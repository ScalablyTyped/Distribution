package typings.elasticDotJs.elasticDotJsMod

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "TermQuery")
@js.native
class TermQuery protected () extends Query {
  /*
    A Query that matches documents containing a term. This may be
    combined with other terms with a BooleanQuery.
    */
  def this(field: String, term: String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: Number): TermQuery = js.native
  /*
    Sets the fields to query against.
    */
  def field(f: String): TermQuery = js.native
  /*
    Sets the term.
    */
  def term(t: String): TermQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

