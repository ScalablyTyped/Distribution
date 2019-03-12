package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsStats extends js.Object {
  def getAverageCpc(): scala.Double
  def getAverageCpm(): scala.Double
  def getAverageCpv(): scala.Double
  def getAveragePageviews(): scala.Double
  def getAveragePosition(): scala.Double
  def getAverageTimeOnSite(): scala.Double
  def getBounceRage(): scala.Double
  def getClicks(): scala.Double
  def getConversionRate(): scala.Double
  def getConversions(): scala.Double
  def getCost(): scala.Double
  def getCtr(): scala.Double
  def getImpressions(): scala.Double
  def getViewRate(): scala.Double
  def getViews(): scala.Double
}

object AdWordsStats {
  @scala.inline
  def apply(
    getAverageCpc: () => scala.Double,
    getAverageCpm: () => scala.Double,
    getAverageCpv: () => scala.Double,
    getAveragePageviews: () => scala.Double,
    getAveragePosition: () => scala.Double,
    getAverageTimeOnSite: () => scala.Double,
    getBounceRage: () => scala.Double,
    getClicks: () => scala.Double,
    getConversionRate: () => scala.Double,
    getConversions: () => scala.Double,
    getCost: () => scala.Double,
    getCtr: () => scala.Double,
    getImpressions: () => scala.Double,
    getViewRate: () => scala.Double,
    getViews: () => scala.Double
  ): AdWordsStats = {
    val __obj = js.Dynamic.literal(getAverageCpc = js.Any.fromFunction0(getAverageCpc), getAverageCpm = js.Any.fromFunction0(getAverageCpm), getAverageCpv = js.Any.fromFunction0(getAverageCpv), getAveragePageviews = js.Any.fromFunction0(getAveragePageviews), getAveragePosition = js.Any.fromFunction0(getAveragePosition), getAverageTimeOnSite = js.Any.fromFunction0(getAverageTimeOnSite), getBounceRage = js.Any.fromFunction0(getBounceRage), getClicks = js.Any.fromFunction0(getClicks), getConversionRate = js.Any.fromFunction0(getConversionRate), getConversions = js.Any.fromFunction0(getConversions), getCost = js.Any.fromFunction0(getCost), getCtr = js.Any.fromFunction0(getCtr), getImpressions = js.Any.fromFunction0(getImpressions), getViewRate = js.Any.fromFunction0(getViewRate), getViews = js.Any.fromFunction0(getViews))
  
    __obj.asInstanceOf[AdWordsStats]
  }
}

