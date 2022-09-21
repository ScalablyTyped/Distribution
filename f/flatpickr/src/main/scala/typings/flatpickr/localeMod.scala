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
    
    var monthAriaLabel: js.UndefOr[String] = js.undefined
    
    var months: Longhand
    
    var ordinal: js.UndefOr[js.Function1[/* nth */ Double, String]] = js.undefined
    
    var rangeSeparator: js.UndefOr[String] = js.undefined
    
    var scrollTitle: js.UndefOr[String] = js.undefined
    
    var time_24hr: js.UndefOr[Boolean] = js.undefined
    
    var toggleTitle: js.UndefOr[String] = js.undefined
    
    var weekAbbreviation: js.UndefOr[String] = js.undefined
    
    var weekdays: Shorthand
    
    var yearAriaLabel: js.UndefOr[String] = js.undefined
  }
  object CustomLocale {
    
    inline def apply(months: Longhand, weekdays: Shorthand): CustomLocale = {
      val __obj = js.Dynamic.literal(months = months.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomLocale]
    }
    
    extension [Self <: CustomLocale](x: Self) {
      
      inline def setAmPM(value: js.Tuple2[String, String]): Self = StObject.set(x, "amPM", value.asInstanceOf[js.Any])
      
      inline def setAmPMUndefined: Self = StObject.set(x, "amPM", js.undefined)
      
      inline def setDaysInMonth(
        value: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double]
      ): Self = StObject.set(x, "daysInMonth", value.asInstanceOf[js.Any])
      
      inline def setDaysInMonthUndefined: Self = StObject.set(x, "daysInMonth", js.undefined)
      
      inline def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      inline def setHourAriaLabel(value: String): Self = StObject.set(x, "hourAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setHourAriaLabelUndefined: Self = StObject.set(x, "hourAriaLabel", js.undefined)
      
      inline def setMinuteAriaLabel(value: String): Self = StObject.set(x, "minuteAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMinuteAriaLabelUndefined: Self = StObject.set(x, "minuteAriaLabel", js.undefined)
      
      inline def setMonthAriaLabel(value: String): Self = StObject.set(x, "monthAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMonthAriaLabelUndefined: Self = StObject.set(x, "monthAriaLabel", js.undefined)
      
      inline def setMonths(value: Longhand): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setOrdinal(value: /* nth */ Double => String): Self = StObject.set(x, "ordinal", js.Any.fromFunction1(value))
      
      inline def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
      
      inline def setRangeSeparator(value: String): Self = StObject.set(x, "rangeSeparator", value.asInstanceOf[js.Any])
      
      inline def setRangeSeparatorUndefined: Self = StObject.set(x, "rangeSeparator", js.undefined)
      
      inline def setScrollTitle(value: String): Self = StObject.set(x, "scrollTitle", value.asInstanceOf[js.Any])
      
      inline def setScrollTitleUndefined: Self = StObject.set(x, "scrollTitle", js.undefined)
      
      inline def setTime_24hr(value: Boolean): Self = StObject.set(x, "time_24hr", value.asInstanceOf[js.Any])
      
      inline def setTime_24hrUndefined: Self = StObject.set(x, "time_24hr", js.undefined)
      
      inline def setToggleTitle(value: String): Self = StObject.set(x, "toggleTitle", value.asInstanceOf[js.Any])
      
      inline def setToggleTitleUndefined: Self = StObject.set(x, "toggleTitle", js.undefined)
      
      inline def setWeekAbbreviation(value: String): Self = StObject.set(x, "weekAbbreviation", value.asInstanceOf[js.Any])
      
      inline def setWeekAbbreviationUndefined: Self = StObject.set(x, "weekAbbreviation", js.undefined)
      
      inline def setWeekdays(value: Shorthand): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
      
      inline def setYearAriaLabel(value: String): Self = StObject.set(x, "yearAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setYearAriaLabelUndefined: Self = StObject.set(x, "yearAriaLabel", js.undefined)
    }
  }
  
  trait Locale extends StObject {
    
    var amPM: js.Tuple2[String, String]
    
    var daysInMonth: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double]
    
    var firstDayOfWeek: Double
    
    var hourAriaLabel: String
    
    var minuteAriaLabel: String
    
    var monthAriaLabel: String
    
    var months: Longhand
    
    def ordinal(nth: Double): String
    
    var rangeSeparator: String
    
    var scrollTitle: String
    
    var time_24hr: Boolean
    
    var toggleTitle: String
    
    var weekAbbreviation: String
    
    var weekdays: Shorthand
    
    var yearAriaLabel: String
  }
  object Locale {
    
    inline def apply(
      amPM: js.Tuple2[String, String],
      daysInMonth: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double],
      firstDayOfWeek: Double,
      hourAriaLabel: String,
      minuteAriaLabel: String,
      monthAriaLabel: String,
      months: Longhand,
      ordinal: Double => String,
      rangeSeparator: String,
      scrollTitle: String,
      time_24hr: Boolean,
      toggleTitle: String,
      weekAbbreviation: String,
      weekdays: Shorthand,
      yearAriaLabel: String
    ): Locale = {
      val __obj = js.Dynamic.literal(amPM = amPM.asInstanceOf[js.Any], daysInMonth = daysInMonth.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], hourAriaLabel = hourAriaLabel.asInstanceOf[js.Any], minuteAriaLabel = minuteAriaLabel.asInstanceOf[js.Any], monthAriaLabel = monthAriaLabel.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], ordinal = js.Any.fromFunction1(ordinal), rangeSeparator = rangeSeparator.asInstanceOf[js.Any], scrollTitle = scrollTitle.asInstanceOf[js.Any], time_24hr = time_24hr.asInstanceOf[js.Any], toggleTitle = toggleTitle.asInstanceOf[js.Any], weekAbbreviation = weekAbbreviation.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any], yearAriaLabel = yearAriaLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    extension [Self <: Locale](x: Self) {
      
      inline def setAmPM(value: js.Tuple2[String, String]): Self = StObject.set(x, "amPM", value.asInstanceOf[js.Any])
      
      inline def setDaysInMonth(
        value: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double]
      ): Self = StObject.set(x, "daysInMonth", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setHourAriaLabel(value: String): Self = StObject.set(x, "hourAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMinuteAriaLabel(value: String): Self = StObject.set(x, "minuteAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMonthAriaLabel(value: String): Self = StObject.set(x, "monthAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMonths(value: Longhand): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setOrdinal(value: Double => String): Self = StObject.set(x, "ordinal", js.Any.fromFunction1(value))
      
      inline def setRangeSeparator(value: String): Self = StObject.set(x, "rangeSeparator", value.asInstanceOf[js.Any])
      
      inline def setScrollTitle(value: String): Self = StObject.set(x, "scrollTitle", value.asInstanceOf[js.Any])
      
      inline def setTime_24hr(value: Boolean): Self = StObject.set(x, "time_24hr", value.asInstanceOf[js.Any])
      
      inline def setToggleTitle(value: String): Self = StObject.set(x, "toggleTitle", value.asInstanceOf[js.Any])
      
      inline def setWeekAbbreviation(value: String): Self = StObject.set(x, "weekAbbreviation", value.asInstanceOf[js.Any])
      
      inline def setWeekdays(value: Shorthand): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
      
      inline def setYearAriaLabel(value: String): Self = StObject.set(x, "yearAriaLabel", value.asInstanceOf[js.Any])
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
    - typings.flatpickr.flatpickrStrings.ckb
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
    - typings.flatpickr.flatpickrStrings.hy
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
    - typings.flatpickr.flatpickrStrings.nn
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
    
    inline def default: typings.flatpickr.flatpickrStrings.default = "default".asInstanceOf[typings.flatpickr.flatpickrStrings.default]
    
    inline def ar: typings.flatpickr.flatpickrStrings.ar = "ar".asInstanceOf[typings.flatpickr.flatpickrStrings.ar]
    
    inline def at: typings.flatpickr.flatpickrStrings.at = "at".asInstanceOf[typings.flatpickr.flatpickrStrings.at]
    
    inline def az: typings.flatpickr.flatpickrStrings.az = "az".asInstanceOf[typings.flatpickr.flatpickrStrings.az]
    
    inline def be: typings.flatpickr.flatpickrStrings.be = "be".asInstanceOf[typings.flatpickr.flatpickrStrings.be]
    
    inline def bg: typings.flatpickr.flatpickrStrings.bg = "bg".asInstanceOf[typings.flatpickr.flatpickrStrings.bg]
    
    inline def bn: typings.flatpickr.flatpickrStrings.bn = "bn".asInstanceOf[typings.flatpickr.flatpickrStrings.bn]
    
    inline def bs: typings.flatpickr.flatpickrStrings.bs = "bs".asInstanceOf[typings.flatpickr.flatpickrStrings.bs]
    
    inline def ca: typings.flatpickr.flatpickrStrings.ca = "ca".asInstanceOf[typings.flatpickr.flatpickrStrings.ca]
    
    inline def cat: typings.flatpickr.flatpickrStrings.cat = "cat".asInstanceOf[typings.flatpickr.flatpickrStrings.cat]
    
    inline def ckb: typings.flatpickr.flatpickrStrings.ckb = "ckb".asInstanceOf[typings.flatpickr.flatpickrStrings.ckb]
    
    inline def cs: typings.flatpickr.flatpickrStrings.cs = "cs".asInstanceOf[typings.flatpickr.flatpickrStrings.cs]
    
    inline def cy: typings.flatpickr.flatpickrStrings.cy = "cy".asInstanceOf[typings.flatpickr.flatpickrStrings.cy]
    
    inline def da: typings.flatpickr.flatpickrStrings.da = "da".asInstanceOf[typings.flatpickr.flatpickrStrings.da]
    
    inline def de: typings.flatpickr.flatpickrStrings.de = "de".asInstanceOf[typings.flatpickr.flatpickrStrings.de]
    
    inline def en: typings.flatpickr.flatpickrStrings.en = "en".asInstanceOf[typings.flatpickr.flatpickrStrings.en]
    
    inline def eo: typings.flatpickr.flatpickrStrings.eo = "eo".asInstanceOf[typings.flatpickr.flatpickrStrings.eo]
    
    inline def es: typings.flatpickr.flatpickrStrings.es = "es".asInstanceOf[typings.flatpickr.flatpickrStrings.es]
    
    inline def et: typings.flatpickr.flatpickrStrings.et = "et".asInstanceOf[typings.flatpickr.flatpickrStrings.et]
    
    inline def fa: typings.flatpickr.flatpickrStrings.fa = "fa".asInstanceOf[typings.flatpickr.flatpickrStrings.fa]
    
    inline def fi: typings.flatpickr.flatpickrStrings.fi = "fi".asInstanceOf[typings.flatpickr.flatpickrStrings.fi]
    
    inline def fo: typings.flatpickr.flatpickrStrings.fo = "fo".asInstanceOf[typings.flatpickr.flatpickrStrings.fo]
    
    inline def fr: typings.flatpickr.flatpickrStrings.fr = "fr".asInstanceOf[typings.flatpickr.flatpickrStrings.fr]
    
    inline def gr: typings.flatpickr.flatpickrStrings.gr = "gr".asInstanceOf[typings.flatpickr.flatpickrStrings.gr]
    
    inline def he: typings.flatpickr.flatpickrStrings.he = "he".asInstanceOf[typings.flatpickr.flatpickrStrings.he]
    
    inline def hi: typings.flatpickr.flatpickrStrings.hi = "hi".asInstanceOf[typings.flatpickr.flatpickrStrings.hi]
    
    inline def hr: typings.flatpickr.flatpickrStrings.hr = "hr".asInstanceOf[typings.flatpickr.flatpickrStrings.hr]
    
    inline def hu: typings.flatpickr.flatpickrStrings.hu = "hu".asInstanceOf[typings.flatpickr.flatpickrStrings.hu]
    
    inline def hy: typings.flatpickr.flatpickrStrings.hy = "hy".asInstanceOf[typings.flatpickr.flatpickrStrings.hy]
    
    inline def id: typings.flatpickr.flatpickrStrings.id = "id".asInstanceOf[typings.flatpickr.flatpickrStrings.id]
    
    inline def is: typings.flatpickr.flatpickrStrings.is = "is".asInstanceOf[typings.flatpickr.flatpickrStrings.is]
    
    inline def it: typings.flatpickr.flatpickrStrings.it = "it".asInstanceOf[typings.flatpickr.flatpickrStrings.it]
    
    inline def ja: typings.flatpickr.flatpickrStrings.ja = "ja".asInstanceOf[typings.flatpickr.flatpickrStrings.ja]
    
    inline def ka: typings.flatpickr.flatpickrStrings.ka = "ka".asInstanceOf[typings.flatpickr.flatpickrStrings.ka]
    
    inline def km: typings.flatpickr.flatpickrStrings.km = "km".asInstanceOf[typings.flatpickr.flatpickrStrings.km]
    
    inline def ko: typings.flatpickr.flatpickrStrings.ko = "ko".asInstanceOf[typings.flatpickr.flatpickrStrings.ko]
    
    inline def kz: typings.flatpickr.flatpickrStrings.kz = "kz".asInstanceOf[typings.flatpickr.flatpickrStrings.kz]
    
    inline def lt: typings.flatpickr.flatpickrStrings.lt = "lt".asInstanceOf[typings.flatpickr.flatpickrStrings.lt]
    
    inline def lv: typings.flatpickr.flatpickrStrings.lv = "lv".asInstanceOf[typings.flatpickr.flatpickrStrings.lv]
    
    inline def mk: typings.flatpickr.flatpickrStrings.mk = "mk".asInstanceOf[typings.flatpickr.flatpickrStrings.mk]
    
    inline def mn: typings.flatpickr.flatpickrStrings.mn = "mn".asInstanceOf[typings.flatpickr.flatpickrStrings.mn]
    
    inline def ms: typings.flatpickr.flatpickrStrings.ms = "ms".asInstanceOf[typings.flatpickr.flatpickrStrings.ms]
    
    inline def my: typings.flatpickr.flatpickrStrings.my = "my".asInstanceOf[typings.flatpickr.flatpickrStrings.my]
    
    inline def nl: typings.flatpickr.flatpickrStrings.nl = "nl".asInstanceOf[typings.flatpickr.flatpickrStrings.nl]
    
    inline def nn: typings.flatpickr.flatpickrStrings.nn = "nn".asInstanceOf[typings.flatpickr.flatpickrStrings.nn]
    
    inline def no: typings.flatpickr.flatpickrStrings.no = "no".asInstanceOf[typings.flatpickr.flatpickrStrings.no]
    
    inline def pa: typings.flatpickr.flatpickrStrings.pa = "pa".asInstanceOf[typings.flatpickr.flatpickrStrings.pa]
    
    inline def pl: typings.flatpickr.flatpickrStrings.pl = "pl".asInstanceOf[typings.flatpickr.flatpickrStrings.pl]
    
    inline def pt: typings.flatpickr.flatpickrStrings.pt = "pt".asInstanceOf[typings.flatpickr.flatpickrStrings.pt]
    
    inline def ro: typings.flatpickr.flatpickrStrings.ro = "ro".asInstanceOf[typings.flatpickr.flatpickrStrings.ro]
    
    inline def ru: typings.flatpickr.flatpickrStrings.ru = "ru".asInstanceOf[typings.flatpickr.flatpickrStrings.ru]
    
    inline def si: typings.flatpickr.flatpickrStrings.si = "si".asInstanceOf[typings.flatpickr.flatpickrStrings.si]
    
    inline def sk: typings.flatpickr.flatpickrStrings.sk = "sk".asInstanceOf[typings.flatpickr.flatpickrStrings.sk]
    
    inline def sl: typings.flatpickr.flatpickrStrings.sl = "sl".asInstanceOf[typings.flatpickr.flatpickrStrings.sl]
    
    inline def sq: typings.flatpickr.flatpickrStrings.sq = "sq".asInstanceOf[typings.flatpickr.flatpickrStrings.sq]
    
    inline def sr: typings.flatpickr.flatpickrStrings.sr = "sr".asInstanceOf[typings.flatpickr.flatpickrStrings.sr]
    
    inline def sv: typings.flatpickr.flatpickrStrings.sv = "sv".asInstanceOf[typings.flatpickr.flatpickrStrings.sv]
    
    inline def th: typings.flatpickr.flatpickrStrings.th = "th".asInstanceOf[typings.flatpickr.flatpickrStrings.th]
    
    inline def tr: typings.flatpickr.flatpickrStrings.tr = "tr".asInstanceOf[typings.flatpickr.flatpickrStrings.tr]
    
    inline def uk: typings.flatpickr.flatpickrStrings.uk = "uk".asInstanceOf[typings.flatpickr.flatpickrStrings.uk]
    
    inline def uz: typings.flatpickr.flatpickrStrings.uz = "uz".asInstanceOf[typings.flatpickr.flatpickrStrings.uz]
    
    inline def uz_latn: typings.flatpickr.flatpickrStrings.uz_latn = "uz_latn".asInstanceOf[typings.flatpickr.flatpickrStrings.uz_latn]
    
    inline def vn: typings.flatpickr.flatpickrStrings.vn = "vn".asInstanceOf[typings.flatpickr.flatpickrStrings.vn]
    
    inline def zh: typings.flatpickr.flatpickrStrings.zh = "zh".asInstanceOf[typings.flatpickr.flatpickrStrings.zh]
    
    inline def zh_tw: typings.flatpickr.flatpickrStrings.zh_tw = "zh_tw".asInstanceOf[typings.flatpickr.flatpickrStrings.zh_tw]
  }
}
