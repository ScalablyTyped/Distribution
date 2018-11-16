package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "MoreLikeThisFieldQuery")
@js.native
class MoreLikeThisFieldQuery protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.MoreLikeThisFieldQuery {
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
  override def analyzer(analyzerName: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MoreLikeThisFieldQuery = js.native
  /*
       Sets the boost value of the Query.
       */
  /* CompleteClass */
  override def boost(boost: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MoreLikeThisFieldQuery = js.native
  /*
       Sets the boost factor to use when boosting terms.
       Defaults to 1.
       */
  /* CompleteClass */
  override def boostTerms(boost: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MoreLikeThisFieldQuery = js.native
  /*
       Should the Query fail when an unsupported field
       is specified. Defaults to true.
       */
  /* CompleteClass */
  override def failOnUnsupportedField(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MoreLikeThisFieldQuery = js.native
  /*
       The field to run the query against.
       */
  /* CompleteClass */
  override def field(f: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MoreLikeThisFieldQuery = js.native
  /*
       The text to find documents like
       */
  /* CompleteClass */
  override def likeText(s: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MoreLikeThisFieldQuery = js.native
  /*
       The maximum frequency in which words may still appear. Words that
       appear in more than this many docs will be ignored.
       Defaults to unbounded.
       */
  /* CompleteClass */
  override def maxDocFreq(max: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MoreLikeThisFieldQuery = js.native
  /*
       The maximum number of query terms that will be included in any
       generated query. Defaults to 25.
       */
  /* CompleteClass */
  override def maxQueryTerms(max: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MoreLikeThisFieldQuery = js.native
  /*
       The maximum word length above which words will be ignored.
       Defaults to unbounded (0).
       */
  /* CompleteClass */
  override def maxWordLen(len: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MoreLikeThisFieldQuery = js.native
  /*
       The frequency at which words will be ignored which do not occur in
       at least this many docs. Defaults to 5.
       */
  /* CompleteClass */
  override def minDocFreq(min: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MoreLikeThisFieldQuery = js.native
  /*
       The frequency below which terms will be ignored in the source doc.
       The default frequency is 2.
       */
  /* CompleteClass */
  override def minTermFreq(freq: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MoreLikeThisFieldQuery = js.native
  /*
       The minimum word length below which words will be ignored.
       Defaults to 0.
       */
  /* CompleteClass */
  override def minWordLen(len: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MoreLikeThisFieldQuery = js.native
  /*
       The percentage of terms to match on (float value).
       Defaults to 0.3 (30 percent).
       */
  /* CompleteClass */
  override def percentTermsToMatch(percent: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MoreLikeThisFieldQuery = js.native
  /*
       An array of stop words. Any word in this set is considered
       “uninteresting” and ignored. Even if your Analyzer allows stopwords,
       you might want to tell the MoreLikeThis code to ignore them, as for
       the purposes of document similarity it seems reasonable to assume
       that “a stop word is never interesting”.
       */
  /* CompleteClass */
  override def stopWords(stopWords: js.Array[_]): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MoreLikeThisFieldQuery = js.native
  /*
       Retrieves the internal query object. This is typically used by
       internal API functions so use with caution.
       */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

