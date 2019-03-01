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
    getAverageCpc: js.Function0[scala.Double],
    getAverageCpm: js.Function0[scala.Double],
    getAverageCpv: js.Function0[scala.Double],
    getAveragePageviews: js.Function0[scala.Double],
    getAveragePosition: js.Function0[scala.Double],
    getAverageTimeOnSite: js.Function0[scala.Double],
    getBounceRage: js.Function0[scala.Double],
    getClicks: js.Function0[scala.Double],
    getConversionRate: js.Function0[scala.Double],
    getConversions: js.Function0[scala.Double],
    getCost: js.Function0[scala.Double],
    getCtr: js.Function0[scala.Double],
    getImpressions: js.Function0[scala.Double],
    getViewRate: js.Function0[scala.Double],
    getViews: js.Function0[scala.Double]
  ): AdWordsStats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAverageCpc")(getAverageCpc)
    __obj.updateDynamic("getAverageCpm")(getAverageCpm)
    __obj.updateDynamic("getAverageCpv")(getAverageCpv)
    __obj.updateDynamic("getAveragePageviews")(getAveragePageviews)
    __obj.updateDynamic("getAveragePosition")(getAveragePosition)
    __obj.updateDynamic("getAverageTimeOnSite")(getAverageTimeOnSite)
    __obj.updateDynamic("getBounceRage")(getBounceRage)
    __obj.updateDynamic("getClicks")(getClicks)
    __obj.updateDynamic("getConversionRate")(getConversionRate)
    __obj.updateDynamic("getConversions")(getConversions)
    __obj.updateDynamic("getCost")(getCost)
    __obj.updateDynamic("getCtr")(getCtr)
    __obj.updateDynamic("getImpressions")(getImpressions)
    __obj.updateDynamic("getViewRate")(getViewRate)
    __obj.updateDynamic("getViews")(getViews)
    __obj.asInstanceOf[AdWordsStats]
  }
}

