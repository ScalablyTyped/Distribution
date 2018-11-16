package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "FunctionScoreQuery")
@js.native
class FunctionScoreQuery ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.FunctionScoreQuery {
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Sets the boost value for documents matching the Query.
       */
  /* CompleteClass */
  override def boost(boost: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FunctionScoreQuery = js.native
  /*
       Set the setermines how the new calculated score is combined with the
       score from the original query. Valid values are: multiply, replace, sum,
       avg, max, and min.
       */
  /* CompleteClass */
  override def boostMode(mode: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FunctionScoreQuery = js.native
  /*
       Set the source filter.
       */
  /* CompleteClass */
  override def filter(oFilter: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Filter): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FunctionScoreQuery = js.native
  /*
       Add a single score function to the list of existing functions.
       */
  //function (func: ScoreFunction): FunctionScoreQuery;
  /*
       Sets the score functions.  Replaces any existing score functions.
       */
  /* CompleteClass */
  override def functions(funcs: js.Array[elasticDotJsLib.elasticDotJsMod.elasticjsNs.ScoreFunction]): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FunctionScoreQuery = js.native
  /*
       Set the source query.
       */
  /* CompleteClass */
  override def query(oQuery: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Query): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FunctionScoreQuery = js.native
  /*
       Set the scoring mode which specifies how the computed scores are combined.
       Valid values are: avg, max, min, sum, multiply, and first.
       */
  /* CompleteClass */
  override def scoreMode(mode: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FunctionScoreQuery = js.native
  /*
       Retrieves the internal query object. This is typically used by
       internal API functions so use with caution.
       */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

