package typings
package expressDashOpenapiLib.expressDashOpenapiMod.OpenApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterObject extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var in: java.lang.String
  var name: java.lang.String
  var required: js.UndefOr[scala.Boolean] = js.undefined
}

object ParameterObject {
  @scala.inline
  def apply(
    in: java.lang.String,
    name: java.lang.String,
    description: java.lang.String = null,
    required: js.UndefOr[scala.Boolean] = js.undefined
  ): ParameterObject = {
    val __obj = js.Dynamic.literal(in = in, name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[ParameterObject]
  }
}

