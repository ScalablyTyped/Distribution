package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetedProximity
  extends AdWordsEntity
     with canSetBidModifier
     with hasStats
     with isCampaignChild {
  def getAddress(): Address = js.native
  def getCampaignType(): CampaignType = js.native
  def getId(): scala.Double = js.native
  def getLatitude(): scala.Double = js.native
  def getLongitude(): scala.Double = js.native
  def getRadius(): scala.Double = js.native
  def getRadiusUnits(): RadiusUnits = js.native
  def getVideoCampaign(): Campaign = js.native
   // TODO: VideoCampaign
  def remove(): scala.Unit = js.native
}

