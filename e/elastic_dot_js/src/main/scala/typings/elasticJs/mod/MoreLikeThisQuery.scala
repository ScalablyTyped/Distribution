package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "MoreLikeThisQuery")
@js.native
class MoreLikeThisQuery protected () extends Query {
  /*
    Constructs a query where each documents returned are “like” provided text
    */
  def this(fields: String, likeText: String) = this()
  def this(fields: js.Array[String], likeText: String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    The analyzer that will be used to analyze the text. Defaults to the
    analyzer associated with the field.
    */
  def analyzer(analyzerName: String): MoreLikeThisQuery = js.native
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: Double): MoreLikeThisQuery = js.native
  /*
    Sets the boost factor to use when boosting terms.
    Defaults to 1.
    */
  def boostTerms(boost: Double): MoreLikeThisQuery = js.native
  /*
    Should the Query fail when an unsupported field
    is specified. Defaults to true.
    */
  def failOnUnsupportedField(trueFalse: Boolean): MoreLikeThisQuery = js.native
  /*
    The fields to run the query against.  If you call with a single field,
    it is added to the existing list of fields.  If called with an array
    of field names, it replaces any existing values with the new array.
    */
  def fields(f: String): MoreLikeThisQuery = js.native
  def fields(f: js.Array[String]): MoreLikeThisQuery = js.native
  /*
    The text to find documents like
    */
  def likeText(s: String): MoreLikeThisQuery = js.native
  /*
    The maximum frequency in which words may still appear. Words that
    appear in more than this many docs will be ignored.
    Defaults to unbounded.
    */
  def maxDocFreq(max: Double): MoreLikeThisQuery = js.native
  /*
    The maximum number of query terms that will be included in any
    generated query. Defaults to 25.
    */
  def maxQueryTerms(max: Double): MoreLikeThisQuery = js.native
  /*
    The maximum word length above which words will be ignored.
    Defaults to unbounded (0).
    */
  def maxWordLen(len: Double): MoreLikeThisQuery = js.native
  /*
    The frequency at which words will be ignored which do not occur in
    at least this many docs. Defaults to 5.
    */
  def minDocFreq(min: Double): MoreLikeThisQuery = js.native
  /*
    The frequency below which terms will be ignored in the source doc.
    The default frequency is 2.
    */
  def minTermFreq(freq: Double): MoreLikeThisQuery = js.native
  /*
    The minimum word length below which words will be ignored.
    Defaults to 0.
    */
  def minWordLen(len: Double): MoreLikeThisQuery = js.native
  /*
    The percentage of terms to match on (float value).
    Defaults to 0.3 (30 percent).
    */
  def percentTermsToMatch(percent: Double): MoreLikeThisQuery = js.native
  /*
    An array of stop words. Any word in this set is considered
    “uninteresting” and ignored. Even if your Analyzer allows stopwords,
    you might want to tell the MoreLikeThis code to ignore them, as for
    the purposes of document similarity it seems reasonable to assume
    that “a stop word is never interesting”.
    */
  def stopWords(stopWords: js.Array[_]): MoreLikeThisQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

