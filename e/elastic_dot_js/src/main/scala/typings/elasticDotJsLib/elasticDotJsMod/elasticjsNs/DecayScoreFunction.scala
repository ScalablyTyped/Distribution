package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecayScoreFunction extends ScoreFunction {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the decay value which defines how documents are scored at the distance
    given at scale.
    */
  def decay(d: scala.Double): DecayScoreFunction
  /*
    Use the exp decay function. Exponential decay.
    */
  def exp(): DecayScoreFunction
  /*
    Sets the fields to run the decay function against.
    */
  def field(f: java.lang.String): DecayScoreFunction
  /*
    Adds a filter whose matching documents will have the score function applied.
    */
  def filter(oFilter: Filter): DecayScoreFunction
  /*
    Use the gauss decay function. Normal decay.
    */
  def gauss(): DecayScoreFunction
  /*
    Use the linear decay function. Linear decay.
    */
  def linear(): DecayScoreFunction
  /*
    Sets the decay offset.  The decay function will only compute a the decay
    function for documents with a distance greater that the defined offset.
    The default is 0.
    */
  def offset(o: java.lang.String): DecayScoreFunction
  /*
    Sets the origin which is the “central point” from which the distance is
    calculated.
    */
  def origin(o: java.lang.String): DecayScoreFunction
  /*
    Sets the scale/rate of decay.
    */
  def scale(s: java.lang.String): DecayScoreFunction
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

