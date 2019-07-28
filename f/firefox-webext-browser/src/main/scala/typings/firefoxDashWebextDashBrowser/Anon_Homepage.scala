package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Homepage extends js.Object {
  var homepage: js.UndefOr[String] = js.undefined
  var search_provider: js.UndefOr[Anon_Alternateurls] = js.undefined
}

object Anon_Homepage {
  @scala.inline
  def apply(homepage: String = null, search_provider: Anon_Alternateurls = null): Anon_Homepage = {
    val __obj = js.Dynamic.literal()
    if (homepage != null) __obj.updateDynamic("homepage")(homepage)
    if (search_provider != null) __obj.updateDynamic("search_provider")(search_provider)
    __obj.asInstanceOf[Anon_Homepage]
  }
}

