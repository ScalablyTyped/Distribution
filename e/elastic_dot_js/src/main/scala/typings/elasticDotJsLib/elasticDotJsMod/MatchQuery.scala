package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "MatchQuery")
@js.native
class MatchQuery protected () extends Query {
  /*
    A Query that appects text, analyzes it, generates internal query based
    on the MatchQuery type.
    */
  def this(field: java.lang.String, qstr: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Sets the analyzer name used to analyze the Query object.
    */
  def analyzer(analyzer: java.lang.String): MatchQuery = js.native
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: stdLib.Number): MatchQuery = js.native
  /*
    Sets the maximum threshold/frequency to be considered a low
    frequency term in a CommonTermsQuery.
    Set to a value between 0 and 1.
    */
  def cutoffFrequency(freq: stdLib.Number): MatchQuery = js.native
  /*
    Sets the fuzziness value for the Query.
    */
  def fuzziness(fuzz: scala.Double): MatchQuery = js.native
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
  def fuzzyRewrite(m: java.lang.String): MatchQuery = js.native
  /*
    Set to false to use classic Levenshtein edit distance in the
    fuzzy query.
    */
  def fuzzyTranspositions(trueFalse: scala.Boolean): MatchQuery = js.native
  /*
    Enables lenient parsing of the query string.
    */
  def lenient(trueFalse: scala.Boolean): MatchQuery = js.native
  /*
    Sets the max expansions of a fuzzy MatchQuery.
    */
  def maxExpansions(e: scala.Double): MatchQuery = js.native
  /*
    Sets a percent value controlling how many "should" clauses in the
    resulting Query should match.
    */
  def minimumShouldMatch(minMatch: scala.Double): MatchQuery = js.native
  /*
    Sets default operator of the Query.  Default: or.
    */
  def operator(op: java.lang.String): MatchQuery = js.native
  /*
    Sets the prefix length for a fuzzy prefix MatchQuery.
    */
  def prefixLength(l: scala.Double): MatchQuery = js.native
  /*
    Sets the query string for the Query.
    */
  def query(qstr: java.lang.String): MatchQuery = js.native
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
  def rewrite(m: java.lang.String): MatchQuery = js.native
  /*
    Sets the default slop for phrases. If zero, then exact phrase matches
    are required.  Default: 0.
    */
  def slop(slop: scala.Double): MatchQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
  /*
    Sets the type of the MatchQuery.  Valid values are
    boolean, phrase, and phrase_prefix.
    */
  def `type`(`type`: java.lang.String): MatchQuery = js.native
  /*
    Sets what happens when no terms match.  Valid values are
    "all" or "none".
    */
  def zeroTermsQuery(q: java.lang.String): MatchQuery = js.native
}

