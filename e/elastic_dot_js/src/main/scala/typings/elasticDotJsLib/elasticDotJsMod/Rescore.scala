package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "Rescore")
@js.native
class Rescore protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.Rescore {
  /*
       Defines an operation that rescores a query with another query.
       */
  //constructor(windowSize: Number, windowSize: Query);
  def this(windowSize: stdLib.Number) = this()
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Sets the weight assigned to the original query of the rescoring.
       */
  /* CompleteClass */
  override def queryWeight(weight: stdLib.Number): elasticDotJsLib.elasticDotJsMod.elasticjsNs.Rescore = js.native
  /*
       Sets the query used by the rescoring.
       */
  /* CompleteClass */
  override def rescoreQuery(someQuery: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Query): elasticDotJsLib.elasticDotJsMod.elasticjsNs.Rescore = js.native
  /*
       Sets the weight assigned to the query used to rescore the original query.
       */
  /* CompleteClass */
  override def rescoreQueryWeight(weight: stdLib.Number): elasticDotJsLib.elasticDotJsMod.elasticjsNs.Rescore = js.native
  /*
       Sets the scoring mode.  Valid values are:
  
       total - default mode, the scores combined
       multiply - the scores multiplied
       min - the lowest of the scores
       max - the highest score
       avg - the average of the scores
       */
  /* CompleteClass */
  override def scoreMode(s: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.Rescore = js.native
  /*
       Retrieves the internal script object. This is typically used by
       internal API functions so use with caution.
       */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /*
       Sets the window_size parameter of the rescoring.
       */
  /* CompleteClass */
  override def windowSize(size: stdLib.Number): elasticDotJsLib.elasticDotJsMod.elasticjsNs.Rescore = js.native
}

