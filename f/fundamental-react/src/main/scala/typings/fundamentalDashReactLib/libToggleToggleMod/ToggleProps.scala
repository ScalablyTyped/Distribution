package typings
package fundamentalDashReactLib.libToggleToggleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var inputProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var labelProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.ChangeEvent[stdLib.HTMLInputElement], scala.Unit]
  ] = js.undefined
  var size: js.UndefOr[ToggleSize] = js.undefined
}

object ToggleProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    inputProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    labelProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    onChange: /* event */ reactLib.reactMod.ChangeEvent[stdLib.HTMLInputElement] => scala.Unit = null,
    size: ToggleSize = null
  ): ToggleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (labelProps != null) __obj.updateDynamic("labelProps")(labelProps)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[ToggleProps]
  }
}

