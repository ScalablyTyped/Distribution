package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchQuery extends Query {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the analyzer name used to analyze the Query object.
    */
  def analyzer(analyzer: java.lang.String): MatchQuery
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: stdLib.Number): MatchQuery
  /*
    Sets the maximum threshold/frequency to be considered a low
    frequency term in a CommonTermsQuery.
    Set to a value between 0 and 1.
    */
  def cutoffFrequency(freq: stdLib.Number): MatchQuery
  /*
    Sets the fuzziness value for the Query.
    */
  def fuzziness(fuzz: scala.Double): MatchQuery
  /*
    Sets fuzzy rewrite method.  Valid values are:
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
    top_terms_N -   first translates each term into boolean should
    and keeps the scores as computed by the query. Only the top N
    scoring terms are used.  Replace N with an integer value.
    Default is constant_score_auto.
    This is an advanced option, use with care.
    */
  def fuzzyRewrite(m: java.lang.String): MatchQuery
  /*
    Set to false to use classic Levenshtein edit distance in the
    fuzzy query.
    */
  def fuzzyTranspositions(trueFalse: scala.Boolean): MatchQuery
  /*
    Enables lenient parsing of the query string.
    */
  def lenient(trueFalse: scala.Boolean): MatchQuery
  /*
    Sets the max expansions of a fuzzy MatchQuery.
    */
  def maxExpansions(e: scala.Double): MatchQuery
  /*
    Sets a percent value controlling how many "should" clauses in the
    resulting Query should match.
    */
  def minimumShouldMatch(minMatch: scala.Double): MatchQuery
  /*
    Sets default operator of the Query.  Default: or.
    */
  def operator(op: java.lang.String): MatchQuery
  /*
    Sets the prefix length for a fuzzy prefix MatchQuery.
    */
  def prefixLength(l: scala.Double): MatchQuery
  /*
    Sets the query string for the Query.
    */
  def query(qstr: java.lang.String): MatchQuery
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
    top_terms_N -   first translates each term into boolean should
    and keeps the scores as computed by the query. Only the top N
    scoring terms are used.  Replace N with an integer value.
    Default is constant_score_auto.
    This is an advanced option, use with care.
    */
  def rewrite(m: java.lang.String): MatchQuery
  /*
    Sets the default slop for phrases. If zero, then exact phrase matches
    are required.  Default: 0.
    */
  def slop(slop: scala.Double): MatchQuery
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
  /*
    Sets the type of the MatchQuery.  Valid values are
    boolean, phrase, and phrase_prefix.
    */
  def `type`(`type`: java.lang.String): MatchQuery
  /*
    Sets what happens when no terms match.  Valid values are
    "all" or "none".
    */
  def zeroTermsQuery(q: java.lang.String): MatchQuery
}

object MatchQuery {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    analyzer: js.Function1[java.lang.String, MatchQuery],
    boost: js.Function1[stdLib.Number, MatchQuery],
    cutoffFrequency: js.Function1[stdLib.Number, MatchQuery],
    fuzziness: js.Function1[scala.Double, MatchQuery],
    fuzzyRewrite: js.Function1[java.lang.String, MatchQuery],
    fuzzyTranspositions: js.Function1[scala.Boolean, MatchQuery],
    lenient: js.Function1[scala.Boolean, MatchQuery],
    maxExpansions: js.Function1[scala.Double, MatchQuery],
    minimumShouldMatch: js.Function1[scala.Double, MatchQuery],
    operator: js.Function1[java.lang.String, MatchQuery],
    prefixLength: js.Function1[scala.Double, MatchQuery],
    query: js.Function1[java.lang.String, MatchQuery],
    rewrite: js.Function1[java.lang.String, MatchQuery],
    slop: js.Function1[scala.Double, MatchQuery],
    toJSON: js.Function0[js.Any],
    `type`: js.Function1[java.lang.String, MatchQuery],
    zeroTermsQuery: js.Function1[java.lang.String, MatchQuery]
  ): MatchQuery = {
    val __obj = js.Dynamic.literal(_type = _type, analyzer = analyzer, boost = boost, cutoffFrequency = cutoffFrequency, fuzziness = fuzziness, fuzzyRewrite = fuzzyRewrite, fuzzyTranspositions = fuzzyTranspositions, lenient = lenient, maxExpansions = maxExpansions, minimumShouldMatch = minimumShouldMatch, operator = operator, prefixLength = prefixLength, query = query, rewrite = rewrite, slop = slop, toJSON = toJSON, zeroTermsQuery = zeroTermsQuery)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MatchQuery]
  }
}

