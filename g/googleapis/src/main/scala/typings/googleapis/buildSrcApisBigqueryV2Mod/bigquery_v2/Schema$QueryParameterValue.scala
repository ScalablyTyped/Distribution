package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$QueryParameterValue extends js.Object {
  /**
    * [Optional] The array values, if this is an array type.
    */
  var arrayValues: js.UndefOr[js.Array[Schema$QueryParameterValue]] = js.native
  /**
    * [Optional] The struct field values, in order of the struct type&#39;s
    * declaration.
    */
  var structValues: js.UndefOr[StringDictionary[Schema$QueryParameterValue]] = js.native
  /**
    * [Optional] The value of this value, if a simple scalar type.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$QueryParameterValue {
  @scala.inline
  def apply(
    arrayValues: js.Array[Schema$QueryParameterValue] = null,
    structValues: StringDictionary[Schema$QueryParameterValue] = null,
    value: String = null
  ): Schema$QueryParameterValue = {
    val __obj = js.Dynamic.literal()
    if (arrayValues != null) __obj.updateDynamic("arrayValues")(arrayValues.asInstanceOf[js.Any])
    if (structValues != null) __obj.updateDynamic("structValues")(structValues.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$QueryParameterValue]
  }
}

