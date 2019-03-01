package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Apiscript extends js.Object {
  var api_script: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionURL] = js.undefined
}

object Anon_Apiscript {
  @scala.inline
  def apply(api_script: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionURL = null): Anon_Apiscript = {
    val __obj = js.Dynamic.literal()
    if (api_script != null) __obj.updateDynamic("api_script")(api_script)
    __obj.asInstanceOf[Anon_Apiscript]
  }
}

