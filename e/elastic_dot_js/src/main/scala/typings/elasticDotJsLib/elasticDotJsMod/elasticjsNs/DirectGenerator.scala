package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectGenerator extends Generator {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the accuracy.  How similar the suggested terms at least
    need to be compared to the original suggest text.
    */
  def accuracy(a: scala.Double): DirectGenerator
  /*
    Sets the field used to generate suggestions from.
    */
  def field(field: java.lang.String): DirectGenerator
  /*
    Sets the maximum edit distance candidate suggestions can have
    in order to be considered as a suggestion.
    */
  def maxEdits(max: scala.Double): DirectGenerator
  /*
    The factor that is used to multiply with the size in order
    to inspect more candidate suggestions.
    */
  def maxInspections(max: scala.Double): DirectGenerator
  /*
    Sets a maximum threshold in number of documents a suggest text
    token can exist in order to be corrected.
    */
  def maxTermFreq(max: scala.Double): DirectGenerator
  /*
    Sets a minimal threshold of the number of documents a suggested
    term should appear in.
    */
  def minDocFreq(min: scala.Double): DirectGenerator
  /*
    Sets the minimum length a suggest text term must have in order
    to be corrected.
    */
  def minWordLen(len: scala.Double): DirectGenerator
  /*
    Sets an analyzer that is applied to each of the generated tokens
    before they are passed to the actual phrase scorer.
    */
  def postFilter(analyzer: java.lang.String): DirectGenerator
  /*
    Sets an analyzer that is applied to each of the tokens passed to
    this generator.  The analyzer is applied to the original tokens,
    not the generated tokens.
    */
  def preFilter(analyzer: java.lang.String): DirectGenerator
  /*
    Sets the number of suggestions returned for each token.
    */
  def size(s: scala.Double): DirectGenerator
  /*
    Sets the sort mode.  Valid values are:
    score - Sort by score first, then document frequency, and then the term itself
    frequency - Sort by document frequency first, then simlarity score and then the term itself
    */
  def sort(s: java.lang.String): DirectGenerator
  /*
    Sets what string distance implementation to use for comparing
    how similar suggested terms are.  Valid values are:
    internal - based on damerau_levenshtein but but highly optimized for comparing string distance for terms inside the index
    damerau_levenshtein - String distance algorithm based on Damerau-Levenshtein algorithm
    levenstein - String distance algorithm based on Levenstein edit distance algorithm
    jarowinkler - String distance algorithm based on Jaro-Winkler algorithm
    ngram - String distance algorithm based on character n-grams
    */
  def stringDistance(s: java.lang.String): DirectGenerator
  /*
    Sets the suggest mode.  Valid values are:
    missing - Only suggest terms in the suggest text that aren't in the index
    popular - Only suggest suggestions that occur in more docs then the original suggest text term
    always - Suggest any matching suggestions based on terms in the suggest text
    */
  def suggestMode(m: java.lang.String): DirectGenerator
  /*
    Retrieves the internal generator object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object DirectGenerator {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    accuracy: js.Function1[scala.Double, DirectGenerator],
    field: js.Function1[java.lang.String, DirectGenerator],
    maxEdits: js.Function1[scala.Double, DirectGenerator],
    maxInspections: js.Function1[scala.Double, DirectGenerator],
    maxTermFreq: js.Function1[scala.Double, DirectGenerator],
    minDocFreq: js.Function1[scala.Double, DirectGenerator],
    minWordLen: js.Function1[scala.Double, DirectGenerator],
    postFilter: js.Function1[java.lang.String, DirectGenerator],
    preFilter: js.Function1[java.lang.String, DirectGenerator],
    size: js.Function1[scala.Double, DirectGenerator],
    sort: js.Function1[java.lang.String, DirectGenerator],
    stringDistance: js.Function1[java.lang.String, DirectGenerator],
    suggestMode: js.Function1[java.lang.String, DirectGenerator],
    toJSON: js.Function0[js.Any]
  ): DirectGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("accuracy")(accuracy)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("maxEdits")(maxEdits)
    __obj.updateDynamic("maxInspections")(maxInspections)
    __obj.updateDynamic("maxTermFreq")(maxTermFreq)
    __obj.updateDynamic("minDocFreq")(minDocFreq)
    __obj.updateDynamic("minWordLen")(minWordLen)
    __obj.updateDynamic("postFilter")(postFilter)
    __obj.updateDynamic("preFilter")(preFilter)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("sort")(sort)
    __obj.updateDynamic("stringDistance")(stringDistance)
    __obj.updateDynamic("suggestMode")(suggestMode)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[DirectGenerator]
  }
}

