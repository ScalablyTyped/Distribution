package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ssn4InformationInput extends StObject {
  
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
  
  /**
    * The last four digits of the recipient's Social Security Number (SSN).
    */
  var ssn4: js.UndefOr[String] = js.native
}
object Ssn4InformationInput {
  
  @scala.inline
  def apply(): Ssn4InformationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ssn4InformationInput]
  }
  
  @scala.inline
  implicit class Ssn4InformationInputMutableBuilder[Self <: Ssn4InformationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayLevelCode(value: String): Self = StObject.set(x, "displayLevelCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayLevelCodeUndefined: Self = StObject.set(x, "displayLevelCode", js.undefined)
    
    @scala.inline
    def setReceiveInResponse(value: String): Self = StObject.set(x, "receiveInResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiveInResponseUndefined: Self = StObject.set(x, "receiveInResponse", js.undefined)
    
    @scala.inline
    def setSsn4(value: String): Self = StObject.set(x, "ssn4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsn4Undefined: Self = StObject.set(x, "ssn4", js.undefined)
  }
}
