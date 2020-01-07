package typings.googleapis.buildSrcApisLanguageV1beta2Mod.language_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents part of speech information for a token.
  */
@js.native
trait Schema$PartOfSpeech extends js.Object {
  /**
    * The grammatical aspect.
    */
  var aspect: js.UndefOr[String] = js.native
  /**
    * The grammatical case.
    */
  var `case`: js.UndefOr[String] = js.native
  /**
    * The grammatical form.
    */
  var form: js.UndefOr[String] = js.native
  /**
    * The grammatical gender.
    */
  var gender: js.UndefOr[String] = js.native
  /**
    * The grammatical mood.
    */
  var mood: js.UndefOr[String] = js.native
  /**
    * The grammatical number.
    */
  var number: js.UndefOr[String] = js.native
  /**
    * The grammatical person.
    */
  var person: js.UndefOr[String] = js.native
  /**
    * The grammatical properness.
    */
  var proper: js.UndefOr[String] = js.native
  /**
    * The grammatical reciprocity.
    */
  var reciprocity: js.UndefOr[String] = js.native
  /**
    * The part of speech tag.
    */
  var tag: js.UndefOr[String] = js.native
  /**
    * The grammatical tense.
    */
  var tense: js.UndefOr[String] = js.native
  /**
    * The grammatical voice.
    */
  var voice: js.UndefOr[String] = js.native
}

object Schema$PartOfSpeech {
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
  ): Schema$PartOfSpeech = {
    val __obj = js.Dynamic.literal()
    if (aspect != null) __obj.updateDynamic("aspect")(aspect.asInstanceOf[js.Any])
    if (`case` != null) __obj.updateDynamic("case")(`case`.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (mood != null) __obj.updateDynamic("mood")(mood.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (person != null) __obj.updateDynamic("person")(person.asInstanceOf[js.Any])
    if (proper != null) __obj.updateDynamic("proper")(proper.asInstanceOf[js.Any])
    if (reciprocity != null) __obj.updateDynamic("reciprocity")(reciprocity.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (tense != null) __obj.updateDynamic("tense")(tense.asInstanceOf[js.Any])
    if (voice != null) __obj.updateDynamic("voice")(voice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PartOfSpeech]
  }
}

