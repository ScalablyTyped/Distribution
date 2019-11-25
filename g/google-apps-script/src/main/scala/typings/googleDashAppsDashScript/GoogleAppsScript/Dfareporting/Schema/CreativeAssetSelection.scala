package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeAssetSelection extends js.Object {
  var defaultAssetId: js.UndefOr[String] = js.undefined
  var rules: js.UndefOr[js.Array[Rule]] = js.undefined
}

object CreativeAssetSelection {
  @scala.inline
  def apply(defaultAssetId: String = null, rules: js.Array[Rule] = null): CreativeAssetSelection = {
    val __obj = js.Dynamic.literal()
    if (defaultAssetId != null) __obj.updateDynamic("defaultAssetId")(defaultAssetId.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreativeAssetSelection]
  }
}

