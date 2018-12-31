package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "RandomScoreFunction")
@js.native
/*
  Randomly score documents.
  */
class RandomScoreFunction ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.RandomScoreFunction {
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Adds a filter whose matching documents will have the score function applied.
    */
  /* CompleteClass */
  override def filter(oFilter: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Filter): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RandomScoreFunction = js.native
  /*
    Sets random seed value.
    */
  /* CompleteClass */
  override def seed(s: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.RandomScoreFunction = js.native
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

