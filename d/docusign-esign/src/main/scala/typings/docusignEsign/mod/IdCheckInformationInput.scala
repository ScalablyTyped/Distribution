package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdCheckInformationInput extends js.Object {
  
  /**
    * An object that specifies recipient address information and how it is displayed.
    */
  var addressInformationInput: js.UndefOr[AddressInformationInput] = js.native
  
  /**
    * An object that specifies recipient date of birth information and how it is displayed.
    */
  var dobInformationInput: js.UndefOr[DobInformationInput] = js.native
  
  /**
    * An object that specifies the last four digits of the recipient's Social Security Number (SSN).
    */
  var ssn4InformationInput: js.UndefOr[Ssn4InformationInput] = js.native
  
  /**
    * An object that specifies the recipient's Social Security Number (SSN) information. Note that ssn9 information cannot be returned in a response.
    */
  var ssn9InformationInput: js.UndefOr[Ssn9InformationInput] = js.native
}
object IdCheckInformationInput {
  
  @scala.inline
  def apply(): IdCheckInformationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdCheckInformationInput]
  }
  
  @scala.inline
  implicit class IdCheckInformationInputOps[Self <: IdCheckInformationInput] (val x: Self) extends AnyVal {
    
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
    def setAddressInformationInput(value: AddressInformationInput): Self = this.set("addressInformationInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressInformationInput: Self = this.set("addressInformationInput", js.undefined)
    
    @scala.inline
    def setDobInformationInput(value: DobInformationInput): Self = this.set("dobInformationInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDobInformationInput: Self = this.set("dobInformationInput", js.undefined)
    
    @scala.inline
    def setSsn4InformationInput(value: Ssn4InformationInput): Self = this.set("ssn4InformationInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsn4InformationInput: Self = this.set("ssn4InformationInput", js.undefined)
    
    @scala.inline
    def setSsn9InformationInput(value: Ssn9InformationInput): Self = this.set("ssn9InformationInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsn9InformationInput: Self = this.set("ssn9InformationInput", js.undefined)
  }
}
