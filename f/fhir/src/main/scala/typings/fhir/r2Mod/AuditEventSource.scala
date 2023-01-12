package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditEventSource
  extends StObject
     with BackboneElement {
  
  var _site: js.UndefOr[Element] = js.undefined
  
  /**
    * This field ties the event to a specific source system. It may be used to group events for analysis according to where the event was detected.
    */
  var identifier: Identifier
  
  /**
    * This value differentiates among the sites in a multi-site enterprise health information system.
    */
  var site: js.UndefOr[String] = js.undefined
  
  /**
    * This field indicates which type of source is identified by the Audit Source ID. It is an optional value that may be used to group events for analysis according to the type of source where the event occurred.
    */
  var `type`: js.UndefOr[js.Array[Coding]] = js.undefined
}
object AuditEventSource {
  
  inline def apply(identifier: Identifier): AuditEventSource = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditEventSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuditEventSource] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setSite(value: String): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
    
    inline def setType(value: js.Array[Coding]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: Coding*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def set_site(value: Element): Self = StObject.set(x, "_site", value.asInstanceOf[js.Any])
    
    inline def set_siteUndefined: Self = StObject.set(x, "_site", js.undefined)
  }
}
