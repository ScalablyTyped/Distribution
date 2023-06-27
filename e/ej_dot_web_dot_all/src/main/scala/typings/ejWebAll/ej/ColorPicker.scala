package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorPicker
  extends StObject
     with Widget_ {
  
  /** Convert color value from HSV to RGB
    * @param {any} Specified HSV code converted to RGB
    * @returns {any}
    */
  def HSVToRGB(HSV: Any): Any = js.native
  
  /** Convert color value from RGB to HEX
    * @param {any} Specified RGB code converted to HEX code
    * @returns {string}
    */
  def RGBToHEX(RGB: Any): String = js.native
  
  /** Convert color value from RGB to HSV
    * @param {any} Specified RGB code converted to HSV code
    * @returns {any}
    */
  def RGBToHSV(RGB: Any): Any = js.native
  
  var defaults: Model = js.native
  
  /** Disables the color picker control
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** Enable the color picker control
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** Gets the selected color in RGB format
    * @returns {any}
    */
  def getColor(): Any = js.native
  
  /** Gets the selected color value as string
    * @returns {string}
    */
  def getValue(): String = js.native
  
  /** To Convert color value from hexCode to RGB
    * @param {string} Specified HEX code converted to RGB
    * @returns {any}
    */
  def hexCodeToRGB(colorCode: String): Any = js.native
  
  /** Hides the ColorPicker popup, if in opened state.
    * @returns {void}
    */
  def hide(): Unit = js.native
  
  @JSName("model")
  var model_ColorPicker: Model = js.native
  
  /** Open the ColorPicker popup.
    * @returns {void}
    */
  def show(): Unit = js.native
}
object ColorPicker {
  
  @js.native
  sealed trait ModelType extends StObject
  @JSGlobal("ej.ColorPicker.ModelType")
  @js.native
  object ModelType extends StObject {
    
    ///support palette type mode in color picker.
    @js.native
    sealed trait Palette
      extends StObject
         with ModelType
    
    ///support palette type mode in color picker.
    @js.native
    sealed trait Picker
      extends StObject
         with ModelType
  }
  
  @js.native
  sealed trait Palette extends StObject
  @JSGlobal("ej.ColorPicker.Palette")
  @js.native
  object Palette extends StObject {
    
    ///used to show the basic palette
    @js.native
    sealed trait BasicPalette
      extends StObject
         with Palette
    
    ///used to show the custompalette
    @js.native
    sealed trait CustomPalette
      extends StObject
         with Palette
  }
  
  @js.native
  sealed trait Presets extends StObject
  @JSGlobal("ej.ColorPicker.Presets")
  @js.native
  object Presets extends StObject {
    
    ///used to show the basic presets
    @js.native
    sealed trait Basic
      extends StObject
         with Presets
    
    ///used to show the CandyCrush colors presets
    @js.native
    sealed trait CandyCrush
      extends StObject
         with Presets
    
    ///used to show the Citrus colors presets
    @js.native
    sealed trait Citrus
      extends StObject
         with Presets
    
    ///used to show the FlatColors presets
    @js.native
    sealed trait FlatColors
      extends StObject
         with Presets
    
    ///used to show the Misty presets
    @js.native
    sealed trait Misty
      extends StObject
         with Presets
    
    ///used to show the MoonLight presets
    @js.native
    sealed trait MoonLight
      extends StObject
         with Presets
    
    ///used to show the PinkShades presets
    @js.native
    sealed trait PinkShades
      extends StObject
         with Presets
    
    ///used to show the Sandy presets
    @js.native
    sealed trait Sandy
      extends StObject
         with Presets
    
    ///used to show the Seawolf presets
    @js.native
    sealed trait SeaWolf
      extends StObject
         with Presets
    
    ///used to show the Vintage presets
    @js.native
    sealed trait Vintage
      extends StObject
         with Presets
    
    ///used to show the WebColors presets
    @js.native
    sealed trait WebColors
      extends StObject
         with Presets
  }
  
  trait ButtonText extends StObject {
    
    /** Sets the text for the apply button.
      */
    @JSName("apply")
    var apply: js.UndefOr[String] = js.undefined
    
    /** Sets the text for the cancel button.
      */
    var cancel: js.UndefOr[String] = js.undefined
    
    /** Sets the header text for the swatches area.
      */
    var swatches: js.UndefOr[String] = js.undefined
  }
  object ButtonText {
    
    inline def apply(): ButtonText = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonText]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonText] (val x: Self) extends AnyVal {
      
      inline def setApply(value: String): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
      
      inline def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
      
      inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setSwatches(value: String): Self = StObject.set(x, "swatches", value.asInstanceOf[js.Any])
      
      inline def setSwatchesUndefined: Self = StObject.set(x, "swatches", js.undefined)
    }
  }
  
  trait ChangeEventArgs extends StObject {
    
    /** return the previous color value
      */
    var changeFrom: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** return the changed color value
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object ChangeEventArgs {
    
    inline def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangeEventArgs] (val x: Self) extends AnyVal {
      
      inline def setChangeFrom(value: String): Self = StObject.set(x, "changeFrom", value.asInstanceOf[js.Any])
      
      inline def setChangeFromUndefined: Self = StObject.set(x, "changeFrom", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CloseEventArgs extends StObject {
    
    /** returns the color picker model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CloseEventArgs {
    
    inline def apply(): CloseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloseEventArgs] (val x: Self) extends AnyVal {
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** returns the color picker model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CreateEventArgs {
    
    inline def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the color picker model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DestroyEventArgs {
    
    inline def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Allows to change the mode of the button. Please refer below to know available button mode
      * @default {ej.ButtonMode.Split}
      */
    var buttonMode: js.UndefOr[ButtonMode | String] = js.undefined
    
    /** The ColorPicker control allows to define the customized text to displayed in button elements. Using the property to achieve the customized culture values.
      * @default {{ apply: Apply, cancel: Cancel, swatches: Swatches }}
      */
    var buttonText: js.UndefOr[ButtonText] = js.undefined
    
    /** Fires after Color value has been changed successfully.If the user want to perform any operation after the color value changed then the user can make use of this change event.
      */
    var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
    
    /** Fires after closing the color picker popup.
      */
    var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.undefined
    
    /** Specifies the number of columns to be displayed color palette model.
      * @default {10}
      */
    var columns: js.UndefOr[Double | String] = js.undefined
    
    /** Fires after Color picker control is created. If the user want to perform any operation after the color picker control creation then the user can make use of this create event.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** This property allows you to customize its appearance using user-defined CSS and custom skin options such as colors and backgrounds.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** This property allows to define the custom colors in the palette model.Custom palettes are created by passing a comma delimited string of HEX values or an array of colors.
      * @default {empty}
      */
    var custom: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Fires after Color picker control is destroyed. If the user want to perform any operation after the color picker control destroyed then the user can make use of this destroy event.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** This property allows to embed the popup in the order of DOM element flow . When we set the value as true, the color picker popup is always in visible state.
      * @default {false}
      */
    var displayInline: js.UndefOr[Boolean] = js.undefined
    
    /** This property allows to enable or disable the opacity slider in the color picker control
      * @default {true}
      */
    var enableOpacity: js.UndefOr[Boolean] = js.undefined
    
    /** This property allows to change the control in enabled or disabled state.
      * @default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** It allows to define the characteristics of the ColorPicker control. It will helps to extend the capability of an HTML element.
      * @default {{}}
      */
    var htmlAttributes: js.UndefOr[Any] = js.undefined
    
    /** Defines the localized text values in button and tooltip.
      * @default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Specifies the model type to be rendered initially in the color picker control. See below to get available ModelType
      * @default {ej.ColorPicker.ModelType.Default}
      */
    var modelType: js.UndefOr[ModelType | String] = js.undefined
    
    /** This property allows to change the opacity value .The selected color opacity will be adjusted by using this opacity value.
      * @default {100}
      */
    var opacityValue: js.UndefOr[Double | String] = js.undefined
    
    /** Fires after opening the color picker popup
      */
    var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.undefined
    
    /** Specifies the palette type to be displayed at initial time in palette model.There two types of palette model available in ColorPicker control. See below available Palette
      * @default {ej.ColorPicker.Palette.BasicPalette}
      */
    var palette: js.UndefOr[Palette | String] = js.undefined
    
    /** This property allows to define the preset model to be rendered initially in palette type.It consists of 12 different types of presets. Each presets have 50 colors. See below
      * available Presets
      * @default {ej.ColorPicker.Presets.Basic}
      */
    var presetType: js.UndefOr[Presets | String] = js.undefined
    
    /** Fires after Color value has been selected successfully. If the user want to perform any operation after the color value selected then the user can make use of this select event.
      */
    var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.undefined
    
    /** Allows to show/hides the apply and cancel buttons in ColorPicker control
      * @default {true}
      */
    var showApplyCancel: js.UndefOr[Boolean] = js.undefined
    
    /** Allows to show/hides the clear button in ColorPicker control
      * @default {true}
      */
    var showClearButton: js.UndefOr[Boolean] = js.undefined
    
    /** This property allows to provides live preview support for current cursor selection color and selected color.
      * @default {true}
      */
    var showPreview: js.UndefOr[Boolean] = js.undefined
    
    /** This property allows to store the color values in custom list.The ColorPicker will keep up to 11 colors in a custom list.By clicking the add button, the selected color from picker
      * or palette will get added in the recent color list.
      * @default {false}
      */
    var showRecentColors: js.UndefOr[Boolean] = js.undefined
    
    /** Allows to show/hides the switcher button in ColorPicker control.It helps to switch palette or picker mode in colorpicker.
      * @default {true}
      */
    var showSwitcher: js.UndefOr[Boolean] = js.undefined
    
    /** This property allows to shows tooltip to notify the slider value in color picker control.
      * @default {false}
      */
    var showTooltip: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the toolIcon to be displayed in dropdown control color area.
      * @default {null}
      */
    var toolIcon: js.UndefOr[String] = js.undefined
    
    /** This property allows to define the customized text or content to displayed when mouse over the following elements. This property also allows to use the culture values.
      * @default {{ switcher: Switcher, addButton: Add Color, basic: Basic, monoChrome: Mono Chrome, flatColors: Flat Color, seaWolf: Sea Wolf, webColors: Web Colors, sandy: Sandy,
      * pinkShades: Pink Shades, misty: Misty, citrus: Citrus, vintage: Vintage, moonLight: Moon Light, candyCrush: Candy Crush, currentColor: Current Color, selectedColor: Selected
      * Color }}
      */
    var tooltipText: js.UndefOr[TooltipText] = js.undefined
    
    /** Specifies the color value for color picker control, the value is in hexadecimal form with prefix of &quot;#&quot;.
      * @default {null}
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.ColorPicker.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.ColorPicker.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.ColorPicker.Model] (val x: Self) extends AnyVal {
      
      inline def setButtonMode(value: ButtonMode | String): Self = StObject.set(x, "buttonMode", value.asInstanceOf[js.Any])
      
      inline def setButtonModeUndefined: Self = StObject.set(x, "buttonMode", js.undefined)
      
      inline def setButtonText(value: ButtonText): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      inline def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setClose(value: /* e */ CloseEventArgs => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setColumns(value: Double | String): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setCustom(value: js.Array[Any]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setCustomVarargs(value: Any*): Self = StObject.set(x, "custom", js.Array(value*))
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setDisplayInline(value: Boolean): Self = StObject.set(x, "displayInline", value.asInstanceOf[js.Any])
      
      inline def setDisplayInlineUndefined: Self = StObject.set(x, "displayInline", js.undefined)
      
      inline def setEnableOpacity(value: Boolean): Self = StObject.set(x, "enableOpacity", value.asInstanceOf[js.Any])
      
      inline def setEnableOpacityUndefined: Self = StObject.set(x, "enableOpacity", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHtmlAttributes(value: Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setModelType(value: ModelType | String): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
      
      inline def setModelTypeUndefined: Self = StObject.set(x, "modelType", js.undefined)
      
      inline def setOpacityValue(value: Double | String): Self = StObject.set(x, "opacityValue", value.asInstanceOf[js.Any])
      
      inline def setOpacityValueUndefined: Self = StObject.set(x, "opacityValue", js.undefined)
      
      inline def setOpen(value: /* e */ OpenEventArgs => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPalette(value: Palette | String): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      inline def setPresetType(value: Presets | String): Self = StObject.set(x, "presetType", value.asInstanceOf[js.Any])
      
      inline def setPresetTypeUndefined: Self = StObject.set(x, "presetType", js.undefined)
      
      inline def setSelect(value: /* e */ SelectEventArgs => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setShowApplyCancel(value: Boolean): Self = StObject.set(x, "showApplyCancel", value.asInstanceOf[js.Any])
      
      inline def setShowApplyCancelUndefined: Self = StObject.set(x, "showApplyCancel", js.undefined)
      
      inline def setShowClearButton(value: Boolean): Self = StObject.set(x, "showClearButton", value.asInstanceOf[js.Any])
      
      inline def setShowClearButtonUndefined: Self = StObject.set(x, "showClearButton", js.undefined)
      
      inline def setShowPreview(value: Boolean): Self = StObject.set(x, "showPreview", value.asInstanceOf[js.Any])
      
      inline def setShowPreviewUndefined: Self = StObject.set(x, "showPreview", js.undefined)
      
      inline def setShowRecentColors(value: Boolean): Self = StObject.set(x, "showRecentColors", value.asInstanceOf[js.Any])
      
      inline def setShowRecentColorsUndefined: Self = StObject.set(x, "showRecentColors", js.undefined)
      
      inline def setShowSwitcher(value: Boolean): Self = StObject.set(x, "showSwitcher", value.asInstanceOf[js.Any])
      
      inline def setShowSwitcherUndefined: Self = StObject.set(x, "showSwitcher", js.undefined)
      
      inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      inline def setToolIcon(value: String): Self = StObject.set(x, "toolIcon", value.asInstanceOf[js.Any])
      
      inline def setToolIconUndefined: Self = StObject.set(x, "toolIcon", js.undefined)
      
      inline def setTooltipText(value: TooltipText): Self = StObject.set(x, "tooltipText", value.asInstanceOf[js.Any])
      
      inline def setTooltipTextUndefined: Self = StObject.set(x, "tooltipText", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait OpenEventArgs extends StObject {
    
    /** returns the color picker model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object OpenEventArgs {
    
    inline def apply(): OpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenEventArgs] (val x: Self) extends AnyVal {
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SelectEventArgs extends StObject {
    
    /** returns the color picker model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** return the selected color value
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object SelectEventArgs {
    
    inline def apply(): SelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectEventArgs] (val x: Self) extends AnyVal {
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait TooltipText extends StObject {
    
    /** Sets the tooltip text for the add button.
      */
    var addButton: js.UndefOr[String] = js.undefined
    
    /** Sets the tooltip text for the basic preset.
      */
    var basic: js.UndefOr[String] = js.undefined
    
    /** Sets the tooltip text for the candy crush preset.
      */
    var candyCrush: js.UndefOr[String] = js.undefined
    
    /** Sets the tooltip text for the citrus preset.
      */
    var citrus: js.UndefOr[String] = js.undefined
    
    /** Sets the tooltip text for the current color area.
      */
    var currentColor: js.UndefOr[String] = js.undefined
    
    /** Sets the tooltip text for the flat colors preset.
      */
    var flatColors: js.UndefOr[String] = js.undefined
    
    /** Sets the tooltip text for the misty preset.
      */
    var misty: js.UndefOr[String] = js.undefined
    
    /** Sets the tooltip text for the mono chrome preset.
      */
    var monoChrome: js.UndefOr[String] = js.undefined
    
    /** Sets the tooltip text for the moon light preset.
      */
    var moonLight: js.UndefOr[String] = js.undefined
    
    /** Sets the tooltip text for the pink shades preset.
      */
    var pinkShades: js.UndefOr[String] = js.undefined
    
    /** Sets the tooltip text for the sandy preset.
      */
    var sandy: js.UndefOr[String] = js.undefined
    
    /** Sets the tooltip text for the sea wolf preset.
      */
    var seaWolf: js.UndefOr[String] = js.undefined
    
    /** Sets the tooltip text for the selected color area.
      */
    var selectedColor: js.UndefOr[String] = js.undefined
    
    /** Sets the tooltip text for the switcher button.
      */
    var switcher: js.UndefOr[String] = js.undefined
    
    /** Sets the tooltip text for the vintage preset.
      */
    var vintage: js.UndefOr[String] = js.undefined
    
    /** Sets the tooltip text for the web colors preset.
      */
    var webColors: js.UndefOr[String] = js.undefined
  }
  object TooltipText {
    
    inline def apply(): TooltipText = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipText]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipText] (val x: Self) extends AnyVal {
      
      inline def setAddButton(value: String): Self = StObject.set(x, "addButton", value.asInstanceOf[js.Any])
      
      inline def setAddButtonUndefined: Self = StObject.set(x, "addButton", js.undefined)
      
      inline def setBasic(value: String): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
      
      inline def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
      
      inline def setCandyCrush(value: String): Self = StObject.set(x, "candyCrush", value.asInstanceOf[js.Any])
      
      inline def setCandyCrushUndefined: Self = StObject.set(x, "candyCrush", js.undefined)
      
      inline def setCitrus(value: String): Self = StObject.set(x, "citrus", value.asInstanceOf[js.Any])
      
      inline def setCitrusUndefined: Self = StObject.set(x, "citrus", js.undefined)
      
      inline def setCurrentColor(value: String): Self = StObject.set(x, "currentColor", value.asInstanceOf[js.Any])
      
      inline def setCurrentColorUndefined: Self = StObject.set(x, "currentColor", js.undefined)
      
      inline def setFlatColors(value: String): Self = StObject.set(x, "flatColors", value.asInstanceOf[js.Any])
      
      inline def setFlatColorsUndefined: Self = StObject.set(x, "flatColors", js.undefined)
      
      inline def setMisty(value: String): Self = StObject.set(x, "misty", value.asInstanceOf[js.Any])
      
      inline def setMistyUndefined: Self = StObject.set(x, "misty", js.undefined)
      
      inline def setMonoChrome(value: String): Self = StObject.set(x, "monoChrome", value.asInstanceOf[js.Any])
      
      inline def setMonoChromeUndefined: Self = StObject.set(x, "monoChrome", js.undefined)
      
      inline def setMoonLight(value: String): Self = StObject.set(x, "moonLight", value.asInstanceOf[js.Any])
      
      inline def setMoonLightUndefined: Self = StObject.set(x, "moonLight", js.undefined)
      
      inline def setPinkShades(value: String): Self = StObject.set(x, "pinkShades", value.asInstanceOf[js.Any])
      
      inline def setPinkShadesUndefined: Self = StObject.set(x, "pinkShades", js.undefined)
      
      inline def setSandy(value: String): Self = StObject.set(x, "sandy", value.asInstanceOf[js.Any])
      
      inline def setSandyUndefined: Self = StObject.set(x, "sandy", js.undefined)
      
      inline def setSeaWolf(value: String): Self = StObject.set(x, "seaWolf", value.asInstanceOf[js.Any])
      
      inline def setSeaWolfUndefined: Self = StObject.set(x, "seaWolf", js.undefined)
      
      inline def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
      
      inline def setSelectedColorUndefined: Self = StObject.set(x, "selectedColor", js.undefined)
      
      inline def setSwitcher(value: String): Self = StObject.set(x, "switcher", value.asInstanceOf[js.Any])
      
      inline def setSwitcherUndefined: Self = StObject.set(x, "switcher", js.undefined)
      
      inline def setVintage(value: String): Self = StObject.set(x, "vintage", value.asInstanceOf[js.Any])
      
      inline def setVintageUndefined: Self = StObject.set(x, "vintage", js.undefined)
      
      inline def setWebColors(value: String): Self = StObject.set(x, "webColors", value.asInstanceOf[js.Any])
      
      inline def setWebColorsUndefined: Self = StObject.set(x, "webColors", js.undefined)
    }
  }
}
