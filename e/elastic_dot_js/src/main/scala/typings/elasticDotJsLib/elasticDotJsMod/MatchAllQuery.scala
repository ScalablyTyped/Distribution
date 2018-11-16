package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "MatchAllQuery")
@js.native
class MatchAllQuery ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.MatchAllQuery {
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Sets the boost value for documents matching the Query.
       */
  /* CompleteClass */
  override def boost(boost: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MatchAllQuery = js.native
  /*
       Retrieves the internal query object. This is typically used by
       internal API functions so use with caution.
       */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

