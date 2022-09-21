package typings.fhir.r4Mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.continuous
import typings.fhir.fhirStrings.dichotomous
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.intersection
import typings.fhir.fhirStrings.ordinal
import typings.fhir.fhirStrings.polychotomous
import typings.fhir.fhirStrings.retired
import typings.fhir.fhirStrings.union
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvidenceVariable
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _actual: js.UndefOr[Element] = js.undefined
  
  var _characteristicCombination: js.UndefOr[Element] = js.undefined
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _handling: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _publisher: js.UndefOr[Element] = js.undefined
  
  var _shortTitle: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _subtitle: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * True if the actual variable measured, false if a conceptual representation of the intended variable.
    */
  var actual: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime (Details at: http://build.fhir.org/clinicalreasoning-module.html).
    */
  var author: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * A grouping (or set of values) described along with other groupings to specify the set of groupings allowed for the variable.
    */
  var category: js.UndefOr[js.Array[EvidenceVariableCategory]] = js.undefined
  
  /**
    * Characteristics can be defined flexibly to accommodate different use cases for membership criteria, ranging from simple codes, all the way to using an expression language to express the criteria.
    */
  var characteristic: js.UndefOr[js.Array[EvidenceVariableCharacteristic]] = js.undefined
  
  /**
    * Used to specify if two or more characteristics are combined with OR or AND.
    */
  var characteristicCombination: js.UndefOr[intersection | union] = js.undefined
  
  /**
    * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime (Details at: http://build.fhir.org/clinicalreasoning-module.html).
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * Note that this is not the same as the resource last-modified-date, since the resource may be a secondary representation of the evidence variable. Additional specific dates may be added as extensions or be found by consulting Provenances associated with past versions of the resource.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * This description can be used to capture details such as why the evidence variable was built, comments about misuse, instructions for clinical use and interpretation, literature references, examples from the paper world, etc. It is not a rendering of the evidence variable as conveyed in the 'text' field of the resource itself. This item SHOULD be populated unless the information is available from context (e.g. the language of the evidence variable is presumed to be the predominant language in the place the evidence variable was created).
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime (Details at: http://build.fhir.org/clinicalreasoning-module.html).
    */
  var editor: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime (Details at: http://build.fhir.org/clinicalreasoning-module.html).
    */
  var endorser: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * Used for an outcome to classify.
    */
  var handling: js.UndefOr[continuous | dichotomous | ordinal | polychotomous] = js.undefined
  
  /**
    * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data type, and can then identify this evidence variable outside of FHIR, where it is not possible to use the logical URI.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The name is not expected to be globally unique. The name should be a simple alphanumeric type name to ensure that it is machine-processing friendly.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A human-readable string to clarify or explain concepts about the resource.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Usually an organization but may be an individual. The publisher (or steward) of the evidence variable is the organization or individual primarily responsible for the maintenance and upkeep of the evidence variable. This is not necessarily the same individual or organization that developed and initially authored the content. The publisher is the primary point of contact for questions or issues with the evidence variable. This item SHOULD be populated unless the information is available from context.
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * Each related artifact is either an attachment, or a reference to another resource, but not both.
    */
  var relatedArtifact: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_EvidenceVariable: typings.fhir.fhirStrings.EvidenceVariable
  
  /**
    * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime (Details at: http://build.fhir.org/clinicalreasoning-module.html).
    */
  var reviewer: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * The short title provides an alternate title for use in informal descriptive contexts where the full, formal title is not necessary.
    */
  var shortTitle: js.UndefOr[String] = js.undefined
  
  /**
    * Allows filtering of evidence variables that are appropriate for use versus not.
    */
  var status: draft | active | retired | unknown
  
  /**
    * An explanatory or alternate title for the EvidenceVariable giving additional information about its content.
    */
  var subtitle: js.UndefOr[String] = js.undefined
  
  /**
    * This name does not need to be machine-processing friendly and may contain punctuation, white-space, etc.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Can be a urn:uuid: or a urn:oid: but real http: addresses are preferred.  Multiple instances may share the same URL if they have a distinct version.
    * The determination of when to create a new version of a resource (same url, new version) vs. defining a new artifact is up to the author.  Considerations for making this decision are found in [Technical and Business Versions](resource.html#versions).
    * In some cases, the resource can no longer be found at the stated url, but the url itself cannot change. Implementations can use the [meta.source](resource.html#meta) element to indicate where the current master source of the resource can be found.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * When multiple useContexts are specified, there is no expectation that all or any of the contexts apply.
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  
  /**
    * There may be different evidence variable instances that have the same identifier but different versions.  The version can be appended to the url in a reference to allow a reference to a particular business version of the evidence variable with the format [url]|[version].
    */
  var version: js.UndefOr[String] = js.undefined
}
object EvidenceVariable {
  
  inline def apply(status: draft | active | retired | unknown): EvidenceVariable = {
    val __obj = js.Dynamic.literal(resourceType = "EvidenceVariable", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvidenceVariable]
  }
  
  extension [Self <: EvidenceVariable](x: Self) {
    
    inline def setActual(value: Boolean): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    inline def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
    
    inline def setAuthor(value: js.Array[ContactDetail]): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setAuthorVarargs(value: ContactDetail*): Self = StObject.set(x, "author", js.Array(value*))
    
    inline def setCategory(value: js.Array[EvidenceVariableCategory]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: EvidenceVariableCategory*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setCharacteristic(value: js.Array[EvidenceVariableCharacteristic]): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicCombination(value: intersection | union): Self = StObject.set(x, "characteristicCombination", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicCombinationUndefined: Self = StObject.set(x, "characteristicCombination", js.undefined)
    
    inline def setCharacteristicUndefined: Self = StObject.set(x, "characteristic", js.undefined)
    
    inline def setCharacteristicVarargs(value: EvidenceVariableCharacteristic*): Self = StObject.set(x, "characteristic", js.Array(value*))
    
    inline def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEditor(value: js.Array[ContactDetail]): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    inline def setEditorVarargs(value: ContactDetail*): Self = StObject.set(x, "editor", js.Array(value*))
    
    inline def setEndorser(value: js.Array[ContactDetail]): Self = StObject.set(x, "endorser", value.asInstanceOf[js.Any])
    
    inline def setEndorserUndefined: Self = StObject.set(x, "endorser", js.undefined)
    
    inline def setEndorserVarargs(value: ContactDetail*): Self = StObject.set(x, "endorser", js.Array(value*))
    
    inline def setHandling(value: continuous | dichotomous | ordinal | polychotomous): Self = StObject.set(x, "handling", value.asInstanceOf[js.Any])
    
    inline def setHandlingUndefined: Self = StObject.set(x, "handling", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setRelatedArtifact(value: js.Array[RelatedArtifact]): Self = StObject.set(x, "relatedArtifact", value.asInstanceOf[js.Any])
    
    inline def setRelatedArtifactUndefined: Self = StObject.set(x, "relatedArtifact", js.undefined)
    
    inline def setRelatedArtifactVarargs(value: RelatedArtifact*): Self = StObject.set(x, "relatedArtifact", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.EvidenceVariable): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setReviewer(value: js.Array[ContactDetail]): Self = StObject.set(x, "reviewer", value.asInstanceOf[js.Any])
    
    inline def setReviewerUndefined: Self = StObject.set(x, "reviewer", js.undefined)
    
    inline def setReviewerVarargs(value: ContactDetail*): Self = StObject.set(x, "reviewer", js.Array(value*))
    
    inline def setShortTitle(value: String): Self = StObject.set(x, "shortTitle", value.asInstanceOf[js.Any])
    
    inline def setShortTitleUndefined: Self = StObject.set(x, "shortTitle", js.undefined)
    
    inline def setStatus(value: draft | active | retired | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    inline def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    inline def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_actual(value: Element): Self = StObject.set(x, "_actual", value.asInstanceOf[js.Any])
    
    inline def set_actualUndefined: Self = StObject.set(x, "_actual", js.undefined)
    
    inline def set_characteristicCombination(value: Element): Self = StObject.set(x, "_characteristicCombination", value.asInstanceOf[js.Any])
    
    inline def set_characteristicCombinationUndefined: Self = StObject.set(x, "_characteristicCombination", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_handling(value: Element): Self = StObject.set(x, "_handling", value.asInstanceOf[js.Any])
    
    inline def set_handlingUndefined: Self = StObject.set(x, "_handling", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_publisher(value: Element): Self = StObject.set(x, "_publisher", value.asInstanceOf[js.Any])
    
    inline def set_publisherUndefined: Self = StObject.set(x, "_publisher", js.undefined)
    
    inline def set_shortTitle(value: Element): Self = StObject.set(x, "_shortTitle", value.asInstanceOf[js.Any])
    
    inline def set_shortTitleUndefined: Self = StObject.set(x, "_shortTitle", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_subtitle(value: Element): Self = StObject.set(x, "_subtitle", value.asInstanceOf[js.Any])
    
    inline def set_subtitleUndefined: Self = StObject.set(x, "_subtitle", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
