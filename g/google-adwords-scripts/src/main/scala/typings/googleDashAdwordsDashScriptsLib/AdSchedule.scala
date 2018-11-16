package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Shopping
// Targeting
@js.native
trait AdSchedule
  extends AdWordsEntity
     with canSetBidModifier
     with hasStats
     with isCampaignChild {
  def getCampaignType(): CampaignType = js.native
  def getDayOfWeek(): DayOfWeekString = js.native
  def getEndHour(): scala.Double = js.native
  def getEndMinute(): scala.Double = js.native
  def getId(): scala.Double = js.native
  def getStartHour(): scala.Double = js.native
  def getStartMinute(): scala.Double = js.native
  def getVideoCampaign(): Campaign = js.native
   // TODO: VideoCampaign
  def remove(): scala.Unit = js.native
}

