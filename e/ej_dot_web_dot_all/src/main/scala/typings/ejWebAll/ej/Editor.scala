package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Editor
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** To disable the corresponding Editors
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** To enable the corresponding Editors
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** To get value from corresponding Editors
    * @returns {number}
    */
  def getValue(): Double = js.native
  
  @JSName("model")
  var model_Editor: Model = js.native
}
object Editor {
  
  trait ChangeEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns true when the value changed by user interaction otherwise returns false
      */
    var isInteraction: js.UndefOr[Boolean] = js.undefined
    
    /** returns the corresponding editor model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the corresponding editor control value.
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object ChangeEventArgs {
    
    @scala.inline
    def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    @scala.inline
    implicit class ChangeEventArgsMutableBuilder[Self <: ChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the editor model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CreateEventArgs {
    
    @scala.inline
    def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit class CreateEventArgsMutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the editor model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DestroyEventArgs {
    
    @scala.inline
    def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit class DestroyEventArgsMutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait FocusInEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the corresponding editor model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the corresponding editor control value.
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object FocusInEventArgs {
    
    @scala.inline
    def apply(): FocusInEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusInEventArgs]
    }
    
    @scala.inline
    implicit class FocusInEventArgsMutableBuilder[Self <: FocusInEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait FocusOutEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the corresponding editor model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the corresponding editor control value.
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object FocusOutEventArgs {
    
    @scala.inline
    def apply(): FocusOutEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusOutEventArgs]
    }
    
    @scala.inline
    implicit class FocusOutEventArgsMutableBuilder[Self <: FocusOutEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Fires after Editor control value is changed.
      */
    var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
    
    /** Fires after Editor control is created.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Sets the root CSS class for Editors which allow us to customize the appearance.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Specifies the currency symbol of currency textbox, used when the user wants to overwrite the currency symbol commonly instead of the current culture symbol.
      * @Default {Based on the culture}
      */
    var currencySymbol: js.UndefOr[String] = js.undefined
    
    /** Specifies the number of digits that is allowed after the decimal point. When the decimalPlaces is set to â€œ-1â€, it allows the decimals without any limit in the Textboxes.
      * @Default {0}
      */
    var decimalPlaces: js.UndefOr[Double] = js.undefined
    
    /** Fires when the Editor is destroyed successfully.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Specify the enablePersistence to editor to save current editor control value to browser cookies for state maintenance.
      * @Default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the Right to Left Direction to editor.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** When enableStrictMode true it allows the value outside of the range also but it highlights the textbox with error class,otherwise it internally changed to the correct value.
      * @Default {false}
      */
    var enableStrictMode: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the editor control state.
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Fires after Editor control is focused.
      */
    var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, Unit]] = js.undefined
    
    /** Fires after Editor control is loss the focus.
      */
    var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.undefined
    
    /** It provides the options to get the customized character to separate the digits. If not set, the separator defined by the current culture.
      * @Default {Based on the culture}
      */
    var groupSeparator: js.UndefOr[String] = js.undefined
    
    /** Specifies the number of digits in each group to the editor.
      * @Default {Based on the culture.}
      */
    var groupSize: js.UndefOr[String] = js.undefined
    
    /** Specifies the height of the editor.
      * @Default {30}
      */
    var height: js.UndefOr[String] = js.undefined
    
    /** It allows to define the characteristics of the Editors control. It will helps to extend the capability of an HTML element.
      * @Default {{}}
      */
    var htmlAttributes: js.UndefOr[js.Any] = js.undefined
    
    /** The Editor value increment or decrement based an incrementStep value.
      * @Default {1}
      */
    var incrementStep: js.UndefOr[Double] = js.undefined
    
    /** Defines the localization culture for editor.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Specifies the maximum value of the editor.
      * @Default {Number.MAX_VALUE}
      */
    var maxValue: js.UndefOr[Double] = js.undefined
    
    /** Specifies the minimum value of the editor.
      * @Default {-(Number.MAX_VALUE) and 0 for Currency Textbox.}
      */
    var minValue: js.UndefOr[Double] = js.undefined
    
    /** Specifies the name of the editor.
      * @Default {Sets id as name if it is null.}
      */
    var name: js.UndefOr[String] = js.undefined
    
    /** Specifies the pattern for formatting positive values in editor.We have maintained some standard to define the negative pattern. you have to specify 'n' to place the digit in your
      * pattern.ejTextbox allows you to define a currency or percent symbol where you want to place it.
      * @Default {Based on the culture}
      */
    var negativePattern: js.UndefOr[String] = js.undefined
    
    /** Specifies the pattern for formatting positive values in editor.We have maintained some standard to define the positive pattern. you have to specify 'n' to place the digit in your
      * pattern.ejTextbox allows you to define a currency or percent symbol where you want to place it.
      * @Default {Based on the culture}
      */
    var positivePattern: js.UndefOr[String] = js.undefined
    
    /** Toggles the readonly state of the editor. When the Editor is readonly it doesn't allow user interactions.
      * @Default {false}
      */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies to Change the sharped edges into rounded corner for the Editor.
      * @Default {false}
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether the up and down spin buttons should be displayed in editor.
      * @Default {true}
      */
    var showSpinButton: js.UndefOr[Boolean] = js.undefined
    
    /** Enables decimal separator position validation on type .
      * @Default {false}
      */
    var validateOnType: js.UndefOr[Boolean] = js.undefined
    
    /** Set the jQuery validation error message in editor.
      * @Default {null}
      */
    var validationMessage: js.UndefOr[js.Any] = js.undefined
    
    /** Set the jQuery validation rules to the editor.
      * @Default {null}
      */
    var validationRules: js.UndefOr[js.Any] = js.undefined
    
    /** Specifies the value of the editor.
      * @Default {null}
      */
    var value: js.UndefOr[Double | String] = js.undefined
    
    /** Specifies the watermark text to editor.
      * @Default {Based on the culture.}
      */
    var watermarkText: js.UndefOr[String] = js.undefined
    
    /** Specifies the width of the editor.
      * @Default {143}
      */
    var width: js.UndefOr[String] = js.undefined
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.Editor.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Editor.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.Editor.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      @scala.inline
      def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setCurrencySymbol(value: String): Self = StObject.set(x, "currencySymbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencySymbolUndefined: Self = StObject.set(x, "currencySymbol", js.undefined)
      
      @scala.inline
      def setDecimalPlaces(value: Double): Self = StObject.set(x, "decimalPlaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalPlacesUndefined: Self = StObject.set(x, "decimalPlaces", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      @scala.inline
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setEnableStrictMode(value: Boolean): Self = StObject.set(x, "enableStrictMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableStrictModeUndefined: Self = StObject.set(x, "enableStrictMode", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFocusIn(value: /* e */ FocusInEventArgs => Unit): Self = StObject.set(x, "focusIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocusInUndefined: Self = StObject.set(x, "focusIn", js.undefined)
      
      @scala.inline
      def setFocusOut(value: /* e */ FocusOutEventArgs => Unit): Self = StObject.set(x, "focusOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocusOutUndefined: Self = StObject.set(x, "focusOut", js.undefined)
      
      @scala.inline
      def setGroupSeparator(value: String): Self = StObject.set(x, "groupSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupSeparatorUndefined: Self = StObject.set(x, "groupSeparator", js.undefined)
      
      @scala.inline
      def setGroupSize(value: String): Self = StObject.set(x, "groupSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupSizeUndefined: Self = StObject.set(x, "groupSize", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHtmlAttributes(value: js.Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      @scala.inline
      def setIncrementStep(value: Double): Self = StObject.set(x, "incrementStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementStepUndefined: Self = StObject.set(x, "incrementStep", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      @scala.inline
      def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNegativePattern(value: String): Self = StObject.set(x, "negativePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegativePatternUndefined: Self = StObject.set(x, "negativePattern", js.undefined)
      
      @scala.inline
      def setPositivePattern(value: String): Self = StObject.set(x, "positivePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositivePatternUndefined: Self = StObject.set(x, "positivePattern", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      @scala.inline
      def setShowSpinButton(value: Boolean): Self = StObject.set(x, "showSpinButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSpinButtonUndefined: Self = StObject.set(x, "showSpinButton", js.undefined)
      
      @scala.inline
      def setValidateOnType(value: Boolean): Self = StObject.set(x, "validateOnType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateOnTypeUndefined: Self = StObject.set(x, "validateOnType", js.undefined)
      
      @scala.inline
      def setValidationMessage(value: js.Any): Self = StObject.set(x, "validationMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationMessageUndefined: Self = StObject.set(x, "validationMessage", js.undefined)
      
      @scala.inline
      def setValidationRules(value: js.Any): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
      
      @scala.inline
      def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setWatermarkText(value: String): Self = StObject.set(x, "watermarkText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatermarkTextUndefined: Self = StObject.set(x, "watermarkText", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
