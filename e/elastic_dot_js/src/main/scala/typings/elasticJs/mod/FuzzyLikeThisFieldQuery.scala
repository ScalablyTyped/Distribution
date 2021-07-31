package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "FuzzyLikeThisFieldQuery")
@js.native
class FuzzyLikeThisFieldQuery protected ()
  extends StObject
     with Query {
  /*
    Constructs a query where each documents returned are “like” provided text
    */
  def this(field: String, likeText: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    The analyzer that will be used to analyze the text. Defaults to the
    analyzer associated with the field.
    */
  def analyzer(analyzerName: String): FuzzyLikeThisFieldQuery = js.native
  
  /*
    Sets the boost value of the Query.
    */
  def boost(boost: Double): FuzzyLikeThisFieldQuery = js.native
  
  /*
    Should the Query fail when an unsupported field
    is specified. Defaults to true.
    */
  def failOnUnsupportedField(trueFalse: Boolean): FuzzyLikeThisFieldQuery = js.native
  
  /*
    The field to run the query against.
    */
  def field(f: String): FuzzyLikeThisFieldQuery = js.native
  
  /*
    Should term frequency be ignored. Defaults to false.
    */
  def ignoreTf(trueFalse: Boolean): FuzzyLikeThisFieldQuery = js.native
  
  /*
    The text to find documents like
    */
  def likeText(s: String): FuzzyLikeThisFieldQuery = js.native
  
  /*
    The maximum number of query terms that will be included in any
    generated query. Defaults to 25.
    */
  def maxQueryTerms(max: Double): FuzzyLikeThisFieldQuery = js.native
  
  /*
    The minimum similarity of the term variants. Defaults to 0.5.
    */
  def minSimilarity(min: Double): FuzzyLikeThisFieldQuery = js.native
  
  /*
    Length of required common prefix on variant terms. Defaults to 0..
    */
  def prefixLength(len: Double): FuzzyLikeThisFieldQuery = js.native
  
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}
