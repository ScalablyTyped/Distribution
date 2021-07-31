package typings.flatpickr

import typings.flatpickr.anon.Longhand
import typings.flatpickr.anon.Shorthand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeMod {
  
  trait CustomLocale extends StObject {
    
    var amPM: js.UndefOr[js.Tuple2[String, String]] = js.undefined
    
    var daysInMonth: js.UndefOr[
        js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double]
      ] = js.undefined
    
    var firstDayOfWeek: js.UndefOr[Double] = js.undefined
    
    var hourAriaLabel: js.UndefOr[String] = js.undefined
    
    var minuteAriaLabel: js.UndefOr[String] = js.undefined
    
    var months: Shorthand
    
    var ordinal: js.UndefOr[js.Function1[/* nth */ Double, String]] = js.undefined
    
    var rangeSeparator: js.UndefOr[String] = js.undefined
    
    var scrollTitle: js.UndefOr[String] = js.undefined
    
    var time_24hr: js.UndefOr[Boolean] = js.undefined
    
    var toggleTitle: js.UndefOr[String] = js.undefined
    
    var weekAbbreviation: js.UndefOr[String] = js.undefined
    
    var weekdays: Longhand
    
    var yearAriaLabel: js.UndefOr[String] = js.undefined
  }
  object CustomLocale {
    
    @scala.inline
    def apply(months: Shorthand, weekdays: Longhand): CustomLocale = {
      val __obj = js.Dynamic.literal(months = months.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomLocale]
    }
    
    @scala.inline
    implicit class CustomLocaleMutableBuilder[Self <: CustomLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmPM(value: js.Tuple2[String, String]): Self = StObject.set(x, "amPM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmPMUndefined: Self = StObject.set(x, "amPM", js.undefined)
      
      @scala.inline
      def setDaysInMonth(
        value: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double]
      ): Self = StObject.set(x, "daysInMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysInMonthUndefined: Self = StObject.set(x, "daysInMonth", js.undefined)
      
      @scala.inline
      def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      @scala.inline
      def setHourAriaLabel(value: String): Self = StObject.set(x, "hourAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourAriaLabelUndefined: Self = StObject.set(x, "hourAriaLabel", js.undefined)
      
      @scala.inline
      def setMinuteAriaLabel(value: String): Self = StObject.set(x, "minuteAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteAriaLabelUndefined: Self = StObject.set(x, "minuteAriaLabel", js.undefined)
      
      @scala.inline
      def setMonths(value: Shorthand): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrdinal(value: /* nth */ Double => String): Self = StObject.set(x, "ordinal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
      
      @scala.inline
      def setRangeSeparator(value: String): Self = StObject.set(x, "rangeSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeSeparatorUndefined: Self = StObject.set(x, "rangeSeparator", js.undefined)
      
      @scala.inline
      def setScrollTitle(value: String): Self = StObject.set(x, "scrollTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollTitleUndefined: Self = StObject.set(x, "scrollTitle", js.undefined)
      
      @scala.inline
      def setTime_24hr(value: Boolean): Self = StObject.set(x, "time_24hr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime_24hrUndefined: Self = StObject.set(x, "time_24hr", js.undefined)
      
      @scala.inline
      def setToggleTitle(value: String): Self = StObject.set(x, "toggleTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleTitleUndefined: Self = StObject.set(x, "toggleTitle", js.undefined)
      
      @scala.inline
      def setWeekAbbreviation(value: String): Self = StObject.set(x, "weekAbbreviation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekAbbreviationUndefined: Self = StObject.set(x, "weekAbbreviation", js.undefined)
      
      @scala.inline
      def setWeekdays(value: Longhand): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearAriaLabel(value: String): Self = StObject.set(x, "yearAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearAriaLabelUndefined: Self = StObject.set(x, "yearAriaLabel", js.undefined)
    }
  }
  
  trait Locale extends StObject {
    
    var amPM: js.Tuple2[String, String]
    
    var daysInMonth: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double]
    
    var firstDayOfWeek: Double
    
    var hourAriaLabel: String
    
    var minuteAriaLabel: String
    
    var monthAriaLabel: String
    
    var months: Shorthand
    
    def ordinal(nth: Double): String
    
    var rangeSeparator: String
    
    var scrollTitle: String
    
    var time_24hr: Boolean
    
    var toggleTitle: String
    
    var weekAbbreviation: String
    
    var weekdays: Longhand
    
    var yearAriaLabel: String
  }
  object Locale {
    
    @scala.inline
    def apply(
      amPM: js.Tuple2[String, String],
      daysInMonth: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double],
      firstDayOfWeek: Double,
      hourAriaLabel: String,
      minuteAriaLabel: String,
      monthAriaLabel: String,
      months: Shorthand,
      ordinal: Double => String,
      rangeSeparator: String,
      scrollTitle: String,
      time_24hr: Boolean,
      toggleTitle: String,
      weekAbbreviation: String,
      weekdays: Longhand,
      yearAriaLabel: String
    ): Locale = {
      val __obj = js.Dynamic.literal(amPM = amPM.asInstanceOf[js.Any], daysInMonth = daysInMonth.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], hourAriaLabel = hourAriaLabel.asInstanceOf[js.Any], minuteAriaLabel = minuteAriaLabel.asInstanceOf[js.Any], monthAriaLabel = monthAriaLabel.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], ordinal = js.Any.fromFunction1(ordinal), rangeSeparator = rangeSeparator.asInstanceOf[js.Any], scrollTitle = scrollTitle.asInstanceOf[js.Any], time_24hr = time_24hr.asInstanceOf[js.Any], toggleTitle = toggleTitle.asInstanceOf[js.Any], weekAbbreviation = weekAbbreviation.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any], yearAriaLabel = yearAriaLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmPM(value: js.Tuple2[String, String]): Self = StObject.set(x, "amPM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysInMonth(
        value: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double]
      ): Self = StObject.set(x, "daysInMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourAriaLabel(value: String): Self = StObject.set(x, "hourAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteAriaLabel(value: String): Self = StObject.set(x, "minuteAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthAriaLabel(value: String): Self = StObject.set(x, "monthAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonths(value: Shorthand): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrdinal(value: Double => String): Self = StObject.set(x, "ordinal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRangeSeparator(value: String): Self = StObject.set(x, "rangeSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollTitle(value: String): Self = StObject.set(x, "scrollTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime_24hr(value: Boolean): Self = StObject.set(x, "time_24hr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleTitle(value: String): Self = StObject.set(x, "toggleTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekAbbreviation(value: String): Self = StObject.set(x, "weekAbbreviation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdays(value: Longhand): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearAriaLabel(value: String): Self = StObject.set(x, "yearAriaLabel", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.flatpickr.flatpickrStrings.ar
    - typings.flatpickr.flatpickrStrings.at
    - typings.flatpickr.flatpickrStrings.az
    - typings.flatpickr.flatpickrStrings.be
    - typings.flatpickr.flatpickrStrings.bg
    - typings.flatpickr.flatpickrStrings.bn
    - typings.flatpickr.flatpickrStrings.bs
    - typings.flatpickr.flatpickrStrings.ca
    - typings.flatpickr.flatpickrStrings.cat
    - typings.flatpickr.flatpickrStrings.cs
    - typings.flatpickr.flatpickrStrings.cy
    - typings.flatpickr.flatpickrStrings.da
    - typings.flatpickr.flatpickrStrings.de
    - typings.flatpickr.flatpickrStrings.default
    - typings.flatpickr.flatpickrStrings.en
    - typings.flatpickr.flatpickrStrings.eo
    - typings.flatpickr.flatpickrStrings.es
    - typings.flatpickr.flatpickrStrings.et
    - typings.flatpickr.flatpickrStrings.fa
    - typings.flatpickr.flatpickrStrings.fi
    - typings.flatpickr.flatpickrStrings.fo
    - typings.flatpickr.flatpickrStrings.fr
    - typings.flatpickr.flatpickrStrings.gr
    - typings.flatpickr.flatpickrStrings.he
    - typings.flatpickr.flatpickrStrings.hi
    - typings.flatpickr.flatpickrStrings.hr
    - typings.flatpickr.flatpickrStrings.hu
    - typings.flatpickr.flatpickrStrings.id
    - typings.flatpickr.flatpickrStrings.is
    - typings.flatpickr.flatpickrStrings.it
    - typings.flatpickr.flatpickrStrings.ja
    - typings.flatpickr.flatpickrStrings.ka
    - typings.flatpickr.flatpickrStrings.ko
    - typings.flatpickr.flatpickrStrings.km
    - typings.flatpickr.flatpickrStrings.kz
    - typings.flatpickr.flatpickrStrings.lt
    - typings.flatpickr.flatpickrStrings.lv
    - typings.flatpickr.flatpickrStrings.mk
    - typings.flatpickr.flatpickrStrings.mn
    - typings.flatpickr.flatpickrStrings.ms
    - typings.flatpickr.flatpickrStrings.my
    - typings.flatpickr.flatpickrStrings.nl
    - typings.flatpickr.flatpickrStrings.no
    - typings.flatpickr.flatpickrStrings.pa
    - typings.flatpickr.flatpickrStrings.pl
    - typings.flatpickr.flatpickrStrings.pt
    - typings.flatpickr.flatpickrStrings.ro
    - typings.flatpickr.flatpickrStrings.ru
    - typings.flatpickr.flatpickrStrings.si
    - typings.flatpickr.flatpickrStrings.sk
    - typings.flatpickr.flatpickrStrings.sl
    - typings.flatpickr.flatpickrStrings.sq
    - typings.flatpickr.flatpickrStrings.sr
    - typings.flatpickr.flatpickrStrings.sv
    - typings.flatpickr.flatpickrStrings.th
    - typings.flatpickr.flatpickrStrings.tr
    - typings.flatpickr.flatpickrStrings.uk
    - typings.flatpickr.flatpickrStrings.vn
    - typings.flatpickr.flatpickrStrings.zh
    - typings.flatpickr.flatpickrStrings.uz
    - typings.flatpickr.flatpickrStrings.uz_latn
    - typings.flatpickr.flatpickrStrings.zh_tw
  */
  trait key extends StObject
  object key {
    
    @scala.inline
    def default: typings.flatpickr.flatpickrStrings.default = "default".asInstanceOf[typings.flatpickr.flatpickrStrings.default]
    
    @scala.inline
    def ar: typings.flatpickr.flatpickrStrings.ar = "ar".asInstanceOf[typings.flatpickr.flatpickrStrings.ar]
    
    @scala.inline
    def at: typings.flatpickr.flatpickrStrings.at = "at".asInstanceOf[typings.flatpickr.flatpickrStrings.at]
    
    @scala.inline
    def az: typings.flatpickr.flatpickrStrings.az = "az".asInstanceOf[typings.flatpickr.flatpickrStrings.az]
    
    @scala.inline
    def be: typings.flatpickr.flatpickrStrings.be = "be".asInstanceOf[typings.flatpickr.flatpickrStrings.be]
    
    @scala.inline
    def bg: typings.flatpickr.flatpickrStrings.bg = "bg".asInstanceOf[typings.flatpickr.flatpickrStrings.bg]
    
    @scala.inline
    def bn: typings.flatpickr.flatpickrStrings.bn = "bn".asInstanceOf[typings.flatpickr.flatpickrStrings.bn]
    
    @scala.inline
    def bs: typings.flatpickr.flatpickrStrings.bs = "bs".asInstanceOf[typings.flatpickr.flatpickrStrings.bs]
    
    @scala.inline
    def ca: typings.flatpickr.flatpickrStrings.ca = "ca".asInstanceOf[typings.flatpickr.flatpickrStrings.ca]
    
    @scala.inline
    def cat: typings.flatpickr.flatpickrStrings.cat = "cat".asInstanceOf[typings.flatpickr.flatpickrStrings.cat]
    
    @scala.inline
    def cs: typings.flatpickr.flatpickrStrings.cs = "cs".asInstanceOf[typings.flatpickr.flatpickrStrings.cs]
    
    @scala.inline
    def cy: typings.flatpickr.flatpickrStrings.cy = "cy".asInstanceOf[typings.flatpickr.flatpickrStrings.cy]
    
    @scala.inline
    def da: typings.flatpickr.flatpickrStrings.da = "da".asInstanceOf[typings.flatpickr.flatpickrStrings.da]
    
    @scala.inline
    def de: typings.flatpickr.flatpickrStrings.de = "de".asInstanceOf[typings.flatpickr.flatpickrStrings.de]
    
    @scala.inline
    def en: typings.flatpickr.flatpickrStrings.en = "en".asInstanceOf[typings.flatpickr.flatpickrStrings.en]
    
    @scala.inline
    def eo: typings.flatpickr.flatpickrStrings.eo = "eo".asInstanceOf[typings.flatpickr.flatpickrStrings.eo]
    
    @scala.inline
    def es: typings.flatpickr.flatpickrStrings.es = "es".asInstanceOf[typings.flatpickr.flatpickrStrings.es]
    
    @scala.inline
    def et: typings.flatpickr.flatpickrStrings.et = "et".asInstanceOf[typings.flatpickr.flatpickrStrings.et]
    
    @scala.inline
    def fa: typings.flatpickr.flatpickrStrings.fa = "fa".asInstanceOf[typings.flatpickr.flatpickrStrings.fa]
    
    @scala.inline
    def fi: typings.flatpickr.flatpickrStrings.fi = "fi".asInstanceOf[typings.flatpickr.flatpickrStrings.fi]
    
    @scala.inline
    def fo: typings.flatpickr.flatpickrStrings.fo = "fo".asInstanceOf[typings.flatpickr.flatpickrStrings.fo]
    
    @scala.inline
    def fr: typings.flatpickr.flatpickrStrings.fr = "fr".asInstanceOf[typings.flatpickr.flatpickrStrings.fr]
    
    @scala.inline
    def gr: typings.flatpickr.flatpickrStrings.gr = "gr".asInstanceOf[typings.flatpickr.flatpickrStrings.gr]
    
    @scala.inline
    def he: typings.flatpickr.flatpickrStrings.he = "he".asInstanceOf[typings.flatpickr.flatpickrStrings.he]
    
    @scala.inline
    def hi: typings.flatpickr.flatpickrStrings.hi = "hi".asInstanceOf[typings.flatpickr.flatpickrStrings.hi]
    
    @scala.inline
    def hr: typings.flatpickr.flatpickrStrings.hr = "hr".asInstanceOf[typings.flatpickr.flatpickrStrings.hr]
    
    @scala.inline
    def hu: typings.flatpickr.flatpickrStrings.hu = "hu".asInstanceOf[typings.flatpickr.flatpickrStrings.hu]
    
    @scala.inline
    def id: typings.flatpickr.flatpickrStrings.id = "id".asInstanceOf[typings.flatpickr.flatpickrStrings.id]
    
    @scala.inline
    def is: typings.flatpickr.flatpickrStrings.is = "is".asInstanceOf[typings.flatpickr.flatpickrStrings.is]
    
    @scala.inline
    def it: typings.flatpickr.flatpickrStrings.it = "it".asInstanceOf[typings.flatpickr.flatpickrStrings.it]
    
    @scala.inline
    def ja: typings.flatpickr.flatpickrStrings.ja = "ja".asInstanceOf[typings.flatpickr.flatpickrStrings.ja]
    
    @scala.inline
    def ka: typings.flatpickr.flatpickrStrings.ka = "ka".asInstanceOf[typings.flatpickr.flatpickrStrings.ka]
    
    @scala.inline
    def km: typings.flatpickr.flatpickrStrings.km = "km".asInstanceOf[typings.flatpickr.flatpickrStrings.km]
    
    @scala.inline
    def ko: typings.flatpickr.flatpickrStrings.ko = "ko".asInstanceOf[typings.flatpickr.flatpickrStrings.ko]
    
    @scala.inline
    def kz: typings.flatpickr.flatpickrStrings.kz = "kz".asInstanceOf[typings.flatpickr.flatpickrStrings.kz]
    
    @scala.inline
    def lt: typings.flatpickr.flatpickrStrings.lt = "lt".asInstanceOf[typings.flatpickr.flatpickrStrings.lt]
    
    @scala.inline
    def lv: typings.flatpickr.flatpickrStrings.lv = "lv".asInstanceOf[typings.flatpickr.flatpickrStrings.lv]
    
    @scala.inline
    def mk: typings.flatpickr.flatpickrStrings.mk = "mk".asInstanceOf[typings.flatpickr.flatpickrStrings.mk]
    
    @scala.inline
    def mn: typings.flatpickr.flatpickrStrings.mn = "mn".asInstanceOf[typings.flatpickr.flatpickrStrings.mn]
    
    @scala.inline
    def ms: typings.flatpickr.flatpickrStrings.ms = "ms".asInstanceOf[typings.flatpickr.flatpickrStrings.ms]
    
    @scala.inline
    def my: typings.flatpickr.flatpickrStrings.my = "my".asInstanceOf[typings.flatpickr.flatpickrStrings.my]
    
    @scala.inline
    def nl: typings.flatpickr.flatpickrStrings.nl = "nl".asInstanceOf[typings.flatpickr.flatpickrStrings.nl]
    
    @scala.inline
    def no: typings.flatpickr.flatpickrStrings.no = "no".asInstanceOf[typings.flatpickr.flatpickrStrings.no]
    
    @scala.inline
    def pa: typings.flatpickr.flatpickrStrings.pa = "pa".asInstanceOf[typings.flatpickr.flatpickrStrings.pa]
    
    @scala.inline
    def pl: typings.flatpickr.flatpickrStrings.pl = "pl".asInstanceOf[typings.flatpickr.flatpickrStrings.pl]
    
    @scala.inline
    def pt: typings.flatpickr.flatpickrStrings.pt = "pt".asInstanceOf[typings.flatpickr.flatpickrStrings.pt]
    
    @scala.inline
    def ro: typings.flatpickr.flatpickrStrings.ro = "ro".asInstanceOf[typings.flatpickr.flatpickrStrings.ro]
    
    @scala.inline
    def ru: typings.flatpickr.flatpickrStrings.ru = "ru".asInstanceOf[typings.flatpickr.flatpickrStrings.ru]
    
    @scala.inline
    def si: typings.flatpickr.flatpickrStrings.si = "si".asInstanceOf[typings.flatpickr.flatpickrStrings.si]
    
    @scala.inline
    def sk: typings.flatpickr.flatpickrStrings.sk = "sk".asInstanceOf[typings.flatpickr.flatpickrStrings.sk]
    
    @scala.inline
    def sl: typings.flatpickr.flatpickrStrings.sl = "sl".asInstanceOf[typings.flatpickr.flatpickrStrings.sl]
    
    @scala.inline
    def sq: typings.flatpickr.flatpickrStrings.sq = "sq".asInstanceOf[typings.flatpickr.flatpickrStrings.sq]
    
    @scala.inline
    def sr: typings.flatpickr.flatpickrStrings.sr = "sr".asInstanceOf[typings.flatpickr.flatpickrStrings.sr]
    
    @scala.inline
    def sv: typings.flatpickr.flatpickrStrings.sv = "sv".asInstanceOf[typings.flatpickr.flatpickrStrings.sv]
    
    @scala.inline
    def th: typings.flatpickr.flatpickrStrings.th = "th".asInstanceOf[typings.flatpickr.flatpickrStrings.th]
    
    @scala.inline
    def tr: typings.flatpickr.flatpickrStrings.tr = "tr".asInstanceOf[typings.flatpickr.flatpickrStrings.tr]
    
    @scala.inline
    def uk: typings.flatpickr.flatpickrStrings.uk = "uk".asInstanceOf[typings.flatpickr.flatpickrStrings.uk]
    
    @scala.inline
    def uz: typings.flatpickr.flatpickrStrings.uz = "uz".asInstanceOf[typings.flatpickr.flatpickrStrings.uz]
    
    @scala.inline
    def uz_latn: typings.flatpickr.flatpickrStrings.uz_latn = "uz_latn".asInstanceOf[typings.flatpickr.flatpickrStrings.uz_latn]
    
    @scala.inline
    def vn: typings.flatpickr.flatpickrStrings.vn = "vn".asInstanceOf[typings.flatpickr.flatpickrStrings.vn]
    
    @scala.inline
    def zh: typings.flatpickr.flatpickrStrings.zh = "zh".asInstanceOf[typings.flatpickr.flatpickrStrings.zh]
    
    @scala.inline
    def zh_tw: typings.flatpickr.flatpickrStrings.zh_tw = "zh_tw".asInstanceOf[typings.flatpickr.flatpickrStrings.zh_tw]
  }
}
