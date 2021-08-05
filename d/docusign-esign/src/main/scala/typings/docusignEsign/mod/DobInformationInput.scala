package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DobInformationInput extends StObject {
  
  /**
    * Specifies the recipient's date, month, and year of birth.
    */
  var dateOfBirth: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the display level for the recipient. Valid values are:
    * * `ReadOnly`
    * * `Editable`
    * * `DoNotDisplay`
    */
  var displayLevelCode: js.UndefOr[String] = js.undefined
  
  /**
    * A Boolean value that specifies whether the information must be returned in the response.
    */
  var receiveInResponse: js.UndefOr[String] = js.undefined
}
object DobInformationInput {
  
  inline def apply(): DobInformationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DobInformationInput]
  }
  
  extension [Self <: DobInformationInput](x: Self) {
    
    inline def setDateOfBirth(value: String): Self = StObject.set(x, "dateOfBirth", value.asInstanceOf[js.Any])
    
    inline def setDateOfBirthUndefined: Self = StObject.set(x, "dateOfBirth", js.undefined)
    
    inline def setDisplayLevelCode(value: String): Self = StObject.set(x, "displayLevelCode", value.asInstanceOf[js.Any])
    
    inline def setDisplayLevelCodeUndefined: Self = StObject.set(x, "displayLevelCode", js.undefined)
    
    inline def setReceiveInResponse(value: String): Self = StObject.set(x, "receiveInResponse", value.asInstanceOf[js.Any])
    
    inline def setReceiveInResponseUndefined: Self = StObject.set(x, "receiveInResponse", js.undefined)
  }
}
