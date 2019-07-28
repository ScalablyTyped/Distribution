package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlChannel extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var urlPattern: js.UndefOr[String] = js.undefined
}

object UrlChannel {
  @scala.inline
  def apply(id: String = null, kind: String = null, urlPattern: String = null): UrlChannel = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (urlPattern != null) __obj.updateDynamic("urlPattern")(urlPattern)
    __obj.asInstanceOf[UrlChannel]
  }
}

