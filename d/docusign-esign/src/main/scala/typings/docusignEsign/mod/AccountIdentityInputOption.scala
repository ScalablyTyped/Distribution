package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountIdentityInputOption extends js.Object {
  
  var isRequired: js.UndefOr[Boolean] = js.native
  
  var optionName: js.UndefOr[String] = js.native
  
  var valueType: js.UndefOr[String] = js.native
}
object AccountIdentityInputOption {
  
  @scala.inline
  def apply(): AccountIdentityInputOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountIdentityInputOption]
  }
  
  @scala.inline
  implicit class AccountIdentityInputOptionOps[Self <: AccountIdentityInputOption] (val x: Self) extends AnyVal {
    
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
    def setIsRequired(value: Boolean): Self = this.set("isRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRequired: Self = this.set("isRequired", js.undefined)
    
    @scala.inline
    def setOptionName(value: String): Self = this.set("optionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionName: Self = this.set("optionName", js.undefined)
    
    @scala.inline
    def setValueType(value: String): Self = this.set("valueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueType: Self = this.set("valueType", js.undefined)
  }
}
