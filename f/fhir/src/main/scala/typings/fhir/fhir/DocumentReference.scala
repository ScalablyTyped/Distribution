package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to a document
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait DocumentReference
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'docStatus'.
    */
  var _docStatus: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'indexed'.
    */
  var _indexed: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Who/what authenticated the document
    */
  var authenticator: js.UndefOr[Reference] = js.undefined
  
  /**
    * Who and/or what authored the document
    */
  var author: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Categorization of document
    */
  var `class`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Document referenced
    */
  var content: js.Array[DocumentReferenceContent]
  
  /**
    * Clinical context of document
    */
  var context: js.UndefOr[DocumentReferenceContext] = js.undefined
  
  /**
    * Document creation time
    */
  var created: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Organization which maintains the document
    */
  var custodian: js.UndefOr[Reference] = js.undefined
  
  /**
    * Human-readable description (title)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * preliminary | final | appended | amended | entered-in-error
    */
  var docStatus: js.UndefOr[code] = js.undefined
  
  /**
    * Other identifiers for the document
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * When this document reference was created
    */
  var indexed: instant
  
  /**
    * Master Version Specific Identifier
    */
  var masterIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Relationships to other documents
    */
  var relatesTo: js.UndefOr[js.Array[DocumentReferenceRelatesTo]] = js.undefined
  
  /**
    * Document security-tags
    */
  var securityLabel: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * current | superseded | entered-in-error
    */
  var status: code
  
  /**
    * Who/what is the subject of the document
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * Kind of document (LOINC if possible)
    */
  var `type`: CodeableConcept
}
object DocumentReference {
  
  @scala.inline
  def apply(
    content: js.Array[DocumentReferenceContent],
    indexed: instant,
    status: code,
    `type`: CodeableConcept
  ): DocumentReference = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], indexed = indexed.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentReference]
  }
  
  @scala.inline
  implicit class DocumentReferenceMutableBuilder[Self <: DocumentReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticator(value: Reference): Self = StObject.set(x, "authenticator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticatorUndefined: Self = StObject.set(x, "authenticator", js.undefined)
    
    @scala.inline
    def setAuthor(value: js.Array[Reference]): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setAuthorVarargs(value: Reference*): Self = StObject.set(x, "author", js.Array(value :_*))
    
    @scala.inline
    def setClass(value: CodeableConcept): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    @scala.inline
    def setContent(value: js.Array[DocumentReferenceContent]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentVarargs(value: DocumentReferenceContent*): Self = StObject.set(x, "content", js.Array(value :_*))
    
    @scala.inline
    def setContext(value: DocumentReferenceContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setCreated(value: dateTime): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setCustodian(value: Reference): Self = StObject.set(x, "custodian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustodianUndefined: Self = StObject.set(x, "custodian", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDocStatus(value: code): Self = StObject.set(x, "docStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocStatusUndefined: Self = StObject.set(x, "docStatus", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setIndexed(value: instant): Self = StObject.set(x, "indexed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterIdentifier(value: Identifier): Self = StObject.set(x, "masterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterIdentifierUndefined: Self = StObject.set(x, "masterIdentifier", js.undefined)
    
    @scala.inline
    def setRelatesTo(value: js.Array[DocumentReferenceRelatesTo]): Self = StObject.set(x, "relatesTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatesToUndefined: Self = StObject.set(x, "relatesTo", js.undefined)
    
    @scala.inline
    def setRelatesToVarargs(value: DocumentReferenceRelatesTo*): Self = StObject.set(x, "relatesTo", js.Array(value :_*))
    
    @scala.inline
    def setSecurityLabel(value: js.Array[CodeableConcept]): Self = StObject.set(x, "securityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityLabelUndefined: Self = StObject.set(x, "securityLabel", js.undefined)
    
    @scala.inline
    def setSecurityLabelVarargs(value: CodeableConcept*): Self = StObject.set(x, "securityLabel", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_docStatus(value: Element): Self = StObject.set(x, "_docStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_docStatusUndefined: Self = StObject.set(x, "_docStatus", js.undefined)
    
    @scala.inline
    def set_indexed(value: Element): Self = StObject.set(x, "_indexed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_indexedUndefined: Self = StObject.set(x, "_indexed", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
