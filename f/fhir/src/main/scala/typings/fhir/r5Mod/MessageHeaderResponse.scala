package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`fatal-error`
import typings.fhir.fhirStrings.`transient-error`
import typings.fhir.fhirStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageHeaderResponse
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _identifier: js.UndefOr[Element] = js.undefined
  
  /**
    * This is a generic response to the request message. Specific data for the response will be found in MessageHeader.focus.
    */
  var code: ok | `transient-error` | `fatal-error`
  
  /**
    * This SHALL be contained in the bundle. If any of the issues are errors, the response code SHALL be an error.
    */
  var details: js.UndefOr[Reference] = js.undefined
  
  /**
    * The MessageHeader.id of the message to which this message is a response.
    */
  var identifier: String
}
object MessageHeaderResponse {
  
  inline def apply(code: ok | `transient-error` | `fatal-error`, identifier: String): MessageHeaderResponse = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderResponse]
  }
  
  extension [Self <: MessageHeaderResponse](x: Self) {
    
    inline def setCode(value: ok | `transient-error` | `fatal-error`): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: Reference): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_identifier(value: Element): Self = StObject.set(x, "_identifier", value.asInstanceOf[js.Any])
    
    inline def set_identifierUndefined: Self = StObject.set(x, "_identifier", js.undefined)
  }
}
