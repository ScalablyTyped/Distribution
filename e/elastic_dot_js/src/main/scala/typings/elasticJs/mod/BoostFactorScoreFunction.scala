package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "BoostFactorScoreFunction")
@js.native
class BoostFactorScoreFunction protected () extends ScoreFunction {
  /*
    Multiply the score by the provided boost_factor.
    */
  def this(boostVal: Double) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Sets the boost factor.
    */
  def boost(b: Double): BoostFactorScoreFunction = js.native
  
  /*
    Adds a filter whose matching documents will have the score function applied.
    */
  def filter(oFilter: Filter): BoostFactorScoreFunction = js.native
  
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}
