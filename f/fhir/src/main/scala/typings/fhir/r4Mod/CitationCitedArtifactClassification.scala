package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitationCitedArtifactClassification
  extends StObject
     with BackboneElement {
  
  /**
    * The specific classification value.
    */
  var classifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The kind of classifier (e.g. publication type, keyword).
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Provenance and copyright of classification.
    */
  var whoClassified: js.UndefOr[CitationCitedArtifactClassificationWhoClassified] = js.undefined
}
object CitationCitedArtifactClassification {
  
  inline def apply(): CitationCitedArtifactClassification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CitationCitedArtifactClassification]
  }
  
  extension [Self <: CitationCitedArtifactClassification](x: Self) {
    
    inline def setClassifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "classifier", value.asInstanceOf[js.Any])
    
    inline def setClassifierUndefined: Self = StObject.set(x, "classifier", js.undefined)
    
    inline def setClassifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "classifier", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWhoClassified(value: CitationCitedArtifactClassificationWhoClassified): Self = StObject.set(x, "whoClassified", value.asInstanceOf[js.Any])
    
    inline def setWhoClassifiedUndefined: Self = StObject.set(x, "whoClassified", js.undefined)
  }
}
