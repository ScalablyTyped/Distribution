package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointPayload
  extends StObject
     with BackboneElement {
  
  var _mimeType: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Sending the payload has obvious security consequences. The server is responsible for ensuring that the content is appropriately secured.
    */
  var mimeType: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The mimeType describes the serialization format of the data, where the payload.type indicates the specific document/schema that is being transferred; e.g. DischargeSummary or CarePlan.
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object EndpointPayload {
  
  inline def apply(): EndpointPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndpointPayload] (val x: Self) extends AnyVal {
    
    inline def setMimeType(value: js.Array[String]): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setMimeTypeVarargs(value: String*): Self = StObject.set(x, "mimeType", js.Array(value*))
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def set_mimeType(value: js.Array[Element]): Self = StObject.set(x, "_mimeType", value.asInstanceOf[js.Any])
    
    inline def set_mimeTypeUndefined: Self = StObject.set(x, "_mimeType", js.undefined)
    
    inline def set_mimeTypeVarargs(value: Element*): Self = StObject.set(x, "_mimeType", js.Array(value*))
  }
}
