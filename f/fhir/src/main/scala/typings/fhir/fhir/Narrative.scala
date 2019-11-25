package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A human-readable formatted text, including images
  */
trait Narrative extends Element {
  /**
    * Contains extended information for property 'div'.
    */
  var _div: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Limited xhtml content
    */
  var div: String
  /**
    * generated | extensions | additional | empty
    */
  var status: code
}

object Narrative {
  @scala.inline
  def apply(
    div: String,
    status: code,
    _div: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _status: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null
  ): Narrative = {
    val __obj = js.Dynamic.literal(div = div.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_div != null) __obj.updateDynamic("_div")(_div.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Narrative]
  }
}

