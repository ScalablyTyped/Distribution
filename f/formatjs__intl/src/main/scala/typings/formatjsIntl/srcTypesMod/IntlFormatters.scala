package typings.formatjsIntl.srcTypesMod

import typings.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typings.intlMessageformat.srcFormattersMod.PrimitiveType
import typings.std.Intl.DateTimeFormatPart
import typings.std.Intl.LDMLPluralRule
import typings.std.Intl.NumberFormatPart
import typings.std.Record
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntlFormatters[T, R] extends js.Object {
  
  def formatDate(value: String): String = js.native
  def formatDate(value: String, opts: FormatDateOptions): String = js.native
  
  def formatDateTimeRange(
    from: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallStartDateEndDate>[0] */ js.Any,
    to: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallStartDateEndDate>[1] */ js.Any
  ): String = js.native
  def formatDateTimeRange(
    from: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallStartDateEndDate>[0] */ js.Any,
    to: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallStartDateEndDate>[1] */ js.Any,
    opts: FormatDateOptions
  ): String = js.native
  
  def formatDateToParts(value: String): js.Array[DateTimeFormatPart] = js.native
  def formatDateToParts(value: String, opts: FormatDateOptions): js.Array[DateTimeFormatPart] = js.native
  @JSName("formatDateToParts")
  def formatDateToParts_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallDate>[0] */ js.Any
  ): js.Array[DateTimeFormatPart] = js.native
  @JSName("formatDateToParts")
  def formatDateToParts_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallDate>[0] */ js.Any,
    opts: FormatDateOptions
  ): js.Array[DateTimeFormatPart] = js.native
  
  @JSName("formatDate")
  def formatDate_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallDate>[0] */ js.Any
  ): String = js.native
  @JSName("formatDate")
  def formatDate_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallDate>[0] */ js.Any,
    opts: FormatDateOptions
  ): String = js.native
  
  @JSName("formatDisplayName")
  def formatDisplayName_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallCode>[0] */ js.Any,
    opts: FormatDisplayNameOptions
  ): js.UndefOr[String] = js.native
  
  def formatList(values: js.Array[String]): String = js.native
  def formatList(values: js.Array[String], opts: FormatListOptions): String = js.native
  @JSName("formatList")
  def formatList_Union(values: js.Array[String | T]): T | String | (js.Array[String | T]) = js.native
  @JSName("formatList")
  def formatList_Union(values: js.Array[String | T], opts: FormatListOptions): T | String | (js.Array[String | T]) = js.native
  
  def formatMessage(descriptor: MessageDescriptor): String = js.native
  def formatMessage(
    descriptor: MessageDescriptor,
    values: Record[String, PrimitiveType | (FormatXMLElementFn[String, String])]
  ): String = js.native
  @JSName("formatMessage")
  def formatMessage_R(descriptor: MessageDescriptor): R = js.native
  @JSName("formatMessage")
  def formatMessage_R(
    descriptor: MessageDescriptor,
    values: Record[String, PrimitiveType | T | (FormatXMLElementFn[T, R])]
  ): R = js.native
  
  @JSName("formatNumberToParts")
  def formatNumberToParts_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallValue>[0] */ js.Any
  ): js.Array[NumberFormatPart] = js.native
  @JSName("formatNumberToParts")
  def formatNumberToParts_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallValue>[0] */ js.Any,
    opts: FormatNumberOptions
  ): js.Array[NumberFormatPart] = js.native
  
  @JSName("formatNumber")
  def formatNumber_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallValue>[0] */ js.Any
  ): String = js.native
  @JSName("formatNumber")
  def formatNumber_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallValue>[0] */ js.Any,
    opts: FormatNumberOptions
  ): String = js.native
  
  @JSName("formatPlural")
  def formatPlural_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(n : number): std.Intl.LDMLPluralRule>[0] */ js.Any
  ): ReturnType[js.Function1[/* n */ Double, LDMLPluralRule]] = js.native
  @JSName("formatPlural")
  def formatPlural_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(n : number): std.Intl.LDMLPluralRule>[0] */ js.Any,
    opts: FormatPluralOptions
  ): ReturnType[js.Function1[/* n */ Double, LDMLPluralRule]] = js.native
  
  def formatRelativeTime(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : number, unit : @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/relative-time.RelativeTimeFormattableUnit): string>[0] */ js.Any,
    unit: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : number, unit : @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/relative-time.RelativeTimeFormattableUnit): string>[1] */ js.Any
  ): String = js.native
  def formatRelativeTime(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : number, unit : @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/relative-time.RelativeTimeFormattableUnit): string>[0] */ js.Any,
    unit: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : number, unit : @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/relative-time.RelativeTimeFormattableUnit): string>[1] */ js.Any,
    opts: FormatRelativeTimeOptions
  ): String = js.native
  @JSName("formatRelativeTime")
  def formatRelativeTime_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : number, unit : @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/relative-time.RelativeTimeFormattableUnit): string>[0] */ js.Any
  ): String = js.native
  @JSName("formatRelativeTime")
  def formatRelativeTime_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : number, unit : @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/relative-time.RelativeTimeFormattableUnit): string>[0] */ js.Any,
    unit: js.UndefOr[scala.Nothing],
    opts: FormatRelativeTimeOptions
  ): String = js.native
  
  def formatTime(value: String): String = js.native
  def formatTime(value: String, opts: FormatDateOptions): String = js.native
  
  def formatTimeToParts(value: String): js.Array[DateTimeFormatPart] = js.native
  def formatTimeToParts(value: String, opts: FormatDateOptions): js.Array[DateTimeFormatPart] = js.native
  @JSName("formatTimeToParts")
  def formatTimeToParts_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallDate>[0] */ js.Any
  ): js.Array[DateTimeFormatPart] = js.native
  @JSName("formatTimeToParts")
  def formatTimeToParts_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallDate>[0] */ js.Any,
    opts: FormatDateOptions
  ): js.Array[DateTimeFormatPart] = js.native
  
  @JSName("formatTime")
  def formatTime_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallDate>[0] */ js.Any
  ): String = js.native
  @JSName("formatTime")
  def formatTime_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallDate>[0] */ js.Any,
    opts: FormatDateOptions
  ): String = js.native
}
