package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectSettingsMixin extends js.Object {
  /*
    Sets the accuracy.  How similar the suggested terms at least
    need to be compared to the original suggest text.
    */
  def accuracy(a: scala.Double): DirectSettingsMixin
  /*
    Sets the maximum edit distance candidate suggestions can have
    in order to be considered as a suggestion.
    */
  def maxEdits(max: scala.Double): DirectSettingsMixin
  /*
    The factor that is used to multiply with the size in order
    to inspect more candidate suggestions.
    */
  def maxInspections(max: scala.Double): DirectSettingsMixin
  /*
    Sets a maximum threshold in number of documents a suggest text
    token can exist in order to be corrected.
    */
  def maxTermFreq(max: scala.Double): DirectSettingsMixin
  /*
    Sets a minimal threshold of the number of documents a suggested
    term should appear in.
    */
  def minDocFreq(min: scala.Double): DirectSettingsMixin
  /*
    Sets the minimum length a suggest text term must have in order
    to be corrected.
    */
  def minWordLen(len: scala.Double): DirectSettingsMixin
  /*
    Sets the number of minimal prefix characters that must match in
    order be a candidate suggestion.
    */
  def prefixLen(len: scala.Double): DirectSettingsMixin
  /*
    Sets the sort mode.  Valid values are:
    score - Sort by score first, then document frequency, and then the term itself
    frequency - Sort by document frequency first, then simlarity score and then the term itself
    */
  def sort(s: java.lang.String): DirectSettingsMixin
  /*
    Sets what string distance implementation to use for comparing
    how similar suggested terms are.  Valid values are:
    internal - based on damerau_levenshtein but but highly optimized for comparing string distance for terms inside the index
    damerau_levenshtein - String distance algorithm based on Damerau-Levenshtein algorithm
    levenstein - String distance algorithm based on Levenstein edit distance algorithm
    jarowinkler - String distance algorithm based on Jaro-Winkler algorithm
    ngram - String distance algorithm based on character n-grams
    */
  def stringDistance(s: java.lang.String): DirectSettingsMixin
  /*
    Sets the suggest mode.  Valid values are:
    missing - Only suggest terms in the suggest text that aren't in the index
    popular - Only suggest suggestions that occur in more docs then the original suggest text term
    always - Suggest any matching suggestions based on terms in the suggest text
    */
  def suggestMode(m: java.lang.String): DirectSettingsMixin
}

object DirectSettingsMixin {
  @scala.inline
  def apply(
    accuracy: js.Function1[scala.Double, DirectSettingsMixin],
    maxEdits: js.Function1[scala.Double, DirectSettingsMixin],
    maxInspections: js.Function1[scala.Double, DirectSettingsMixin],
    maxTermFreq: js.Function1[scala.Double, DirectSettingsMixin],
    minDocFreq: js.Function1[scala.Double, DirectSettingsMixin],
    minWordLen: js.Function1[scala.Double, DirectSettingsMixin],
    prefixLen: js.Function1[scala.Double, DirectSettingsMixin],
    sort: js.Function1[java.lang.String, DirectSettingsMixin],
    stringDistance: js.Function1[java.lang.String, DirectSettingsMixin],
    suggestMode: js.Function1[java.lang.String, DirectSettingsMixin]
  ): DirectSettingsMixin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accuracy")(accuracy)
    __obj.updateDynamic("maxEdits")(maxEdits)
    __obj.updateDynamic("maxInspections")(maxInspections)
    __obj.updateDynamic("maxTermFreq")(maxTermFreq)
    __obj.updateDynamic("minDocFreq")(minDocFreq)
    __obj.updateDynamic("minWordLen")(minWordLen)
    __obj.updateDynamic("prefixLen")(prefixLen)
    __obj.updateDynamic("sort")(sort)
    __obj.updateDynamic("stringDistance")(stringDistance)
    __obj.updateDynamic("suggestMode")(suggestMode)
    __obj.asInstanceOf[DirectSettingsMixin]
  }
}

