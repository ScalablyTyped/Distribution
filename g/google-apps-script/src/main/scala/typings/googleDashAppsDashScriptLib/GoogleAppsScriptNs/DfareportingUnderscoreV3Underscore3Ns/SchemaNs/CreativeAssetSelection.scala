package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeAssetSelection extends js.Object {
  var defaultAssetId: js.UndefOr[java.lang.String] = js.undefined
  var rules: js.UndefOr[js.Array[Rule]] = js.undefined
}

object CreativeAssetSelection {
  @scala.inline
  def apply(defaultAssetId: java.lang.String = null, rules: js.Array[Rule] = null): CreativeAssetSelection = {
    val __obj = js.Dynamic.literal()
    if (defaultAssetId != null) __obj.updateDynamic("defaultAssetId")(defaultAssetId)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    __obj.asInstanceOf[CreativeAssetSelection]
  }
}

