package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdCustomizerItemBuilder[AdCustomizerItem]
  extends AdWordsBuilder[AdCustomizerItem]
     with hasMobilePreferredBuilder[AdCustomizerItemBuilder[AdCustomizerItem]]
     with hasSchedulesBuilder[AdCustomizerItemBuilder[AdCustomizerItem]]
     with hasStartAndEndDateBuilder[AdCustomizerItemBuilder[AdCustomizerItem]] {
  def withAttributeValue(name: String, value: js.Object): AdCustomizerItemBuilder[AdCustomizerItem] = js.native
  def withAttributeValues(attributeValues: js.Object): AdCustomizerItemBuilder[AdCustomizerItem] = js.native
  def withTargetAdGroup(campaignName: String, adGroup: String): AdCustomizerItemBuilder[AdCustomizerItem] = js.native
  def withTargetCampaign(campaignName: String): AdCustomizerItemBuilder[AdCustomizerItem] = js.native
  def withTargetKeyword(keyword: String): AdCustomizerItemBuilder[AdCustomizerItem] = js.native
}

