package typings.fundamentalReact.inputGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.AnonClear
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
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
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
  var localizedText: js.UndefOr[AnonClear] = js.undefined
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
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    glyph: String = null,
    inputClassName: String = null,
    inputId: String = null,
    inputName: String = null,
    inputPlaceholder: String = null,
    inputProps: StringDictionary[js.Any] = null,
    inputType: InputGroupTypes = null,
    inputValue: js.Any = null,
    localizedText: AnonClear = null,
    numberDownButtonProps: StringDictionary[js.Any] = null,
    numberUpButtonProps: StringDictionary[js.Any] = null,
    searchButtonProps: StringDictionary[js.Any] = null
  ): InputGroupProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(actions)) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (addon != null) __obj.updateDynamic("addon")(addon.asInstanceOf[js.Any])
    if (addonPos != null) __obj.updateDynamic("addonPos")(addonPos.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (inputId != null) __obj.updateDynamic("inputId")(inputId.asInstanceOf[js.Any])
    if (inputName != null) __obj.updateDynamic("inputName")(inputName.asInstanceOf[js.Any])
    if (inputPlaceholder != null) __obj.updateDynamic("inputPlaceholder")(inputPlaceholder.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (inputType != null) __obj.updateDynamic("inputType")(inputType.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (numberDownButtonProps != null) __obj.updateDynamic("numberDownButtonProps")(numberDownButtonProps.asInstanceOf[js.Any])
    if (numberUpButtonProps != null) __obj.updateDynamic("numberUpButtonProps")(numberUpButtonProps.asInstanceOf[js.Any])
    if (searchButtonProps != null) __obj.updateDynamic("searchButtonProps")(searchButtonProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputGroupProps]
  }
}

