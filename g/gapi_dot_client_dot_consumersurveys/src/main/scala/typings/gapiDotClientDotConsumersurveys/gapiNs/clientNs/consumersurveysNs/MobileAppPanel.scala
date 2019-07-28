package typings.gapiDotClientDotConsumersurveys.gapiNs.clientNs.consumersurveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileAppPanel extends js.Object {
  var country: js.UndefOr[String] = js.undefined
  var isPublicPanel: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var mobileAppPanelId: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var owners: js.UndefOr[js.Array[String]] = js.undefined
}

object MobileAppPanel {
  @scala.inline
  def apply(
    country: String = null,
    isPublicPanel: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    mobileAppPanelId: String = null,
    name: String = null,
    owners: js.Array[String] = null
  ): MobileAppPanel = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (!js.isUndefined(isPublicPanel)) __obj.updateDynamic("isPublicPanel")(isPublicPanel)
    if (language != null) __obj.updateDynamic("language")(language)
    if (mobileAppPanelId != null) __obj.updateDynamic("mobileAppPanelId")(mobileAppPanelId)
    if (name != null) __obj.updateDynamic("name")(name)
    if (owners != null) __obj.updateDynamic("owners")(owners)
    __obj.asInstanceOf[MobileAppPanel]
  }
}

