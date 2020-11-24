package typings.ejWebAll.ej.ColorPicker

import typings.ejWebAll.ej.ButtonMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Allows to change the mode of the button. Please refer below to know available button mode
    * @Default {ej.ButtonMode.Split}
    */
  var buttonMode: js.UndefOr[ButtonMode | String] = js.native
  
  /** The ColorPicker control allows to define the customized text to displayed in button elements. Using the property to achieve the customized culture values.
    * @Default {{ apply: Apply, cancel: Cancel, swatches: Swatches }}
    */
  var buttonText: js.UndefOr[ButtonText] = js.native
  
  /** Fires after Color value has been changed successfully.If the user want to perform any operation after the color value changed then the user can make use of this change event.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  
  /** Fires after closing the color picker popup.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.native
  
  /** Specifies the number of columns to be displayed color palette model.
    * @Default {10}
    */
  var columns: js.UndefOr[Double | String] = js.native
  
  /** Fires after Color picker control is created. If the user want to perform any operation after the color picker control creation then the user can make use of this create event.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  
  /** This property allows you to customize its appearance using user-defined CSS and custom skin options such as colors and backgrounds.
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** This property allows to define the custom colors in the palette model.Custom palettes are created by passing a comma delimited string of HEX values or an array of colors.
    * @Default {empty}
    */
  var custom: js.UndefOr[js.Array[_]] = js.native
  
  /** Fires after Color picker control is destroyed. If the user want to perform any operation after the color picker control destroyed then the user can make use of this destroy event.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  
  /** This property allows to embed the popup in the order of DOM element flow . When we set the value as true, the color picker popup is always in visible state.
    * @Default {false}
    */
  var displayInline: js.UndefOr[Boolean] = js.native
  
  /** This property allows to enable or disable the opacity slider in the color picker control
    * @Default {true}
    */
  var enableOpacity: js.UndefOr[Boolean] = js.native
  
  /** This property allows to change the control in enabled or disabled state.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** It allows to define the characteristics of the ColorPicker control. It will helps to extend the capability of an HTML element.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  
  /** Defines the localized text values in button and tooltip.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Specifies the model type to be rendered initially in the color picker control. See below to get available ModelType
    * @Default {ej.ColorPicker.ModelType.Default}
    */
  var modelType: js.UndefOr[ModelType | String] = js.native
  
  /** This property allows to change the opacity value .The selected color opacity will be adjusted by using this opacity value.
    * @Default {100}
    */
  var opacityValue: js.UndefOr[Double | String] = js.native
  
  /** Fires after opening the color picker popup
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
  
  /** Specifies the palette type to be displayed at initial time in palette model.There two types of palette model available in ColorPicker control. See below available Palette
    * @Default {ej.ColorPicker.Palette.BasicPalette}
    */
  var palette: js.UndefOr[Palette | String] = js.native
  
  /** This property allows to define the preset model to be rendered initially in palette type.It consists of 12 different types of presets. Each presets have 50 colors. See below
    * available Presets
    * @Default {ej.ColorPicker.Presets.Basic}
    */
  var presetType: js.UndefOr[Presets | String] = js.native
  
  /** Fires after Color value has been selected successfully. If the user want to perform any operation after the color value selected then the user can make use of this select event.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.native
  
  /** Allows to show/hides the apply and cancel buttons in ColorPicker control
    * @Default {true}
    */
  var showApplyCancel: js.UndefOr[Boolean] = js.native
  
  /** Allows to show/hides the clear button in ColorPicker control
    * @Default {true}
    */
  var showClearButton: js.UndefOr[Boolean] = js.native
  
  /** This property allows to provides live preview support for current cursor selection color and selected color.
    * @Default {true}
    */
  var showPreview: js.UndefOr[Boolean] = js.native
  
  /** This property allows to store the color values in custom list.The ColorPicker will keep up to 11 colors in a custom list.By clicking the add button, the selected color from picker
    * or palette will get added in the recent color list.
    * @Default {false}
    */
  var showRecentColors: js.UndefOr[Boolean] = js.native
  
  /** Allows to show/hides the switcher button in ColorPicker control.It helps to switch palette or picker mode in colorpicker.
    * @Default {true}
    */
  var showSwitcher: js.UndefOr[Boolean] = js.native
  
  /** This property allows to shows tooltip to notify the slider value in color picker control.
    * @Default {false}
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  
  /** Specifies the toolIcon to be displayed in dropdown control color area.
    * @Default {null}
    */
  var toolIcon: js.UndefOr[String] = js.native
  
  /** This property allows to define the customized text or content to displayed when mouse over the following elements. This property also allows to use the culture values.
    * @Default {{ switcher: Switcher, addButton: Add Color, basic: Basic, monoChrome: Mono Chrome, flatColors: Flat Color, seaWolf: Sea Wolf, webColors: Web Colors, sandy: Sandy,
    * pinkShades: Pink Shades, misty: Misty, citrus: Citrus, vintage: Vintage, moonLight: Moon Light, candyCrush: Candy Crush, currentColor: Current Color, selectedColor: Selected
    * Color }}
    */
  var tooltipText: js.UndefOr[TooltipText] = js.native
  
  /** Specifies the color value for color picker control, the value is in hexadecimal form with prefix of &quot;#&quot;.
    * @Default {null}
    */
  var value: js.UndefOr[String] = js.native
}
object Model {
  
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setButtonMode(value: ButtonMode | String): Self = this.set("buttonMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonMode: Self = this.set("buttonMode", js.undefined)
    
    @scala.inline
    def setButtonText(value: ButtonText): Self = this.set("buttonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonText: Self = this.set("buttonText", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ ChangeEventArgs => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ CloseEventArgs => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setColumns(value: Double | String): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setCustomVarargs(value: js.Any*): Self = this.set("custom", js.Array(value :_*))
    
    @scala.inline
    def setCustom(value: js.Array[_]): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setDisplayInline(value: Boolean): Self = this.set("displayInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayInline: Self = this.set("displayInline", js.undefined)
    
    @scala.inline
    def setEnableOpacity(value: Boolean): Self = this.set("enableOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableOpacity: Self = this.set("enableOpacity", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setHtmlAttributes(value: js.Any): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setModelType(value: ModelType | String): Self = this.set("modelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelType: Self = this.set("modelType", js.undefined)
    
    @scala.inline
    def setOpacityValue(value: Double | String): Self = this.set("opacityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacityValue: Self = this.set("opacityValue", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ OpenEventArgs => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPalette(value: Palette | String): Self = this.set("palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePalette: Self = this.set("palette", js.undefined)
    
    @scala.inline
    def setPresetType(value: Presets | String): Self = this.set("presetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresetType: Self = this.set("presetType", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ SelectEventArgs => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setShowApplyCancel(value: Boolean): Self = this.set("showApplyCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowApplyCancel: Self = this.set("showApplyCancel", js.undefined)
    
    @scala.inline
    def setShowClearButton(value: Boolean): Self = this.set("showClearButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowClearButton: Self = this.set("showClearButton", js.undefined)
    
    @scala.inline
    def setShowPreview(value: Boolean): Self = this.set("showPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPreview: Self = this.set("showPreview", js.undefined)
    
    @scala.inline
    def setShowRecentColors(value: Boolean): Self = this.set("showRecentColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRecentColors: Self = this.set("showRecentColors", js.undefined)
    
    @scala.inline
    def setShowSwitcher(value: Boolean): Self = this.set("showSwitcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSwitcher: Self = this.set("showSwitcher", js.undefined)
    
    @scala.inline
    def setShowTooltip(value: Boolean): Self = this.set("showTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTooltip: Self = this.set("showTooltip", js.undefined)
    
    @scala.inline
    def setToolIcon(value: String): Self = this.set("toolIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolIcon: Self = this.set("toolIcon", js.undefined)
    
    @scala.inline
    def setTooltipText(value: TooltipText): Self = this.set("tooltipText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipText: Self = this.set("tooltipText", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
