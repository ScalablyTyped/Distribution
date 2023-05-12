package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`amended-with`
import typings.fhir.fhirStrings.`appended-with`
import typings.fhir.fhirStrings.`cite-as`
import typings.fhir.fhirStrings.`cited-by`
import typings.fhir.fhirStrings.`comment-in`
import typings.fhir.fhirStrings.`comments-on`
import typings.fhir.fhirStrings.`composed-of`
import typings.fhir.fhirStrings.`contained-in`
import typings.fhir.fhirStrings.`correction-in`
import typings.fhir.fhirStrings.`created-with`
import typings.fhir.fhirStrings.`depends-on`
import typings.fhir.fhirStrings.`derived-from`
import typings.fhir.fhirStrings.`part-of`
import typings.fhir.fhirStrings.`replaced-with`
import typings.fhir.fhirStrings.`reprint-of`
import typings.fhir.fhirStrings.`retracted-by`
import typings.fhir.fhirStrings.`similar-to`
import typings.fhir.fhirStrings.`specification-of`
import typings.fhir.fhirStrings.`supported-with`
import typings.fhir.fhirStrings.`transformed-into`
import typings.fhir.fhirStrings.`transformed-with`
import typings.fhir.fhirStrings.amends
import typings.fhir.fhirStrings.appends
import typings.fhir.fhirStrings.citation_
import typings.fhir.fhirStrings.cites
import typings.fhir.fhirStrings.contains
import typings.fhir.fhirStrings.corrects
import typings.fhir.fhirStrings.documentation
import typings.fhir.fhirStrings.documents
import typings.fhir.fhirStrings.justification
import typings.fhir.fhirStrings.predecessor
import typings.fhir.fhirStrings.replaces
import typings.fhir.fhirStrings.reprint
import typings.fhir.fhirStrings.retracts
import typings.fhir.fhirStrings.signs
import typings.fhir.fhirStrings.successor
import typings.fhir.fhirStrings.supports
import typings.fhir.fhirStrings.transforms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitationCitedArtifactRelatesTo
  extends StObject
     with BackboneElement {
  
  var _citation: js.UndefOr[Element] = js.undefined
  
  var _display: js.UndefOr[Element] = js.undefined
  
  var _label: js.UndefOr[Element] = js.undefined
  
  var _resource: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * A bibliographic citation for the related artifact. This text SHOULD be formatted according to an accepted citation format.
    */
  var citation: js.UndefOr[String] = js.undefined
  
  /**
    * Provides additional classifiers of the related artifact.
    */
  var classifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * A brief description of the document or knowledge resource being referenced, suitable for display to a consumer.
    */
  var display: js.UndefOr[String] = js.undefined
  
  /**
    * To refer to related artifacts by URL, the FHIR Attachment Datatype includes a url element, so the path would be Citation.citedArtifact.relatesTo.document.url
    */
  var document: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Though not commonly used in citation records, this could be used for referencing other articles in the abstract or explanatory notes.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * If the type is predecessor, this is a reference to the succeeding knowledge resource. If the type is successor, this is a reference to the prior knowledge resource
    */
  var resource: js.UndefOr[String] = js.undefined
  
  /**
    * If both resource and resourceReference are present, they SHOULD be consistent and reference the same resource. Although relatedArtifact is intended to support references to definitional resources, there are cases where non-definitional resources can be definitional (such as Location where the kind is mode). Related artifacts SHOULD be used to reference definitional resources, and profiles SHOULD be used to make that explicit for particular use cases.
    */
  var resourceReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The type of relationship to the related artifact.
    */
  var `type`: documentation | justification | citation_ | predecessor | successor | `derived-from` | `depends-on` | `composed-of` | `part-of` | amends | `amended-with` | appends | `appended-with` | cites | `cited-by` | `comments-on` | `comment-in` | contains | `contained-in` | corrects | `correction-in` | replaces | `replaced-with` | retracts | `retracted-by` | signs | `similar-to` | supports | `supported-with` | transforms | `transformed-into` | `transformed-with` | documents | `specification-of` | `created-with` | `cite-as` | reprint | `reprint-of`
}
object CitationCitedArtifactRelatesTo {
  
  inline def apply(
    `type`: documentation | justification | citation_ | predecessor | successor | `derived-from` | `depends-on` | `composed-of` | `part-of` | amends | `amended-with` | appends | `appended-with` | cites | `cited-by` | `comments-on` | `comment-in` | contains | `contained-in` | corrects | `correction-in` | replaces | `replaced-with` | retracts | `retracted-by` | signs | `similar-to` | supports | `supported-with` | transforms | `transformed-into` | `transformed-with` | documents | `specification-of` | `created-with` | `cite-as` | reprint | `reprint-of`
  ): CitationCitedArtifactRelatesTo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CitationCitedArtifactRelatesTo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CitationCitedArtifactRelatesTo] (val x: Self) extends AnyVal {
    
    inline def setCitation(value: String): Self = StObject.set(x, "citation", value.asInstanceOf[js.Any])
    
    inline def setCitationUndefined: Self = StObject.set(x, "citation", js.undefined)
    
    inline def setClassifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "classifier", value.asInstanceOf[js.Any])
    
    inline def setClassifierUndefined: Self = StObject.set(x, "classifier", js.undefined)
    
    inline def setClassifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "classifier", js.Array(value*))
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setDocument(value: Attachment): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceReference(value: Reference): Self = StObject.set(x, "resourceReference", value.asInstanceOf[js.Any])
    
    inline def setResourceReferenceUndefined: Self = StObject.set(x, "resourceReference", js.undefined)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setType(
      value: documentation | justification | citation_ | predecessor | successor | `derived-from` | `depends-on` | `composed-of` | `part-of` | amends | `amended-with` | appends | `appended-with` | cites | `cited-by` | `comments-on` | `comment-in` | contains | `contained-in` | corrects | `correction-in` | replaces | `replaced-with` | retracts | `retracted-by` | signs | `similar-to` | supports | `supported-with` | transforms | `transformed-into` | `transformed-with` | documents | `specification-of` | `created-with` | `cite-as` | reprint | `reprint-of`
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_citation(value: Element): Self = StObject.set(x, "_citation", value.asInstanceOf[js.Any])
    
    inline def set_citationUndefined: Self = StObject.set(x, "_citation", js.undefined)
    
    inline def set_display(value: Element): Self = StObject.set(x, "_display", value.asInstanceOf[js.Any])
    
    inline def set_displayUndefined: Self = StObject.set(x, "_display", js.undefined)
    
    inline def set_label(value: Element): Self = StObject.set(x, "_label", value.asInstanceOf[js.Any])
    
    inline def set_labelUndefined: Self = StObject.set(x, "_label", js.undefined)
    
    inline def set_resource(value: Element): Self = StObject.set(x, "_resource", value.asInstanceOf[js.Any])
    
    inline def set_resourceUndefined: Self = StObject.set(x, "_resource", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
