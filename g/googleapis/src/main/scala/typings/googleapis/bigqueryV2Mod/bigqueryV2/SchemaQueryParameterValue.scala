package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaQueryParameterValue extends js.Object {
  /**
    * [Optional] The array values, if this is an array type.
    */
  var arrayValues: js.UndefOr[js.Array[SchemaQueryParameterValue]] = js.native
  /**
    * [Optional] The struct field values, in order of the struct type&#39;s
    * declaration.
    */
  var structValues: js.UndefOr[StringDictionary[SchemaQueryParameterValue]] = js.native
  /**
    * [Optional] The value of this value, if a simple scalar type.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaQueryParameterValue {
  @scala.inline
  def apply(
    arrayValues: js.Array[SchemaQueryParameterValue] = null,
    structValues: StringDictionary[SchemaQueryParameterValue] = null,
    value: String = null
  ): SchemaQueryParameterValue = {
    val __obj = js.Dynamic.literal()
    if (arrayValues != null) __obj.updateDynamic("arrayValues")(arrayValues.asInstanceOf[js.Any])
    if (structValues != null) __obj.updateDynamic("structValues")(structValues.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQueryParameterValue]
  }
}

