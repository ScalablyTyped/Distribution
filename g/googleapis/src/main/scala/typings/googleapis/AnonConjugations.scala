package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConjugations extends js.Object {
  var conjugations: js.UndefOr[js.Array[AnonTypeValue]] = js.native
  var definitions: js.UndefOr[js.Array[AnonDefinition]] = js.native
  var partOfSpeech: js.UndefOr[String] = js.native
  var pronunciation: js.UndefOr[String] = js.native
  var pronunciationUrl: js.UndefOr[String] = js.native
  var source: js.UndefOr[AnonAttribution] = js.native
  var syllabification: js.UndefOr[String] = js.native
  var synonyms: js.UndefOr[js.Array[AnonSource]] = js.native
}

object AnonConjugations {
  @scala.inline
  def apply(
    conjugations: js.Array[AnonTypeValue] = null,
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

