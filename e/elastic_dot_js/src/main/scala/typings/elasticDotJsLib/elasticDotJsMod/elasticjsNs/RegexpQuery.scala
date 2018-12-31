package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegexpQuery extends Query {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the boost value of the Query.
    */
  def boost(boost: scala.Double): RegexpQuery
  /*
    The field to run the query against.
    */
  def field(f: java.lang.String): RegexpQuery
  /*
    The regex flags to use.  Valid flags are:
    INTERSECTION - Support for intersection notation
    COMPLEMENT - Support for complement notation
    EMPTY - Support for the empty language symbol: #
    ANYSTRING - Support for the any string symbol: @
    INTERVAL - Support for numerical interval notation:
    NONE - Disable support for all syntax options
    ALL - Enables support for all syntax options
    Use multiple flags by separating with a "|" character.  Example:
    INTERSECTION|COMPLEMENT|EMPTY
    */
  def flags(f: java.lang.String): RegexpQuery
  /*
    The regex flags to use as a numeric value.  Advanced use only,
    it is probably better to stick with the flags option.
    */
  def flagsValue(v: java.lang.String): RegexpQuery
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
  def rewrite(m: java.lang.String): RegexpQuery
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
  /*
    The regexp value.
    */
  def value(p: java.lang.String): RegexpQuery
}

