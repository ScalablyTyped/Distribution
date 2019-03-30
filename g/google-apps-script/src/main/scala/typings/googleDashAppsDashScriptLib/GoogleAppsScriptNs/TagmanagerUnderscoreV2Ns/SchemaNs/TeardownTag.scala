package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeardownTag extends js.Object {
  var stopTeardownOnFailure: js.UndefOr[scala.Boolean] = js.undefined
  var tagName: js.UndefOr[java.lang.String] = js.undefined
}

object TeardownTag {
  @scala.inline
  def apply(stopTeardownOnFailure: js.UndefOr[scala.Boolean] = js.undefined, tagName: java.lang.String = null): TeardownTag = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stopTeardownOnFailure)) __obj.updateDynamic("stopTeardownOnFailure")(stopTeardownOnFailure)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[TeardownTag]
  }
}

