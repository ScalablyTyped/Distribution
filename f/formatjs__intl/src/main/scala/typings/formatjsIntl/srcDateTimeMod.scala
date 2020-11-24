package typings.formatjsIntl

import typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat
import typings.formatjsIntl.anon.Call
import typings.formatjsIntl.anon.Formats
import typings.formatjsIntl.anon.LocaleOnErrorTimeZone
import typings.formatjsIntl.formatjsIntlStrings.date
import typings.formatjsIntl.formatjsIntlStrings.time
import typings.formatjsIntl.srcTypesMod.FormatDateOptions
import typings.std.ConstructorParameters
import typings.std.Intl.DateTimeFormatPart
import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/intl/src/dateTime", JSImport.Namespace)
@js.native
object srcDateTimeMod extends js.Object {
  
  def formatDate(
    config: Formats,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Call], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasValueOptions because its type Parameters<IntlFormatters['formatDate']> is not an array type */ hasValueOptions: Parameters[
      js.Function2[
        /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Intl.DateTimeFormat['format']>[0] */ js.Any) | String, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        String
      ]
    ]
  ): String = js.native
  
  def formatDateTimeRange(
    config: LocaleOnErrorTimeZone,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Call], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasFromToOptions because its type Parameters<IntlFormatters['formatDateTimeRange']> is not an array type */ hasFromToOptions: Parameters[
      js.Function3[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/date-time.DateTimeFormat['formatRange']>[0] */ /* from */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/date-time.DateTimeFormat['formatRange']>[1] */ /* to */ js.Any, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        String
      ]
    ]
  ): String = js.native
  
  def formatDateToParts(
    config: Formats,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Call], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasValueOptions because its type Parameters<IntlFormatters['formatDate']> is not an array type */ hasValueOptions: Parameters[
      js.Function2[
        /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Intl.DateTimeFormat['format']>[0] */ js.Any) | String, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        String
      ]
    ]
  ): js.Array[DateTimeFormatPart] = js.native
  
  def formatTime(
    config: Formats,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Call], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasValueOptions because its type Parameters<IntlFormatters['formatTime']> is not an array type */ hasValueOptions: Parameters[
      js.Function2[
        /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Intl.DateTimeFormat['format']>[0] */ js.Any) | String, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        String
      ]
    ]
  ): String = js.native
  
  def formatTimeToParts(
    config: Formats,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Call], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasValueOptions because its type Parameters<IntlFormatters['formatTimeToParts']> is not an array type */ hasValueOptions: Parameters[
      js.Function2[
        /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Intl.DateTimeFormat['format']>[0] */ js.Any) | String, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        js.Array[DateTimeFormatPart]
      ]
    ]
  ): js.Array[DateTimeFormatPart] = js.native
  
  def getFormatter(
    hasLocaleFormatsOnErrorTimeZone: Formats,
    `type`: date,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Call], DateTimeFormat],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts : @formatjs/intl.@formatjs/intl/src/types.FormatDateOptions | undefined): string>[1] */ js.Any
  ): DateTimeFormat = js.native
  def getFormatter(
    hasLocaleFormatsOnErrorTimeZone: Formats,
    `type`: time,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Call], DateTimeFormat],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts : @formatjs/intl.@formatjs/intl/src/types.FormatDateOptions | undefined): string>[1] */ js.Any
  ): DateTimeFormat = js.native
  @JSName("getFormatter")
  def getFormatter_date(
    hasLocaleFormatsOnErrorTimeZone: Formats,
    `type`: date,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Call], DateTimeFormat]
  ): DateTimeFormat = js.native
  @JSName("getFormatter")
  def getFormatter_time(
    hasLocaleFormatsOnErrorTimeZone: Formats,
    `type`: time,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Call], DateTimeFormat]
  ): DateTimeFormat = js.native
}
