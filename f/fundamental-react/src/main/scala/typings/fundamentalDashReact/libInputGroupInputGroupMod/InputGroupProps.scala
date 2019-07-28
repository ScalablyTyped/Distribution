package typings.fundamentalDashReact.libInputGroupInputGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalDashReact.Anon_Clear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputGroupProps
  extends /* x */ StringDictionary[js.Any] {
  /* Set to **true** to enable an input with actions. Actions can be shown with a text label or icon. */
  var actions: js.UndefOr[Boolean] = js.undefined
  /* The value of the add-on. */
  var addon: js.UndefOr[String] = js.undefined
  /* Location of the add-on relative to the input. */
  var addonPos: js.UndefOr[InputGroupAddonPosition] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var glyph: js.UndefOr[String] = js.undefined
  /* CSS class(es) to add to the `<input>` element. */
  var inputClassName: js.UndefOr[String] = js.undefined
  /* Value for the `id` attribute on the `<input>` element. */
  var inputId: js.UndefOr[String] = js.undefined
  /* Value for the `name` attribute on the `<input>` element. */
  var inputName: js.UndefOr[String] = js.undefined
  /* Value for the `placeholder` attribute on the `<input>` element. */
  var inputPlaceholder: js.UndefOr[String] = js.undefined
  var inputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Value for the `type` attribute on the `<input>` element. */
  var inputType: js.UndefOr[InputGroupTypes] = js.undefined
  /* Value for the `value` attribute on the `<input>` element. */
  var inputValue: js.UndefOr[js.Any] = js.undefined
  var localizedText: js.UndefOr[Anon_Clear] = js.undefined
  /* Additional props to be spread to the down `<button>` element (for inputType='number'). */
  var numberDownButtonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the up `<button>` element (for inputType='number'). */
  var numberUpButtonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the `<button>` element. */
  var searchButtonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object InputGroupProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    actions: js.UndefOr[Boolean] = js.undefined,
    addon: String = null,
    addonPos: InputGroupAddonPosition = null,
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    glyph: String = null,
    inputClassName: String = null,
    inputId: String = null,
    inputName: String = null,
    inputPlaceholder: String = null,
    inputProps: StringDictionary[js.Any] = null,
    inputType: InputGroupTypes = null,
    inputValue: js.Any = null,
    localizedText: Anon_Clear = null,
    numberDownButtonProps: StringDictionary[js.Any] = null,
    numberUpButtonProps: StringDictionary[js.Any] = null,
    searchButtonProps: StringDictionary[js.Any] = null
  ): InputGroupProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(actions)) __obj.updateDynamic("actions")(actions)
    if (addon != null) __obj.updateDynamic("addon")(addon)
    if (addonPos != null) __obj.updateDynamic("addonPos")(addonPos)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (glyph != null) __obj.updateDynamic("glyph")(glyph)
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName)
    if (inputId != null) __obj.updateDynamic("inputId")(inputId)
    if (inputName != null) __obj.updateDynamic("inputName")(inputName)
    if (inputPlaceholder != null) __obj.updateDynamic("inputPlaceholder")(inputPlaceholder)
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (inputType != null) __obj.updateDynamic("inputType")(inputType)
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue)
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText)
    if (numberDownButtonProps != null) __obj.updateDynamic("numberDownButtonProps")(numberDownButtonProps)
    if (numberUpButtonProps != null) __obj.updateDynamic("numberUpButtonProps")(numberUpButtonProps)
    if (searchButtonProps != null) __obj.updateDynamic("searchButtonProps")(searchButtonProps)
    __obj.asInstanceOf[InputGroupProps]
  }
}

