package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BandingProperties extends js.Object {
  var firstBandColor: js.UndefOr[Color] = js.undefined
  var footerColor: js.UndefOr[Color] = js.undefined
  var headerColor: js.UndefOr[Color] = js.undefined
  var secondBandColor: js.UndefOr[Color] = js.undefined
}

object BandingProperties {
  @scala.inline
  def apply(
    firstBandColor: Color = null,
    footerColor: Color = null,
    headerColor: Color = null,
    secondBandColor: Color = null
  ): BandingProperties = {
    val __obj = js.Dynamic.literal()
    if (firstBandColor != null) __obj.updateDynamic("firstBandColor")(firstBandColor.asInstanceOf[js.Any])
    if (footerColor != null) __obj.updateDynamic("footerColor")(footerColor.asInstanceOf[js.Any])
    if (headerColor != null) __obj.updateDynamic("headerColor")(headerColor.asInstanceOf[js.Any])
    if (secondBandColor != null) __obj.updateDynamic("secondBandColor")(secondBandColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BandingProperties]
  }
}

