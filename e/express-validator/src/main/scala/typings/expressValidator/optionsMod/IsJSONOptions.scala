package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsJSONOptions extends js.Object {
  
  var allow_primitives: js.UndefOr[Boolean] = js.native
}
object IsJSONOptions {
  
  @scala.inline
  def apply(): IsJSONOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsJSONOptions]
  }
  
  @scala.inline
  implicit class IsJSONOptionsOps[Self <: IsJSONOptions] (val x: Self) extends AnyVal {
    
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
    def setAllow_primitives(value: Boolean): Self = this.set("allow_primitives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_primitives: Self = this.set("allow_primitives", js.undefined)
  }
}
