package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Platform
  extends AdWordsEntity
     with canSetBidModifier
     with hasStats
     with isCampaignChild {
  def getCampaignType(): CampaignType = js.native
  def getId(): scala.Double = js.native
  def getName(): java.lang.String = js.native
  def getVideoCampaign(): Campaign = js.native
}

