package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.Date
import typings.fundamentalReact.anon.State
import typings.fundamentalReact.calendarMod.CalendarBaseProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerMod {
  
  @JSImport("fundamental-react/lib/DatePicker/DatePicker", JSImport.Default)
  @js.native
  open class default ()
    extends Component[DatePickerProps, js.Object, Any]
  
  type DatePicker = Component[DatePickerProps, js.Object, Any]
  
  trait DatePickerProps
    extends StObject
       with CalendarBaseProps
       with /* x */ StringDictionary[Any] {
    
    var buttonLabel: js.UndefOr[String] = js.undefined
    
    var buttonProps: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var enableRangeSelection: js.UndefOr[Boolean] = js.undefined
    
    var inputProps: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* hasDateFormattedDate */ Date, Unit]] = js.undefined
    
    var validationState: js.UndefOr[State] = js.undefined
  }
  object DatePickerProps {
    
    inline def apply(): DatePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerProps]
    }
    
    extension [Self <: DatePickerProps](x: Self) {
      
      inline def setButtonLabel(value: String): Self = StObject.set(x, "buttonLabel", value.asInstanceOf[js.Any])
      
      inline def setButtonLabelUndefined: Self = StObject.set(x, "buttonLabel", js.undefined)
      
      inline def setButtonProps(value: StringDictionary[Any]): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
      
      inline def setButtonPropsUndefined: Self = StObject.set(x, "buttonProps", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setEnableRangeSelection(value: Boolean): Self = StObject.set(x, "enableRangeSelection", value.asInstanceOf[js.Any])
      
      inline def setEnableRangeSelectionUndefined: Self = StObject.set(x, "enableRangeSelection", js.undefined)
      
      inline def setInputProps(value: StringDictionary[Any]): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setOnBlur(value: /* hasDateFormattedDate */ Date => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setValidationState(value: State): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    }
  }
}
