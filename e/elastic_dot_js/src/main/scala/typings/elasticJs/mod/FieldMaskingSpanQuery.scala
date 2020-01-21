package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "FieldMaskingSpanQuery")
@js.native
class FieldMaskingSpanQuery protected () extends Query {
  /*
    Wraps a SpanQuery and hides the real field being searched across.
    */
  def this(spanQry: Query, field: Double) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: Double): FieldMaskingSpanQuery = js.native
  /*
    Sets the value of the "masked" field.
    */
  def field(f: String): FieldMaskingSpanQuery = js.native
  /*
    Sets the span query to wrap.
    */
  def query(spanQuery: Query): FieldMaskingSpanQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

