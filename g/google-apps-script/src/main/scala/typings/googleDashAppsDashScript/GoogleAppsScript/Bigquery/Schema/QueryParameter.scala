package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryParameter extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var parameterType: js.UndefOr[QueryParameterType] = js.undefined
  var parameterValue: js.UndefOr[QueryParameterValue] = js.undefined
}

object QueryParameter {
  @scala.inline
  def apply(
    name: String = null,
    parameterType: QueryParameterType = null,
    parameterValue: QueryParameterValue = null
  ): QueryParameter = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameterType != null) __obj.updateDynamic("parameterType")(parameterType.asInstanceOf[js.Any])
    if (parameterValue != null) __obj.updateDynamic("parameterValue")(parameterValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryParameter]
  }
}

