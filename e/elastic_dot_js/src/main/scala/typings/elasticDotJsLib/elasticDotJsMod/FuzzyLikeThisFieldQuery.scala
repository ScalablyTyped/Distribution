package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "FuzzyLikeThisFieldQuery")
@js.native
class FuzzyLikeThisFieldQuery protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.FuzzyLikeThisFieldQuery {
  /*
    Constructs a query where each documents returned are “like” provided text
    */
  def this(field: java.lang.String, likeText: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    The analyzer that will be used to analyze the text. Defaults to the
    analyzer associated with the field.
    */
  /* CompleteClass */
  override def analyzer(analyzerName: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FuzzyLikeThisFieldQuery = js.native
  /*
    Sets the boost value of the Query.
    */
  /* CompleteClass */
  override def boost(boost: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FuzzyLikeThisFieldQuery = js.native
  /*
    Should the Query fail when an unsupported field
    is specified. Defaults to true.
    */
  /* CompleteClass */
  override def failOnUnsupportedField(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FuzzyLikeThisFieldQuery = js.native
  /*
    The field to run the query against.
    */
  /* CompleteClass */
  override def field(f: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FuzzyLikeThisFieldQuery = js.native
  /*
    Should term frequency be ignored. Defaults to false.
    */
  /* CompleteClass */
  override def ignoreTf(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FuzzyLikeThisFieldQuery = js.native
  /*
    The text to find documents like
    */
  /* CompleteClass */
  override def likeText(s: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FuzzyLikeThisFieldQuery = js.native
  /*
    The maximum number of query terms that will be included in any
    generated query. Defaults to 25.
    */
  /* CompleteClass */
  override def maxQueryTerms(max: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FuzzyLikeThisFieldQuery = js.native
  /*
    The minimum similarity of the term variants. Defaults to 0.5.
    */
  /* CompleteClass */
  override def minSimilarity(min: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FuzzyLikeThisFieldQuery = js.native
  /*
    Length of required common prefix on variant terms. Defaults to 0..
    */
  /* CompleteClass */
  override def prefixLength(len: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FuzzyLikeThisFieldQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

