package typings.firebaseAnalyticsTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsOptions extends js.Object {
  /** Sets custom name for `dataLayer` array used by gtag. */
  var dataLayerName: js.UndefOr[String] = js.undefined
  /** Sets custom name for `gtag` function. */
  var gtagName: js.UndefOr[String] = js.undefined
}

object SettingsOptions {
  @scala.inline
  def apply(dataLayerName: String = null, gtagName: String = null): SettingsOptions = {
    val __obj = js.Dynamic.literal()
    if (dataLayerName != null) __obj.updateDynamic("dataLayerName")(dataLayerName.asInstanceOf[js.Any])
    if (gtagName != null) __obj.updateDynamic("gtagName")(gtagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsOptions]
  }
}

