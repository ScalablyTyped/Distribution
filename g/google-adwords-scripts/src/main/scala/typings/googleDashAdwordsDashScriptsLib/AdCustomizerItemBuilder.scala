package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdCustomizerItemBuilder[AdCustomizerItem]
  extends AdWordsBuilder[AdCustomizerItem]
     with hasMobilePreferredBuilder[AdCustomizerItemBuilder[AdCustomizerItem]]
     with hasSchedulesBuilder[AdCustomizerItemBuilder[AdCustomizerItem]]
     with hasStartAndEndDateBuilder[AdCustomizerItemBuilder[AdCustomizerItem]] {
  def withAttributeValue(name: java.lang.String, value: js.Object): AdCustomizerItemBuilder[AdCustomizerItem] = js.native
  def withAttributeValues(attributeValues: js.Object): AdCustomizerItemBuilder[AdCustomizerItem] = js.native
  def withTargetAdGroup(campaignName: java.lang.String, adGroup: java.lang.String): AdCustomizerItemBuilder[AdCustomizerItem] = js.native
  def withTargetCampaign(campaignName: java.lang.String): AdCustomizerItemBuilder[AdCustomizerItem] = js.native
  def withTargetKeyword(keyword: java.lang.String): AdCustomizerItemBuilder[AdCustomizerItem] = js.native
}

