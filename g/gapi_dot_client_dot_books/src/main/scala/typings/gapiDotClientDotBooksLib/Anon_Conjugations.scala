package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Conjugations extends js.Object {
  var conjugations: js.UndefOr[js.Array[Anon_Type]] = js.undefined
  var definitions: js.UndefOr[js.Array[Anon_Definition]] = js.undefined
  var partOfSpeech: js.UndefOr[java.lang.String] = js.undefined
  var pronunciation: js.UndefOr[java.lang.String] = js.undefined
  var pronunciationUrl: js.UndefOr[java.lang.String] = js.undefined
  var source: js.UndefOr[Anon_Attribution] = js.undefined
  var syllabification: js.UndefOr[java.lang.String] = js.undefined
  var synonyms: js.UndefOr[js.Array[Anon_Source]] = js.undefined
}

object Anon_Conjugations {
  @scala.inline
  def apply(
    conjugations: js.Array[Anon_Type] = null,
    definitions: js.Array[Anon_Definition] = null,
    partOfSpeech: java.lang.String = null,
    pronunciation: java.lang.String = null,
    pronunciationUrl: java.lang.String = null,
    source: Anon_Attribution = null,
    syllabification: java.lang.String = null,
    synonyms: js.Array[Anon_Source] = null
  ): Anon_Conjugations = {
    val __obj = js.Dynamic.literal()
    if (conjugations != null) __obj.updateDynamic("conjugations")(conjugations)
    if (definitions != null) __obj.updateDynamic("definitions")(definitions)
    if (partOfSpeech != null) __obj.updateDynamic("partOfSpeech")(partOfSpeech)
    if (pronunciation != null) __obj.updateDynamic("pronunciation")(pronunciation)
    if (pronunciationUrl != null) __obj.updateDynamic("pronunciationUrl")(pronunciationUrl)
    if (source != null) __obj.updateDynamic("source")(source)
    if (syllabification != null) __obj.updateDynamic("syllabification")(syllabification)
    if (synonyms != null) __obj.updateDynamic("synonyms")(synonyms)
    __obj.asInstanceOf[Anon_Conjugations]
  }
}

