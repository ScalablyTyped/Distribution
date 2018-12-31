package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "SpanMultiTermQuery")
@js.native
class SpanMultiTermQuery protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.SpanMultiTermQuery {
  /*
    Use MultiTermQueries as a SpanQuery.
    */
  def this(qry: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Query) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Sets the boost value for documents matching the Query.
    */
  /* CompleteClass */
  override def boost(boost: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SpanMultiTermQuery = js.native
  /*
    Sets the span query to match on.
    */
  /* CompleteClass */
  override def `match`(mtQuery: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SpanMultiTermQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

