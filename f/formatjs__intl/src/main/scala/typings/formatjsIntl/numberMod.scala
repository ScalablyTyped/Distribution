package typings.formatjsIntl

import typings.formatjsIntl.anon.FormatsLocale
import typings.formatjsIntl.anon.TypeofNumberFormat
import typings.std.ConstructorParameters
import typings.std.Intl.NumberFormat
import typings.std.Intl.NumberFormatPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberMod {
  
  @JSImport("@formatjs/intl/lib/src/number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def formatNumber(
    config: FormatsLocale,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(config.asInstanceOf[js.Any], getNumberFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatNumber(
    config: FormatsLocale,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[1] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(config.asInstanceOf[js.Any], getNumberFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatNumberToParts(
    config: FormatsLocale,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any
  ): js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumberToParts")(config.asInstanceOf[js.Any], getNumberFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFormatPart]]
  @scala.inline
  def formatNumberToParts(
    config: FormatsLocale,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[1] */ js.Any
  ): js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumberToParts")(config.asInstanceOf[js.Any], getNumberFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFormatPart]]
  
  @scala.inline
  def getFormatter(
    hasLocaleFormatsOnError: FormatsLocale,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat]
  ): NumberFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatter")(hasLocaleFormatsOnError.asInstanceOf[js.Any], getNumberFormat.asInstanceOf[js.Any])).asInstanceOf[NumberFormat]
  @scala.inline
  def getFormatter(
    hasLocaleFormatsOnError: FormatsLocale,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[1] */ js.Any
  ): NumberFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatter")(hasLocaleFormatsOnError.asInstanceOf[js.Any], getNumberFormat.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NumberFormat]
}
