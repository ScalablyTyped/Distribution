package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "SpanMultiTermQuery")
@js.native
class SpanMultiTermQuery protected () extends Query {
  /*
    Use MultiTermQueries as a SpanQuery.
    */
  def this(qry: Query) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: scala.Double): SpanMultiTermQuery = js.native
  /*
    Sets the span query to match on.
    */
  def `match`(mtQuery: js.Object): SpanMultiTermQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

