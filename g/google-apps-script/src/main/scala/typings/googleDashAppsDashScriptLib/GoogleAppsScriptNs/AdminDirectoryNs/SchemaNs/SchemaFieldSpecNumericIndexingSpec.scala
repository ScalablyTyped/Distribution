package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaFieldSpecNumericIndexingSpec extends js.Object {
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  var minValue: js.UndefOr[scala.Double] = js.undefined
}

object SchemaFieldSpecNumericIndexingSpec {
  @scala.inline
  def apply(maxValue: scala.Int | scala.Double = null, minValue: scala.Int | scala.Double = null): SchemaFieldSpecNumericIndexingSpec = {
    val __obj = js.Dynamic.literal()
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFieldSpecNumericIndexingSpec]
  }
}

