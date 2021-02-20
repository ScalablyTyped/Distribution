package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "QueryStringQuery")
@js.native
class QueryStringQuery protected () extends Query {
  /*
    A query that is parsed using Lucene's default query parser.
    */
  def this(qstr: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Sets whether or not wildcard characters (* and ?) are allowed as the
    first character of the Query.  Default: true.
    */
  def allowLeadingWildcard(trueFalse: Boolean): QueryStringQuery = js.native
  
  /*
    Sets whether or not we should attempt to analyzed wilcard terms in the
    Query. By default, wildcard terms are not analyzed.
    Analysis of wildcard characters is not perfect.  Default: false.
    */
  def analyzeWildcard(trueFalse: Boolean): QueryStringQuery = js.native
  
  /*
    Sets the analyzer name used to analyze the Query object.
    */
  def analyzer(analyzer: String): QueryStringQuery = js.native
  
  /*
    Sets whether or not we should auto generate phrase queries *if* the
    analyzer returns more than one term. Default: false.
    */
  def autoGeneratePhraseQueries(trueFalse: Boolean): QueryStringQuery = js.native
  
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: Double): QueryStringQuery = js.native
  
  /*
    Sets the default field/property this query should execute against.
    */
  def defaultField(fieldName: String): QueryStringQuery = js.native
  
  /*
    Set the default Boolean operator. This operator is used to join individual query
    terms when no operator is explicity used in the query string (i.e., this AND that).
    Defaults to OR.
    */
  def defaultOperator(op: String): QueryStringQuery = js.native
  
  /*
    Sets whether or not position increments will be used in the
    Query. Default: true.
    */
  def enablePositionIncrements(trueFalse: Boolean): QueryStringQuery = js.native
  
  /*
    If they query string should be escaped or not.
    */
  def escape(trueFalse: Boolean): QueryStringQuery = js.native
  
  /*
    A set of fields/properties this query should execute against.
    Pass a single value to add to the existing list of fields and
    pass an array to overwrite all existing fields.  For each field,
    you can apply a field specific boost by appending a ^boost to the
    field name.  For example, title^10, to give the title field a
    boost of 10.
    */
  def fields(fieldNames: js.Array[_]): QueryStringQuery = js.native
  
  /*
    Sets the max number of term expansions for fuzzy queries.
    */
  def fuzzyMaxExpansions(max: Double): QueryStringQuery = js.native
  
  /*
    Set the minimum similarity for fuzzy queries.  Default: 0.5.
    */
  def fuzzyMinSim(minSim: Double): QueryStringQuery = js.native
  
  /*
    Sets the prefix length for fuzzy queries.  Default: 0.
    */
  def fuzzyPrefixLength(fuzzLen: Double): QueryStringQuery = js.native
  
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
  def fuzzyRewrite(m: String): QueryStringQuery = js.native
  
  /*
    Enables lenient parsing of the query string.
    */
  def lenient(trueFalse: Boolean): QueryStringQuery = js.native
  
  /*
    Sets whether or not terms from wildcard, prefix, fuzzy, and
    range queries should automatically be lowercased in the Query
    since they are not analyzed.  Default: true.
    */
  def lowercaseExpandedTerms(trueFalse: Boolean): QueryStringQuery = js.native
  
  /*
    Sets a percent value controlling how many "should" clauses in the
    resulting Query should match.
    */
  def minimumShouldMatch(minMatch: Double): QueryStringQuery = js.native
  
  /*
    Sets the default slop for phrases. If zero, then exact phrase matches
    are required.  Default: 0.
    */
  def phraseSlop(slop: Double): QueryStringQuery = js.native
  
  /*
    Sets the query string on this Query object.
    */
  def query(qstr: String): QueryStringQuery = js.native
  
  /*
    Sets the quote analyzer name used to analyze the query
    when in quoted text.
    */
  def quoteAnalyzer(analyzer: String): QueryStringQuery = js.native
  
  /*
    Sets the suffix to automatically add to the field name when
    performing a quoted search.
    */
  def quoteFieldSuffix(s: String): QueryStringQuery = js.native
  
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
  def rewrite(m: String): QueryStringQuery = js.native
  
  /*
    Sets the tie breaker value for a Query using
    DisMax.  The tie breaker capability allows results
    that include the same term in multiple fields to be judged better than
    results that include this term in only the best of those multiple
    fields, without confusing this with the better case of two different
    terms in the multiple fields.  Default: 0.0.
    */
  def tieBreaker(tieBreaker: Double): QueryStringQuery = js.native
  
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
  
  /*
    Sets whether or not queries against multiple fields should be combined using Lucene's
    DisjunctionMaxQuery
    */
  def useDisMax(trueFalse: String): QueryStringQuery = js.native
}
