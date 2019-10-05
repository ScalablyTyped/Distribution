package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message payload
  */
trait CommunicationPayload extends BackboneElement {
  /**
    * Contains extended information for property 'contentString'.
    */
  var _contentString: js.UndefOr[Element] = js.undefined
  /**
    * Message part content
    */
  var contentAttachment: js.UndefOr[Attachment] = js.undefined
  /**
    * Message part content
    */
  var contentReference: js.UndefOr[Reference] = js.undefined
  /**
    * Message part content
    */
  var contentString: js.UndefOr[String] = js.undefined
}

object CommunicationPayload {
  @scala.inline
  def apply(
    _contentString: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    contentAttachment: Attachment = null,
    contentReference: Reference = null,
    contentString: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): CommunicationPayload = {
    val __obj = js.Dynamic.literal()
    if (_contentString != null) __obj.updateDynamic("_contentString")(_contentString)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (contentAttachment != null) __obj.updateDynamic("contentAttachment")(contentAttachment)
    if (contentReference != null) __obj.updateDynamic("contentReference")(contentReference)
    if (contentString != null) __obj.updateDynamic("contentString")(contentString)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[CommunicationPayload]
  }
}

