package typings
package firefoxDashWebextDashBrowserLib.browserNs.searchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* search types */
/** An object encapsulating a search engine */
trait SearchEngine extends js.Object {
  var alias: js.UndefOr[java.lang.String] = js.undefined
  var favIconUrl: js.UndefOr[java.lang.String] = js.undefined
  var isDefault: scala.Boolean
  var name: java.lang.String
}

object SearchEngine {
  @scala.inline
  def apply(
    isDefault: scala.Boolean,
    name: java.lang.String,
    alias: java.lang.String = null,
    favIconUrl: java.lang.String = null
  ): SearchEngine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefault")(isDefault)
    __obj.updateDynamic("name")(name)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (favIconUrl != null) __obj.updateDynamic("favIconUrl")(favIconUrl)
    __obj.asInstanceOf[SearchEngine]
  }
}

