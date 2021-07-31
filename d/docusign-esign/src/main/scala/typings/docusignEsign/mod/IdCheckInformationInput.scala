package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdCheckInformationInput extends StObject {
  
  /**
    * An object that specifies recipient address information and how it is displayed.
    */
  var addressInformationInput: js.UndefOr[AddressInformationInput] = js.undefined
  
  /**
    * An object that specifies recipient date of birth information and how it is displayed.
    */
  var dobInformationInput: js.UndefOr[DobInformationInput] = js.undefined
  
  /**
    * An object that specifies the last four digits of the recipient's Social Security Number (SSN).
    */
  var ssn4InformationInput: js.UndefOr[Ssn4InformationInput] = js.undefined
  
  /**
    * An object that specifies the recipient's Social Security Number (SSN) information. Note that ssn9 information cannot be returned in a response.
    */
  var ssn9InformationInput: js.UndefOr[Ssn9InformationInput] = js.undefined
}
object IdCheckInformationInput {
  
  @scala.inline
  def apply(): IdCheckInformationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdCheckInformationInput]
  }
  
  @scala.inline
  implicit class IdCheckInformationInputMutableBuilder[Self <: IdCheckInformationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressInformationInput(value: AddressInformationInput): Self = StObject.set(x, "addressInformationInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressInformationInputUndefined: Self = StObject.set(x, "addressInformationInput", js.undefined)
    
    @scala.inline
    def setDobInformationInput(value: DobInformationInput): Self = StObject.set(x, "dobInformationInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDobInformationInputUndefined: Self = StObject.set(x, "dobInformationInput", js.undefined)
    
    @scala.inline
    def setSsn4InformationInput(value: Ssn4InformationInput): Self = StObject.set(x, "ssn4InformationInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsn4InformationInputUndefined: Self = StObject.set(x, "ssn4InformationInput", js.undefined)
    
    @scala.inline
    def setSsn9InformationInput(value: Ssn9InformationInput): Self = StObject.set(x, "ssn9InformationInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsn9InformationInputUndefined: Self = StObject.set(x, "ssn9InformationInput", js.undefined)
  }
}
