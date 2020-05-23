package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.ExtensionURL
import typings.firefoxWebextBrowser.browser.manifest.PersistentBackgroundProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Persistent extends js.Object {
  var persistent: js.UndefOr[PersistentBackgroundProperty] = js.undefined
  var scripts: js.Array[ExtensionURL]
}

object Persistent {
  @scala.inline
  def apply(
    scripts: js.Array[ExtensionURL],
    persistent: js.UndefOr[PersistentBackgroundProperty] = js.undefined
  ): Persistent = {
    val __obj = js.Dynamic.literal(scripts = scripts.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Persistent]
  }
}

