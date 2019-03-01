package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Gecko extends js.Object {
  var gecko: js.UndefOr[
    firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.FirefoxSpecificProperties
  ] = js.undefined
}

object Anon_Gecko {
  @scala.inline
  def apply(
    gecko: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.FirefoxSpecificProperties = null
  ): Anon_Gecko = {
    val __obj = js.Dynamic.literal()
    if (gecko != null) __obj.updateDynamic("gecko")(gecko)
    __obj.asInstanceOf[Anon_Gecko]
  }
}

