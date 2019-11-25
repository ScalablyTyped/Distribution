package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The items included
  */
trait DocumentManifestContent extends BackboneElement {
  /**
    * Contents of this set of documents
    */
  var pAttachment: js.UndefOr[Attachment] = js.undefined
  /**
    * Contents of this set of documents
    */
  var pReference: js.UndefOr[Reference] = js.undefined
}

object DocumentManifestContent {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    pAttachment: Attachment = null,
    pReference: Reference = null
  ): DocumentManifestContent = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (pAttachment != null) __obj.updateDynamic("pAttachment")(pAttachment.asInstanceOf[js.Any])
    if (pReference != null) __obj.updateDynamic("pReference")(pReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentManifestContent]
  }
}

