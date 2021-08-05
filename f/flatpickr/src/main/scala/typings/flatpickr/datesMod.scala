package typings.flatpickr

import typings.flatpickr.anon.Config
import typings.flatpickr.globalsMod.global.Date
import typings.flatpickr.localeMod.Locale
import typings.flatpickr.optionsMod.ParsedOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datesMod {
  
  @JSImport("flatpickr/dist/utils/dates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareDates(date1: Date, date2: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDates")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareDates(date1: Date, date2: Date, timeless: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDates")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any], timeless.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def compareTimes(date1: Date, date2: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareTimes")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def createDateFormatter(hasConfigL10nIsMobile: FormatterArgs): js.Function3[/* dateObj */ Date, /* frmt */ String, /* overrideLocale */ js.UndefOr[Locale], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDateFormatter")(hasConfigL10nIsMobile.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* dateObj */ Date, /* frmt */ String, /* overrideLocale */ js.UndefOr[Locale], String]]
  
  inline def createDateParser(hasConfigL10n: Config): js.Function4[
    /* date */ Date | String | Double, 
    /* givenFormat */ js.UndefOr[String], 
    /* timeless */ js.UndefOr[Boolean], 
    /* customLocale */ js.UndefOr[Locale], 
    js.UndefOr[Date]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDateParser")(hasConfigL10n.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
    /* date */ Date | String | Double, 
    /* givenFormat */ js.UndefOr[String], 
    /* timeless */ js.UndefOr[Boolean], 
    /* customLocale */ js.UndefOr[Locale], 
    js.UndefOr[Date]
  ]]
  
  object duration {
    
    @JSImport("flatpickr/dist/utils/dates", "duration")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("flatpickr/dist/utils/dates", "duration.DAY")
    @js.native
    def DAY: Double = js.native
    inline def DAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DAY")(x.asInstanceOf[js.Any])
  }
  
  inline def isBetween(ts: Double, ts1: Double, ts2: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBetween")(ts.asInstanceOf[js.Any], ts1.asInstanceOf[js.Any], ts2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait FormatterArgs extends StObject {
    
    var config: js.UndefOr[ParsedOptions] = js.undefined
    
    var isMobile: js.UndefOr[Boolean] = js.undefined
    
    var l10n: js.UndefOr[Locale] = js.undefined
  }
  object FormatterArgs {
    
    inline def apply(): FormatterArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatterArgs]
    }
    
    extension [Self <: FormatterArgs](x: Self) {
      
      inline def setConfig(value: ParsedOptions): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      inline def setIsMobileUndefined: Self = StObject.set(x, "isMobile", js.undefined)
      
      inline def setL10n(value: Locale): Self = StObject.set(x, "l10n", value.asInstanceOf[js.Any])
      
      inline def setL10nUndefined: Self = StObject.set(x, "l10n", js.undefined)
    }
  }
}
