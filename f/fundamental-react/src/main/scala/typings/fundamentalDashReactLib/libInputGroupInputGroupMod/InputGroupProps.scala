package typings
package fundamentalDashReactLib.libInputGroupInputGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputGroupProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /* Set to **true** to enable an input with actions. Actions can be shown with a text label or icon. */
  var actions: js.UndefOr[scala.Boolean] = js.undefined
  /* The value of the add-on. */
  var addon: js.UndefOr[java.lang.String] = js.undefined
  /* Location of the add-on relative to the input. */
  var addonPos: js.UndefOr[InputGroupAddonPosition] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  var glyph: js.UndefOr[java.lang.String] = js.undefined
  /* CSS class(es) to add to the `<input>` element. */
  var inputClassName: js.UndefOr[java.lang.String] = js.undefined
  /* Value for the `id` attribute on the `<input>` element. */
  var inputId: js.UndefOr[java.lang.String] = js.undefined
  /* Value for the `name` attribute on the `<input>` element. */
  var inputName: js.UndefOr[java.lang.String] = js.undefined
  /* Value for the `placeholder` attribute on the `<input>` element. */
  var inputPlaceholder: js.UndefOr[java.lang.String] = js.undefined
  var inputProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Value for the `type` attribute on the `<input>` element. */
  var inputType: js.UndefOr[InputGroupTypes] = js.undefined
  /* Value for the `value` attribute on the `<input>` element. */
  var inputValue: js.UndefOr[js.Any] = js.undefined
  var localizedText: js.UndefOr[fundamentalDashReactLib.Anon_Clear] = js.undefined
  /* Additional props to be spread to the down `<button>` element (for inputType='number'). */
  var numberDownButtonProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the up `<button>` element (for inputType='number'). */
  var numberUpButtonProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the `<button>` element. */
  var searchButtonProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object InputGroupProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    actions: js.UndefOr[scala.Boolean] = js.undefined,
    addon: java.lang.String = null,
    addonPos: InputGroupAddonPosition = null,
    className: java.lang.String = null,
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    glyph: java.lang.String = null,
    inputClassName: java.lang.String = null,
    inputId: java.lang.String = null,
    inputName: java.lang.String = null,
    inputPlaceholder: java.lang.String = null,
    inputProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    inputType: InputGroupTypes = null,
    inputValue: js.Any = null,
    localizedText: fundamentalDashReactLib.Anon_Clear = null,
    numberDownButtonProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    numberUpButtonProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    searchButtonProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null
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

