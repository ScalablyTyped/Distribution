package typings.elasticDotJs.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "RegexpQuery")
@js.native
class RegexpQuery protected () extends Query {
  /*
    Matches documents that have fields matching a regular expression.
    */
  def this(field: String, value: String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Sets the boost value of the Query.
    */
  def boost(boost: Double): RegexpQuery = js.native
  /*
    The field to run the query against.
    */
  def field(f: String): RegexpQuery = js.native
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
  def flags(f: String): RegexpQuery = js.native
  /*
    The regex flags to use as a numeric value.  Advanced use only,
    it is probably better to stick with the flags option.
    */
  def flagsValue(v: String): RegexpQuery = js.native
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
  def rewrite(m: String): RegexpQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
  /*
    The regexp value.
    */
  def value(p: String): RegexpQuery = js.native
}

