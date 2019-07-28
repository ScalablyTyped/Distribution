package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Ad Customizers
@js.native
trait AdCustomizerItem
  extends AdWordsEntity
     with hasMobilePreferred
     with hasStartAndEndDate
     with hasSchedules {
  def clearTargetAdGroup(): Unit = js.native
  def clearTargetCampaign(): Unit = js.native
  def clearTargetKeyword(): Unit = js.native
  def getAttributeValue(name: String): Double | String = js.native
  def getAttributeValues(): js.Object = js.native
  def getId(): Double = js.native
  def getTargetAdGroupName(): String = js.native
  def getTargetCampaignName(): String = js.native
  def getTargetKeywordText(): String = js.native
  def remove(): Unit = js.native
  def setAttributeValue(name: String, value: String): Unit = js.native
  def setAttributeValue(name: String, value: Double): Unit = js.native
  def setAttributeValues(attributeValues: js.Object): Unit = js.native
  def setTargetAdGroup(campaignName: String, adGroupName: String): Unit = js.native
  def setTargetCampaign(campaignName: String): Unit = js.native
  def setTargetKeyword(): Unit = js.native
  def setTargetKeyword(keyword: String): Unit = js.native
}

