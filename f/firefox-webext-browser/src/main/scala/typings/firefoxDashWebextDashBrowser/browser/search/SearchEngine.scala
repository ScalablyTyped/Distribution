package typings.firefoxDashWebextDashBrowser.browser.search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* search types */
/** An object encapsulating a search engine */
trait SearchEngine extends js.Object {
  var alias: js.UndefOr[String] = js.undefined
  var favIconUrl: js.UndefOr[String] = js.undefined
  var isDefault: Boolean
  var name: String
}

object SearchEngine {
  @scala.inline
  def apply(isDefault: Boolean, name: String, alias: String = null, favIconUrl: String = null): SearchEngine = {
    val __obj = js.Dynamic.literal(isDefault = isDefault, name = name)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (favIconUrl != null) __obj.updateDynamic("favIconUrl")(favIconUrl)
    __obj.asInstanceOf[SearchEngine]
  }
}

