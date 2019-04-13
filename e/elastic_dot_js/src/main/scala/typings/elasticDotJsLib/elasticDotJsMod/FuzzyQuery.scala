package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "FuzzyQuery")
@js.native
class FuzzyQuery protected () extends Query {
  /*
    Constructs a query where each documents returned are “like” provided text
    */
  def this(field: java.lang.String, value: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Sets the boost value of the Query.
    */
  def boost(boost: scala.Double): FuzzyQuery = js.native
  /*
    The field to run the query against.
    */
  def field(f: java.lang.String): FuzzyQuery = js.native
  /*
    The maximum number of query terms that will be included in any
    generated query. Defaults to 50.
    */
  def maxExpansions(max: scala.Double): FuzzyQuery = js.native
  /*
    The minimum similarity of the term variants. Defaults to 0.5.
    */
  def minSimilarity(min: scala.Double): FuzzyQuery = js.native
  /*
    Length of required common prefix on variant terms. Defaults to 0.
    */
  def prefixLength(len: scala.Double): FuzzyQuery = js.native
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
  def rewrite(m: java.lang.String): FuzzyQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
  /*
    Set to false to use classic Levenshtein edit distance.
    */
  def transpositions(trueFalse: scala.Boolean): FuzzyQuery = js.native
  /*
    The query text to fuzzify.
    */
  def value(s: java.lang.String): FuzzyQuery = js.native
}

