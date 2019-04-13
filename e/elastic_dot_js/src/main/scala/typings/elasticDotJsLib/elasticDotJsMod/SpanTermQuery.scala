package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "SpanTermQuery")
@js.native
class SpanTermQuery protected () extends Query {
  /*
    Matches spans containing a term
    */
  def this(field: java.lang.String, value: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: scala.Double): SpanTermQuery = js.native
  /*
    Sets the field to query against.
    */
  def field(f: java.lang.String): SpanTermQuery = js.native
  /*
    Sets the term.
    */
  def term(t: java.lang.String): SpanTermQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

