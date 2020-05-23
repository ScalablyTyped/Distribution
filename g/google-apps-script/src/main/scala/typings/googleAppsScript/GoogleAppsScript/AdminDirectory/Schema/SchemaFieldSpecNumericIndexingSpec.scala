package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaFieldSpecNumericIndexingSpec extends js.Object {
  var maxValue: js.UndefOr[Double] = js.undefined
  var minValue: js.UndefOr[Double] = js.undefined
}

object SchemaFieldSpecNumericIndexingSpec {
  @scala.inline
  def apply(maxValue: js.UndefOr[Double] = js.undefined, minValue: js.UndefOr[Double] = js.undefined): SchemaFieldSpecNumericIndexingSpec = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFieldSpecNumericIndexingSpec]
  }
}

