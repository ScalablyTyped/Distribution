package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Document referenced
  */
trait DocumentReferenceContent extends BackboneElement {
  /**
    * Where to access the document
    */
  var attachment: Attachment
  /**
    * Format/content rules for the document
    */
  var format: js.UndefOr[Coding] = js.undefined
}

object DocumentReferenceContent {
  @scala.inline
  def apply(
    attachment: Attachment,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    format: Coding = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): DocumentReferenceContent = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentReferenceContent]
  }
}

