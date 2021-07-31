package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait hasStats extends StObject {
  
  def getStatsFor(dateFrom: String, dateTo: String): AdWordsStats = js.native
  def getStatsFor(dateFrom: String, dateTo: AdWordsDate): AdWordsStats = js.native
  def getStatsFor(dateFrom: AdWordsDate, dateTo: String): AdWordsStats = js.native
  def getStatsFor(dateFrom: AdWordsDate, dateTo: AdWordsDate): AdWordsStats = js.native
  def getStatsFor(dateRange: DateRange): AdWordsStats = js.native
}
