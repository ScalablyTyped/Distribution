package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxNumberBox.NumberBoxPredefinedButton
import typings.devextreme.mod.DevExpress.ui.dxNumberBox.NumberBoxType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxNumberBoxOptions
  extends StObject
     with dxTextEditorOptions[dxNumberBox] {
  
  /**
    * Allows you to add custom buttons to the input text field.
    */
  @JSName("buttons")
  var buttons_dxNumberBoxOptions: js.UndefOr[js.Array[NumberBoxPredefinedButton | dxTextEditorButton]] = js.undefined
  
  /**
    * Specifies the value&apos;s display format and controls user input accordingly.
    */
  var format: js.UndefOr[Format] = js.undefined
  
  /**
    * Specifies the text of the message displayed if the specified value is not a number.
    */
  var invalidValueMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum value accepted by the number box.
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum value accepted by the number box.
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the value to be passed to the type attribute of the underlying `` element.
    */
  var mode: js.UndefOr[NumberBoxType] = js.undefined
  
  /**
    * Specifies whether to show the buttons that change the value by a step.
    */
  var showSpinButtons: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies how much the UI component&apos;s value changes when using the spin buttons, Up/Down arrow keys, or mouse wheel.
    */
  var step: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether to use touch friendly spin buttons. Applies only if showSpinButtons is true.
    */
  var useLargeSpinButtons: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The current number box value.
    */
  @JSName("value")
  var value_dxNumberBoxOptions: js.UndefOr[Double] = js.undefined
}
object dxNumberBoxOptions {
  
  inline def apply(): dxNumberBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxNumberBoxOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxNumberBoxOptions] (val x: Self) extends AnyVal {
    
    inline def setButtons(value: js.Array[NumberBoxPredefinedButton | dxTextEditorButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: (NumberBoxPredefinedButton | dxTextEditorButton)*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setInvalidValueMessage(value: String): Self = StObject.set(x, "invalidValueMessage", value.asInstanceOf[js.Any])
    
    inline def setInvalidValueMessageUndefined: Self = StObject.set(x, "invalidValueMessage", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMode(value: NumberBoxType): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setShowSpinButtons(value: Boolean): Self = StObject.set(x, "showSpinButtons", value.asInstanceOf[js.Any])
    
    inline def setShowSpinButtonsUndefined: Self = StObject.set(x, "showSpinButtons", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setUseLargeSpinButtons(value: Boolean): Self = StObject.set(x, "useLargeSpinButtons", value.asInstanceOf[js.Any])
    
    inline def setUseLargeSpinButtonsUndefined: Self = StObject.set(x, "useLargeSpinButtons", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
