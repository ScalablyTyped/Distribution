package typings.expressDashOpenapi.expressDashOpenapiMod.OpenApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InBodyParameterObject
  extends ParameterObject
     with Parameter {
  var schema: Schema
}

object InBodyParameterObject {
  @scala.inline
  def apply(
    in: String,
    name: String,
    schema: Schema,
    description: String = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): InBodyParameterObject = {
    val __obj = js.Dynamic.literal(in = in, name = name, schema = schema)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[InBodyParameterObject]
  }
}

