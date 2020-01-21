package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.manifest.FirefoxSpecificProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGecko extends js.Object {
  var gecko: js.UndefOr[FirefoxSpecificProperties] = js.undefined
}

object AnonGecko {
  @scala.inline
  def apply(gecko: FirefoxSpecificProperties = null): AnonGecko = {
    val __obj = js.Dynamic.literal()
    if (gecko != null) __obj.updateDynamic("gecko")(gecko.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGecko]
  }
}

