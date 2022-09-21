package typings.fhir.mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.current
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
  
  var _indexed: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Which person or organization authenticates that this document is valid.
    */
  var authenticator: js.UndefOr[Reference] = js.undefined
  
  /**
    * Identifies who is responsible for adding the information to the document.
    */
  var author: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Helps humans to assess whether the document is of interest when viewing a list of documents.
    */
  var `class`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The document and format referenced. There may be multiple content element repetitions, each with a different format.
    */
  var content: js.Array[DocumentReferenceContent]
  
  /**
    * The clinical context in which the document was prepared.
    */
  var context: js.UndefOr[DocumentReferenceContext] = js.undefined
  
  /**
    * When the document was created.
    */
  var created: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.
    */
  var custodian: js.UndefOr[Reference] = js.undefined
  
  /**
    * Helps humans to assess whether the document is of interest.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the underlying document.
    */
  var docStatus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Other identifiers associated with the document, including version independent identifiers.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * When the document reference was created.
    */
  var indexed: String
  
  /**
    * The structure and format of this Id shall be consistent with the specification corresponding to the formatCode attribute. (e.g. for a DICOM standard document a 64 character numeric UID, for an HL7 CDA format a serialization of the CDA Document Id extension and root in the form "oid^extension", where OID is a 64 digits max, and the Id is a 16 UTF-8 char max. If the OID is coded without the extension then the '^' character shall not be included.).
    */
  var masterIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Relationships that this document has with other document references that already exist.
    */
  var relatesTo: js.UndefOr[js.Array[DocumentReferenceRelatesTo]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_DocumentReference: typings.fhir.fhirStrings.DocumentReference
  
  /**
    * Use of the Health Care Privacy/Security Classification (HCS) system of security-tag use is recommended.
    */
  var securityLabel: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The status of this document reference.
    */
  var status: current | superseded | `entered-in-error`
  
  /**
    * Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * Specifies the particular kind of document referenced  (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the document referenced.
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
  
  extension [Self <: DocumentReference](x: Self) {
    
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
    
    inline def setDocStatus(value: CodeableConcept): Self = StObject.set(x, "docStatus", value.asInstanceOf[js.Any])
    
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
    
    inline def set_indexed(value: Element): Self = StObject.set(x, "_indexed", value.asInstanceOf[js.Any])
    
    inline def set_indexedUndefined: Self = StObject.set(x, "_indexed", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
