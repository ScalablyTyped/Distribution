package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryParameterValue extends js.Object {
  var arrayValues: js.UndefOr[js.Array[QueryParameterValue]] = js.undefined
  var structValues: js.UndefOr[js.Object] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object QueryParameterValue {
  @scala.inline
  def apply(
    arrayValues: js.Array[QueryParameterValue] = null,
    structValues: js.Object = null,
    value: String = null
  ): QueryParameterValue = {
    val __obj = js.Dynamic.literal()
    if (arrayValues != null) __obj.updateDynamic("arrayValues")(arrayValues)
    if (structValues != null) __obj.updateDynamic("structValues")(structValues)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[QueryParameterValue]
  }
}

