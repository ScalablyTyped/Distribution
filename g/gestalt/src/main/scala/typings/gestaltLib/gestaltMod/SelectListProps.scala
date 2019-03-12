package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectListProps extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var errorMessage: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var idealErrorDirection: js.UndefOr[
    gestaltLib.gestaltLibStrings.up | gestaltLib.gestaltLibStrings.right | gestaltLib.gestaltLibStrings.down | gestaltLib.gestaltLibStrings.left
  ] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var options: js.Array[gestaltLib.Anon_Label]
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  def onChange(args: gestaltLib.Anon_EventValue): scala.Unit
}

object SelectListProps {
  @scala.inline
  def apply(
    id: java.lang.String,
    onChange: gestaltLib.Anon_EventValue => scala.Unit,
    options: js.Array[gestaltLib.Anon_Label],
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    errorMessage: java.lang.String = null,
    idealErrorDirection: gestaltLib.gestaltLibStrings.up | gestaltLib.gestaltLibStrings.right | gestaltLib.gestaltLibStrings.down | gestaltLib.gestaltLibStrings.left = null,
    name: java.lang.String = null,
    placeholder: java.lang.String = null,
    value: java.lang.String = null
  ): SelectListProps = {
    val __obj = js.Dynamic.literal(id = id, onChange = js.Any.fromFunction1(onChange), options = options)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (idealErrorDirection != null) __obj.updateDynamic("idealErrorDirection")(idealErrorDirection.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SelectListProps]
  }
}

