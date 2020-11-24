package typings.globStream.mod

import typings.glob.mod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends IOptions {
  
  /**
    * Whether or not to error upon an empty singular glob.
    */
  var allowEmpty: js.UndefOr[Boolean] = js.native
  
  /**
    * The absolute segment of the glob path that isn't a glob. This value is attached
    * to each globobject and is useful for relative pathing.
    */
  var base: js.UndefOr[String] = js.native
  
  /**
    * Whether or not the `cwd` and `base` should be the same.
    */
  var cwdbase: js.UndefOr[Boolean] = js.native
  
  /**
    * Filters stream to remove duplicates based on the string property name or the result of function.
    * When using a function, the function receives the streamed
    * data (objects containing `cwd`, `base`, `path` properties) to compare against.
    */
  var uniqueBy: js.UndefOr[UniqueByStringPredicate | UniqueByFunctionPredicate] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowEmpty(value: Boolean): Self = this.set("allowEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEmpty: Self = this.set("allowEmpty", js.undefined)
    
    @scala.inline
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setCwdbase(value: Boolean): Self = this.set("cwdbase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwdbase: Self = this.set("cwdbase", js.undefined)
    
    @scala.inline
    def setUniqueByFunction1(value: /* entry */ Entry => String): Self = this.set("uniqueBy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUniqueBy(value: UniqueByStringPredicate | UniqueByFunctionPredicate): Self = this.set("uniqueBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueBy: Self = this.set("uniqueBy", js.undefined)
  }
}
