package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityAdWordsLinkEntity extends js.Object {
  var webPropertyRef: js.UndefOr[WebPropertyRef] = js.undefined
}

object EntityAdWordsLinkEntity {
  @scala.inline
  def apply(webPropertyRef: WebPropertyRef = null): EntityAdWordsLinkEntity = {
    val __obj = js.Dynamic.literal()
    if (webPropertyRef != null) __obj.updateDynamic("webPropertyRef")(webPropertyRef)
    __obj.asInstanceOf[EntityAdWordsLinkEntity]
  }
}

