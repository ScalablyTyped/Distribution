package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ssn9InformationInput extends StObject {
  
  /**
    * Specifies the display level for the recipient. Valid values are:
    * * `ReadOnly`
    * * `Editable`
    * * `DoNotDisplay`
    */
  var displayLevelCode: js.UndefOr[String] = js.undefined
  
  /**
    * The recipient's full Social Security Number (SSN).
    */
  var ssn9: js.UndefOr[String] = js.undefined
}
object Ssn9InformationInput {
  
  inline def apply(): Ssn9InformationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ssn9InformationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ssn9InformationInput] (val x: Self) extends AnyVal {
    
    inline def setDisplayLevelCode(value: String): Self = StObject.set(x, "displayLevelCode", value.asInstanceOf[js.Any])
    
    inline def setDisplayLevelCodeUndefined: Self = StObject.set(x, "displayLevelCode", js.undefined)
    
    inline def setSsn9(value: String): Self = StObject.set(x, "ssn9", value.asInstanceOf[js.Any])
    
    inline def setSsn9Undefined: Self = StObject.set(x, "ssn9", js.undefined)
  }
}
