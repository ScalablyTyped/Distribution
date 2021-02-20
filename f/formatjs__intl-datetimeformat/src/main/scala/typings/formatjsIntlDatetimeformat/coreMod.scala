package typings.formatjsIntlDatetimeformat

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormatLocaleInternalData
import typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormatOptions
import typings.formatjsEcma402Abstract.typesDateTimeMod.UnpackedZoneData
import typings.formatjsIntlDatetimeformat.anon.PickDateTimeFormatOptions
import typings.formatjsIntlDatetimeformat.typesMod.PackedData
import typings.formatjsIntlDatetimeformat.typesMod.RawDateTimeLocaleData
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@formatjs/intl-datetimeformat/lib/src/core", "DateTimeFormat")
  @js.native
  class DateTimeFormat ()
    extends typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions) = this()
    def this(locales: String, options: DateTimeFormatOptions) = this()
    def this(locales: js.Array[String], options: DateTimeFormatOptions) = this()
  }
  @JSImport("@formatjs/intl-datetimeformat/lib/src/core", "DateTimeFormat")
  @js.native
  val DateTimeFormat: DateTimeFormatConstructor = js.native
  
  @js.native
  trait DateTimeFormatConstructor
    extends Instantiable0[typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat]
       with Instantiable1[
          (/* locales */ js.Array[String]) | (/* locales */ String), 
          typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat
        ]
       with Instantiable2[
          js.UndefOr[(/* locales */ js.Array[String]) | (/* locales */ String)], 
          /* options */ DateTimeFormatOptions, 
          typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat
        ] {
    
    def apply(): typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat = js.native
    def apply(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions): typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat = js.native
    def apply(locales: String): typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat = js.native
    def apply(locales: String, options: DateTimeFormatOptions): typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat = js.native
    def apply(locales: js.Array[String]): typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat = js.native
    def apply(locales: js.Array[String], options: DateTimeFormatOptions): typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat = js.native
    
    def __addLocaleData(data: RawDateTimeLocaleData*): Unit = js.native
    
    def __addTZData(d: PackedData): Unit = js.native
    
    var __defaultLocale: String = js.native
    
    var __defaultTimeZone: String = js.native
    
    def __setDefaultTimeZone(tz: String): Unit = js.native
    
    var availableLocales: Set[String] = js.native
    
    def getDefaultLocale(): String = js.native
    
    def getDefaultTimeZone(): String = js.native
    
    var localeData: Record[String, DateTimeFormatLocaleInternalData] = js.native
    
    var polyfilled: Boolean = js.native
    
    var relevantExtensionKeys: js.Array[String] = js.native
    
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: PickDateTimeFormatOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: PickDateTimeFormatOptions): js.Array[String] = js.native
    
    var tzData: Record[String, js.Array[UnpackedZoneData]] = js.native
  }
}
