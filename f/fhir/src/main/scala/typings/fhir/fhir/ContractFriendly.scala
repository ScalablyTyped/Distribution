package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contract Friendly Language
  */
trait ContractFriendly extends BackboneElement {
  /**
    * Easily comprehended representation of this Contract
    */
  var contentAttachment: js.UndefOr[Attachment] = js.undefined
  /**
    * Easily comprehended representation of this Contract
    */
  var contentReference: js.UndefOr[Reference] = js.undefined
}

object ContractFriendly {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    contentAttachment: Attachment = null,
    contentReference: Reference = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): ContractFriendly = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (contentAttachment != null) __obj.updateDynamic("contentAttachment")(contentAttachment)
    if (contentReference != null) __obj.updateDynamic("contentReference")(contentReference)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[ContractFriendly]
  }
}

