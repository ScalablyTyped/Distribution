package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "MoreLikeThisFieldQuery")
@js.native
class MoreLikeThisFieldQuery protected () extends Query {
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
  def analyzer(analyzerName: String): MoreLikeThisFieldQuery = js.native
  
  /*
    Sets the boost value of the Query.
    */
  def boost(boost: Double): MoreLikeThisFieldQuery = js.native
  
  /*
    Sets the boost factor to use when boosting terms.
    Defaults to 1.
    */
  def boostTerms(boost: Double): MoreLikeThisFieldQuery = js.native
  
  /*
    Should the Query fail when an unsupported field
    is specified. Defaults to true.
    */
  def failOnUnsupportedField(trueFalse: Boolean): MoreLikeThisFieldQuery = js.native
  
  /*
    The field to run the query against.
    */
  def field(f: String): MoreLikeThisFieldQuery = js.native
  
  /*
    The text to find documents like
    */
  def likeText(s: String): MoreLikeThisFieldQuery = js.native
  
  /*
    The maximum frequency in which words may still appear. Words that
    appear in more than this many docs will be ignored.
    Defaults to unbounded.
    */
  def maxDocFreq(max: Double): MoreLikeThisFieldQuery = js.native
  
  /*
    The maximum number of query terms that will be included in any
    generated query. Defaults to 25.
    */
  def maxQueryTerms(max: Double): MoreLikeThisFieldQuery = js.native
  
  /*
    The maximum word length above which words will be ignored.
    Defaults to unbounded (0).
    */
  def maxWordLen(len: Double): MoreLikeThisFieldQuery = js.native
  
  /*
    The frequency at which words will be ignored which do not occur in
    at least this many docs. Defaults to 5.
    */
  def minDocFreq(min: Double): MoreLikeThisFieldQuery = js.native
  
  /*
    The frequency below which terms will be ignored in the source doc.
    The default frequency is 2.
    */
  def minTermFreq(freq: Double): MoreLikeThisFieldQuery = js.native
  
  /*
    The minimum word length below which words will be ignored.
    Defaults to 0.
    */
  def minWordLen(len: Double): MoreLikeThisFieldQuery = js.native
  
  /*
    The percentage of terms to match on (float value).
    Defaults to 0.3 (30 percent).
    */
  def percentTermsToMatch(percent: Double): MoreLikeThisFieldQuery = js.native
  
  /*
    An array of stop words. Any word in this set is considered
    “uninteresting” and ignored. Even if your Analyzer allows stopwords,
    you might want to tell the MoreLikeThis code to ignore them, as for
    the purposes of document similarity it seems reasonable to assume
    that “a stop word is never interesting”.
    */
  def stopWords(stopWords: js.Array[_]): MoreLikeThisFieldQuery = js.native
  
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}
