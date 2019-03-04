package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FuzzyLikeThisFieldQuery extends Query {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    The analyzer that will be used to analyze the text. Defaults to the
    analyzer associated with the field.
    */
  def analyzer(analyzerName: java.lang.String): FuzzyLikeThisFieldQuery
  /*
    Sets the boost value of the Query.
    */
  def boost(boost: scala.Double): FuzzyLikeThisFieldQuery
  /*
    Should the Query fail when an unsupported field
    is specified. Defaults to true.
    */
  def failOnUnsupportedField(trueFalse: scala.Boolean): FuzzyLikeThisFieldQuery
  /*
    The field to run the query against.
    */
  def field(f: java.lang.String): FuzzyLikeThisFieldQuery
  /*
    Should term frequency be ignored. Defaults to false.
    */
  def ignoreTf(trueFalse: scala.Boolean): FuzzyLikeThisFieldQuery
  /*
    The text to find documents like
    */
  def likeText(s: java.lang.String): FuzzyLikeThisFieldQuery
  /*
    The maximum number of query terms that will be included in any
    generated query. Defaults to 25.
    */
  def maxQueryTerms(max: scala.Double): FuzzyLikeThisFieldQuery
  /*
    The minimum similarity of the term variants. Defaults to 0.5.
    */
  def minSimilarity(min: scala.Double): FuzzyLikeThisFieldQuery
  /*
    Length of required common prefix on variant terms. Defaults to 0..
    */
  def prefixLength(len: scala.Double): FuzzyLikeThisFieldQuery
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object FuzzyLikeThisFieldQuery {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    analyzer: js.Function1[java.lang.String, FuzzyLikeThisFieldQuery],
    boost: js.Function1[scala.Double, FuzzyLikeThisFieldQuery],
    failOnUnsupportedField: js.Function1[scala.Boolean, FuzzyLikeThisFieldQuery],
    field: js.Function1[java.lang.String, FuzzyLikeThisFieldQuery],
    ignoreTf: js.Function1[scala.Boolean, FuzzyLikeThisFieldQuery],
    likeText: js.Function1[java.lang.String, FuzzyLikeThisFieldQuery],
    maxQueryTerms: js.Function1[scala.Double, FuzzyLikeThisFieldQuery],
    minSimilarity: js.Function1[scala.Double, FuzzyLikeThisFieldQuery],
    prefixLength: js.Function1[scala.Double, FuzzyLikeThisFieldQuery],
    toJSON: js.Function0[js.Any]
  ): FuzzyLikeThisFieldQuery = {
    val __obj = js.Dynamic.literal(_type = _type, analyzer = analyzer, boost = boost, failOnUnsupportedField = failOnUnsupportedField, field = field, ignoreTf = ignoreTf, likeText = likeText, maxQueryTerms = maxQueryTerms, minSimilarity = minSimilarity, prefixLength = prefixLength, toJSON = toJSON)
  
    __obj.asInstanceOf[FuzzyLikeThisFieldQuery]
  }
}

