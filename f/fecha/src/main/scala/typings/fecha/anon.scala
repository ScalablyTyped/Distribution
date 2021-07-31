package typings.fecha

import typings.fecha.mod.Days
import typings.fecha.mod.Months
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<fecha.fecha.I18nSettings> */
  trait PartialI18nSettings extends StObject {
    
    var DoFn: js.UndefOr[js.Function1[/* dayOfMonth */ Double, String]] = js.undefined
    
    var amPm: js.UndefOr[js.Tuple2[String, String]] = js.undefined
    
    var dayNames: js.UndefOr[Days] = js.undefined
    
    var dayNamesShort: js.UndefOr[Days] = js.undefined
    
    var monthNames: js.UndefOr[Months] = js.undefined
    
    var monthNamesShort: js.UndefOr[Months] = js.undefined
  }
  object PartialI18nSettings {
    
    @scala.inline
    def apply(): PartialI18nSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialI18nSettings]
    }
    
    @scala.inline
    implicit class PartialI18nSettingsMutableBuilder[Self <: PartialI18nSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmPm(value: js.Tuple2[String, String]): Self = StObject.set(x, "amPm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmPmUndefined: Self = StObject.set(x, "amPm", js.undefined)
      
      @scala.inline
      def setDayNames(value: Days): Self = StObject.set(x, "dayNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayNamesShort(value: Days): Self = StObject.set(x, "dayNamesShort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayNamesShortUndefined: Self = StObject.set(x, "dayNamesShort", js.undefined)
      
      @scala.inline
      def setDayNamesUndefined: Self = StObject.set(x, "dayNames", js.undefined)
      
      @scala.inline
      def setDoFn(value: /* dayOfMonth */ Double => String): Self = StObject.set(x, "DoFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDoFnUndefined: Self = StObject.set(x, "DoFn", js.undefined)
      
      @scala.inline
      def setMonthNames(value: Months): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthNamesShort(value: Months): Self = StObject.set(x, "monthNamesShort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthNamesShortUndefined: Self = StObject.set(x, "monthNamesShort", js.undefined)
      
      @scala.inline
      def setMonthNamesUndefined: Self = StObject.set(x, "monthNames", js.undefined)
    }
  }
}
