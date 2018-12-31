package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "DecayScoreFunction")
@js.native
class DecayScoreFunction protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.DecayScoreFunction {
  /*
    Score a document with a function that decays depending on the distance
    of a numeric field value of the document from given origin.
    */
  def this(field: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Sets the decay value which defines how documents are scored at the distance
    given at scale.
    */
  /* CompleteClass */
  override def decay(d: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DecayScoreFunction = js.native
  /*
    Use the exp decay function. Exponential decay.
    */
  /* CompleteClass */
  override def exp(): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DecayScoreFunction = js.native
  /*
    Sets the fields to run the decay function against.
    */
  /* CompleteClass */
  override def field(f: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DecayScoreFunction = js.native
  /*
    Adds a filter whose matching documents will have the score function applied.
    */
  /* CompleteClass */
  override def filter(oFilter: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Filter): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DecayScoreFunction = js.native
  /*
    Use the gauss decay function. Normal decay.
    */
  /* CompleteClass */
  override def gauss(): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DecayScoreFunction = js.native
  /*
    Use the linear decay function. Linear decay.
    */
  /* CompleteClass */
  override def linear(): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DecayScoreFunction = js.native
  /*
    Sets the decay offset.  The decay function will only compute a the decay
    function for documents with a distance greater that the defined offset.
    The default is 0.
    */
  /* CompleteClass */
  override def offset(o: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DecayScoreFunction = js.native
  /*
    Sets the origin which is the “central point” from which the distance is
    calculated.
    */
  /* CompleteClass */
  override def origin(o: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DecayScoreFunction = js.native
  /*
    Sets the scale/rate of decay.
    */
  /* CompleteClass */
  override def scale(s: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DecayScoreFunction = js.native
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

