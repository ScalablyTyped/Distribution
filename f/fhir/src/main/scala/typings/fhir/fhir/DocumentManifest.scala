package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list that defines a set of documents
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait DocumentManifest extends DomainResource {
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'source'.
    */
  var _source: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Who and/or what authored the manifest
    */
  var author: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * The items included
    */
  var content: js.Array[DocumentManifestContent] = js.native
  /**
    * When this document manifest created
    */
  var created: js.UndefOr[dateTime] = js.native
  /**
    * Human-readable description (title)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Other identifiers for the manifest
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Unique Identifier for the set of documents
    */
  var masterIdentifier: js.UndefOr[Identifier] = js.native
  /**
    * Intended to get notified about this set of documents
    */
  var recipient: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Related things
    */
  var related: js.UndefOr[js.Array[DocumentManifestRelated]] = js.native
  /**
    * The source system/application/software
    */
  var source: js.UndefOr[uri] = js.native
  /**
    * current | superseded | entered-in-error
    */
  var status: code = js.native
  /**
    * The subject of the set of documents
    */
  var subject: js.UndefOr[Reference] = js.native
  /**
    * Kind of document set
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}

object DocumentManifest {
  @scala.inline
  def apply(content: js.Array[DocumentManifestContent], status: code): DocumentManifest = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentManifest]
  }
  @scala.inline
  implicit class DocumentManifestOps[Self <: DocumentManifest] (val x: Self) extends AnyVal {
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
    def setContentVarargs(value: DocumentManifestContent*): Self = this.set("content", js.Array(value :_*))
    @scala.inline
    def setContent(value: js.Array[DocumentManifestContent]): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def set_created(value: Element): Self = this.set("_created", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_created: Self = this.set("_created", js.undefined)
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def set_source(value: Element): Self = this.set("_source", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_source: Self = this.set("_source", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def setAuthorVarargs(value: Reference*): Self = this.set("author", js.Array(value :_*))
    @scala.inline
    def setAuthor(value: js.Array[Reference]): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setCreated(value: dateTime): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
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
    def setRecipientVarargs(value: Reference*): Self = this.set("recipient", js.Array(value :_*))
    @scala.inline
    def setRecipient(value: js.Array[Reference]): Self = this.set("recipient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipient: Self = this.set("recipient", js.undefined)
    @scala.inline
    def setRelatedVarargs(value: DocumentManifestRelated*): Self = this.set("related", js.Array(value :_*))
    @scala.inline
    def setRelated(value: js.Array[DocumentManifestRelated]): Self = this.set("related", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelated: Self = this.set("related", js.undefined)
    @scala.inline
    def setSource(value: uri): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

