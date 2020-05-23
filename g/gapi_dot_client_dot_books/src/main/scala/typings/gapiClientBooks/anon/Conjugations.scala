package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conjugations extends js.Object {
  var conjugations: js.UndefOr[js.Array[Type]] = js.undefined
  var definitions: js.UndefOr[js.Array[Definition]] = js.undefined
  var partOfSpeech: js.UndefOr[String] = js.undefined
  var pronunciation: js.UndefOr[String] = js.undefined
  var pronunciationUrl: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[Attribution] = js.undefined
  var syllabification: js.UndefOr[String] = js.undefined
  var synonyms: js.UndefOr[js.Array[Source]] = js.undefined
}

object Conjugations {
  @scala.inline
  def apply(
    conjugations: js.Array[Type] = null,
    definitions: js.Array[Definition] = null,
    partOfSpeech: String = null,
    pronunciation: String = null,
    pronunciationUrl: String = null,
    source: Attribution = null,
    syllabification: String = null,
    synonyms: js.Array[Source] = null
  ): Conjugations = {
    val __obj = js.Dynamic.literal()
    if (conjugations != null) __obj.updateDynamic("conjugations")(conjugations.asInstanceOf[js.Any])
    if (definitions != null) __obj.updateDynamic("definitions")(definitions.asInstanceOf[js.Any])
    if (partOfSpeech != null) __obj.updateDynamic("partOfSpeech")(partOfSpeech.asInstanceOf[js.Any])
    if (pronunciation != null) __obj.updateDynamic("pronunciation")(pronunciation.asInstanceOf[js.Any])
    if (pronunciationUrl != null) __obj.updateDynamic("pronunciationUrl")(pronunciationUrl.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (syllabification != null) __obj.updateDynamic("syllabification")(syllabification.asInstanceOf[js.Any])
    if (synonyms != null) __obj.updateDynamic("synonyms")(synonyms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conjugations]
  }
}

