package typings.gestaltDatepicker

import typings.dateFns.mod.Locale
import typings.gestaltDatepicker.anon.Event
import typings.gestaltDatepicker.gestaltDatepickerStrings.down
import typings.gestaltDatepicker.gestaltDatepickerStrings.end
import typings.gestaltDatepicker.gestaltDatepickerStrings.left
import typings.gestaltDatepicker.gestaltDatepickerStrings.right
import typings.gestaltDatepicker.gestaltDatepickerStrings.start
import typings.gestaltDatepicker.gestaltDatepickerStrings.up
import typings.react.mod.Component
import typings.react.mod.Ref
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gestalt-datepicker", JSImport.Default)
  @js.native
  class default ()
    extends Component[DatePickerProps, js.Any, js.Any]
  
  type DatePicker = Component[DatePickerProps, js.Any, js.Any]
  
  trait DatePickerProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var errorMessage: js.UndefOr[String] = js.undefined
    
    var excludeDates: js.UndefOr[js.Array[Date]] = js.undefined
    
    var helperText: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var idealDirection: js.UndefOr[up | right | down | left] = js.undefined
    
    var includeDates: js.UndefOr[js.Array[Date]] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var localeData: js.UndefOr[Locale] = js.undefined
    
    var maxDate: js.UndefOr[Date] = js.undefined
    
    var minDate: js.UndefOr[Date] = js.undefined
    
    var nextRef: js.UndefOr[Ref[js.Any]] = js.undefined
    
    def onChange(args: Event): Unit
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var rangeEndDate: js.UndefOr[Date] = js.undefined
    
    var rangeSelector: js.UndefOr[start | end] = js.undefined
    
    var rangeStartDate: js.UndefOr[Date] = js.undefined
    
    var ref: js.UndefOr[Ref[js.Any]] = js.undefined
    
    var value: js.UndefOr[Date] = js.undefined
  }
  object DatePickerProps {
    
    @scala.inline
    def apply(id: String, onChange: Event => Unit): DatePickerProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[DatePickerProps]
    }
    
    @scala.inline
    implicit class DatePickerPropsMutableBuilder[Self <: DatePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      @scala.inline
      def setExcludeDates(value: js.Array[Date]): Self = StObject.set(x, "excludeDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeDatesUndefined: Self = StObject.set(x, "excludeDates", js.undefined)
      
      @scala.inline
      def setExcludeDatesVarargs(value: Date*): Self = StObject.set(x, "excludeDates", js.Array(value :_*))
      
      @scala.inline
      def setHelperText(value: String): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdealDirection(value: up | right | down | left): Self = StObject.set(x, "idealDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdealDirectionUndefined: Self = StObject.set(x, "idealDirection", js.undefined)
      
      @scala.inline
      def setIncludeDates(value: js.Array[Date]): Self = StObject.set(x, "includeDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeDatesUndefined: Self = StObject.set(x, "includeDates", js.undefined)
      
      @scala.inline
      def setIncludeDatesVarargs(value: Date*): Self = StObject.set(x, "includeDates", js.Array(value :_*))
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLocaleData(value: Locale): Self = StObject.set(x, "localeData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleDataUndefined: Self = StObject.set(x, "localeData", js.undefined)
      
      @scala.inline
      def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setNextRef(value: Ref[js.Any]): Self = StObject.set(x, "nextRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "nextRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNextRefNull: Self = StObject.set(x, "nextRef", null)
      
      @scala.inline
      def setNextRefUndefined: Self = StObject.set(x, "nextRef", js.undefined)
      
      @scala.inline
      def setOnChange(value: Event => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setRangeEndDate(value: Date): Self = StObject.set(x, "rangeEndDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeEndDateUndefined: Self = StObject.set(x, "rangeEndDate", js.undefined)
      
      @scala.inline
      def setRangeSelector(value: start | end): Self = StObject.set(x, "rangeSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeSelectorUndefined: Self = StObject.set(x, "rangeSelector", js.undefined)
      
      @scala.inline
      def setRangeStartDate(value: Date): Self = StObject.set(x, "rangeStartDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeStartDateUndefined: Self = StObject.set(x, "rangeStartDate", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
