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
  
  /**
    * This is a generic response to the request message. Specific data for the response will be found in MessageHeader.focus.
    */
  var code: ok | `transient-error` | `fatal-error`
  
  /**
    * This SHALL be contained in the bundle. If any of the issues are errors, the response code SHALL be an error.
    */
  var details: js.UndefOr[Reference] = js.undefined
  
  /**
    * The Bundle.identifier of the message to which this message is a response.
    */
  var identifier: Identifier
}
object MessageHeaderResponse {
  
  inline def apply(code: ok | `transient-error` | `fatal-error`, identifier: Identifier): MessageHeaderResponse = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageHeaderResponse] (val x: Self) extends AnyVal {
    
    inline def setCode(value: ok | `transient-error` | `fatal-error`): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: Reference): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
  }
}
