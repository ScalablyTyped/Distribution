package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TermsQuery extends Query {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: scala.Double): TermsQuery = js.native
  /*
    Enables or disables similarity coordinate scoring of documents
    matching the Query. Default: false.
    */
  def disableCoord(trueFalse: java.lang.String): TermsQuery = js.native
  /*
    Sets the fields to query against.
    */
  def field(f: java.lang.String): TermsQuery = js.native
  /*
    Sets the minimum number of terms that need to match in a document
    before that document is returned in the results.
    */
  def minimumShouldMatch(min: scala.Double): TermsQuery = js.native
  /*
    Sets the terms.  If you t is a String, it is added to the existing
    list of terms.  If t is an array, the list of terms replaces the
    existing terms.
    */
  def terms(t: java.lang.String): TermsQuery = js.native
  def terms(t: js.Array[java.lang.String]): TermsQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

