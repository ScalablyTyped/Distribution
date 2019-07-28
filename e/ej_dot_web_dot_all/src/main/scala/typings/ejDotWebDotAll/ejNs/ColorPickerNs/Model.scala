package typings.ejDotWebDotAll.ejNs.ColorPickerNs

import typings.ejDotWebDotAll.ejNs.ButtonMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Allows to change the mode of the button. Please refer below to know available button mode
    * @Default {ej.ButtonMode.Split}
    */
  var buttonMode: js.UndefOr[ButtonMode | String] = js.undefined
  /** The ColorPicker control allows to define the customized text to displayed in button elements. Using the property to achieve the customized culture values.
    * @Default {{ apply: Apply, cancel: Cancel, swatches: Swatches }}
    */
  var buttonText: js.UndefOr[ButtonText] = js.undefined
  /** Fires after Color value has been changed successfully.If the user want to perform any operation after the color value changed then the user can make use of this change event.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
  /** Fires after closing the color picker popup.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.undefined
  /** Specifies the number of columns to be displayed color palette model.
    * @Default {10}
    */
  var columns: js.UndefOr[Double | String] = js.undefined
  /** Fires after Color picker control is created. If the user want to perform any operation after the color picker control creation then the user can make use of this create event.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** This property allows you to customize its appearance using user-defined CSS and custom skin options such as colors and backgrounds.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** This property allows to define the custom colors in the palette model.Custom palettes are created by passing a comma delimited string of HEX values or an array of colors.
    * @Default {empty}
    */
  var custom: js.UndefOr[js.Array[_]] = js.undefined
  /** Fires after Color picker control is destroyed. If the user want to perform any operation after the color picker control destroyed then the user can make use of this destroy event.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** This property allows to embed the popup in the order of DOM element flow . When we set the value as true, the color picker popup is always in visible state.
    * @Default {false}
    */
  var displayInline: js.UndefOr[Boolean] = js.undefined
  /** This property allows to enable or disable the opacity slider in the color picker control
    * @Default {true}
    */
  var enableOpacity: js.UndefOr[Boolean] = js.undefined
  /** This property allows to change the control in enabled or disabled state.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** It allows to define the characteristics of the ColorPicker control. It will helps to extend the capability of an HTML element.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Defines the localized text values in button and tooltip.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Specifies the model type to be rendered initially in the color picker control. See below to get available ModelType
    * @Default {ej.ColorPicker.ModelType.Default}
    */
  var modelType: js.UndefOr[ModelType | String] = js.undefined
  /** This property allows to change the opacity value .The selected color opacity will be adjusted by using this opacity value.
    * @Default {100}
    */
  var opacityValue: js.UndefOr[Double | String] = js.undefined
  /** Fires after opening the color picker popup
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.undefined
  /** Specifies the palette type to be displayed at initial time in palette model.There two types of palette model available in ColorPicker control. See below available Palette
    * @Default {ej.ColorPicker.Palette.BasicPalette}
    */
  var palette: js.UndefOr[Palette | String] = js.undefined
  /** This property allows to define the preset model to be rendered initially in palette type.It consists of 12 different types of presets. Each presets have 50 colors. See below
    * available Presets
    * @Default {ej.ColorPicker.Presets.Basic}
    */
  var presetType: js.UndefOr[Presets | String] = js.undefined
  /** Fires after Color value has been selected successfully. If the user want to perform any operation after the color value selected then the user can make use of this select event.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.undefined
  /** Allows to show/hides the apply and cancel buttons in ColorPicker control
    * @Default {true}
    */
  var showApplyCancel: js.UndefOr[Boolean] = js.undefined
  /** Allows to show/hides the clear button in ColorPicker control
    * @Default {true}
    */
  var showClearButton: js.UndefOr[Boolean] = js.undefined
  /** This property allows to provides live preview support for current cursor selection color and selected color.
    * @Default {true}
    */
  var showPreview: js.UndefOr[Boolean] = js.undefined
  /** This property allows to store the color values in custom list.The ColorPicker will keep up to 11 colors in a custom list.By clicking the add button, the selected color from picker
    * or palette will get added in the recent color list.
    * @Default {false}
    */
  var showRecentColors: js.UndefOr[Boolean] = js.undefined
  /** Allows to show/hides the switcher button in ColorPicker control.It helps to switch palette or picker mode in colorpicker.
    * @Default {true}
    */
  var showSwitcher: js.UndefOr[Boolean] = js.undefined
  /** This property allows to shows tooltip to notify the slider value in color picker control.
    * @Default {false}
    */
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  /** Specifies the toolIcon to be displayed in dropdown control color area.
    * @Default {null}
    */
  var toolIcon: js.UndefOr[String] = js.undefined
  /** This property allows to define the customized text or content to displayed when mouse over the following elements. This property also allows to use the culture values.
    * @Default {{ switcher: Switcher, addButton: Add Color, basic: Basic, monoChrome: Mono Chrome, flatColors: Flat Color, seaWolf: Sea Wolf, webColors: Web Colors, sandy: Sandy,
    * pinkShades: Pink Shades, misty: Misty, citrus: Citrus, vintage: Vintage, moonLight: Moon Light, candyCrush: Candy Crush, currentColor: Current Color, selectedColor: Selected
    * Color }}
    */
  var tooltipText: js.UndefOr[TooltipText] = js.undefined
  /** Specifies the color value for color picker control, the value is in hexadecimal form with prefix of &quot;#&quot;.
    * @Default {null}
    */
  var value: js.UndefOr[String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    buttonMode: ButtonMode | String = null,
    buttonText: ButtonText = null,
    change: /* e */ ChangeEventArgs => Unit = null,
    close: /* e */ CloseEventArgs => Unit = null,
    columns: Double | String = null,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    custom: js.Array[_] = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    displayInline: js.UndefOr[Boolean] = js.undefined,
    enableOpacity: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    htmlAttributes: js.Any = null,
    locale: String = null,
    modelType: ModelType | String = null,
    opacityValue: Double | String = null,
    open: /* e */ OpenEventArgs => Unit = null,
    palette: Palette | String = null,
    presetType: Presets | String = null,
    select: /* e */ SelectEventArgs => Unit = null,
    showApplyCancel: js.UndefOr[Boolean] = js.undefined,
    showClearButton: js.UndefOr[Boolean] = js.undefined,
    showPreview: js.UndefOr[Boolean] = js.undefined,
    showRecentColors: js.UndefOr[Boolean] = js.undefined,
    showSwitcher: js.UndefOr[Boolean] = js.undefined,
    showTooltip: js.UndefOr[Boolean] = js.undefined,
    toolIcon: String = null,
    tooltipText: TooltipText = null,
    value: String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (buttonMode != null) __obj.updateDynamic("buttonMode")(buttonMode.asInstanceOf[js.Any])
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText)
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (custom != null) __obj.updateDynamic("custom")(custom)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (!js.isUndefined(displayInline)) __obj.updateDynamic("displayInline")(displayInline)
    if (!js.isUndefined(enableOpacity)) __obj.updateDynamic("enableOpacity")(enableOpacity)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (modelType != null) __obj.updateDynamic("modelType")(modelType.asInstanceOf[js.Any])
    if (opacityValue != null) __obj.updateDynamic("opacityValue")(opacityValue.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (presetType != null) __obj.updateDynamic("presetType")(presetType.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (!js.isUndefined(showApplyCancel)) __obj.updateDynamic("showApplyCancel")(showApplyCancel)
    if (!js.isUndefined(showClearButton)) __obj.updateDynamic("showClearButton")(showClearButton)
    if (!js.isUndefined(showPreview)) __obj.updateDynamic("showPreview")(showPreview)
    if (!js.isUndefined(showRecentColors)) __obj.updateDynamic("showRecentColors")(showRecentColors)
    if (!js.isUndefined(showSwitcher)) __obj.updateDynamic("showSwitcher")(showSwitcher)
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip)
    if (toolIcon != null) __obj.updateDynamic("toolIcon")(toolIcon)
    if (tooltipText != null) __obj.updateDynamic("tooltipText")(tooltipText)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Model]
  }
}

