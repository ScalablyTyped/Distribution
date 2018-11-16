package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MoreLikeThisFieldQuery extends Query {
  /*
       The type of ejs object.  For internal use only.
       */
  def _type(): java.lang.String
  /*
       The analyzer that will be used to analyze the text. Defaults to the
       analyzer associated with the field.
       */
  def analyzer(analyzerName: java.lang.String): MoreLikeThisFieldQuery
  /*
       Sets the boost value of the Query.
       */
  def boost(boost: scala.Double): MoreLikeThisFieldQuery
  /*
       Sets the boost factor to use when boosting terms.
       Defaults to 1.
       */
  def boostTerms(boost: scala.Double): MoreLikeThisFieldQuery
  /*
       Should the Query fail when an unsupported field
       is specified. Defaults to true.
       */
  def failOnUnsupportedField(trueFalse: scala.Boolean): MoreLikeThisFieldQuery
  /*
       The field to run the query against.
       */
  def field(f: java.lang.String): MoreLikeThisFieldQuery
  /*
       The text to find documents like
       */
  def likeText(s: java.lang.String): MoreLikeThisFieldQuery
  /*
       The maximum frequency in which words may still appear. Words that
       appear in more than this many docs will be ignored.
       Defaults to unbounded.
       */
  def maxDocFreq(max: scala.Double): MoreLikeThisFieldQuery
  /*
       The maximum number of query terms that will be included in any
       generated query. Defaults to 25.
       */
  def maxQueryTerms(max: scala.Double): MoreLikeThisFieldQuery
  /*
       The maximum word length above which words will be ignored.
       Defaults to unbounded (0).
       */
  def maxWordLen(len: scala.Double): MoreLikeThisFieldQuery
  /*
       The frequency at which words will be ignored which do not occur in
       at least this many docs. Defaults to 5.
       */
  def minDocFreq(min: scala.Double): MoreLikeThisFieldQuery
  /*
       The frequency below which terms will be ignored in the source doc.
       The default frequency is 2.
       */
  def minTermFreq(freq: scala.Double): MoreLikeThisFieldQuery
  /*
       The minimum word length below which words will be ignored.
       Defaults to 0.
       */
  def minWordLen(len: scala.Double): MoreLikeThisFieldQuery
  /*
       The percentage of terms to match on (float value).
       Defaults to 0.3 (30 percent).
       */
  def percentTermsToMatch(percent: scala.Double): MoreLikeThisFieldQuery
  /*
       An array of stop words. Any word in this set is considered
       “uninteresting” and ignored. Even if your Analyzer allows stopwords,
       you might want to tell the MoreLikeThis code to ignore them, as for
       the purposes of document similarity it seems reasonable to assume
       that “a stop word is never interesting”.
       */
  def stopWords(stopWords: js.Array[_]): MoreLikeThisFieldQuery
  /*
       Retrieves the internal query object. This is typically used by
       internal API functions so use with caution.
       */
  def toJSON(): js.Any
}

