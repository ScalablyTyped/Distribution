package typings.eloRank.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elo-rank", JSImport.Namespace)
@js.native
class ^ () extends EloRank {
  def this(kFactor: Double) = this()
  /* CompleteClass */
  override def getExpected(a: Double, b: Double): Double = js.native
  /* CompleteClass */
  override def getKFactor(): Double = js.native
  /* CompleteClass */
  override def setKFactor(kFactor: Double): Unit = js.native
  /* CompleteClass */
  override def updateRating(expected: Double, actual: Double, current: Double): Double = js.native
}

