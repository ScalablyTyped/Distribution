package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdWordsStats extends js.Object {
  def getAverageCpc(): Double = js.native
  def getAverageCpm(): Double = js.native
  def getAverageCpv(): Double = js.native
  def getAveragePageviews(): Double = js.native
  def getAveragePosition(): Double = js.native
  def getAverageTimeOnSite(): Double = js.native
  def getBounceRage(): Double = js.native
  def getClicks(): Double = js.native
  def getConversionRate(): Double = js.native
  def getConversions(): Double = js.native
  def getCost(): Double = js.native
  def getCtr(): Double = js.native
  def getImpressions(): Double = js.native
  def getViewRate(): Double = js.native
  def getViews(): Double = js.native
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
  @scala.inline
  implicit class AdWordsStatsOps[Self <: AdWordsStats] (val x: Self) extends AnyVal {
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
    def setGetAverageCpc(value: () => Double): Self = this.set("getAverageCpc", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAverageCpm(value: () => Double): Self = this.set("getAverageCpm", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAverageCpv(value: () => Double): Self = this.set("getAverageCpv", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAveragePageviews(value: () => Double): Self = this.set("getAveragePageviews", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAveragePosition(value: () => Double): Self = this.set("getAveragePosition", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAverageTimeOnSite(value: () => Double): Self = this.set("getAverageTimeOnSite", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBounceRage(value: () => Double): Self = this.set("getBounceRage", js.Any.fromFunction0(value))
    @scala.inline
    def setGetClicks(value: () => Double): Self = this.set("getClicks", js.Any.fromFunction0(value))
    @scala.inline
    def setGetConversionRate(value: () => Double): Self = this.set("getConversionRate", js.Any.fromFunction0(value))
    @scala.inline
    def setGetConversions(value: () => Double): Self = this.set("getConversions", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCost(value: () => Double): Self = this.set("getCost", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCtr(value: () => Double): Self = this.set("getCtr", js.Any.fromFunction0(value))
    @scala.inline
    def setGetImpressions(value: () => Double): Self = this.set("getImpressions", js.Any.fromFunction0(value))
    @scala.inline
    def setGetViewRate(value: () => Double): Self = this.set("getViewRate", js.Any.fromFunction0(value))
    @scala.inline
    def setGetViews(value: () => Double): Self = this.set("getViews", js.Any.fromFunction0(value))
  }
  
}

