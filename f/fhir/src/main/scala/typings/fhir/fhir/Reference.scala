package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference from one resource to another
  */
trait Reference extends Element {
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'reference'.
    */
  var _reference: js.UndefOr[Element] = js.undefined
  /**
    * Text alternative for the resource
    */
  var display: js.UndefOr[String] = js.undefined
  /**
    * Logical reference, when literal reference is not known
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Literal reference, Relative, internal or absolute URL
    */
  var reference: js.UndefOr[String] = js.undefined
}

object Reference {
  @scala.inline
  def apply(
    _display: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _reference: Element = null,
    display: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    identifier: Identifier = null,
    reference: String = null
  ): Reference = {
    val __obj = js.Dynamic.literal()
    if (_display != null) __obj.updateDynamic("_display")(_display.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_reference != null) __obj.updateDynamic("_reference")(_reference.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (reference != null) __obj.updateDynamic("reference")(reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
}

