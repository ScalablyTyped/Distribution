package typings.gapiDotClientDotLanguage.gapi.client.language

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartOfSpeech extends js.Object {
  /** The grammatical aspect. */
  var aspect: js.UndefOr[String] = js.undefined
  /** The grammatical case. */
  var `case`: js.UndefOr[String] = js.undefined
  /** The grammatical form. */
  var form: js.UndefOr[String] = js.undefined
  /** The grammatical gender. */
  var gender: js.UndefOr[String] = js.undefined
  /** The grammatical mood. */
  var mood: js.UndefOr[String] = js.undefined
  /** The grammatical number. */
  var number: js.UndefOr[String] = js.undefined
  /** The grammatical person. */
  var person: js.UndefOr[String] = js.undefined
  /** The grammatical properness. */
  var proper: js.UndefOr[String] = js.undefined
  /** The grammatical reciprocity. */
  var reciprocity: js.UndefOr[String] = js.undefined
  /** The part of speech tag. */
  var tag: js.UndefOr[String] = js.undefined
  /** The grammatical tense. */
  var tense: js.UndefOr[String] = js.undefined
  /** The grammatical voice. */
  var voice: js.UndefOr[String] = js.undefined
}

object PartOfSpeech {
  @scala.inline
  def apply(
    aspect: String = null,
    `case`: String = null,
    form: String = null,
    gender: String = null,
    mood: String = null,
    number: String = null,
    person: String = null,
    proper: String = null,
    reciprocity: String = null,
    tag: String = null,
    tense: String = null,
    voice: String = null
  ): PartOfSpeech = {
    val __obj = js.Dynamic.literal()
    if (aspect != null) __obj.updateDynamic("aspect")(aspect)
    if (`case` != null) __obj.updateDynamic("case")(`case`)
    if (form != null) __obj.updateDynamic("form")(form)
    if (gender != null) __obj.updateDynamic("gender")(gender)
    if (mood != null) __obj.updateDynamic("mood")(mood)
    if (number != null) __obj.updateDynamic("number")(number)
    if (person != null) __obj.updateDynamic("person")(person)
    if (proper != null) __obj.updateDynamic("proper")(proper)
    if (reciprocity != null) __obj.updateDynamic("reciprocity")(reciprocity)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (tense != null) __obj.updateDynamic("tense")(tense)
    if (voice != null) __obj.updateDynamic("voice")(voice)
    __obj.asInstanceOf[PartOfSpeech]
  }
}

