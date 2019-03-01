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

object Language {
  @scala.inline
  def apply(
    getCampaign: js.Function0[Campaign],
    getCampaignType: js.Function0[CampaignType],
    getId: js.Function0[scala.Double],
    getName: js.Function0[java.lang.String],
    getVideoCampaign: js.Function0[Campaign],
    remove: js.Function0[scala.Unit],
    getEntityType: js.Function0[java.lang.String] = null
  ): Language = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCampaign")(getCampaign)
    __obj.updateDynamic("getCampaignType")(getCampaignType)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getVideoCampaign")(getVideoCampaign)
    __obj.updateDynamic("remove")(remove)
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(getEntityType)
    __obj.asInstanceOf[Language]
  }
}

