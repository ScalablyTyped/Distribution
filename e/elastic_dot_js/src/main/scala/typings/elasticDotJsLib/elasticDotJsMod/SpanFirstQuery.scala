package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "SpanFirstQuery")
@js.native
class SpanFirstQuery protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.SpanFirstQuery {
  /*
       Matches spans near the beginning of a field.
       */
  def this(spanQry: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Query, end: scala.Double) = this()
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Sets the boost value for documents matching the Query.
       */
  /* CompleteClass */
  override def boost(boost: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SpanFirstQuery = js.native
  /*
       Sets the maximum end position permitted in a match.
       */
  /* CompleteClass */
  override def end(position: stdLib.Number): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SpanFirstQuery = js.native
  /*
       Sets the span query to match on.
       */
  /* CompleteClass */
  override def `match`(spanQuery: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SpanFirstQuery = js.native
  /*
       Retrieves the internal query object. This is typically used by
       internal API functions so use with caution.
       */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

