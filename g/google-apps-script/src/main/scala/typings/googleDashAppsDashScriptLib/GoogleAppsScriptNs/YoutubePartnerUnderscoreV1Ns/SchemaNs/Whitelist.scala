package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Whitelist extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Whitelist {
  @scala.inline
  def apply(id: java.lang.String = null, kind: java.lang.String = null, title: java.lang.String = null): Whitelist = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Whitelist]
  }
}

