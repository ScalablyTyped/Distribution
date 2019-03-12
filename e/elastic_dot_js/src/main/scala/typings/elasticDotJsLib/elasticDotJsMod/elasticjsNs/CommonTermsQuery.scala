package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonTermsQuery extends Query {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the analyzer name used to analyze the Query object.
    */
  def analyzer(analyzer: java.lang.String): CommonTermsQuery
  /*
    Sets the boost value for documents commoning the Query.
    */
  def boost(boost: stdLib.Number): CommonTermsQuery
  /*
    Sets the maximum threshold/frequency to be considered a low
    frequency term.  Set to a value between 0 and 1.
    */
  def cutoffFrequency(freq: stdLib.Number): CommonTermsQuery
  /*
    Enables or disables similarity coordinate scoring of documents
    commoning the Query. Default: false.
    */
  def disableCoord(trueFalse: java.lang.String): CommonTermsQuery
  /*
    Sets the field to query against.
    */
  def field(f: java.lang.String): CommonTermsQuery
  /*
    Sets the boolean operator to be used for high frequency terms.
    Default: AND
    */
  def highFreqOperator(op: java.lang.String): CommonTermsQuery
  /*
    Sets the boolean operator to be used for low frequency terms.
    Default: AND
    */
  def lowFreqOperator(op: java.lang.String): CommonTermsQuery
  /*
    Sets the minimum number of low freq matches that need to match in
    a document before that document is returned in the results.
    */
  def minimumShouldMatch(min: scala.Double): CommonTermsQuery
  /*
    Sets the minimum number of high freq matches that need to match in
    a document before that document is returned in the results.
    */
  def minimumShouldMatchHighFreq(min: scala.Double): CommonTermsQuery
  /*
    Sets the minimum number of low freq matches that need to match in
    a document before that document is returned in the results.
    */
  def minimumShouldMatchLowFreq(min: scala.Double): CommonTermsQuery
  /*
    Sets the query string.
    */
  def query(qstr: java.lang.String): CommonTermsQuery
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object CommonTermsQuery {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    analyzer: java.lang.String => CommonTermsQuery,
    boost: stdLib.Number => CommonTermsQuery,
    cutoffFrequency: stdLib.Number => CommonTermsQuery,
    disableCoord: java.lang.String => CommonTermsQuery,
    field: java.lang.String => CommonTermsQuery,
    highFreqOperator: java.lang.String => CommonTermsQuery,
    lowFreqOperator: java.lang.String => CommonTermsQuery,
    minimumShouldMatch: scala.Double => CommonTermsQuery,
    minimumShouldMatchHighFreq: scala.Double => CommonTermsQuery,
    minimumShouldMatchLowFreq: scala.Double => CommonTermsQuery,
    query: java.lang.String => CommonTermsQuery,
    toJSON: () => js.Any
  ): CommonTermsQuery = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), analyzer = js.Any.fromFunction1(analyzer), boost = js.Any.fromFunction1(boost), cutoffFrequency = js.Any.fromFunction1(cutoffFrequency), disableCoord = js.Any.fromFunction1(disableCoord), field = js.Any.fromFunction1(field), highFreqOperator = js.Any.fromFunction1(highFreqOperator), lowFreqOperator = js.Any.fromFunction1(lowFreqOperator), minimumShouldMatch = js.Any.fromFunction1(minimumShouldMatch), minimumShouldMatchHighFreq = js.Any.fromFunction1(minimumShouldMatchHighFreq), minimumShouldMatchLowFreq = js.Any.fromFunction1(minimumShouldMatchLowFreq), query = js.Any.fromFunction1(query), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[CommonTermsQuery]
  }
}

