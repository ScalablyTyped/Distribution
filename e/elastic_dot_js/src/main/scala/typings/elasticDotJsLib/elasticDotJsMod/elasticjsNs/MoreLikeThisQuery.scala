package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoreLikeThisQuery extends Query {
  /*
       The type of ejs object.  For internal use only.
       */
  def _type(): java.lang.String = js.native
  /*
       The analyzer that will be used to analyze the text. Defaults to the
       analyzer associated with the field.
       */
  def analyzer(analyzerName: java.lang.String): MoreLikeThisQuery = js.native
  /*
       Sets the boost value for documents matching the Query.
       */
  def boost(boost: scala.Double): MoreLikeThisQuery = js.native
  /*
       Sets the boost factor to use when boosting terms.
       Defaults to 1.
       */
  def boostTerms(boost: scala.Double): MoreLikeThisQuery = js.native
  /*
       Should the Query fail when an unsupported field
       is specified. Defaults to true.
       */
  def failOnUnsupportedField(trueFalse: scala.Boolean): MoreLikeThisQuery = js.native
  /*
       The fields to run the query against.  If you call with a single field,
       it is added to the existing list of fields.  If called with an array
       of field names, it replaces any existing values with the new array.
       */
  def fields(f: java.lang.String): MoreLikeThisQuery = js.native
  /*
       The fields to run the query against.  If you call with a single field,
       it is added to the existing list of fields.  If called with an array
       of field names, it replaces any existing values with the new array.
       */
  def fields(f: js.Array[java.lang.String]): MoreLikeThisQuery = js.native
  /*
       The text to find documents like
       */
  def likeText(s: java.lang.String): MoreLikeThisQuery = js.native
  /*
       The maximum frequency in which words may still appear. Words that
       appear in more than this many docs will be ignored.
       Defaults to unbounded.
       */
  def maxDocFreq(max: scala.Double): MoreLikeThisQuery = js.native
  /*
       The maximum number of query terms that will be included in any
       generated query. Defaults to 25.
       */
  def maxQueryTerms(max: scala.Double): MoreLikeThisQuery = js.native
  /*
       The maximum word length above which words will be ignored.
       Defaults to unbounded (0).
       */
  def maxWordLen(len: scala.Double): MoreLikeThisQuery = js.native
  /*
       The frequency at which words will be ignored which do not occur in
       at least this many docs. Defaults to 5.
       */
  def minDocFreq(min: scala.Double): MoreLikeThisQuery = js.native
  /*
       The frequency below which terms will be ignored in the source doc.
       The default frequency is 2.
       */
  def minTermFreq(freq: scala.Double): MoreLikeThisQuery = js.native
  /*
       The minimum word length below which words will be ignored.
       Defaults to 0.
       */
  def minWordLen(len: scala.Double): MoreLikeThisQuery = js.native
  /*
       The percentage of terms to match on (float value).
       Defaults to 0.3 (30 percent).
       */
  def percentTermsToMatch(percent: scala.Double): MoreLikeThisQuery = js.native
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

