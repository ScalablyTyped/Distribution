package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldMetadata extends js.Object {
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  var source: js.UndefOr[Source] = js.undefined
  var verified: js.UndefOr[scala.Boolean] = js.undefined
}

object FieldMetadata {
  @scala.inline
  def apply(
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    source: Source = null,
    verified: js.UndefOr[scala.Boolean] = js.undefined
  ): FieldMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (source != null) __obj.updateDynamic("source")(source)
    if (!js.isUndefined(verified)) __obj.updateDynamic("verified")(verified)
    __obj.asInstanceOf[FieldMetadata]
  }
}

