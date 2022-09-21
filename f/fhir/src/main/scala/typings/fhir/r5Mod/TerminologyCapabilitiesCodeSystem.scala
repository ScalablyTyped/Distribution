package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminologyCapabilitiesCodeSystem
  extends StObject
     with BackboneElement {
  
  var _subsumption: js.UndefOr[Element] = js.undefined
  
  var _uri: js.UndefOr[Element] = js.undefined
  
  /**
    * True if subsumption is supported for this version of the code system.
    */
  var subsumption: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Canonical identifier for the code system, represented as a URI.
    */
  var uri: js.UndefOr[String] = js.undefined
  
  /**
    * Language translations might not be available for all codes.
    */
  var version: js.UndefOr[js.Array[TerminologyCapabilitiesCodeSystemVersion]] = js.undefined
}
object TerminologyCapabilitiesCodeSystem {
  
  inline def apply(): TerminologyCapabilitiesCodeSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminologyCapabilitiesCodeSystem]
  }
  
  extension [Self <: TerminologyCapabilitiesCodeSystem](x: Self) {
    
    inline def setSubsumption(value: Boolean): Self = StObject.set(x, "subsumption", value.asInstanceOf[js.Any])
    
    inline def setSubsumptionUndefined: Self = StObject.set(x, "subsumption", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setVersion(value: js.Array[TerminologyCapabilitiesCodeSystemVersion]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersionVarargs(value: TerminologyCapabilitiesCodeSystemVersion*): Self = StObject.set(x, "version", js.Array(value*))
    
    inline def set_subsumption(value: Element): Self = StObject.set(x, "_subsumption", value.asInstanceOf[js.Any])
    
    inline def set_subsumptionUndefined: Self = StObject.set(x, "_subsumption", js.undefined)
    
    inline def set_uri(value: Element): Self = StObject.set(x, "_uri", value.asInstanceOf[js.Any])
    
    inline def set_uriUndefined: Self = StObject.set(x, "_uri", js.undefined)
  }
}
