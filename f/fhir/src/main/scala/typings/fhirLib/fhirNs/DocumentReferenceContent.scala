package typings
package fhirLib.fhirNs

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
    fhir_comments: js.Array[java.lang.String] = null,
    format: Coding = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): DocumentReferenceContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attachment")(attachment)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (format != null) __obj.updateDynamic("format")(format)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[DocumentReferenceContent]
  }
}

