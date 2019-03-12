package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FuzzyQuery extends Query {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the boost value of the Query.
    */
  def boost(boost: scala.Double): FuzzyQuery
  /*
    The field to run the query against.
    */
  def field(f: java.lang.String): FuzzyQuery
  /*
    The maximum number of query terms that will be included in any
    generated query. Defaults to 50.
    */
  def maxExpansions(max: scala.Double): FuzzyQuery
  /*
    The minimum similarity of the term variants. Defaults to 0.5.
    */
  def minSimilarity(min: scala.Double): FuzzyQuery
  /*
    Length of required common prefix on variant terms. Defaults to 0.
    */
  def prefixLength(len: scala.Double): FuzzyQuery
  /*
    Sets rewrite method.  Valid values are:
    constant_score_auto - tries to pick the best constant-score rewrite
    method based on term and document counts from the query
    scoring_boolean - translates each term into boolean should and
    keeps the scores as computed by the query
    constant_score_boolean - same as scoring_boolean, expect no scores
    are computed.
    constant_score_filter - first creates a private Filter, by visiting
    each term in sequence and marking all docs for that term
    top_terms_boost_N - first translates each term into boolean should
    and scores are only computed as the boost using the top N
    scoring terms.  Replace N with an integer value.
    top_terms_N - first translates each term into boolean should
    and keeps the scores as computed by the query. Only the top N
    scoring terms are used.  Replace N with an integer value.
    Default is constant_score_auto.
    This is an advanced option, use with care.
    */
  def rewrite(m: java.lang.String): FuzzyQuery
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
  /*
    Set to false to use classic Levenshtein edit distance.
    */
  def transpositions(trueFalse: scala.Boolean): FuzzyQuery
  /*
    The query text to fuzzify.
    */
  def value(s: java.lang.String): FuzzyQuery
}

object FuzzyQuery {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    boost: scala.Double => FuzzyQuery,
    field: java.lang.String => FuzzyQuery,
    maxExpansions: scala.Double => FuzzyQuery,
    minSimilarity: scala.Double => FuzzyQuery,
    prefixLength: scala.Double => FuzzyQuery,
    rewrite: java.lang.String => FuzzyQuery,
    toJSON: () => js.Any,
    transpositions: scala.Boolean => FuzzyQuery,
    value: java.lang.String => FuzzyQuery
  ): FuzzyQuery = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), boost = js.Any.fromFunction1(boost), field = js.Any.fromFunction1(field), maxExpansions = js.Any.fromFunction1(maxExpansions), minSimilarity = js.Any.fromFunction1(minSimilarity), prefixLength = js.Any.fromFunction1(prefixLength), rewrite = js.Any.fromFunction1(rewrite), toJSON = js.Any.fromFunction0(toJSON), transpositions = js.Any.fromFunction1(transpositions), value = js.Any.fromFunction1(value))
  
    __obj.asInstanceOf[FuzzyQuery]
  }
}

