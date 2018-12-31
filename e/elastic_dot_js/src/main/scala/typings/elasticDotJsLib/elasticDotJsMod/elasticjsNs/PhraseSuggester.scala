package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhraseSuggester extends Suggest {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Sets analyzer used to analyze the suggest text.
    */
  def analyzer(analyzer: java.lang.String): PhraseSuggester = js.native
  /*
    Sets the confidence level defines a factor applied to the input
    phrases score which is used as a threshold for other suggest
    candidates. Only candidates that score higher than the threshold
    will be included in the result.
    */
  def confidence(c: scala.Double): PhraseSuggester = js.native
  /*
    Adds a direct generator. If passed a single Generator
    it is added to the list of existing generators.  If passed an
    array of Generators, they replace all existing generators.
    */
  def directGenerator(oGenerator: Generator): PhraseSuggester = js.native
  def directGenerator(oGenerator: js.Array[Generator]): PhraseSuggester = js.native
  /*
    Sets the field used to generate suggestions from.
    */
  def field(field: java.lang.String): PhraseSuggester = js.native
  /*
    Forces the use of unigrams.
    */
  def forceUnigrams(trueFalse: scala.Boolean): PhraseSuggester = js.native
  /*
    Sets the max size of the n-grams (shingles) in the field. If
    the field doesn't contain n-grams (shingles) this should be
    omitted or set to 1.
    */
  def gramSize(s: scala.Double): PhraseSuggester = js.native
  /*
    Enables highlighting of suggestions
    */
  def highlight(preTag: java.lang.String, postTag: java.lang.String): PhraseSuggester = js.native
  /*
    A smoothing model that uses an additive smoothing model where a
    constant (typically 1.0 or smaller) is added to all counts to
    balance weights, The default alpha is 0.5.
    */
  def laplaceSmoothing(alpha: scala.Double): PhraseSuggester = js.native
  /*
    A smoothing model that takes the weighted mean of the unigrams,
    bigrams and trigrams based on user supplied weights (lambdas). The
    sum of tl, bl, and ul must equal 1.
    */
  def linearSmoothing(tl: scala.Double, bl: scala.Double, ul: scala.Double): PhraseSuggester = js.native
  /*
    Sets the maximum percentage of the terms that at most
    considered to be misspellings in order to form a correction.
    */
  def maxErrors(c: scala.Double): PhraseSuggester = js.native
  /*
    Sets the likelihood of a term being a misspelled even if the
    term exists in the dictionary. The default it 0.95 corresponding
    to 5% or the real words are misspelled.
    */
  def realWordErrorLikelihood(l: scala.Double): PhraseSuggester = js.native
  /*
    Sets the separator that is used to separate terms in the bigram
    field. If not set the whitespce character is used as a
    separator.
    */
  def separator(sep: java.lang.String): PhraseSuggester = js.native
  /*
    Sets the maximum number of suggestions to be retrieved from
    each individual shard.
    */
  def shardSize(s: scala.Double): PhraseSuggester = js.native
  /*
    Sets the number of suggestions returned for each token.
    */
  def size(s: scala.Double): PhraseSuggester = js.native
  /*
    A simple backoff model that backs off to lower order n-gram
    models if the higher order count is 0 and discounts the lower
    order n-gram model by a constant factor. The default discount is
    0.4.
    */
  def stupidBackoffSmoothing(discount: scala.Double): PhraseSuggester = js.native
  /*
    Sets the text to get suggestions for.  If not set, the global
    suggestion text will be used.
    */
  def text(txt: java.lang.String): PhraseSuggester = js.native
  /*
    Retrieves the internal suggest object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
  /*
    Sets the token limit.
    */
  def tokenLimit(l: scala.Double): PhraseSuggester = js.native
}

