package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.manifest.ExtensionURL
import typings.firefoxWebextBrowser.browser.manifest.PersistentBackgroundProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPage extends js.Object {
  var page: ExtensionURL
  var persistent: js.UndefOr[PersistentBackgroundProperty] = js.undefined
}

object AnonPage {
  @scala.inline
  def apply(page: ExtensionURL, persistent: js.UndefOr[Boolean] = js.undefined): AnonPage = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPage]
  }
}

