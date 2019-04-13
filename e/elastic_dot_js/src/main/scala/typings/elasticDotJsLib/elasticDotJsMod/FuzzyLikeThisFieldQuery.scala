package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "FuzzyLikeThisFieldQuery")
@js.native
class FuzzyLikeThisFieldQuery protected () extends Query {
  /*
    Constructs a query where each documents returned are “like” provided text
    */
  def this(field: java.lang.String, likeText: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    The analyzer that will be used to analyze the text. Defaults to the
    analyzer associated with the field.
    */
  def analyzer(analyzerName: java.lang.String): FuzzyLikeThisFieldQuery = js.native
  /*
    Sets the boost value of the Query.
    */
  def boost(boost: scala.Double): FuzzyLikeThisFieldQuery = js.native
  /*
    Should the Query fail when an unsupported field
    is specified. Defaults to true.
    */
  def failOnUnsupportedField(trueFalse: scala.Boolean): FuzzyLikeThisFieldQuery = js.native
  /*
    The field to run the query against.
    */
  def field(f: java.lang.String): FuzzyLikeThisFieldQuery = js.native
  /*
    Should term frequency be ignored. Defaults to false.
    */
  def ignoreTf(trueFalse: scala.Boolean): FuzzyLikeThisFieldQuery = js.native
  /*
    The text to find documents like
    */
  def likeText(s: java.lang.String): FuzzyLikeThisFieldQuery = js.native
  /*
    The maximum number of query terms that will be included in any
    generated query. Defaults to 25.
    */
  def maxQueryTerms(max: scala.Double): FuzzyLikeThisFieldQuery = js.native
  /*
    The minimum similarity of the term variants. Defaults to 0.5.
    */
  def minSimilarity(min: scala.Double): FuzzyLikeThisFieldQuery = js.native
  /*
    Length of required common prefix on variant terms. Defaults to 0..
    */
  def prefixLength(len: scala.Double): FuzzyLikeThisFieldQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

