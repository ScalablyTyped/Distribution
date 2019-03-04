package typings
package fhirLib.fhirNs

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
  var authorString: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The annotation  - text content
    */
  var text: java.lang.String
  /**
    * When the annotation was made
    */
  var time: js.UndefOr[dateTime] = js.undefined
}

object Annotation {
  @scala.inline
  def apply(
    text: java.lang.String,
    _authorString: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _text: Element = null,
    _time: Element = null,
    authorReference: Reference = null,
    authorString: java.lang.String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    time: dateTime = null
  ): Annotation = {
    val __obj = js.Dynamic.literal(text = text)
    if (_authorString != null) __obj.updateDynamic("_authorString")(_authorString)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_text != null) __obj.updateDynamic("_text")(_text)
    if (_time != null) __obj.updateDynamic("_time")(_time)
    if (authorReference != null) __obj.updateDynamic("authorReference")(authorReference)
    if (authorString != null) __obj.updateDynamic("authorString")(authorString)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[Annotation]
  }
}

