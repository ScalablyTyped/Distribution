package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The items included
  */
@js.native
trait DocumentManifestContent extends BackboneElement {
  /**
    * Contents of this set of documents
    */
  var pAttachment: js.UndefOr[Attachment] = js.native
  /**
    * Contents of this set of documents
    */
  var pReference: js.UndefOr[Reference] = js.native
}

object DocumentManifestContent {
  @scala.inline
  def apply(): DocumentManifestContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentManifestContent]
  }
  @scala.inline
  implicit class DocumentManifestContentOps[Self <: DocumentManifestContent] (val x: Self) extends AnyVal {
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
    def setPAttachment(value: Attachment): Self = this.set("pAttachment", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePAttachment: Self = this.set("pAttachment", js.undefined)
    @scala.inline
    def setPReference(value: Reference): Self = this.set("pReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePReference: Self = this.set("pReference", js.undefined)
  }
  
}

