package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Key images associated with this report
  */
trait DiagnosticReportImage extends BackboneElement {
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.undefined
  /**
    * Comment about the image (e.g. explanation)
    */
  var comment: js.UndefOr[String] = js.undefined
  /**
    * Reference to the image source
    */
  var link: Reference
}

object DiagnosticReportImage {
  @scala.inline
  def apply(
    link: Reference,
    _comment: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    comment: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): DiagnosticReportImage = {
    val __obj = js.Dynamic.literal(link = link)
    if (_comment != null) __obj.updateDynamic("_comment")(_comment)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[DiagnosticReportImage]
  }
}

