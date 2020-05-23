package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.HttpURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interactive extends js.Object {
  var interactive: js.UndefOr[Boolean] = js.undefined
  var url: HttpURL
}

object Interactive {
  @scala.inline
  def apply(url: HttpURL, interactive: js.UndefOr[Boolean] = js.undefined): Interactive = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interactive]
  }
}

