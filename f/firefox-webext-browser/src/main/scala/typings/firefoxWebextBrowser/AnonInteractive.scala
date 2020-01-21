package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.manifest.HttpURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInteractive extends js.Object {
  var interactive: js.UndefOr[Boolean] = js.undefined
  var url: HttpURL
}

object AnonInteractive {
  @scala.inline
  def apply(url: HttpURL, interactive: js.UndefOr[Boolean] = js.undefined): AnonInteractive = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInteractive]
  }
}

