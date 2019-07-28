package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsStats extends js.Object {
  def getAverageCpc(): Double
  def getAverageCpm(): Double
  def getAverageCpv(): Double
  def getAveragePageviews(): Double
  def getAveragePosition(): Double
  def getAverageTimeOnSite(): Double
  def getBounceRage(): Double
  def getClicks(): Double
  def getConversionRate(): Double
  def getConversions(): Double
  def getCost(): Double
  def getCtr(): Double
  def getImpressions(): Double
  def getViewRate(): Double
  def getViews(): Double
}

object AdWordsStats {
  @scala.inline
  def apply(
    getAverageCpc: () => Double,
    getAverageCpm: () => Double,
    getAverageCpv: () => Double,
    getAveragePageviews: () => Double,
    getAveragePosition: () => Double,
    getAverageTimeOnSite: () => Double,
    getBounceRage: () => Double,
    getClicks: () => Double,
    getConversionRate: () => Double,
    getConversions: () => Double,
    getCost: () => Double,
    getCtr: () => Double,
    getImpressions: () => Double,
    getViewRate: () => Double,
    getViews: () => Double
  ): AdWordsStats = {
    val __obj = js.Dynamic.literal(getAverageCpc = js.Any.fromFunction0(getAverageCpc), getAverageCpm = js.Any.fromFunction0(getAverageCpm), getAverageCpv = js.Any.fromFunction0(getAverageCpv), getAveragePageviews = js.Any.fromFunction0(getAveragePageviews), getAveragePosition = js.Any.fromFunction0(getAveragePosition), getAverageTimeOnSite = js.Any.fromFunction0(getAverageTimeOnSite), getBounceRage = js.Any.fromFunction0(getBounceRage), getClicks = js.Any.fromFunction0(getClicks), getConversionRate = js.Any.fromFunction0(getConversionRate), getConversions = js.Any.fromFunction0(getConversions), getCost = js.Any.fromFunction0(getCost), getCtr = js.Any.fromFunction0(getCtr), getImpressions = js.Any.fromFunction0(getImpressions), getViewRate = js.Any.fromFunction0(getViewRate), getViews = js.Any.fromFunction0(getViews))
  
    __obj.asInstanceOf[AdWordsStats]
  }
}

