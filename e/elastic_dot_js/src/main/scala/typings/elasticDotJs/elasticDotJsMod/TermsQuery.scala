package typings.elasticDotJs.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "TermsQuery")
@js.native
class TermsQuery protected () extends Query {
  /*
    A Query that matches documents containing provided terms.
    */
  def this(field: String, terms: String) = this()
  def this(field: String, terms: js.Array[String]) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: Double): TermsQuery = js.native
  /*
    Enables or disables similarity coordinate scoring of documents
    matching the Query. Default: false.
    */
  def disableCoord(trueFalse: String): TermsQuery = js.native
  /*
    Sets the fields to query against.
    */
  def field(f: String): TermsQuery = js.native
  /*
    Sets the minimum number of terms that need to match in a document
    before that document is returned in the results.
    */
  def minimumShouldMatch(min: Double): TermsQuery = js.native
  /*
    Sets the terms.  If you t is a String, it is added to the existing
    list of terms.  If t is an array, the list of terms replaces the
    existing terms.
    */
  def terms(t: String): TermsQuery = js.native
  def terms(t: js.Array[String]): TermsQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

