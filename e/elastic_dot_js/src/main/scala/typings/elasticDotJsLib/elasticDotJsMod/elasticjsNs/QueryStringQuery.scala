package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryStringQuery extends Query {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets whether or not wildcard characters (* and ?) are allowed as the
    first character of the Query.  Default: true.
    */
  def allowLeadingWildcard(trueFalse: scala.Boolean): QueryStringQuery
  /*
    Sets whether or not we should attempt to analyzed wilcard terms in the
    Query. By default, wildcard terms are not analyzed.
    Analysis of wildcard characters is not perfect.  Default: false.
    */
  def analyzeWildcard(trueFalse: scala.Boolean): QueryStringQuery
  /*
    Sets the analyzer name used to analyze the Query object.
    */
  def analyzer(analyzer: java.lang.String): QueryStringQuery
  /*
    Sets whether or not we should auto generate phrase queries *if* the
    analyzer returns more than one term. Default: false.
    */
  def autoGeneratePhraseQueries(trueFalse: scala.Boolean): QueryStringQuery
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: scala.Double): QueryStringQuery
  /*
    Sets the default field/property this query should execute against.
    */
  def defaultField(fieldName: java.lang.String): QueryStringQuery
  /*
    Set the default Boolean operator. This operator is used to join individual query
    terms when no operator is explicity used in the query string (i.e., this AND that).
    Defaults to OR.
    */
  def defaultOperator(op: java.lang.String): QueryStringQuery
  /*
    Sets whether or not position increments will be used in the
    Query. Default: true.
    */
  def enablePositionIncrements(trueFalse: scala.Boolean): QueryStringQuery
  /*
    If they query string should be escaped or not.
    */
  def escape(trueFalse: scala.Boolean): QueryStringQuery
  /*
    A set of fields/properties this query should execute against.
    Pass a single value to add to the existing list of fields and
    pass an array to overwrite all existing fields.  For each field,
    you can apply a field specific boost by appending a ^boost to the
    field name.  For example, title^10, to give the title field a
    boost of 10.
    */
  def fields(fieldNames: js.Array[_]): QueryStringQuery
  /*
    Sets the max number of term expansions for fuzzy queries.
    */
  def fuzzyMaxExpansions(max: scala.Double): QueryStringQuery
  /*
    Set the minimum similarity for fuzzy queries.  Default: 0.5.
    */
  def fuzzyMinSim(minSim: scala.Double): QueryStringQuery
  /*
    Sets the prefix length for fuzzy queries.  Default: 0.
    */
  def fuzzyPrefixLength(fuzzLen: scala.Double): QueryStringQuery
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
  def fuzzyRewrite(m: java.lang.String): QueryStringQuery
  /*
    Enables lenient parsing of the query string.
    */
  def lenient(trueFalse: scala.Boolean): QueryStringQuery
  /*
    Sets whether or not terms from wildcard, prefix, fuzzy, and
    range queries should automatically be lowercased in the Query
    since they are not analyzed.  Default: true.
    */
  def lowercaseExpandedTerms(trueFalse: scala.Boolean): QueryStringQuery
  /*
    Sets a percent value controlling how many "should" clauses in the
    resulting Query should match.
    */
  def minimumShouldMatch(minMatch: scala.Double): QueryStringQuery
  /*
    Sets the default slop for phrases. If zero, then exact phrase matches
    are required.  Default: 0.
    */
  def phraseSlop(slop: scala.Double): QueryStringQuery
  /*
    Sets the query string on this Query object.
    */
  def query(qstr: java.lang.String): QueryStringQuery
  /*
    Sets the quote analyzer name used to analyze the query
    when in quoted text.
    */
  def quoteAnalyzer(analyzer: java.lang.String): QueryStringQuery
  /*
    Sets the suffix to automatically add to the field name when
    performing a quoted search.
    */
  def quoteFieldSuffix(s: java.lang.String): QueryStringQuery
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
  def rewrite(m: java.lang.String): QueryStringQuery
  /*
    Sets the tie breaker value for a Query using
    DisMax.  The tie breaker capability allows results
    that include the same term in multiple fields to be judged better than
    results that include this term in only the best of those multiple
    fields, without confusing this with the better case of two different
    terms in the multiple fields.  Default: 0.0.
    */
  def tieBreaker(tieBreaker: scala.Double): QueryStringQuery
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
  /*
    Sets whether or not queries against multiple fields should be combined using Lucene's
    DisjunctionMaxQuery
    */
  def useDisMax(trueFalse: java.lang.String): QueryStringQuery
}

object QueryStringQuery {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    allowLeadingWildcard: scala.Boolean => QueryStringQuery,
    analyzeWildcard: scala.Boolean => QueryStringQuery,
    analyzer: java.lang.String => QueryStringQuery,
    autoGeneratePhraseQueries: scala.Boolean => QueryStringQuery,
    boost: scala.Double => QueryStringQuery,
    defaultField: java.lang.String => QueryStringQuery,
    defaultOperator: java.lang.String => QueryStringQuery,
    enablePositionIncrements: scala.Boolean => QueryStringQuery,
    escape: scala.Boolean => QueryStringQuery,
    fields: js.Array[_] => QueryStringQuery,
    fuzzyMaxExpansions: scala.Double => QueryStringQuery,
    fuzzyMinSim: scala.Double => QueryStringQuery,
    fuzzyPrefixLength: scala.Double => QueryStringQuery,
    fuzzyRewrite: java.lang.String => QueryStringQuery,
    lenient: scala.Boolean => QueryStringQuery,
    lowercaseExpandedTerms: scala.Boolean => QueryStringQuery,
    minimumShouldMatch: scala.Double => QueryStringQuery,
    phraseSlop: scala.Double => QueryStringQuery,
    query: java.lang.String => QueryStringQuery,
    quoteAnalyzer: java.lang.String => QueryStringQuery,
    quoteFieldSuffix: java.lang.String => QueryStringQuery,
    rewrite: java.lang.String => QueryStringQuery,
    tieBreaker: scala.Double => QueryStringQuery,
    toJSON: () => js.Any,
    useDisMax: java.lang.String => QueryStringQuery
  ): QueryStringQuery = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), allowLeadingWildcard = js.Any.fromFunction1(allowLeadingWildcard), analyzeWildcard = js.Any.fromFunction1(analyzeWildcard), analyzer = js.Any.fromFunction1(analyzer), autoGeneratePhraseQueries = js.Any.fromFunction1(autoGeneratePhraseQueries), boost = js.Any.fromFunction1(boost), defaultField = js.Any.fromFunction1(defaultField), defaultOperator = js.Any.fromFunction1(defaultOperator), enablePositionIncrements = js.Any.fromFunction1(enablePositionIncrements), escape = js.Any.fromFunction1(escape), fields = js.Any.fromFunction1(fields), fuzzyMaxExpansions = js.Any.fromFunction1(fuzzyMaxExpansions), fuzzyMinSim = js.Any.fromFunction1(fuzzyMinSim), fuzzyPrefixLength = js.Any.fromFunction1(fuzzyPrefixLength), fuzzyRewrite = js.Any.fromFunction1(fuzzyRewrite), lenient = js.Any.fromFunction1(lenient), lowercaseExpandedTerms = js.Any.fromFunction1(lowercaseExpandedTerms), minimumShouldMatch = js.Any.fromFunction1(minimumShouldMatch), phraseSlop = js.Any.fromFunction1(phraseSlop), query = js.Any.fromFunction1(query), quoteAnalyzer = js.Any.fromFunction1(quoteAnalyzer), quoteFieldSuffix = js.Any.fromFunction1(quoteFieldSuffix), rewrite = js.Any.fromFunction1(rewrite), tieBreaker = js.Any.fromFunction1(tieBreaker), toJSON = js.Any.fromFunction0(toJSON), useDisMax = js.Any.fromFunction1(useDisMax))
  
    __obj.asInstanceOf[QueryStringQuery]
  }
}

