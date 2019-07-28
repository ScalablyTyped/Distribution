package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browserNs.underscoreManifestNs.HttpURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Interactive extends js.Object {
  var interactive: js.UndefOr[Boolean] = js.undefined
  var url: HttpURL
}

object Anon_Interactive {
  @scala.inline
  def apply(url: HttpURL, interactive: js.UndefOr[Boolean] = js.undefined): Anon_Interactive = {
    val __obj = js.Dynamic.literal(url = url)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    __obj.asInstanceOf[Anon_Interactive]
  }
}

