package typings.fhir.r5Mod

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
  var classifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CitationCitedArtifactWebLocation] (val x: Self) extends AnyVal {
    
    inline def setClassifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "classifier", value.asInstanceOf[js.Any])
    
    inline def setClassifierUndefined: Self = StObject.set(x, "classifier", js.undefined)
    
    inline def setClassifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "classifier", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}
