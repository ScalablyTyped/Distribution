package typings.editJsonFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** JSON file editor options. */
@js.native
trait Options extends js.Object {
  
  var autosave: js.UndefOr[Boolean] = js.native
  
  var stringify_eol: js.UndefOr[Boolean] = js.native
  
  var stringify_fn: js.UndefOr[js.Function1[/* data */ js.Object, String]] = js.native
  
  var stringify_width: js.UndefOr[Double] = js.native
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
    def setAutosave(value: Boolean): Self = this.set("autosave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutosave: Self = this.set("autosave", js.undefined)
    
    @scala.inline
    def setStringify_eol(value: Boolean): Self = this.set("stringify_eol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringify_eol: Self = this.set("stringify_eol", js.undefined)
    
    @scala.inline
    def setStringify_fn(value: /* data */ js.Object => String): Self = this.set("stringify_fn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStringify_fn: Self = this.set("stringify_fn", js.undefined)
    
    @scala.inline
    def setStringify_width(value: Double): Self = this.set("stringify_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringify_width: Self = this.set("stringify_width", js.undefined)
  }
}
