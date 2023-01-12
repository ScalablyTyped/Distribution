package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvidenceReportRelatesToTarget
  extends StObject
     with BackboneElement {
  
  var _display: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * Target of the relationship Display.
    */
  var display: js.UndefOr[String] = js.undefined
  
  /**
    * Target of the relationship Identifier.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Target of the relationship Resource reference.
    */
  var resource: js.UndefOr[Reference] = js.undefined
  
  /**
    * Target of the relationship URL.
    */
  var url: js.UndefOr[String] = js.undefined
}
object EvidenceReportRelatesToTarget {
  
  inline def apply(): EvidenceReportRelatesToTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvidenceReportRelatesToTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvidenceReportRelatesToTarget] (val x: Self) extends AnyVal {
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setResource(value: Reference): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def set_display(value: Element): Self = StObject.set(x, "_display", value.asInstanceOf[js.Any])
    
    inline def set_displayUndefined: Self = StObject.set(x, "_display", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}
