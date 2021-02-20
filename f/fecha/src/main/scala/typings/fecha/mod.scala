package typings.fecha

import org.scalablytyped.runtime.StringDictionary
import typings.fecha.anon.PartialI18nSettings
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("fecha", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fecha", "default.defaultI18n")
    @js.native
    def defaultI18n: I18nSettings = js.native
    @scala.inline
    def defaultI18n_=(x: I18nSettings): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultI18n")(x.asInstanceOf[js.Any])
    
    @JSImport("fecha", "default.format")
    @js.native
    def format(dateObj: Date): String = js.native
    @JSImport("fecha", "default.format")
    @js.native
    def format(dateObj: Date, mask: js.UndefOr[scala.Nothing], i18n: PartialI18nSettings): String = js.native
    @JSImport("fecha", "default.format")
    @js.native
    def format(dateObj: Date, mask: String): String = js.native
    @JSImport("fecha", "default.format")
    @js.native
    def format(dateObj: Date, mask: String, i18n: PartialI18nSettings): String = js.native
    
    @JSImport("fecha", "default.parse")
    @js.native
    def parse: js.Function3[
        /* dateStr */ String, 
        /* format */ String, 
        /* i18n */ js.UndefOr[I18nSettingsOptional], 
        Date | Null
      ] = js.native
    @JSImport("fecha", "default.parse")
    @js.native
    def parse(dateStr: String, format: String): Date | Null = js.native
    @JSImport("fecha", "default.parse")
    @js.native
    def parse(dateStr: String, format: String, i18n: I18nSettingsOptional): Date | Null = js.native
    @scala.inline
    def parse_=(
      x: js.Function3[
          /* dateStr */ String, 
          /* format */ String, 
          /* i18n */ js.UndefOr[I18nSettingsOptional], 
          Date | Null
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("fecha", "default.setGlobalDateI18n")
    @js.native
    def setGlobalDateI18n(i18n: PartialI18nSettings): I18nSettings = js.native
    
    @JSImport("fecha", "default.setGlobalDateMasks")
    @js.native
    def setGlobalDateMasks(masks: StringDictionary[String]): StringDictionary[String] = js.native
  }
  
  @JSImport("fecha", "assign")
  @js.native
  def assign[A](a: A): A = js.native
  @JSImport("fecha", "assign")
  @js.native
  def assign[A, B](a: A, b: B): A with B = js.native
  @JSImport("fecha", "assign")
  @js.native
  def assign[A, B, C](a: A, b: B, c: C): A with B with C = js.native
  @JSImport("fecha", "assign")
  @js.native
  def assign[A, B, C, D](a: A, b: B, c: C, d: D): A with B with C with D = js.native
  
  @JSImport("fecha", "defaultI18n")
  @js.native
  val defaultI18n: I18nSettings = js.native
  
  /***
    * Format a date
    * @method format
    * @param {Date|number} dateObj
    * @param {string} mask Format of the date, i.e. 'mm-dd-yy' or 'shortDate'
    * @returns {string} Formatted date string
    */
  @JSImport("fecha", "format")
  @js.native
  def format(dateObj: Date): String = js.native
  @JSImport("fecha", "format")
  @js.native
  def format(dateObj: Date, mask: js.UndefOr[scala.Nothing], i18n: PartialI18nSettings): String = js.native
  @JSImport("fecha", "format")
  @js.native
  def format(dateObj: Date, mask: String): String = js.native
  @JSImport("fecha", "format")
  @js.native
  def format(dateObj: Date, mask: String, i18n: PartialI18nSettings): String = js.native
  
  /**
    * Parse a date string into a Javascript Date object /
    * @method parse
    * @param {string} dateStr Date string
    * @param {string} format Date parse format
    * @param {i18n} I18nSettingsOptional Full or subset of I18N settings
    * @returns {Date|null} Returns Date object. Returns null what date string is invalid or doesn't match format
    */
  @JSImport("fecha", "parse")
  @js.native
  def parse(dateStr: String, format: String): Date | Null = js.native
  @JSImport("fecha", "parse")
  @js.native
  def parse(dateStr: String, format: String, i18n: I18nSettingsOptional): Date | Null = js.native
  
  @JSImport("fecha", "setGlobalDateI18n")
  @js.native
  def setGlobalDateI18n(i18n: PartialI18nSettings): I18nSettings = js.native
  
  @JSImport("fecha", "setGlobalDateMasks")
  @js.native
  def setGlobalDateMasks(masks: StringDictionary[String]): StringDictionary[String] = js.native
  
  type Days = js.Tuple7[String, String, String, String, String, String, String]
  
  @js.native
  trait I18nSettings extends StObject {
    
    def DoFn(dayOfMonth: Double): String = js.native
    
    var amPm: js.Tuple2[String, String] = js.native
    
    var dayNames: Days = js.native
    
    var dayNamesShort: Days = js.native
    
    var monthNames: Months = js.native
    
    var monthNamesShort: Months = js.native
  }
  object I18nSettings {
    
    @scala.inline
    def apply(
      DoFn: Double => String,
      amPm: js.Tuple2[String, String],
      dayNames: Days,
      dayNamesShort: Days,
      monthNames: Months,
      monthNamesShort: Months
    ): I18nSettings = {
      val __obj = js.Dynamic.literal(DoFn = js.Any.fromFunction1(DoFn), amPm = amPm.asInstanceOf[js.Any], dayNames = dayNames.asInstanceOf[js.Any], dayNamesShort = dayNamesShort.asInstanceOf[js.Any], monthNames = monthNames.asInstanceOf[js.Any], monthNamesShort = monthNamesShort.asInstanceOf[js.Any])
      __obj.asInstanceOf[I18nSettings]
    }
    
    @scala.inline
    implicit class I18nSettingsMutableBuilder[Self <: I18nSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmPm(value: js.Tuple2[String, String]): Self = StObject.set(x, "amPm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayNames(value: Days): Self = StObject.set(x, "dayNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayNamesShort(value: Days): Self = StObject.set(x, "dayNamesShort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoFn(value: Double => String): Self = StObject.set(x, "DoFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMonthNames(value: Months): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthNamesShort(value: Months): Self = StObject.set(x, "monthNamesShort", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<fecha.fecha.I18nSettings> */
  @js.native
  trait I18nSettingsOptional extends StObject {
    
    var DoFn: js.UndefOr[js.Function1[/* dayOfMonth */ Double, String]] = js.native
    
    var amPm: js.UndefOr[js.Tuple2[String, String]] = js.native
    
    var dayNames: js.UndefOr[Days] = js.native
    
    var dayNamesShort: js.UndefOr[Days] = js.native
    
    var monthNames: js.UndefOr[Months] = js.native
    
    var monthNamesShort: js.UndefOr[Months] = js.native
  }
  object I18nSettingsOptional {
    
    @scala.inline
    def apply(): I18nSettingsOptional = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[I18nSettingsOptional]
    }
    
    @scala.inline
    implicit class I18nSettingsOptionalMutableBuilder[Self <: I18nSettingsOptional] (val x: Self) extends AnyVal {
      
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
  
  type Months = js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
}
