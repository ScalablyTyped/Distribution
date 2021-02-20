package typings.flatpickr

import typings.flatpickr.anon.Config
import typings.flatpickr.globalsMod.global.Date
import typings.flatpickr.localeMod.Locale
import typings.flatpickr.optionsMod.ParsedOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datesMod {
  
  @JSImport("flatpickr/dist/utils/dates", "compareDates")
  @js.native
  def compareDates(date1: Date, date2: Date): Double = js.native
  @JSImport("flatpickr/dist/utils/dates", "compareDates")
  @js.native
  def compareDates(date1: Date, date2: Date, timeless: Boolean): Double = js.native
  
  @JSImport("flatpickr/dist/utils/dates", "compareTimes")
  @js.native
  def compareTimes(date1: Date, date2: Date): Double = js.native
  
  @JSImport("flatpickr/dist/utils/dates", "createDateFormatter")
  @js.native
  def createDateFormatter(hasConfigL10nIsMobile: FormatterArgs): js.Function3[/* dateObj */ Date, /* frmt */ String, /* overrideLocale */ js.UndefOr[Locale], String] = js.native
  
  @JSImport("flatpickr/dist/utils/dates", "createDateParser")
  @js.native
  def createDateParser(hasConfigL10n: Config): js.Function4[
    /* date */ Date | String | Double, 
    /* givenFormat */ js.UndefOr[String], 
    /* timeless */ js.UndefOr[Boolean], 
    /* customLocale */ js.UndefOr[Locale], 
    js.UndefOr[Date]
  ] = js.native
  
  object duration {
    
    @JSImport("flatpickr/dist/utils/dates", "duration")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("flatpickr/dist/utils/dates", "duration.DAY")
    @js.native
    def DAY: Double = js.native
    @scala.inline
    def DAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DAY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("flatpickr/dist/utils/dates", "isBetween")
  @js.native
  def isBetween(ts: Double, ts1: Double, ts2: Double): Boolean = js.native
  
  @js.native
  trait FormatterArgs extends StObject {
    
    var config: js.UndefOr[ParsedOptions] = js.native
    
    var isMobile: js.UndefOr[Boolean] = js.native
    
    var l10n: js.UndefOr[Locale] = js.native
  }
  object FormatterArgs {
    
    @scala.inline
    def apply(): FormatterArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatterArgs]
    }
    
    @scala.inline
    implicit class FormatterArgsMutableBuilder[Self <: FormatterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: ParsedOptions): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMobileUndefined: Self = StObject.set(x, "isMobile", js.undefined)
      
      @scala.inline
      def setL10n(value: Locale): Self = StObject.set(x, "l10n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL10nUndefined: Self = StObject.set(x, "l10n", js.undefined)
    }
  }
}
