package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientIdentityInputOption extends js.Object {
  
  var name: js.UndefOr[String] = js.native
  
  var phoneNumberList: js.UndefOr[js.Array[RecipientIdentityPhoneNumber]] = js.native
  
  var valueType: js.UndefOr[String] = js.native
}
object RecipientIdentityInputOption {
  
  @scala.inline
  def apply(): RecipientIdentityInputOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientIdentityInputOption]
  }
  
  @scala.inline
  implicit class RecipientIdentityInputOptionOps[Self <: RecipientIdentityInputOption] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPhoneNumberListVarargs(value: RecipientIdentityPhoneNumber*): Self = this.set("phoneNumberList", js.Array(value :_*))
    
    @scala.inline
    def setPhoneNumberList(value: js.Array[RecipientIdentityPhoneNumber]): Self = this.set("phoneNumberList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumberList: Self = this.set("phoneNumberList", js.undefined)
    
    @scala.inline
    def setValueType(value: String): Self = this.set("valueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueType: Self = this.set("valueType", js.undefined)
  }
}
