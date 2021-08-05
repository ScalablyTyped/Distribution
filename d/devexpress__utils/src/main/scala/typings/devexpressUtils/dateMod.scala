package typings.devexpressUtils

import typings.devexpressUtils.optionsMod.IDateFormatterOptions
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMod {
  
  @JSImport("@devexpress/utils/lib/formatters/date", "DateFormatter")
  @js.native
  class DateFormatter protected () extends StObject {
    def this(options: IDateFormatterOptions) = this()
    
    /* private */ var applyMonth: js.Any = js.native
    
    /* private */ var catchNumbers: js.Any = js.native
    
    /* private */ var createDayMonthNameReplacePattern: js.Any = js.native
    
    /* private */ var createReplacePattern: js.Any = js.native
    
    /* private */ var currentParseNumber: js.Any = js.native
    
    /* private */ var date: js.Any = js.native
    
    /* private */ var dayMonthNameReplacePattern: js.Any = js.native
    
    /* private */ var findAbbrMonth: js.Any = js.native
    
    /* private */ var findFullMonth: js.Any = js.native
    
    /* private */ var findMonthCore: js.Any = js.native
    
    /* private */ var fixHours: js.Any = js.native
    
    def format(date: Date): String = js.native
    
    /* private */ var formatMs: js.Any = js.native
    
    /* private */ var getAmPmState: js.Any = js.native
    
    /* private */ var getDayMonthNameReplacePattern: js.Any = js.native
    
    /* private */ var hasAmPm: js.Any = js.native
    
    def hasDay(): Boolean = js.native
    
    def hasHours(): Boolean = js.native
    
    def hasMilliseconds(): Boolean = js.native
    
    def hasMinutes(): Boolean = js.native
    
    def hasMonth(): Boolean = js.native
    
    /* private */ var hasParserKey: js.Any = js.native
    
    def hasSeconds(): Boolean = js.native
    
    def hasYear(): Boolean = js.native
    
    /* private */ var isKnownSpecifier: js.Any = js.native
    
    /* private */ var isNumericSpecifier: js.Any = js.native
    
    /* private */ var isYearParsed: js.Any = js.native
    
    /* private */ val knownSpecifiers: js.Any = js.native
    
    /* private */ var mask: js.Any = js.native
    
    val options: IDateFormatterOptions = js.native
    
    /* private */ var padLeft: js.Any = js.native
    
    def parse(str: String, rememberParserKeys: Boolean): Date | Boolean = js.native
    
    /* private */ var parseAmPm: js.Any = js.native
    
    /* private */ var parseDay: js.Any = js.native
    
    /* private */ var parseDecInt: js.Any = js.native
    
    /* private */ var parseEra: js.Any = js.native
    
    /* private */ var parseHours: js.Any = js.native
    
    /* private */ var parseMinSecCore: js.Any = js.native
    
    /* private */ var parseMinutes: js.Any = js.native
    
    /* private */ var parseMonth: js.Any = js.native
    
    /* private */ var parseMs: js.Any = js.native
    
    /* private */ var parseNumbers: js.Any = js.native
    
    /* private */ var parseSeconds: js.Any = js.native
    
    /* private */ var parseYear: js.Any = js.native
    
    /* private */ var parsedMonth: js.Any = js.native
    
    /* private */ var parserKeys: js.Any = js.native
    
    /* private */ val parsers: js.Any = js.native
    
    /* private */ var popParseNumber: js.Any = js.native
    
    /* private */ var registerSpecifier: js.Any = js.native
    
    /* private */ var replaceAmPm: js.Any = js.native
    
    /* private */ var replaceDay: js.Any = js.native
    
    /* private */ var replaceEra: js.Any = js.native
    
    /* private */ var replaceHours12: js.Any = js.native
    
    /* private */ var replaceHours23: js.Any = js.native
    
    /* private */ var replaceMinutes: js.Any = js.native
    
    /* private */ var replaceMonth: js.Any = js.native
    
    /* private */ var replaceMs: js.Any = js.native
    
    /* private */ var replaceMsTrimmed: js.Any = js.native
    
    /* private */ var replaceSeconds: js.Any = js.native
    
    /* private */ var replaceYear: js.Any = js.native
    
    /* private */ val replacers: js.Any = js.native
    
    /* private */ var savedYear: js.Any = js.native
    
    def setFormatString(mask: String): Unit = js.native
    
    /* private */ var spPositions: js.Any = js.native
    
    /* private */ var specifiers: js.Any = js.native
    
    /* private */ var strToParse: js.Any = js.native
  }
  /* static members */
  object DateFormatter {
    
    @JSImport("@devexpress/utils/lib/formatters/date", "DateFormatter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def expandPredefinedFormat(format: String, options: IDateFormatterOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("expandPredefinedFormat")(format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
