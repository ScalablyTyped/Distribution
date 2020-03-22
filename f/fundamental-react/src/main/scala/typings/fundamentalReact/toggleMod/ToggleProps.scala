package typings.fundamentalReact.toggleMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.formLabelMod.FormLabelProps
import typings.react.mod.ChangeEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  checked ? :boolean,   className ? :string,   customStyles ? :{[x: string] : any},   disabled ? :boolean,   disableStyles ? :boolean,   id ? :string,   inputProps ? :{[x: string] : any},   labelProps ? :fundamental-react.fundamental-react/lib/Forms/FormLabel.FormLabelProps,   size ? :fundamental-react.fundamental-react/lib/Toggle/Toggle.ToggleSize, onChange ? (event : react.react.ChangeEvent<std.HTMLInputElement>): void} & fundamental-react.fundamental-react/lib/Forms/FormItem.FormItemProps */
trait ToggleProps
  extends /* x */ StringDictionary[js.Any] {
  var checked: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Set to **true** to render an `<input>` with `type` of **checkbox**. */
  var isCheck: js.UndefOr[Boolean] = js.undefined
  /* Set to **true** to display radio buttons and checkboxes in a row. */
  var isInline: js.UndefOr[Boolean] = js.undefined
  var labelProps: js.UndefOr[FormLabelProps] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* event */ ChangeEvent[HTMLInputElement], Unit]] = js.undefined
  var size: js.UndefOr[ToggleSize] = js.undefined
}

object ToggleProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inputProps: StringDictionary[js.Any] = null,
    isCheck: js.UndefOr[Boolean] = js.undefined,
    isInline: js.UndefOr[Boolean] = js.undefined,
    labelProps: FormLabelProps = null,
    onChange: /* event */ ChangeEvent[HTMLInputElement] => Unit = null,
    size: ToggleSize = null
  ): ToggleProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (!js.isUndefined(isCheck)) __obj.updateDynamic("isCheck")(isCheck.asInstanceOf[js.Any])
    if (!js.isUndefined(isInline)) __obj.updateDynamic("isInline")(isInline.asInstanceOf[js.Any])
    if (labelProps != null) __obj.updateDynamic("labelProps")(labelProps.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToggleProps]
  }
}

