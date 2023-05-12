package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`change-request`
import typings.fhir.fhirStrings.classifier
import typings.fhir.fhirStrings.comment
import typings.fhir.fhirStrings.container
import typings.fhir.fhirStrings.rating
import typings.fhir.fhirStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactAssessmentContent
  extends StObject
     with BackboneElement {
  
  var _freeToShare: js.UndefOr[Element] = js.undefined
  
  var _informationType: js.UndefOr[Element] = js.undefined
  
  var _path: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _summary: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates who or what authored the content.
    */
  var author: js.UndefOr[Reference] = js.undefined
  
  /**
    * Represents a rating, classifier, or assessment of the artifact.
    */
  var classifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * If the informationType is container, the components of the content.
    */
  var component: js.UndefOr[js.Array[ArtifactAssessmentContent]] = js.undefined
  
  /**
    * Acceptable to publicly share the comment, classifier or rating.
    */
  var freeToShare: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of information this component of the content represents.
    */
  var informationType: js.UndefOr[comment | classifier | rating | container | response | `change-request`] = js.undefined
  
  /**
    * The target element is used to point the comment to aspect of the artifact, such as a text range within a CQL library (e.g. #content?0:0-120:80).
    */
  var path: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A quantitative rating of the artifact.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Additional related artifacts that provide supporting documentation, additional evidence, or further information related to the content.
    */
  var relatedArtifact: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  
  /**
    * A brief summary of the content of this component.
    */
  var summary: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates what type of content this component represents.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object ArtifactAssessmentContent {
  
  inline def apply(): ArtifactAssessmentContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactAssessmentContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArtifactAssessmentContent] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setClassifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "classifier", value.asInstanceOf[js.Any])
    
    inline def setClassifierUndefined: Self = StObject.set(x, "classifier", js.undefined)
    
    inline def setClassifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "classifier", js.Array(value*))
    
    inline def setComponent(value: js.Array[ArtifactAssessmentContent]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setComponentVarargs(value: ArtifactAssessmentContent*): Self = StObject.set(x, "component", js.Array(value*))
    
    inline def setFreeToShare(value: Boolean): Self = StObject.set(x, "freeToShare", value.asInstanceOf[js.Any])
    
    inline def setFreeToShareUndefined: Self = StObject.set(x, "freeToShare", js.undefined)
    
    inline def setInformationType(value: comment | classifier | rating | container | response | `change-request`): Self = StObject.set(x, "informationType", value.asInstanceOf[js.Any])
    
    inline def setInformationTypeUndefined: Self = StObject.set(x, "informationType", js.undefined)
    
    inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setRelatedArtifact(value: js.Array[RelatedArtifact]): Self = StObject.set(x, "relatedArtifact", value.asInstanceOf[js.Any])
    
    inline def setRelatedArtifactUndefined: Self = StObject.set(x, "relatedArtifact", js.undefined)
    
    inline def setRelatedArtifactVarargs(value: RelatedArtifact*): Self = StObject.set(x, "relatedArtifact", js.Array(value*))
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_freeToShare(value: Element): Self = StObject.set(x, "_freeToShare", value.asInstanceOf[js.Any])
    
    inline def set_freeToShareUndefined: Self = StObject.set(x, "_freeToShare", js.undefined)
    
    inline def set_informationType(value: Element): Self = StObject.set(x, "_informationType", value.asInstanceOf[js.Any])
    
    inline def set_informationTypeUndefined: Self = StObject.set(x, "_informationType", js.undefined)
    
    inline def set_path(value: js.Array[Element]): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    inline def set_pathUndefined: Self = StObject.set(x, "_path", js.undefined)
    
    inline def set_pathVarargs(value: Element*): Self = StObject.set(x, "_path", js.Array(value*))
    
    inline def set_summary(value: Element): Self = StObject.set(x, "_summary", value.asInstanceOf[js.Any])
    
    inline def set_summaryUndefined: Self = StObject.set(x, "_summary", js.undefined)
  }
}
