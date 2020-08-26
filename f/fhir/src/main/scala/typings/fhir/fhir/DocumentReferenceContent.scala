package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Document referenced
  */
@js.native
trait DocumentReferenceContent extends BackboneElement {
  /**
    * Where to access the document
    */
  var attachment: Attachment = js.native
  /**
    * Format/content rules for the document
    */
  var format: js.UndefOr[Coding] = js.native
}

object DocumentReferenceContent {
  @scala.inline
  def apply(attachment: Attachment): DocumentReferenceContent = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentReferenceContent]
  }
  @scala.inline
  implicit class DocumentReferenceContentOps[Self <: DocumentReferenceContent] (val x: Self) extends AnyVal {
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
    def setAttachment(value: Attachment): Self = this.set("attachment", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: Coding): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
  
}

