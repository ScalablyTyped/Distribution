package typings.eloRank.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EloRank extends js.Object {
  
  def getExpected(a: Double, b: Double): Double = js.native
  
  def getKFactor(): Double = js.native
  
  def setKFactor(kFactor: Double): Unit = js.native
  
  def updateRating(expected: Double, actual: Double, current: Double): Double = js.native
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
  
  @scala.inline
  implicit class EloRankOps[Self <: EloRank] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetExpected(value: (Double, Double) => Double): Self = this.set("getExpected", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetKFactor(value: () => Double): Self = this.set("getKFactor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetKFactor(value: Double => Unit): Self = this.set("setKFactor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateRating(value: (Double, Double, Double) => Double): Self = this.set("updateRating", js.Any.fromFunction3(value))
  }
}
