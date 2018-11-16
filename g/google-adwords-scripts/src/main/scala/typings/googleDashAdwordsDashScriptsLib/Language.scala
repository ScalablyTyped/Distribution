package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Language
  extends AdWordsEntity
     with isCampaignChild {
  def getCampaignType(): CampaignType
  def getId(): scala.Double
  def getName(): java.lang.String
  def getVideoCampaign(): Campaign
   // TODO: VideoCampaign
  def remove(): scala.Unit
}

