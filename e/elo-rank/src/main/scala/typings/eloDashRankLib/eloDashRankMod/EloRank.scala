package typings
package eloDashRankLib.eloDashRankMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EloRank extends js.Object {
  def getExpected(a: scala.Double, b: scala.Double): scala.Double
  def getKFactor(): scala.Double
  def setKFactor(kFactor: scala.Double): scala.Unit
  def updateRating(expected: scala.Double, actual: scala.Double, current: scala.Double): scala.Double
}

object EloRank {
  @scala.inline
  def apply(
    getExpected: (scala.Double, scala.Double) => scala.Double,
    getKFactor: () => scala.Double,
    setKFactor: scala.Double => scala.Unit,
    updateRating: (scala.Double, scala.Double, scala.Double) => scala.Double
  ): EloRank = {
    val __obj = js.Dynamic.literal(getExpected = js.Any.fromFunction2(getExpected), getKFactor = js.Any.fromFunction0(getKFactor), setKFactor = js.Any.fromFunction1(setKFactor), updateRating = js.Any.fromFunction3(updateRating))
  
    __obj.asInstanceOf[EloRank]
  }
}

