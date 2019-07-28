package typings.gestalt.gestaltMod

import typings.gestalt.Anon_EventValue
import typings.gestalt.Anon_Label
import typings.gestalt.gestaltStrings.down
import typings.gestalt.gestaltStrings.left
import typings.gestalt.gestaltStrings.right
import typings.gestalt.gestaltStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectListProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var errorMessage: js.UndefOr[String] = js.undefined
  var id: String
  var idealErrorDirection: js.UndefOr[up | right | down | left] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var options: js.Array[Anon_Label]
  var placeholder: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  def onChange(args: Anon_EventValue): Unit
}

object SelectListProps {
  @scala.inline
  def apply(
    id: String,
    onChange: Anon_EventValue => Unit,
    options: js.Array[Anon_Label],
    disabled: js.UndefOr[Boolean] = js.undefined,
    errorMessage: String = null,
    idealErrorDirection: up | right | down | left = null,
    name: String = null,
    placeholder: String = null,
    value: String = null
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

