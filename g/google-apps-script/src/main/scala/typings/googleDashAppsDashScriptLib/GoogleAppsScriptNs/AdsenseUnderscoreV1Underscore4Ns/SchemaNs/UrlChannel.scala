package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlChannel extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var urlPattern: js.UndefOr[java.lang.String] = js.undefined
}

object UrlChannel {
  @scala.inline
  def apply(id: java.lang.String = null, kind: java.lang.String = null, urlPattern: java.lang.String = null): UrlChannel = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (urlPattern != null) __obj.updateDynamic("urlPattern")(urlPattern)
    __obj.asInstanceOf[UrlChannel]
  }
}

