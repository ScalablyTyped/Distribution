package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Audit Event Reporter
  */
trait AuditEventSource
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'site'.
    */
  var _site: js.UndefOr[Element] = js.undefined
  
  /**
    * The identity of source detecting the event
    */
  var identifier: Identifier
  
  /**
    * Logical source location within the enterprise
    */
  var site: js.UndefOr[String] = js.undefined
  
  /**
    * The type of source where event originated
    */
  var `type`: js.UndefOr[js.Array[Coding]] = js.undefined
}
object AuditEventSource {
  
  inline def apply(identifier: Identifier): AuditEventSource = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditEventSource]
  }
  
  extension [Self <: AuditEventSource](x: Self) {
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setSite(value: String): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
    
    inline def setType(value: js.Array[Coding]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: Coding*): Self = StObject.set(x, "type", js.Array(value :_*))
    
    inline def set_site(value: Element): Self = StObject.set(x, "_site", value.asInstanceOf[js.Any])
    
    inline def set_siteUndefined: Self = StObject.set(x, "_site", js.undefined)
  }
}
