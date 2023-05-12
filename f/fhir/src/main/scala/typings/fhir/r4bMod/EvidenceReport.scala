package typings.fhir.r4bMod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.retired
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvidenceReport
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _citeAsMarkdown: js.UndefOr[Element] = js.undefined
  
  var _publisher: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime (Details at: http://build.fhir.org/clinicalreasoning-module.html).
    */
  var author: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * used for reports for which external citation is expected, such as use in support of scholarly publications.
    */
  var citeAsMarkdown: js.UndefOr[String] = js.undefined
  
  /**
    * used for reports for which external citation is expected, such as use in support of scholarly publications.
    */
  var citeAsReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime (Details at: http://build.fhir.org/clinicalreasoning-module.html).
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime (Details at: http://build.fhir.org/clinicalreasoning-module.html).
    */
  var editor: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime (Details at: http://build.fhir.org/clinicalreasoning-module.html).
    */
  var endorser: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * This element will contain unique identifiers that support de-duplication of EvidenceReports. This identifier can be valid for only one EvidenceReport resource.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Used for footnotes and annotations.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Usually an organization but may be an individual. The publisher (or steward) of the evidence report is the organization or individual primarily responsible for the maintenance and upkeep of the evidence report. This is not necessarily the same individual or organization that developed and initially authored the content. The publisher is the primary point of contact for questions or issues with the evidence report. This item SHOULD be populated unless the information is available from context.
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * Link, description or reference to artifact associated with the report.
    */
  var relatedArtifact: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  
  /**
    * May include trial registry identifiers, e.g. NCT04372602 from clinicaltrials.gov. This identifier can be valid for multiple EvidenceReport resources.
    */
  var relatedIdentifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * A document is a version specific composition.
    */
  var relatesTo: js.UndefOr[js.Array[EvidenceReportRelatesTo]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_EvidenceReport: typings.fhir.fhirStrings.EvidenceReport
  
  /**
    * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime (Details at: http://build.fhir.org/clinicalreasoning-module.html).
    */
  var reviewer: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * The root of the sections that make up the composition.
    */
  var section: js.UndefOr[js.Array[EvidenceReportSection]] = js.undefined
  
  /**
    * Allows filtering of summaries that are appropriate for use versus not.
    */
  var status: draft | active | retired | unknown
  
  /**
    * May be used as an expression for search queries and search results
    */
  var subject: EvidenceReportSubject
  
  /**
    * Specifies the kind of report, such as grouping of classifiers, search results, or human-compiled expression.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Can be a urn:uuid: or a urn:oid: but real http: addresses are preferred. Multiple instances may share the same URL if they have a distinct version.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * When multiple useContexts are specified, there is no expectation that all or any of the contexts apply.
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
}
object EvidenceReport {
  
  inline def apply(status: draft | active | retired | unknown, subject: EvidenceReportSubject): EvidenceReport = {
    val __obj = js.Dynamic.literal(resourceType = "EvidenceReport", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvidenceReport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvidenceReport] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: js.Array[ContactDetail]): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setAuthorVarargs(value: ContactDetail*): Self = StObject.set(x, "author", js.Array(value*))
    
    inline def setCiteAsMarkdown(value: String): Self = StObject.set(x, "citeAsMarkdown", value.asInstanceOf[js.Any])
    
    inline def setCiteAsMarkdownUndefined: Self = StObject.set(x, "citeAsMarkdown", js.undefined)
    
    inline def setCiteAsReference(value: Reference): Self = StObject.set(x, "citeAsReference", value.asInstanceOf[js.Any])
    
    inline def setCiteAsReferenceUndefined: Self = StObject.set(x, "citeAsReference", js.undefined)
    
    inline def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setEditor(value: js.Array[ContactDetail]): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    inline def setEditorVarargs(value: ContactDetail*): Self = StObject.set(x, "editor", js.Array(value*))
    
    inline def setEndorser(value: js.Array[ContactDetail]): Self = StObject.set(x, "endorser", value.asInstanceOf[js.Any])
    
    inline def setEndorserUndefined: Self = StObject.set(x, "endorser", js.undefined)
    
    inline def setEndorserVarargs(value: ContactDetail*): Self = StObject.set(x, "endorser", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setRelatedArtifact(value: js.Array[RelatedArtifact]): Self = StObject.set(x, "relatedArtifact", value.asInstanceOf[js.Any])
    
    inline def setRelatedArtifactUndefined: Self = StObject.set(x, "relatedArtifact", js.undefined)
    
    inline def setRelatedArtifactVarargs(value: RelatedArtifact*): Self = StObject.set(x, "relatedArtifact", js.Array(value*))
    
    inline def setRelatedIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "relatedIdentifier", value.asInstanceOf[js.Any])
    
    inline def setRelatedIdentifierUndefined: Self = StObject.set(x, "relatedIdentifier", js.undefined)
    
    inline def setRelatedIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "relatedIdentifier", js.Array(value*))
    
    inline def setRelatesTo(value: js.Array[EvidenceReportRelatesTo]): Self = StObject.set(x, "relatesTo", value.asInstanceOf[js.Any])
    
    inline def setRelatesToUndefined: Self = StObject.set(x, "relatesTo", js.undefined)
    
    inline def setRelatesToVarargs(value: EvidenceReportRelatesTo*): Self = StObject.set(x, "relatesTo", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.EvidenceReport): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setReviewer(value: js.Array[ContactDetail]): Self = StObject.set(x, "reviewer", value.asInstanceOf[js.Any])
    
    inline def setReviewerUndefined: Self = StObject.set(x, "reviewer", js.undefined)
    
    inline def setReviewerVarargs(value: ContactDetail*): Self = StObject.set(x, "reviewer", js.Array(value*))
    
    inline def setSection(value: js.Array[EvidenceReportSection]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    
    inline def setSectionVarargs(value: EvidenceReportSection*): Self = StObject.set(x, "section", js.Array(value*))
    
    inline def setStatus(value: draft | active | retired | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: EvidenceReportSubject): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    inline def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    inline def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value*))
    
    inline def set_citeAsMarkdown(value: Element): Self = StObject.set(x, "_citeAsMarkdown", value.asInstanceOf[js.Any])
    
    inline def set_citeAsMarkdownUndefined: Self = StObject.set(x, "_citeAsMarkdown", js.undefined)
    
    inline def set_publisher(value: Element): Self = StObject.set(x, "_publisher", value.asInstanceOf[js.Any])
    
    inline def set_publisherUndefined: Self = StObject.set(x, "_publisher", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}
