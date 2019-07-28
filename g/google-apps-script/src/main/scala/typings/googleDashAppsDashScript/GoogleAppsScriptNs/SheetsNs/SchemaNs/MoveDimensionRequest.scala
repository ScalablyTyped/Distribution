package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveDimensionRequest extends js.Object {
  var destinationIndex: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[DimensionRange] = js.undefined
}

object MoveDimensionRequest {
  @scala.inline
  def apply(destinationIndex: Int | Double = null, source: DimensionRange = null): MoveDimensionRequest = {
    val __obj = js.Dynamic.literal()
    if (destinationIndex != null) __obj.updateDynamic("destinationIndex")(destinationIndex.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[MoveDimensionRequest]
  }
}

