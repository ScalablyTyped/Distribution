package typings
package gapiDotClientDotLanguageLib.gapiNs.clientNs.languageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartOfSpeech extends js.Object {
  /** The grammatical aspect. */
  var aspect: js.UndefOr[java.lang.String] = js.undefined
  /** The grammatical case. */
  var `case`: js.UndefOr[java.lang.String] = js.undefined
  /** The grammatical form. */
  var form: js.UndefOr[java.lang.String] = js.undefined
  /** The grammatical gender. */
  var gender: js.UndefOr[java.lang.String] = js.undefined
  /** The grammatical mood. */
  var mood: js.UndefOr[java.lang.String] = js.undefined
  /** The grammatical number. */
  var number: js.UndefOr[java.lang.String] = js.undefined
  /** The grammatical person. */
  var person: js.UndefOr[java.lang.String] = js.undefined
  /** The grammatical properness. */
  var proper: js.UndefOr[java.lang.String] = js.undefined
  /** The grammatical reciprocity. */
  var reciprocity: js.UndefOr[java.lang.String] = js.undefined
  /** The part of speech tag. */
  var tag: js.UndefOr[java.lang.String] = js.undefined
  /** The grammatical tense. */
  var tense: js.UndefOr[java.lang.String] = js.undefined
  /** The grammatical voice. */
  var voice: js.UndefOr[java.lang.String] = js.undefined
}

object PartOfSpeech {
  @scala.inline
  def apply(
    aspect: java.lang.String = null,
    `case`: java.lang.String = null,
    form: java.lang.String = null,
    gender: java.lang.String = null,
    mood: java.lang.String = null,
    number: java.lang.String = null,
    person: java.lang.String = null,
    proper: java.lang.String = null,
    reciprocity: java.lang.String = null,
    tag: java.lang.String = null,
    tense: java.lang.String = null,
    voice: java.lang.String = null
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

