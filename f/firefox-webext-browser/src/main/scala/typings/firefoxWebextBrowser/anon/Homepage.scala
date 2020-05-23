package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Homepage extends js.Object {
  var homepage: js.UndefOr[String] = js.undefined
  var search_provider: js.UndefOr[Alternateurls] = js.undefined
}

object Homepage {
  @scala.inline
  def apply(homepage: String = null, search_provider: Alternateurls = null): Homepage = {
    val __obj = js.Dynamic.literal()
    if (homepage != null) __obj.updateDynamic("homepage")(homepage.asInstanceOf[js.Any])
    if (search_provider != null) __obj.updateDynamic("search_provider")(search_provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Homepage]
  }
}

