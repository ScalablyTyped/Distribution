package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExcludedLocation
  extends AdWordsEntity
     with isCampaignChild {
  def getCampaignType(): CampaignType
  def getCountryCode(): java.lang.String
  def getId(): scala.Double
  def getName(): java.lang.String
  def getTargetType(): TargetType
  def getTargetingStatus(): TargetingStatus
  def getVideoCampaign(): Campaign
   // TODO: VideoCampaign
  def remove(): scala.Unit
}

