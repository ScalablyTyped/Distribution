package typings.express.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterOptions extends js.Object {
  
  /**
    * Enable case sensitivity.
    */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  /**
    * Preserve the req.params values from the parent router.
    * If the parent and the child have conflicting param names, the child’s value take precedence.
    *
    * @default false
    * @since 4.5.0
    */
  var mergeParams: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable strict routing.
    */
  var strict: js.UndefOr[Boolean] = js.native
}
object RouterOptions {
  
  @scala.inline
  def apply(): RouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterOptions]
  }
  
  @scala.inline
  implicit class RouterOptionsOps[Self <: RouterOptions] (val x: Self) extends AnyVal {
    
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
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    
    @scala.inline
    def setMergeParams(value: Boolean): Self = this.set("mergeParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeParams: Self = this.set("mergeParams", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
}
