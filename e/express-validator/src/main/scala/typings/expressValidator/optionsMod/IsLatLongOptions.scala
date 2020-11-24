package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsLatLongOptions extends js.Object {
  
  var checkDMS: js.UndefOr[Boolean] = js.native
}
object IsLatLongOptions {
  
  @scala.inline
  def apply(): IsLatLongOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsLatLongOptions]
  }
  
  @scala.inline
  implicit class IsLatLongOptionsOps[Self <: IsLatLongOptions] (val x: Self) extends AnyVal {
    
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
    def setCheckDMS(value: Boolean): Self = this.set("checkDMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckDMS: Self = this.set("checkDMS", js.undefined)
  }
}
