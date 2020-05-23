package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveDimensionRequest extends js.Object {
  var destinationIndex: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[DimensionRange] = js.undefined
}

object MoveDimensionRequest {
  @scala.inline
  def apply(destinationIndex: js.UndefOr[Double] = js.undefined, source: DimensionRange = null): MoveDimensionRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(destinationIndex)) __obj.updateDynamic("destinationIndex")(destinationIndex.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveDimensionRequest]
  }
}

