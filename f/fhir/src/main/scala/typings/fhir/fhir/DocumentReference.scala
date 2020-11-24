package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to a document
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait DocumentReference extends DomainResource {
  
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'docStatus'.
    */
  var _docStatus: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'indexed'.
    */
  var _indexed: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Who/what authenticated the document
    */
  var authenticator: js.UndefOr[Reference] = js.native
  
  /**
    * Who and/or what authored the document
    */
  var author: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Categorization of document
    */
  var `class`: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Document referenced
    */
  var content: js.Array[DocumentReferenceContent] = js.native
  
  /**
    * Clinical context of document
    */
  var context: js.UndefOr[DocumentReferenceContext] = js.native
  
  /**
    * Document creation time
    */
  var created: js.UndefOr[dateTime] = js.native
  
  /**
    * Organization which maintains the document
    */
  var custodian: js.UndefOr[Reference] = js.native
  
  /**
    * Human-readable description (title)
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * preliminary | final | appended | amended | entered-in-error
    */
  var docStatus: js.UndefOr[code] = js.native
  
  /**
    * Other identifiers for the document
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * When this document reference was created
    */
  var indexed: instant = js.native
  
  /**
    * Master Version Specific Identifier
    */
  var masterIdentifier: js.UndefOr[Identifier] = js.native
  
  /**
    * Relationships to other documents
    */
  var relatesTo: js.UndefOr[js.Array[DocumentReferenceRelatesTo]] = js.native
  
  /**
    * Document security-tags
    */
  var securityLabel: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * current | superseded | entered-in-error
    */
  var status: code = js.native
  
  /**
    * Who/what is the subject of the document
    */
  var subject: js.UndefOr[Reference] = js.native
  
  /**
    * Kind of document (LOINC if possible)
    */
  var `type`: CodeableConcept = js.native
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
  implicit class DocumentReferenceOps[Self <: DocumentReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContentVarargs(value: DocumentReferenceContent*): Self = this.set("content", js.Array(value :_*))
    
    @scala.inline
    def setContent(value: js.Array[DocumentReferenceContent]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexed(value: instant): Self = this.set("indexed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_created(value: Element): Self = this.set("_created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_created: Self = this.set("_created", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    
    @scala.inline
    def set_docStatus(value: Element): Self = this.set("_docStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_docStatus: Self = this.set("_docStatus", js.undefined)
    
    @scala.inline
    def set_indexed(value: Element): Self = this.set("_indexed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_indexed: Self = this.set("_indexed", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def setAuthenticator(value: Reference): Self = this.set("authenticator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticator: Self = this.set("authenticator", js.undefined)
    
    @scala.inline
    def setAuthorVarargs(value: Reference*): Self = this.set("author", js.Array(value :_*))
    
    @scala.inline
    def setAuthor(value: js.Array[Reference]): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    
    @scala.inline
    def setClass(value: CodeableConcept): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    
    @scala.inline
    def setContext(value: DocumentReferenceContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setCreated(value: dateTime): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setCustodian(value: Reference): Self = this.set("custodian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustodian: Self = this.set("custodian", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDocStatus(value: code): Self = this.set("docStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocStatus: Self = this.set("docStatus", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setMasterIdentifier(value: Identifier): Self = this.set("masterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterIdentifier: Self = this.set("masterIdentifier", js.undefined)
    
    @scala.inline
    def setRelatesToVarargs(value: DocumentReferenceRelatesTo*): Self = this.set("relatesTo", js.Array(value :_*))
    
    @scala.inline
    def setRelatesTo(value: js.Array[DocumentReferenceRelatesTo]): Self = this.set("relatesTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatesTo: Self = this.set("relatesTo", js.undefined)
    
    @scala.inline
    def setSecurityLabelVarargs(value: CodeableConcept*): Self = this.set("securityLabel", js.Array(value :_*))
    
    @scala.inline
    def setSecurityLabel(value: js.Array[CodeableConcept]): Self = this.set("securityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityLabel: Self = this.set("securityLabel", js.undefined)
    
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
}
