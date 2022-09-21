package typings.devexpressUtils

import typings.devexpressUtils.optionsMod.IDateFormatterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMod {
  
  @JSImport("@devexpress/utils/lib/formatters/date", "DateFormatter")
  @js.native
  open class DateFormatter protected () extends StObject {
    def this(options: IDateFormatterOptions) = this()
    
    /* private */ var applyMonth: Any = js.native
    
    /* private */ var catchNumbers: Any = js.native
    
    /* private */ var createDayMonthNameReplacePattern: Any = js.native
    
    /* private */ var createReplacePattern: Any = js.native
    
    /* private */ var currentParseNumber: Any = js.native
    
    /* private */ var date: Any = js.native
    
    /* private */ var dayMonthNameReplacePattern: Any = js.native
    
    /* private */ var findAbbrMonth: Any = js.native
    
    /* private */ var findFullMonth: Any = js.native
    
    /* private */ var findMonthCore: Any = js.native
    
    /* private */ var fixHours: Any = js.native
    
    def format(date: js.Date): String = js.native
    
    /* private */ var formatMs: Any = js.native
    
    /* private */ var getAmPmState: Any = js.native
    
    /* private */ var getDayMonthNameReplacePattern: Any = js.native
    
    /* private */ var hasAmPm: Any = js.native
    
    def hasDay(): Boolean = js.native
    
    def hasHours(): Boolean = js.native
    
    def hasMilliseconds(): Boolean = js.native
    
    def hasMinutes(): Boolean = js.native
    
    def hasMonth(): Boolean = js.native
    
    /* private */ var hasParserKey: Any = js.native
    
    def hasSeconds(): Boolean = js.native
    
    def hasYear(): Boolean = js.native
    
    /* private */ var isKnownSpecifier: Any = js.native
    
    /* private */ var isNumericSpecifier: Any = js.native
    
    /* private */ var isYearParsed: Any = js.native
    
    /* private */ val knownSpecifiers: Any = js.native
    
    /* private */ var mask: Any = js.native
    
    val options: IDateFormatterOptions = js.native
    
    /* private */ var padLeft: Any = js.native
    
    def parse(str: String, rememberParserKeys: Boolean): js.Date | Boolean = js.native
    
    /* private */ var parseAmPm: Any = js.native
    
    /* private */ var parseDay: Any = js.native
    
    /* private */ var parseDecInt: Any = js.native
    
    /* private */ var parseEra: Any = js.native
    
    /* private */ var parseHours: Any = js.native
    
    /* private */ var parseMinSecCore: Any = js.native
    
    /* private */ var parseMinutes: Any = js.native
    
    /* private */ var parseMonth: Any = js.native
    
    /* private */ var parseMs: Any = js.native
    
    /* private */ var parseNumbers: Any = js.native
    
    /* private */ var parseSeconds: Any = js.native
    
    /* private */ var parseYear: Any = js.native
    
    /* private */ var parsedMonth: Any = js.native
    
    /* private */ var parserKeys: Any = js.native
    
    /* private */ val parsers: Any = js.native
    
    /* private */ var popParseNumber: Any = js.native
    
    /* private */ var registerSpecifier: Any = js.native
    
    /* private */ var replaceAmPm: Any = js.native
    
    /* private */ var replaceDay: Any = js.native
    
    /* private */ var replaceEra: Any = js.native
    
    /* private */ var replaceHours12: Any = js.native
    
    /* private */ var replaceHours23: Any = js.native
    
    /* private */ var replaceMinutes: Any = js.native
    
    /* private */ var replaceMonth: Any = js.native
    
    /* private */ var replaceMs: Any = js.native
    
    /* private */ var replaceMsTrimmed: Any = js.native
    
    /* private */ var replaceSeconds: Any = js.native
    
    /* private */ var replaceYear: Any = js.native
    
    /* private */ val replacers: Any = js.native
    
    /* private */ var savedYear: Any = js.native
    
    def setFormatString(mask: String): Unit = js.native
    
    /* private */ var spPositions: Any = js.native
    
    /* private */ var specifiers: Any = js.native
    
    /* private */ var strToParse: Any = js.native
  }
  /* static members */
  object DateFormatter {
    
    @JSImport("@devexpress/utils/lib/formatters/date", "DateFormatter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def expandPredefinedFormat(format: String, options: IDateFormatterOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("expandPredefinedFormat")(format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
