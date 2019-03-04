package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Persistent extends js.Object {
  var persistent: js.UndefOr[
    firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.PersistentBackgroundProperty
  ] = js.undefined
  var scripts: js.Array[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionURL]
}

object Anon_Persistent {
  @scala.inline
  def apply(
    scripts: js.Array[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionURL],
    persistent: js.UndefOr[
      firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.PersistentBackgroundProperty
    ] = js.undefined
  ): Anon_Persistent = {
    val __obj = js.Dynamic.literal(scripts = scripts)
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    __obj.asInstanceOf[Anon_Persistent]
  }
}

