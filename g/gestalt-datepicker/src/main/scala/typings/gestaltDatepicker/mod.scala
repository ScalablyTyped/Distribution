package typings.gestaltDatepicker

import org.scalablytyped.runtime.Shortcut
import typings.gestaltDatepicker.anon.Date
import typings.gestaltDatepicker.anon.Day
import typings.gestaltDatepicker.anon.Event
import typings.gestaltDatepicker.anon.FirstWeekContainsDate
import typings.gestaltDatepicker.gestaltDatepickerStrings.down
import typings.gestaltDatepicker.gestaltDatepickerStrings.end
import typings.gestaltDatepicker.gestaltDatepickerStrings.left
import typings.gestaltDatepicker.gestaltDatepickerStrings.right
import typings.gestaltDatepicker.gestaltDatepickerStrings.start
import typings.gestaltDatepicker.gestaltDatepickerStrings.up
import typings.react.mod.FunctionComponent
import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gestalt-datepicker", JSImport.Default)
  @js.native
  val default: FunctionComponent[DatePickerProps] = js.native
  
  trait DatePickerProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var errorMessage: js.UndefOr[String] = js.undefined
    
    var excludeDates: js.UndefOr[js.Array[js.Date]] = js.undefined
    
    var helperText: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var idealDirection: js.UndefOr[up | right | down | left] = js.undefined
    
    var includeDates: js.UndefOr[js.Array[js.Date]] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var localeData: js.UndefOr[Locale] = js.undefined
    
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var nextRef: js.UndefOr[Ref[Any]] = js.undefined
    
    def onChange(args: Event): Unit
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var rangeEndDate: js.UndefOr[js.Date] = js.undefined
    
    var rangeSelector: js.UndefOr[start | end] = js.undefined
    
    var rangeStartDate: js.UndefOr[js.Date] = js.undefined
    
    var ref: js.UndefOr[Ref[Any]] = js.undefined
    
    var value: js.UndefOr[js.Date] = js.undefined
  }
  object DatePickerProps {
    
    inline def apply(id: String, onChange: Event => Unit): DatePickerProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[DatePickerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatePickerProps] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setExcludeDates(value: js.Array[js.Date]): Self = StObject.set(x, "excludeDates", value.asInstanceOf[js.Any])
      
      inline def setExcludeDatesUndefined: Self = StObject.set(x, "excludeDates", js.undefined)
      
      inline def setExcludeDatesVarargs(value: js.Date*): Self = StObject.set(x, "excludeDates", js.Array(value*))
      
      inline def setHelperText(value: String): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
      
      inline def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdealDirection(value: up | right | down | left): Self = StObject.set(x, "idealDirection", value.asInstanceOf[js.Any])
      
      inline def setIdealDirectionUndefined: Self = StObject.set(x, "idealDirection", js.undefined)
      
      inline def setIncludeDates(value: js.Array[js.Date]): Self = StObject.set(x, "includeDates", value.asInstanceOf[js.Any])
      
      inline def setIncludeDatesUndefined: Self = StObject.set(x, "includeDates", js.undefined)
      
      inline def setIncludeDatesVarargs(value: js.Date*): Self = StObject.set(x, "includeDates", js.Array(value*))
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLocaleData(value: Locale): Self = StObject.set(x, "localeData", value.asInstanceOf[js.Any])
      
      inline def setLocaleDataUndefined: Self = StObject.set(x, "localeData", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNextRef(value: Ref[Any]): Self = StObject.set(x, "nextRef", value.asInstanceOf[js.Any])
      
      inline def setNextRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "nextRef", js.Any.fromFunction1(value))
      
      inline def setNextRefNull: Self = StObject.set(x, "nextRef", null)
      
      inline def setNextRefUndefined: Self = StObject.set(x, "nextRef", js.undefined)
      
      inline def setOnChange(value: Event => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setRangeEndDate(value: js.Date): Self = StObject.set(x, "rangeEndDate", value.asInstanceOf[js.Any])
      
      inline def setRangeEndDateUndefined: Self = StObject.set(x, "rangeEndDate", js.undefined)
      
      inline def setRangeSelector(value: start | end): Self = StObject.set(x, "rangeSelector", value.asInstanceOf[js.Any])
      
      inline def setRangeSelectorUndefined: Self = StObject.set(x, "rangeSelector", js.undefined)
      
      inline def setRangeStartDate(value: js.Date): Self = StObject.set(x, "rangeStartDate", value.asInstanceOf[js.Any])
      
      inline def setRangeStartDateUndefined: Self = StObject.set(x, "rangeStartDate", js.undefined)
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Locale extends StObject {
    
    var code: js.UndefOr[String] = js.undefined
    
    var formatDistance: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var formatLong: js.UndefOr[Date] = js.undefined
    
    var formatRelative: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var localize: js.UndefOr[Day] = js.undefined
    
    var `match`: js.UndefOr[Day] = js.undefined
    
    var options: js.UndefOr[FirstWeekContainsDate] = js.undefined
  }
  object Locale {
    
    inline def apply(): Locale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setFormatDistance(value: /* repeated */ Any => Any): Self = StObject.set(x, "formatDistance", js.Any.fromFunction1(value))
      
      inline def setFormatDistanceUndefined: Self = StObject.set(x, "formatDistance", js.undefined)
      
      inline def setFormatLong(value: Date): Self = StObject.set(x, "formatLong", value.asInstanceOf[js.Any])
      
      inline def setFormatLongUndefined: Self = StObject.set(x, "formatLong", js.undefined)
      
      inline def setFormatRelative(value: /* repeated */ Any => Any): Self = StObject.set(x, "formatRelative", js.Any.fromFunction1(value))
      
      inline def setFormatRelativeUndefined: Self = StObject.set(x, "formatRelative", js.undefined)
      
      inline def setLocalize(value: Day): Self = StObject.set(x, "localize", value.asInstanceOf[js.Any])
      
      inline def setLocalizeUndefined: Self = StObject.set(x, "localize", js.undefined)
      
      inline def setMatch(value: Day): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setOptions(value: FirstWeekContainsDate): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  type _To = FunctionComponent[DatePickerProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FunctionComponent[DatePickerProps] = default
}
