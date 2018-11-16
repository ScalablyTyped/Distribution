package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "ConstantScoreQuery")
@js.native
class ConstantScoreQuery ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.ConstantScoreQuery {
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Sets the boost value for documents matching the Query.
       */
  /* CompleteClass */
  override def boost(boost: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ConstantScoreQuery = js.native
  /*
       Enables caching of the filter.
       */
  /* CompleteClass */
  override def cache(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ConstantScoreQuery = js.native
  /*
       Set the cache key.
       */
  /* CompleteClass */
  override def cacheKey(k: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ConstantScoreQuery = js.native
  /*
       Adds the filter to apply a constant score to.
       */
  /* CompleteClass */
  override def filter(oFilter: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ConstantScoreQuery = js.native
  /*
       Adds the query to apply a constant score to.
       */
  /* CompleteClass */
  override def query(oQuery: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ConstantScoreQuery = js.native
  /*
       Retrieves the internal query object. This is typically used by
       internal API functions so use with caution.
       */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

