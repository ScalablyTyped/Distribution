package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Audit Event Reporter
  */
@js.native
trait AuditEventSource extends BackboneElement {
  
  /**
    * Contains extended information for property 'site'.
    */
  var _site: js.UndefOr[Element] = js.native
  
  /**
    * The identity of source detecting the event
    */
  var identifier: Identifier = js.native
  
  /**
    * Logical source location within the enterprise
    */
  var site: js.UndefOr[String] = js.native
  
  /**
    * The type of source where event originated
    */
  var `type`: js.UndefOr[js.Array[Coding]] = js.native
}
object AuditEventSource {
  
  @scala.inline
  def apply(identifier: Identifier): AuditEventSource = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditEventSource]
  }
  
  @scala.inline
  implicit class AuditEventSourceMutableBuilder[Self <: AuditEventSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSite(value: String): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
    
    @scala.inline
    def setType(value: js.Array[Coding]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: Coding*): Self = StObject.set(x, "type", js.Array(value :_*))
    
    @scala.inline
    def set_site(value: Element): Self = StObject.set(x, "_site", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_siteUndefined: Self = StObject.set(x, "_site", js.undefined)
  }
}
