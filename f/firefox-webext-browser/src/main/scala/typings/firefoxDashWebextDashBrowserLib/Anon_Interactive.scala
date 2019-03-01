package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Interactive extends js.Object {
  var interactive: js.UndefOr[scala.Boolean] = js.undefined
  var url: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.HttpURL
}

object Anon_Interactive {
  @scala.inline
  def apply(
    url: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.HttpURL,
    interactive: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Interactive = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    __obj.asInstanceOf[Anon_Interactive]
  }
}

