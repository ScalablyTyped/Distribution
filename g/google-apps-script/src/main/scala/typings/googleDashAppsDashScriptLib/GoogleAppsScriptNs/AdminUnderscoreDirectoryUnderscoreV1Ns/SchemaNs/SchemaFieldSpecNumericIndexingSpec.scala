package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaFieldSpecNumericIndexingSpec extends js.Object {
  var maxValue: js.UndefOr[stdLib.Number] = js.undefined
  var minValue: js.UndefOr[stdLib.Number] = js.undefined
}

object SchemaFieldSpecNumericIndexingSpec {
  @scala.inline
  def apply(maxValue: stdLib.Number = null, minValue: stdLib.Number = null): SchemaFieldSpecNumericIndexingSpec = {
    val __obj = js.Dynamic.literal()
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue)
    if (minValue != null) __obj.updateDynamic("minValue")(minValue)
    __obj.asInstanceOf[SchemaFieldSpecNumericIndexingSpec]
  }
}

