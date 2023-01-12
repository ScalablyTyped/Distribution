package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`final`
import typings.fhir.fhirStrings.amended
import typings.fhir.fhirStrings.current
import typings.fhir.fhirStrings.preliminary
import typings.fhir.fhirStrings.superseded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentReference
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _created: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _docStatus: js.UndefOr[Element] = js.undefined
  
  var _indexed: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Represents a participant within the author institution who has legally authenticated or attested the document. Legal authentication implies that a document has been signed manually or electronically by the legal Authenticator.
    */
  var authenticator: js.UndefOr[Reference] = js.undefined
  
  /**
    * Not necessarily who did the actual data entry (i.e. typist) it in or who was the source (informant).
    */
  var author: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This is a metadata field from [XDS/MHD](http://wiki.ihe.net/index.php?title=Mobile_access_to_Health_Documents_(MHD)).
    */
  var `class`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The document and format referenced. There may be multiple content element repetitions, each with a different format.
    */
  var content: js.Array[DocumentReferenceContent]
  
  /**
    * These values are primarily added to help with searching for interesting/relevant documents.
    */
  var context: js.UndefOr[DocumentReferenceContext] = js.undefined
  
  /**
    * Creation time is used for tracking, organizing versions and searching. This is the creation time of the document, not the source material on which it is based.
    */
  var created: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the logical organization to go to find the current version, where to report issues, etc. This is different from the physical location of the document, which is the technical location of the document, which host may be delegated to the management of some other organization.
    */
  var custodian: js.UndefOr[Reference] = js.undefined
  
  /**
    * What the document is about, rather than a terse summary of the document. It is commonly the case that records do not have a title and are collectively referred to by the display name of Record code (e.g. a "consultation" or "progress note").
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The document that is pointed to might be in various lifecycle states.
    */
  var docStatus: js.UndefOr[preliminary | `final` | amended | `entered-in-error`] = js.undefined
  
  /**
    * Other identifiers associated with the document, including version independent identifiers.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Referencing/indexing time is used for tracking, organizing versions and searching.
    */
  var indexed: String
  
  /**
    * CDA Document Id extension and root.
    */
  var masterIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * This element is labeled as a modifier because documents that append to other documents are incomplete on their own.
    */
  var relatesTo: js.UndefOr[js.Array[DocumentReferenceRelatesTo]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_DocumentReference: typings.fhir.fhirStrings.DocumentReference
  
  /**
    * The confidentiality codes can carry multiple vocabulary items. HL7 has developed an understanding of security and privacy tags that might be desirable in a Document Sharing environment, called HL7 Healthcare Privacy and Security Classification System (HCS). The following specification is recommended but not mandated, as the vocabulary bindings are an administrative domain responsibility. The use of this method is up to the policy domain such as the XDS Affinity Domain or other Trust Domain where all parties including sender and recipients are trusted to appropriately tag and enforce.   In the HL7 Healthcare Privacy and Security Classification (HCS) there are code systems specific to Confidentiality, Sensitivity, Integrity, and Handling Caveats. Some values would come from a local vocabulary as they are related to workflow roles and special projects.
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
    * Key metadata element describing the document, used in searching/filtering.
    */
  var `type`: CodeableConcept
}
object DocumentReference {
  
  inline def apply(
    content: js.Array[DocumentReferenceContent],
    indexed: String,
    status: current | superseded | `entered-in-error`,
    `type`: CodeableConcept
  ): DocumentReference = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], indexed = indexed.asInstanceOf[js.Any], resourceType = "DocumentReference", status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentReference] (val x: Self) extends AnyVal {
    
    inline def setAuthenticator(value: Reference): Self = StObject.set(x, "authenticator", value.asInstanceOf[js.Any])
    
    inline def setAuthenticatorUndefined: Self = StObject.set(x, "authenticator", js.undefined)
    
    inline def setAuthor(value: js.Array[Reference]): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setAuthorVarargs(value: Reference*): Self = StObject.set(x, "author", js.Array(value*))
    
    inline def setClass(value: CodeableConcept): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setContent(value: js.Array[DocumentReferenceContent]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentVarargs(value: DocumentReferenceContent*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setContext(value: DocumentReferenceContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setCustodian(value: Reference): Self = StObject.set(x, "custodian", value.asInstanceOf[js.Any])
    
    inline def setCustodianUndefined: Self = StObject.set(x, "custodian", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDocStatus(value: preliminary | `final` | amended | `entered-in-error`): Self = StObject.set(x, "docStatus", value.asInstanceOf[js.Any])
    
    inline def setDocStatusUndefined: Self = StObject.set(x, "docStatus", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setIndexed(value: String): Self = StObject.set(x, "indexed", value.asInstanceOf[js.Any])
    
    inline def setMasterIdentifier(value: Identifier): Self = StObject.set(x, "masterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setMasterIdentifierUndefined: Self = StObject.set(x, "masterIdentifier", js.undefined)
    
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
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_docStatus(value: Element): Self = StObject.set(x, "_docStatus", value.asInstanceOf[js.Any])
    
    inline def set_docStatusUndefined: Self = StObject.set(x, "_docStatus", js.undefined)
    
    inline def set_indexed(value: Element): Self = StObject.set(x, "_indexed", value.asInstanceOf[js.Any])
    
    inline def set_indexedUndefined: Self = StObject.set(x, "_indexed", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
