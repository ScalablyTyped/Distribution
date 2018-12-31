package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "SpanNotQuery")
@js.native
class SpanNotQuery protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.SpanNotQuery {
  /*
    Removes matches which overlap with another span query.
    */
  def this(includeQry: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Query, excludeQry: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Query) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Sets the boost value for documents matching the Query.
    */
  /* CompleteClass */
  override def boost(boost: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SpanNotQuery = js.native
  /*
    Sets the span query whose matches must not overlap those returned.
    */
  /* CompleteClass */
  override def exclude(spanQuery: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SpanNotQuery = js.native
  /*
    Set the span query whose matches are filtered.
    */
  /* CompleteClass */
  override def include(spanQuery: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SpanNotQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

