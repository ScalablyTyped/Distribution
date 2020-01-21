package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaQueryParameter extends js.Object {
  /**
    * [Optional] If unset, this is a positional parameter. Otherwise, should be
    * unique within a query.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Required] The type of this parameter.
    */
  var parameterType: js.UndefOr[SchemaQueryParameterType] = js.native
  /**
    * [Required] The value of this parameter.
    */
  var parameterValue: js.UndefOr[SchemaQueryParameterValue] = js.native
}

object SchemaQueryParameter {
  @scala.inline
  def apply(
    name: String = null,
    parameterType: SchemaQueryParameterType = null,
    parameterValue: SchemaQueryParameterValue = null
  ): SchemaQueryParameter = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameterType != null) __obj.updateDynamic("parameterType")(parameterType.asInstanceOf[js.Any])
    if (parameterValue != null) __obj.updateDynamic("parameterValue")(parameterValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQueryParameter]
  }
}

