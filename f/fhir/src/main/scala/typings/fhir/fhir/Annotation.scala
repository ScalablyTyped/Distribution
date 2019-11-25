package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Text node with attribution
  */
trait Annotation extends Element {
  /**
    * Contains extended information for property 'authorString'.
    */
  var _authorString: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'time'.
    */
  var _time: js.UndefOr[Element] = js.undefined
  /**
    * Individual responsible for the annotation
    */
  var authorReference: js.UndefOr[Reference] = js.undefined
  /**
    * Individual responsible for the annotation
    */
  var authorString: js.UndefOr[String] = js.undefined
  /**
    * The annotation  - text content
    */
  var text: String
  /**
    * When the annotation was made
    */
  var time: js.UndefOr[dateTime] = js.undefined
}

object Annotation {
  @scala.inline
  def apply(
    text: String,
    _authorString: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _text: Element = null,
    _time: Element = null,
    authorReference: Reference = null,
    authorString: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    time: dateTime = null
  ): Annotation = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (_authorString != null) __obj.updateDynamic("_authorString")(_authorString.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_text != null) __obj.updateDynamic("_text")(_text.asInstanceOf[js.Any])
    if (_time != null) __obj.updateDynamic("_time")(_time.asInstanceOf[js.Any])
    if (authorReference != null) __obj.updateDynamic("authorReference")(authorReference.asInstanceOf[js.Any])
    if (authorString != null) __obj.updateDynamic("authorString")(authorString.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
}

