package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditEventSource
  extends StObject
     with BackboneElement {
  
  /**
    * Identifier of the source where the event was detected.
    */
  var observer: Reference
  
  /**
    * Logical source location within the healthcare enterprise network.  For example, a hospital or other provider location within a multi-entity provider group.
    */
  var site: js.UndefOr[Reference] = js.undefined
  
  /**
    * Code specifying the type of source where event originated.
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object AuditEventSource {
  
  inline def apply(observer: Reference): AuditEventSource = {
    val __obj = js.Dynamic.literal(observer = observer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditEventSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuditEventSource] (val x: Self) extends AnyVal {
    
    inline def setObserver(value: Reference): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
    
    inline def setSite(value: Reference): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
