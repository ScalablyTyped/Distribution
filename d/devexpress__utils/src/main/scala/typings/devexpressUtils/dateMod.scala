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
    
    var applyMonth: js.Any = js.native
    
    var catchNumbers: js.Any = js.native
    
    var createDayMonthNameReplacePattern: js.Any = js.native
    
    var createReplacePattern: js.Any = js.native
    
    var currentParseNumber: js.Any = js.native
    
    var date: js.Any = js.native
    
    var dayMonthNameReplacePattern: js.Any = js.native
    
    var findAbbrMonth: js.Any = js.native
    
    var findFullMonth: js.Any = js.native
    
    var findMonthCore: js.Any = js.native
    
    var fixHours: js.Any = js.native
    
    def format(date: Date): String = js.native
    
    var formatMs: js.Any = js.native
    
    var getAmPmState: js.Any = js.native
    
    var getDayMonthNameReplacePattern: js.Any = js.native
    
    var hasAmPm: js.Any = js.native
    
    def hasDay(): Boolean = js.native
    
    def hasHours(): Boolean = js.native
    
    def hasMilliseconds(): Boolean = js.native
    
    def hasMinutes(): Boolean = js.native
    
    def hasMonth(): Boolean = js.native
    
    var hasParserKey: js.Any = js.native
    
    def hasSeconds(): Boolean = js.native
    
    def hasYear(): Boolean = js.native
    
    var isKnownSpecifier: js.Any = js.native
    
    var isNumericSpecifier: js.Any = js.native
    
    var isYearParsed: js.Any = js.native
    
    val knownSpecifiers: js.Any = js.native
    
    var mask: js.Any = js.native
    
    val options: IDateFormatterOptions = js.native
    
    var padLeft: js.Any = js.native
    
    def parse(str: String, rememberParserKeys: Boolean): Date | Boolean = js.native
    
    var parseAmPm: js.Any = js.native
    
    var parseDay: js.Any = js.native
    
    var parseDecInt: js.Any = js.native
    
    var parseEra: js.Any = js.native
    
    var parseHours: js.Any = js.native
    
    var parseMinSecCore: js.Any = js.native
    
    var parseMinutes: js.Any = js.native
    
    var parseMonth: js.Any = js.native
    
    var parseMs: js.Any = js.native
    
    var parseNumbers: js.Any = js.native
    
    var parseSeconds: js.Any = js.native
    
    var parseYear: js.Any = js.native
    
    var parsedMonth: js.Any = js.native
    
    var parserKeys: js.Any = js.native
    
    val parsers: js.Any = js.native
    
    var popParseNumber: js.Any = js.native
    
    var registerSpecifier: js.Any = js.native
    
    var replaceAmPm: js.Any = js.native
    
    var replaceDay: js.Any = js.native
    
    var replaceEra: js.Any = js.native
    
    var replaceHours12: js.Any = js.native
    
    var replaceHours23: js.Any = js.native
    
    var replaceMinutes: js.Any = js.native
    
    var replaceMonth: js.Any = js.native
    
    var replaceMs: js.Any = js.native
    
    var replaceMsTrimmed: js.Any = js.native
    
    var replaceSeconds: js.Any = js.native
    
    var replaceYear: js.Any = js.native
    
    val replacers: js.Any = js.native
    
    var savedYear: js.Any = js.native
    
    def setFormatString(mask: String): Unit = js.native
    
    var spPositions: js.Any = js.native
    
    var specifiers: js.Any = js.native
    
    var strToParse: js.Any = js.native
  }
  /* static members */
  object DateFormatter {
    
    @JSImport("@devexpress/utils/lib/formatters/date", "DateFormatter")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def expandPredefinedFormat(format: String, options: IDateFormatterOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("expandPredefinedFormat")(format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
