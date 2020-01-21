package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.manifest.ExtensionURL
import typings.firefoxWebextBrowser.browser.manifest.PersistentBackgroundProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPersistent extends js.Object {
  var persistent: js.UndefOr[PersistentBackgroundProperty] = js.undefined
  var scripts: js.Array[ExtensionURL]
}

object AnonPersistent {
  @scala.inline
  def apply(scripts: js.Array[ExtensionURL], persistent: js.UndefOr[Boolean] = js.undefined): AnonPersistent = {
    val __obj = js.Dynamic.literal(scripts = scripts.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPersistent]
  }
}

