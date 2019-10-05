package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionValue extends js.Object {
  var dimensionName: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var matchType: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object DimensionValue {
  @scala.inline
  def apply(
    dimensionName: String = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    matchType: String = null,
    value: String = null
  ): DimensionValue = {
    val __obj = js.Dynamic.literal()
    if (dimensionName != null) __obj.updateDynamic("dimensionName")(dimensionName)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (matchType != null) __obj.updateDynamic("matchType")(matchType)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DimensionValue]
  }
}

