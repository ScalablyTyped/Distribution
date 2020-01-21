package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "DecayScoreFunction")
@js.native
class DecayScoreFunction protected () extends ScoreFunction {
  /*
    Score a document with a function that decays depending on the distance
    of a numeric field value of the document from given origin.
    */
  def this(field: String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Sets the decay value which defines how documents are scored at the distance
    given at scale.
    */
  def decay(d: Double): DecayScoreFunction = js.native
  /*
    Use the exp decay function. Exponential decay.
    */
  def exp(): DecayScoreFunction = js.native
  /*
    Sets the fields to run the decay function against.
    */
  def field(f: String): DecayScoreFunction = js.native
  /*
    Adds a filter whose matching documents will have the score function applied.
    */
  def filter(oFilter: Filter): DecayScoreFunction = js.native
  /*
    Use the gauss decay function. Normal decay.
    */
  def gauss(): DecayScoreFunction = js.native
  /*
    Use the linear decay function. Linear decay.
    */
  def linear(): DecayScoreFunction = js.native
  /*
    Sets the decay offset.  The decay function will only compute a the decay
    function for documents with a distance greater that the defined offset.
    The default is 0.
    */
  def offset(o: String): DecayScoreFunction = js.native
  /*
    Sets the origin which is the “central point” from which the distance is
    calculated.
    */
  def origin(o: String): DecayScoreFunction = js.native
  /*
    Sets the scale/rate of decay.
    */
  def scale(s: String): DecayScoreFunction = js.native
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

