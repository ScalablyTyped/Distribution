package typings.elasticDotJs.elasticDotJsMod

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "MultiMatchQuery")
@js.native
class MultiMatchQuery protected () extends Query {
  /*
    A Query that allow to more easily build a MatchQuery
    over multiple fields
    */
  def this(fields: String, qstr: String) = this()
  def this(fields: js.Array[String], qstr: String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Sets the analyzer name used to analyze the Query object.
    */
  def analyzer(analyzer: String): MultiMatchQuery = js.native
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: Double): MultiMatchQuery = js.native
  /*
    Sets the maximum threshold/frequency to be considered a low
    frequency term in a CommonTermsQuery.
    Set to a value between 0 and 1.
    */
  def cutoffFrequency(freq: Number): MultiMatchQuery = js.native
  /*
    Sets the fields to search across.  If passed a single value it is
    added to the existing list of fields.  If passed an array of
    values, they overwite all existing values.
    */
  def fields(f: String): MultiMatchQuery = js.native
  def fields(f: js.Array[String]): MultiMatchQuery = js.native
  /*
    Sets the fuzziness value for the Query.
    */
  def fuzziness(fuzz: Double): MultiMatchQuery = js.native
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
  def fuzzyRewrite(m: String): MultiMatchQuery = js.native
  /*
    Enables lenient parsing of the query string.
    */
  def lenient(trueFalse: Boolean): MultiMatchQuery = js.native
  /*
    Sets the max expansions of a fuzzy Query.
    */
  def maxExpansions(e: Double): MultiMatchQuery = js.native
  /*
    Sets a percent value controlling how many "should" clauses in the
    resulting Query should match.
    */
  def minimumShouldMatch(minMatch: Double): MultiMatchQuery = js.native
  /*
    Sets default operator of the Query.  Default: or.
    */
  def operator(op: String): MultiMatchQuery = js.native
  /*
    Sets the prefix length for a fuzzy prefix Query.
    */
  def prefixLength(l: Double): MultiMatchQuery = js.native
  /*
    Sets the query string for the Query.
    */
  def query(qstr: String): MultiMatchQuery = js.native
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
  def rewrite(m: String): MultiMatchQuery = js.native
  /*
    Sets the default slop for phrases. If zero, then exact phrase matches
    are required.  Default: 0.
    */
  def slop(slop: Double): MultiMatchQuery = js.native
  /*
    The tie breaker value.  The tie breaker capability allows results
    that include the same term in multiple fields to be judged better than
    results that include this term in only the best of those multiple
    fields, without confusing this with the better case of two different
    terms in the multiple fields.  Default: 0.0.
    */
  def tieBreaker(tieBreaker: Double): MultiMatchQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
  /*
    Sets the type of the MultiMatchQuery.  Valid values are
    boolean, phrase, and phrase_prefix or phrasePrefix.
    */
  def `type`(`type`: String): MultiMatchQuery = js.native
  /*
    Sets whether or not queries against multiple fields should be combined using Lucene's
    DisjunctionMaxQuery
    */
  def useDisMax(trueFalse: String): MultiMatchQuery = js.native
  /*
    Sets what happens when no terms match.  Valid values are
    "all" or "none".
    */
  def zeroTermsQuery(q: String): MultiMatchQuery = js.native
}

