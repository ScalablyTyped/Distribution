package typings.gapiClientBigquery.gapi.client.bigquery

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryParameterValue extends js.Object {
  /** [Optional] The array values, if this is an array type. */
  var arrayValues: js.UndefOr[js.Array[QueryParameterValue]] = js.undefined
  /** [Optional] The struct field values, in order of the struct type's declaration. */
  var structValues: js.UndefOr[Record[String, QueryParameterValue]] = js.undefined
  /** [Optional] The value of this value, if a simple scalar type. */
  var value: js.UndefOr[String] = js.undefined
}

object QueryParameterValue {
  @scala.inline
  def apply(
    arrayValues: js.Array[QueryParameterValue] = null,
    structValues: Record[String, QueryParameterValue] = null,
    value: String = null
  ): QueryParameterValue = {
    val __obj = js.Dynamic.literal()
    if (arrayValues != null) __obj.updateDynamic("arrayValues")(arrayValues.asInstanceOf[js.Any])
    if (structValues != null) __obj.updateDynamic("structValues")(structValues.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryParameterValue]
  }
}

