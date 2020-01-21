package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait hasStats extends js.Object {
  def getStatsFor(dateFrom: String, dateTo: String): AdWordsStats = js.native
  def getStatsFor(dateFrom: String, dateTo: AdWordsDate): AdWordsStats = js.native
  def getStatsFor(dateFrom: AdWordsDate, dateTo: String): AdWordsStats = js.native
  def getStatsFor(dateFrom: AdWordsDate, dateTo: AdWordsDate): AdWordsStats = js.native
  def getStatsFor(dateRange: DateRange): AdWordsStats = js.native
}

