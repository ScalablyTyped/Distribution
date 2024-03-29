package typings.formatjsIntl

import typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat
import typings.formatjsIntl.anon.OnErrorTimeZone
import typings.formatjsIntl.anon.TimeZone
import typings.formatjsIntl.anon.TypeofDateTimeFormat
import typings.formatjsIntl.formatjsIntlStrings.date
import typings.formatjsIntl.formatjsIntlStrings.time
import typings.formatjsIntl.libSrcTypesMod.FormatDateOptions
import typings.std.ConstructorParameters
import typings.std.Intl.DateTimeFormatPart
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcDateTimeMod {
  
  @JSImport("@formatjs/intl/lib/src/dateTime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatDate(
    config: TimeZone,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofDateTimeFormat], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param <destructured> because its type Parameters<IntlFormatters['formatDate']> is not an array type */ param2: Parameters[
      js.Function2[
        /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Intl.DateTimeFormat['format']>[0] */ js.Any) | String, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        String
      ]
    ]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(config.asInstanceOf[js.Any], getDateTimeFormat.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatDateTimeRange(
    config: OnErrorTimeZone,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofDateTimeFormat], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param <destructured> because its type Parameters<IntlFormatters['formatDateTimeRange']> is not an array type */ param2: Parameters[
      js.Function3[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/date-time.DateTimeFormat['formatRange']>[0] */ /* from */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/date-time.DateTimeFormat['formatRange']>[1] */ /* to */ js.Any, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        String
      ]
    ]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDateTimeRange")(config.asInstanceOf[js.Any], getDateTimeFormat.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatDateToParts(
    config: TimeZone,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofDateTimeFormat], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param <destructured> because its type Parameters<IntlFormatters['formatDate']> is not an array type */ param2: Parameters[
      js.Function2[
        /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Intl.DateTimeFormat['format']>[0] */ js.Any) | String, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        String
      ]
    ]
  ): js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDateToParts")(config.asInstanceOf[js.Any], getDateTimeFormat.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Array[DateTimeFormatPart]]
  
  inline def formatTime(
    config: TimeZone,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofDateTimeFormat], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param <destructured> because its type Parameters<IntlFormatters['formatTime']> is not an array type */ param2: Parameters[
      js.Function2[
        /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Intl.DateTimeFormat['format']>[0] */ js.Any) | String, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        String
      ]
    ]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTime")(config.asInstanceOf[js.Any], getDateTimeFormat.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatTimeToParts(
    config: TimeZone,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofDateTimeFormat], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param <destructured> because its type Parameters<IntlFormatters['formatTimeToParts']> is not an array type */ param2: Parameters[
      js.Function2[
        /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Intl.DateTimeFormat['format']>[0] */ js.Any) | String, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        js.Array[DateTimeFormatPart]
      ]
    ]
  ): js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTimeToParts")(config.asInstanceOf[js.Any], getDateTimeFormat.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Array[DateTimeFormatPart]]
  
  inline def getFormatter(
    param0: TimeZone,
    `type`: date | time,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofDateTimeFormat], DateTimeFormat]
  ): DateTimeFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatter")(param0.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], getDateTimeFormat.asInstanceOf[js.Any])).asInstanceOf[DateTimeFormat]
  inline def getFormatter(
    param0: TimeZone,
    `type`: date | time,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofDateTimeFormat], DateTimeFormat],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatDateOptions | undefined): string>[1] */ js.Any
  ): DateTimeFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatter")(param0.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], getDateTimeFormat.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DateTimeFormat]
}
