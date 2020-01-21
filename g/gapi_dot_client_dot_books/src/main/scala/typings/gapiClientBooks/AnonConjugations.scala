package typings.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConjugations extends js.Object {
  var conjugations: js.UndefOr[js.Array[AnonType]] = js.undefined
  var definitions: js.UndefOr[js.Array[AnonDefinition]] = js.undefined
  var partOfSpeech: js.UndefOr[String] = js.undefined
  var pronunciation: js.UndefOr[String] = js.undefined
  var pronunciationUrl: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[AnonAttribution] = js.undefined
  var syllabification: js.UndefOr[String] = js.undefined
  var synonyms: js.UndefOr[js.Array[AnonSource]] = js.undefined
}

object AnonConjugations {
  @scala.inline
  def apply(
    conjugations: js.Array[AnonType] = null,
    definitions: js.Array[AnonDefinition] = null,
    partOfSpeech: String = null,
    pronunciation: String = null,
    pronunciationUrl: String = null,
    source: AnonAttribution = null,
    syllabification: String = null,
    synonyms: js.Array[AnonSource] = null
  ): AnonConjugations = {
    val __obj = js.Dynamic.literal()
    if (conjugations != null) __obj.updateDynamic("conjugations")(conjugations.asInstanceOf[js.Any])
    if (definitions != null) __obj.updateDynamic("definitions")(definitions.asInstanceOf[js.Any])
    if (partOfSpeech != null) __obj.updateDynamic("partOfSpeech")(partOfSpeech.asInstanceOf[js.Any])
    if (pronunciation != null) __obj.updateDynamic("pronunciation")(pronunciation.asInstanceOf[js.Any])
    if (pronunciationUrl != null) __obj.updateDynamic("pronunciationUrl")(pronunciationUrl.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (syllabification != null) __obj.updateDynamic("syllabification")(syllabification.asInstanceOf[js.Any])
    if (synonyms != null) __obj.updateDynamic("synonyms")(synonyms.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConjugations]
  }
}

