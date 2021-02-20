package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DobInformationInput extends StObject {
  
  /**
    * Specifies the recipient's date, month, and year of birth.
    */
  var dateOfBirth: js.UndefOr[String] = js.native
  
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
object DobInformationInput {
  
  @scala.inline
  def apply(): DobInformationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DobInformationInput]
  }
  
  @scala.inline
  implicit class DobInformationInputMutableBuilder[Self <: DobInformationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateOfBirth(value: String): Self = StObject.set(x, "dateOfBirth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateOfBirthUndefined: Self = StObject.set(x, "dateOfBirth", js.undefined)
    
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
