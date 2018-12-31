package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FuzzyLikeThisQuery extends Query {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    The analyzer that will be used to analyze the text. Defaults to the
    analyzer associated with the field.
    */
  def analyzer(analyzerName: java.lang.String): FuzzyLikeThisQuery = js.native
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: scala.Double): FuzzyLikeThisQuery = js.native
  /*
    Should the Query fail when an unsupported field
    is specified. Defaults to true.
    */
  def failOnUnsupportedField(trueFalse: scala.Boolean): FuzzyLikeThisQuery = js.native
  /*
    The fields to run the query against.  If you call with a single field,
    it is added to the existing list of fields.  If called with an array
    of field names, it replaces any existing values with the new array.
    */
  def fields(f: java.lang.String): FuzzyLikeThisQuery = js.native
  def fields(f: js.Array[java.lang.String]): FuzzyLikeThisQuery = js.native
  /*
    Should term frequency be ignored. Defaults to false.
    */
  def ignoreTf(trueFalse: scala.Boolean): FuzzyLikeThisQuery = js.native
  /*
    The text to find documents like
    */
  def likeText(s: java.lang.String): FuzzyLikeThisQuery = js.native
  /*
    The maximum number of query terms that will be included in any
    generated query. Defaults to 25.
    */
  def maxQueryTerms(max: scala.Double): FuzzyLikeThisQuery = js.native
  /*
    The minimum similarity of the term variants. Defaults to 0.5.
    */
  def minSimilarity(min: scala.Double): FuzzyLikeThisQuery = js.native
  /*
    Length of required common prefix on variant terms. Defaults to 0..
    */
  def prefixLength(len: scala.Double): FuzzyLikeThisQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

