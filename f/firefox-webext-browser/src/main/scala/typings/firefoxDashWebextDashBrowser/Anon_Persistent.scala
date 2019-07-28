package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browserNs.underscoreManifestNs.ExtensionURL
import typings.firefoxDashWebextDashBrowser.browserNs.underscoreManifestNs.PersistentBackgroundProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Persistent extends js.Object {
  var persistent: js.UndefOr[PersistentBackgroundProperty] = js.undefined
  var scripts: js.Array[ExtensionURL]
}

object Anon_Persistent {
  @scala.inline
  def apply(
    scripts: js.Array[ExtensionURL],
    persistent: js.UndefOr[PersistentBackgroundProperty] = js.undefined
  ): Anon_Persistent = {
    val __obj = js.Dynamic.literal(scripts = scripts)
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    __obj.asInstanceOf[Anon_Persistent]
  }
}

