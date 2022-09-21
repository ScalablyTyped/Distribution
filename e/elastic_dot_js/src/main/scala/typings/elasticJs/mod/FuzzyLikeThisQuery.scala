package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "FuzzyLikeThisQuery")
@js.native
open class FuzzyLikeThisQuery protected ()
  extends StObject
     with Query {
  /*
    Constructs a query where each documents returned are “like” provided text
    */
  def this(likeText: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    The analyzer that will be used to analyze the text. Defaults to the
    analyzer associated with the field.
    */
  def analyzer(analyzerName: String): FuzzyLikeThisQuery = js.native
  
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: Double): FuzzyLikeThisQuery = js.native
  
  /*
    Should the Query fail when an unsupported field
    is specified. Defaults to true.
    */
  def failOnUnsupportedField(trueFalse: Boolean): FuzzyLikeThisQuery = js.native
  
  /*
    The fields to run the query against.  If you call with a single field,
    it is added to the existing list of fields.  If called with an array
    of field names, it replaces any existing values with the new array.
    */
  def fields(f: String): FuzzyLikeThisQuery = js.native
  def fields(f: js.Array[String]): FuzzyLikeThisQuery = js.native
  
  /*
    Should term frequency be ignored. Defaults to false.
    */
  def ignoreTf(trueFalse: Boolean): FuzzyLikeThisQuery = js.native
  
  /*
    The text to find documents like
    */
  def likeText(s: String): FuzzyLikeThisQuery = js.native
  
  /*
    The maximum number of query terms that will be included in any
    generated query. Defaults to 25.
    */
  def maxQueryTerms(max: Double): FuzzyLikeThisQuery = js.native
  
  /*
    The minimum similarity of the term variants. Defaults to 0.5.
    */
  def minSimilarity(min: Double): FuzzyLikeThisQuery = js.native
  
  /*
    Length of required common prefix on variant terms. Defaults to 0..
    */
  def prefixLength(len: Double): FuzzyLikeThisQuery = js.native
  
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): Any = js.native
}
