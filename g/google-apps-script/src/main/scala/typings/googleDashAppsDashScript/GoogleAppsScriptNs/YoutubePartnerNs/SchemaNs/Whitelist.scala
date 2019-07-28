package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Whitelist extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Whitelist {
  @scala.inline
  def apply(id: String = null, kind: String = null, title: String = null): Whitelist = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Whitelist]
  }
}

