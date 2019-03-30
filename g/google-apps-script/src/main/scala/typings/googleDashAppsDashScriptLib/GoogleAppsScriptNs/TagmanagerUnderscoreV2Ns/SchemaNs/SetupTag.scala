package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetupTag extends js.Object {
  var stopOnSetupFailure: js.UndefOr[scala.Boolean] = js.undefined
  var tagName: js.UndefOr[java.lang.String] = js.undefined
}

object SetupTag {
  @scala.inline
  def apply(stopOnSetupFailure: js.UndefOr[scala.Boolean] = js.undefined, tagName: java.lang.String = null): SetupTag = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stopOnSetupFailure)) __obj.updateDynamic("stopOnSetupFailure")(stopOnSetupFailure)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[SetupTag]
  }
}

