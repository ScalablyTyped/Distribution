package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressInformationInput extends StObject {
  
  /**
    * A complex type that contains the following information for the new account: `address1`, `address2`, `city`, `country`, `fax`, `phone`, `postalCode` and `stateOrProvince`.
    *
    * The maximum characters for the strings are:
    * * `address1`, `address2`, `city`, `country` and `stateOrProvince`: 100 characters
    * * `postalCode`, `phone`, and `fax`: 20 characters
    *
    * **Note:** If country is US (United States), `stateOrProvince` codes are validated. Otherwise, `stateOrProvince` is treated as a non-validated string used to specify a state,
    * province, or region.
    */
  var addressInformation: js.UndefOr[/* Contains address information. */ AddressInformation] = js.native
  
  /**
    * Specifies the display level for the recipient. Valid values are:
    * * `ReadOnly`
    * * `Editable`
    * * `DoNotDisplay`
    */
  var displayLevelCode: js.UndefOr[String] = js.native
  
  /**
    * A Boolean value that specifies whether the information must be returned in the response.
    */
  var receiveInResponse: js.UndefOr[String] = js.native
}
object AddressInformationInput {
  
  @scala.inline
  def apply(): AddressInformationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressInformationInput]
  }
  
  @scala.inline
  implicit class AddressInformationInputMutableBuilder[Self <: AddressInformationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressInformation(value: /* Contains address information. */ AddressInformation): Self = StObject.set(x, "addressInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressInformationUndefined: Self = StObject.set(x, "addressInformation", js.undefined)
    
    @scala.inline
    def setDisplayLevelCode(value: String): Self = StObject.set(x, "displayLevelCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayLevelCodeUndefined: Self = StObject.set(x, "displayLevelCode", js.undefined)
    
    @scala.inline
    def setReceiveInResponse(value: String): Self = StObject.set(x, "receiveInResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiveInResponseUndefined: Self = StObject.set(x, "receiveInResponse", js.undefined)
  }
}
