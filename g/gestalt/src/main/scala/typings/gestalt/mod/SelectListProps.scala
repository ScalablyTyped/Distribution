package typings.gestalt.mod

import typings.gestalt.anon.Value
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectListProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var errorMessage: js.UndefOr[String] = js.undefined
  var helperText: js.UndefOr[String] = js.undefined
  var id: String
  var label: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var options: js.Array[typings.gestalt.anon.Label]
  var placeholder: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[md | lg] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  def onChange(args: Value): Unit
}

object SelectListProps {
  @scala.inline
  def apply(
    id: String,
    onChange: Value => Unit,
    options: js.Array[typings.gestalt.anon.Label],
    disabled: js.UndefOr[Boolean] = js.undefined,
    errorMessage: String = null,
    helperText: String = null,
    label: String = null,
    name: String = null,
    placeholder: String = null,
    size: md | lg = null,
    value: String = null
  ): SelectListProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), options = options.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (helperText != null) __obj.updateDynamic("helperText")(helperText.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectListProps]
  }
}

