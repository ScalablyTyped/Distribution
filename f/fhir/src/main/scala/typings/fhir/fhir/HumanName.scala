package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Name of a human - parts and usage
  */
trait HumanName extends Element {
  /**
    * Contains extended information for property 'family'.
    */
  var _family: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'given'.
    */
  var _given: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'prefix'.
    */
  var _prefix: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'suffix'.
    */
  var _suffix: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.undefined
  /**
    * Family name (often called 'Surname')
    */
  var family: js.UndefOr[String] = js.undefined
  /**
    * Given names (not always 'first'). Includes middle names
    */
  var given: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Time period when name was/is in use
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * Parts that come before the name
    */
  var prefix: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Parts that come after the name
    */
  var suffix: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Text representation of the full name
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * usual | official | temp | nickname | anonymous | old | maiden
    */
  var use: js.UndefOr[code] = js.undefined
}

object HumanName {
  @scala.inline
  def apply(
    _family: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _given: js.Array[Element] = null,
    _id: Element = null,
    _prefix: js.Array[Element] = null,
    _suffix: js.Array[Element] = null,
    _text: Element = null,
    _use: Element = null,
    extension: js.Array[Extension] = null,
    family: String = null,
    fhir_comments: js.Array[String] = null,
    given: js.Array[String] = null,
    id: String = null,
    period: Period = null,
    prefix: js.Array[String] = null,
    suffix: js.Array[String] = null,
    text: String = null,
    use: code = null
  ): HumanName = {
    val __obj = js.Dynamic.literal()
    if (_family != null) __obj.updateDynamic("_family")(_family.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_given != null) __obj.updateDynamic("_given")(_given.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_prefix != null) __obj.updateDynamic("_prefix")(_prefix.asInstanceOf[js.Any])
    if (_suffix != null) __obj.updateDynamic("_suffix")(_suffix.asInstanceOf[js.Any])
    if (_text != null) __obj.updateDynamic("_text")(_text.asInstanceOf[js.Any])
    if (_use != null) __obj.updateDynamic("_use")(_use.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (given != null) __obj.updateDynamic("given")(given.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanName]
  }
}

