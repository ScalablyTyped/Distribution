package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait hasStats extends js.Object {
  def getStatsFor(dateFrom: AdWordsDate, dateTo: AdWordsDate): AdWordsStats = js.native
  def getStatsFor(dateFrom: AdWordsDate, dateTo: java.lang.String): AdWordsStats = js.native
  def getStatsFor(dateFrom: java.lang.String, dateTo: AdWordsDate): AdWordsStats = js.native
  def getStatsFor(dateFrom: java.lang.String, dateTo: java.lang.String): AdWordsStats = js.native
  def getStatsFor(dateRange: DateRange): AdWordsStats = js.native
}

