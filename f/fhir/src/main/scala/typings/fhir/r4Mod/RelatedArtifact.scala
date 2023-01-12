package typings.fhir.r4Mod

import typings.fhir.fhirStrings.`composed-of`
import typings.fhir.fhirStrings.`depends-on`
import typings.fhir.fhirStrings.`derived-from`
import typings.fhir.fhirStrings.citation_
import typings.fhir.fhirStrings.documentation
import typings.fhir.fhirStrings.justification
import typings.fhir.fhirStrings.predecessor
import typings.fhir.fhirStrings.successor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedArtifact
  extends StObject
     with Element {
  
  var _citation: js.UndefOr[Element] = js.undefined
  
  var _display: js.UndefOr[Element] = js.undefined
  
  var _label: js.UndefOr[Element] = js.undefined
  
  var _resource: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * Additional structured information about citations should be captured as extensions.
    */
  var citation: js.UndefOr[String] = js.undefined
  
  /**
    * A brief description of the document or knowledge resource being referenced, suitable for display to a consumer.
    */
  var display: js.UndefOr[String] = js.undefined
  
  /**
    * The document being referenced, represented as an attachment. This is exclusive with the resource element.
    */
  var document: js.UndefOr[Attachment] = js.undefined
  
  /**
    * A short label that can be used to reference the citation from elsewhere in the containing artifact, such as a footnote index.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * If the type is predecessor, this is a reference to the succeeding knowledge resource. If the type is successor, this is a reference to the prior knowledge resource.
    */
  var resource: js.UndefOr[String] = js.undefined
  
  /**
    * The type of relationship to the related artifact.
    */
  var `type`: documentation | justification | citation_ | predecessor | successor | `derived-from` | `depends-on` | `composed-of`
  
  /**
    * If a document or resource element is present, this element SHALL NOT be provided (use the url or reference in the Attachment or resource reference).
    */
  var url: js.UndefOr[String] = js.undefined
}
object RelatedArtifact {
  
  inline def apply(
    `type`: documentation | justification | citation_ | predecessor | successor | `derived-from` | `depends-on` | `composed-of`
  ): RelatedArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedArtifact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelatedArtifact] (val x: Self) extends AnyVal {
    
    inline def setCitation(value: String): Self = StObject.set(x, "citation", value.asInstanceOf[js.Any])
    
    inline def setCitationUndefined: Self = StObject.set(x, "citation", js.undefined)
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setDocument(value: Attachment): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setType(
      value: documentation | justification | citation_ | predecessor | successor | `derived-from` | `depends-on` | `composed-of`
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
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
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}
