package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveDimensionRequest extends js.Object {
  var destinationIndex: js.UndefOr[scala.Double] = js.undefined
  var source: js.UndefOr[DimensionRange] = js.undefined
}

object MoveDimensionRequest {
  @scala.inline
  def apply(destinationIndex: scala.Int | scala.Double = null, source: DimensionRange = null): MoveDimensionRequest = {
    val __obj = js.Dynamic.literal()
    if (destinationIndex != null) __obj.updateDynamic("destinationIndex")(destinationIndex.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[MoveDimensionRequest]
  }
}

