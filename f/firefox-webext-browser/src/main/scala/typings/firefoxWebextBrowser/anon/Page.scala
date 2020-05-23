package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.ExtensionURL
import typings.firefoxWebextBrowser.browser.manifest.PersistentBackgroundProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  var page: ExtensionURL
  var persistent: js.UndefOr[PersistentBackgroundProperty] = js.undefined
}

object Page {
  @scala.inline
  def apply(page: ExtensionURL, persistent: js.UndefOr[PersistentBackgroundProperty] = js.undefined): Page = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
}

