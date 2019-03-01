package typings
package gapiDotClientDotConsumersurveysLib.gapiNs.clientNs.consumersurveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileAppPanel extends js.Object {
  var country: js.UndefOr[java.lang.String] = js.undefined
  var isPublicPanel: js.UndefOr[scala.Boolean] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var mobileAppPanelId: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var owners: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object MobileAppPanel {
  @scala.inline
  def apply(
    country: java.lang.String = null,
    isPublicPanel: js.UndefOr[scala.Boolean] = js.undefined,
    language: java.lang.String = null,
    mobileAppPanelId: java.lang.String = null,
    name: java.lang.String = null,
    owners: js.Array[java.lang.String] = null
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

