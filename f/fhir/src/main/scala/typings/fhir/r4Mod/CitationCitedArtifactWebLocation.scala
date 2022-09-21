package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitationCitedArtifactWebLocation
  extends StObject
     with BackboneElement {
  
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * Code the reason for different URLs, e.g. abstract and full-text.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Persistent URLs, like doi, are preferred.
    */
  var url: js.UndefOr[String] = js.undefined
}
object CitationCitedArtifactWebLocation {
  
  inline def apply(): CitationCitedArtifactWebLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CitationCitedArtifactWebLocation]
  }
  
  extension [Self <: CitationCitedArtifactWebLocation](x: Self) {
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}
