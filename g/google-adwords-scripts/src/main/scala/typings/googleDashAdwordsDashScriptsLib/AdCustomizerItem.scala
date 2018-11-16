package typings
package googleDashAdwordsDashScriptsLib

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
  def clearTargetAdGroup(): scala.Unit = js.native
  def clearTargetCampaign(): scala.Unit = js.native
  def clearTargetKeyword(): scala.Unit = js.native
  def getAttributeValue(name: java.lang.String): scala.Double | java.lang.String = js.native
  def getAttributeValues(): js.Object = js.native
  def getId(): scala.Double = js.native
  def getTargetAdGroupName(): java.lang.String = js.native
  def getTargetCampaignName(): java.lang.String = js.native
  def getTargetKeywordText(): java.lang.String = js.native
  def remove(): scala.Unit = js.native
  def setAttributeValue(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setAttributeValue(name: java.lang.String, value: scala.Double): scala.Unit = js.native
  def setAttributeValues(attributeValues: js.Object): scala.Unit = js.native
  def setTargetAdGroup(campaignName: java.lang.String, adGroupName: java.lang.String): scala.Unit = js.native
  def setTargetCampaign(campaignName: java.lang.String): scala.Unit = js.native
  def setTargetKeyword(): scala.Unit = js.native
  def setTargetKeyword(keyword: java.lang.String): scala.Unit = js.native
}

