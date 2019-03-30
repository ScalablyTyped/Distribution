package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountAdwordsLink extends js.Object {
  var adwordsId: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object AccountAdwordsLink {
  @scala.inline
  def apply(adwordsId: java.lang.String = null, status: java.lang.String = null): AccountAdwordsLink = {
    val __obj = js.Dynamic.literal()
    if (adwordsId != null) __obj.updateDynamic("adwordsId")(adwordsId)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[AccountAdwordsLink]
  }
}

