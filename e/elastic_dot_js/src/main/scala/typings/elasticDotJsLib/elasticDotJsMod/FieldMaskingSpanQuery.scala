package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "FieldMaskingSpanQuery")
@js.native
class FieldMaskingSpanQuery protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.FieldMaskingSpanQuery {
  /*
       Wraps a SpanQuery and hides the real field being searched across.
       */
  def this(spanQry: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Query, field: scala.Double) = this()
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Sets the boost value for documents matching the Query.
       */
  /* CompleteClass */
  override def boost(boost: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FieldMaskingSpanQuery = js.native
  /*
       Sets the value of the "masked" field.
       */
  /* CompleteClass */
  override def field(f: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FieldMaskingSpanQuery = js.native
  /*
       Sets the span query to wrap.
       */
  /* CompleteClass */
  override def query(spanQuery: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Query): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FieldMaskingSpanQuery = js.native
  /*
       Retrieves the internal query object. This is typically used by
       internal API functions so use with caution.
       */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

