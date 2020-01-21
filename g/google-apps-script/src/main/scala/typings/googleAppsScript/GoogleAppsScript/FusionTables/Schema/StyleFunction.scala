package typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleFunction extends js.Object {
  var buckets: js.UndefOr[js.Array[Bucket]] = js.undefined
  var columnName: js.UndefOr[String] = js.undefined
  var gradient: js.UndefOr[StyleFunctionGradient] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object StyleFunction {
  @scala.inline
  def apply(
    buckets: js.Array[Bucket] = null,
    columnName: String = null,
    gradient: StyleFunctionGradient = null,
    kind: String = null
  ): StyleFunction = {
    val __obj = js.Dynamic.literal()
    if (buckets != null) __obj.updateDynamic("buckets")(buckets.asInstanceOf[js.Any])
    if (columnName != null) __obj.updateDynamic("columnName")(columnName.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleFunction]
  }
}

