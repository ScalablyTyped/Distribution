package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`final`
import typings.fhir.fhirStrings.amended
import typings.fhir.fhirStrings.appended
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.corrected
import typings.fhir.fhirStrings.current
import typings.fhir.fhirStrings.deprecated
import typings.fhir.fhirStrings.partial
import typings.fhir.fhirStrings.preliminary
import typings.fhir.fhirStrings.registered
import typings.fhir.fhirStrings.superseded
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentReference
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _docStatus: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * Only list each attester once.
    */
  var attester: js.UndefOr[js.Array[DocumentReferenceAttester]] = js.undefined
  
  /**
    * Not necessarily who did the actual data entry (i.e. typist) or who was the source (informant).
    */
  var author: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A procedure that is fulfilled in whole or in part by the creation of this media.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The anatomic structures included in the document.
    */
  var bodySite: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * Key metadata element describing the the category or classification of the document. This is a broader perspective that groups similar documents based on how they would be used. This is a primary key used in searching.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * content element shall not contain different versions of the same content. For version handling use multiple DocumentReference with .relatesTo.
    */
  var content: js.Array[DocumentReferenceContent]
  
  /**
    * Describes the clinical encounter or type of care that the document content is associated with.
    */
  var context: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Identifies the logical organization (software system, vendor, or department) to go to find the current version, where to report issues, etc. This is different from the physical location (URL, disk drive, or server) of the document, which is the technical location of the document, which host may be delegated to the management of some other organization.
    */
  var custodian: js.UndefOr[Reference] = js.undefined
  
  /**
    * Referencing/indexing time is used for tracking, organizing versions and searching.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * What the document is about,  a terse summary of the document.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The document that is pointed to might be in various lifecycle states.
    */
  var docStatus: js.UndefOr[
    registered | partial | preliminary | `final` | amended | corrected | appended | cancelled | `entered-in-error` | deprecated | unknown
  ] = js.undefined
  
  /**
    * An event can further specialize the act inherent in the type, such as  where it is simply "Procedure Report" and the procedure was a "colonoscopy". If one or more event codes are included, they shall not conflict with the values inherent in the class or type elements as such a conflict would create an ambiguous situation.
    */
  var event: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * The kind of facility where the patient was seen.
    */
  var facilityType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The structure and format of this identifier would be consistent with the specification corresponding to the format of the document. (e.g. for a DICOM standard document, a 64-character numeric UID; for an HL7 CDA format, the CDA Document Id root and extension).
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Imaging modality used. This may include both acquisition and non-acquisition modalities.
    */
  var modality: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The time period over which the service that is described by the document was provided.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * This element should be based on a coarse classification system for the class of specialty practice. Recommend the use of the classification system for Practice Setting, such as that described by the Subject Matter Domain in LOINC.
    */
  var practiceSetting: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * This element is labeled as a modifier because documents that append to other documents are incomplete on their own.
    */
  var relatesTo: js.UndefOr[js.Array[DocumentReferenceRelatesTo]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_DocumentReference: typings.fhir.fhirStrings.DocumentReference
  
  /**
    * The confidentiality codes can carry multiple vocabulary items. HL7 has developed an understanding of security and privacy tags that might be desirable in a Document Sharing environment, called HL7 Healthcare Privacy and Security Classification System (HCS). The following specification is recommended but not mandated, as the vocabulary bindings are an administrative domain responsibility. The use of this method is up to the policy domain such as the XDS Affinity Domain or other Trust Domain where all parties including sender and recipients are trusted to appropriately tag and enforce.
    * In the HL7 Healthcare Privacy and Security Classification (HCS) there are code systems specific to Confidentiality, Sensitivity, Integrity, and Handling Caveats. Some values would come from a local vocabulary as they are related to workflow roles and special projects.
    */
  var securityLabel: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * This is the status of the DocumentReference object, which might be independent from the docStatus element.
    * This element is labeled as a modifier because the status contains the codes that mark the document or reference as not currently valid.
    */
  var status: current | superseded | `entered-in-error`
  
  /**
    * Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * Key metadata element describing the document that describes he exact type of document. Helps humans to assess whether the document is of interest when viewing a list of documents.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * While each resource, including the DocumentReference itself, has its own version identifier, this is a formal identifier for the logical version of the DocumentReference as a whole. It would remain constant if the resources were moved to a new server, and all got new individual resource versions, for example.
    */
  var version: js.UndefOr[String] = js.undefined
}
object DocumentReference {
  
  inline def apply(content: js.Array[DocumentReferenceContent], status: current | superseded | `entered-in-error`): DocumentReference = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], resourceType = "DocumentReference", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentReference] (val x: Self) extends AnyVal {
    
    inline def setAttester(value: js.Array[DocumentReferenceAttester]): Self = StObject.set(x, "attester", value.asInstanceOf[js.Any])
    
    inline def setAttesterUndefined: Self = StObject.set(x, "attester", js.undefined)
    
    inline def setAttesterVarargs(value: DocumentReferenceAttester*): Self = StObject.set(x, "attester", js.Array(value*))
    
    inline def setAuthor(value: js.Array[Reference]): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setAuthorVarargs(value: Reference*): Self = StObject.set(x, "author", js.Array(value*))
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setBodySite(value: js.Array[CodeableReference]): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setBodySiteVarargs(value: CodeableReference*): Self = StObject.set(x, "bodySite", js.Array(value*))
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setContent(value: js.Array[DocumentReferenceContent]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentVarargs(value: DocumentReferenceContent*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setContext(value: js.Array[Reference]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setContextVarargs(value: Reference*): Self = StObject.set(x, "context", js.Array(value*))
    
    inline def setCustodian(value: Reference): Self = StObject.set(x, "custodian", value.asInstanceOf[js.Any])
    
    inline def setCustodianUndefined: Self = StObject.set(x, "custodian", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDocStatus(
      value: registered | partial | preliminary | `final` | amended | corrected | appended | cancelled | `entered-in-error` | deprecated | unknown
    ): Self = StObject.set(x, "docStatus", value.asInstanceOf[js.Any])
    
    inline def setDocStatusUndefined: Self = StObject.set(x, "docStatus", js.undefined)
    
    inline def setEvent(value: js.Array[CodeableReference]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setEventVarargs(value: CodeableReference*): Self = StObject.set(x, "event", js.Array(value*))
    
    inline def setFacilityType(value: CodeableConcept): Self = StObject.set(x, "facilityType", value.asInstanceOf[js.Any])
    
    inline def setFacilityTypeUndefined: Self = StObject.set(x, "facilityType", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setModality(value: js.Array[CodeableConcept]): Self = StObject.set(x, "modality", value.asInstanceOf[js.Any])
    
    inline def setModalityUndefined: Self = StObject.set(x, "modality", js.undefined)
    
    inline def setModalityVarargs(value: CodeableConcept*): Self = StObject.set(x, "modality", js.Array(value*))
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPracticeSetting(value: CodeableConcept): Self = StObject.set(x, "practiceSetting", value.asInstanceOf[js.Any])
    
    inline def setPracticeSettingUndefined: Self = StObject.set(x, "practiceSetting", js.undefined)
    
    inline def setRelatesTo(value: js.Array[DocumentReferenceRelatesTo]): Self = StObject.set(x, "relatesTo", value.asInstanceOf[js.Any])
    
    inline def setRelatesToUndefined: Self = StObject.set(x, "relatesTo", js.undefined)
    
    inline def setRelatesToVarargs(value: DocumentReferenceRelatesTo*): Self = StObject.set(x, "relatesTo", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.DocumentReference): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSecurityLabel(value: js.Array[CodeableConcept]): Self = StObject.set(x, "securityLabel", value.asInstanceOf[js.Any])
    
    inline def setSecurityLabelUndefined: Self = StObject.set(x, "securityLabel", js.undefined)
    
    inline def setSecurityLabelVarargs(value: CodeableConcept*): Self = StObject.set(x, "securityLabel", js.Array(value*))
    
    inline def setStatus(value: current | superseded | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_docStatus(value: Element): Self = StObject.set(x, "_docStatus", value.asInstanceOf[js.Any])
    
    inline def set_docStatusUndefined: Self = StObject.set(x, "_docStatus", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
