package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitationCitedArtifactClassification
  extends StObject
     with BackboneElement {
  
  /**
    * Examples relevant to study citations include MeSH Headings or Keywords that contain qualifier codings or sub-classifications, and include risk of bias assessments created by persons different from the creator of the citation record.
    */
  var artifactAssessment: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The specific classification value.
    */
  var classifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The kind of classifier (e.g. publication type, keyword).
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object CitationCitedArtifactClassification {
  
  inline def apply(): CitationCitedArtifactClassification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CitationCitedArtifactClassification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CitationCitedArtifactClassification] (val x: Self) extends AnyVal {
    
    inline def setArtifactAssessment(value: js.Array[Reference]): Self = StObject.set(x, "artifactAssessment", value.asInstanceOf[js.Any])
    
    inline def setArtifactAssessmentUndefined: Self = StObject.set(x, "artifactAssessment", js.undefined)
    
    inline def setArtifactAssessmentVarargs(value: Reference*): Self = StObject.set(x, "artifactAssessment", js.Array(value*))
    
    inline def setClassifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "classifier", value.asInstanceOf[js.Any])
    
    inline def setClassifierUndefined: Self = StObject.set(x, "classifier", js.undefined)
    
    inline def setClassifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "classifier", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
