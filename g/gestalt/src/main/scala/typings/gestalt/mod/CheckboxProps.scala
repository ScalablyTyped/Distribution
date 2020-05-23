package typings.gestalt.mod

import typings.gestalt.anon.Checked
import typings.gestalt.anon.CheckedEvent
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.sm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxProps extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var hasError: js.UndefOr[Boolean] = js.undefined
  var id: String
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* args */ CheckedEvent, Unit]] = js.undefined
  var size: js.UndefOr[sm | md] = js.undefined
  def onChange(args: Checked): Unit
}

object CheckboxProps {
  @scala.inline
  def apply(
    id: String,
    onChange: Checked => Unit,
    checked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hasError: js.UndefOr[Boolean] = js.undefined,
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onClick: /* args */ CheckedEvent => Unit = null,
    size: sm | md = null
  ): CheckboxProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasError)) __obj.updateDynamic("hasError")(hasError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxProps]
  }
}

