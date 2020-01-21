package typings.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryParameter extends js.Object {
  /** [Optional] If unset, this is a positional parameter. Otherwise, should be unique within a query. */
  var name: js.UndefOr[String] = js.undefined
  /** [Required] The type of this parameter. */
  var parameterType: js.UndefOr[QueryParameterType] = js.undefined
  /** [Required] The value of this parameter. */
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

