package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHomepage extends js.Object {
  var homepage: js.UndefOr[String] = js.undefined
  var search_provider: js.UndefOr[AnonAlternateurls] = js.undefined
}

object AnonHomepage {
  @scala.inline
  def apply(homepage: String = null, search_provider: AnonAlternateurls = null): AnonHomepage = {
    val __obj = js.Dynamic.literal()
    if (homepage != null) __obj.updateDynamic("homepage")(homepage.asInstanceOf[js.Any])
    if (search_provider != null) __obj.updateDynamic("search_provider")(search_provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHomepage]
  }
}

