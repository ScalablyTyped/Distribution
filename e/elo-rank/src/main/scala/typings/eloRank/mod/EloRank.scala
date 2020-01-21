package typings.eloRank.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EloRank extends js.Object {
  def getExpected(a: Double, b: Double): Double
  def getKFactor(): Double
  def setKFactor(kFactor: Double): Unit
  def updateRating(expected: Double, actual: Double, current: Double): Double
}

object EloRank {
  @scala.inline
  def apply(
    getExpected: (Double, Double) => Double,
    getKFactor: () => Double,
    setKFactor: Double => Unit,
    updateRating: (Double, Double, Double) => Double
  ): EloRank = {
    val __obj = js.Dynamic.literal(getExpected = js.Any.fromFunction2(getExpected), getKFactor = js.Any.fromFunction0(getKFactor), setKFactor = js.Any.fromFunction1(setKFactor), updateRating = js.Any.fromFunction3(updateRating))
  
    __obj.asInstanceOf[EloRank]
  }
}

