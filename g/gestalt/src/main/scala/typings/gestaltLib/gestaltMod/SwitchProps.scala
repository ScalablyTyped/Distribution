package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchProps extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var id: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
  var switched: js.UndefOr[scala.Boolean] = js.undefined
  def onChange(args: gestaltLib.Anon_EventValueBoolean): scala.Unit
}

object SwitchProps {
  @scala.inline
  def apply(
    id: java.lang.String,
    onChange: gestaltLib.Anon_EventValueBoolean => scala.Unit,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    switched: js.UndefOr[scala.Boolean] = js.undefined
  ): SwitchProps = {
    val __obj = js.Dynamic.literal(id = id, onChange = js.Any.fromFunction1(onChange))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(switched)) __obj.updateDynamic("switched")(switched)
    __obj.asInstanceOf[SwitchProps]
  }
}

