package typings.formatjsIntl.libSrcTypesMod

import typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions
import typings.formatjsIntl.anon.TypeofDateTimeFormat
import typings.formatjsIntl.anon.TypeofDisplayNames
import typings.formatjsIntl.anon.TypeofIntlListFormat
import typings.formatjsIntl.anon.TypeofIntlMessageFormat
import typings.formatjsIntl.anon.TypeofPluralRules
import typings.formatjsIntl.anon.TypeofRelativeTimeFormat
import typings.formatjsIntlDisplaynames.mod.DisplayNames
import typings.formatjsIntlListformat.mod.default
import typings.intlMessageformat.mod.IntlMessageFormat
import typings.std.ConstructorParameters
import typings.std.Intl.NumberFormat
import typings.std.Intl.PluralRules
import typings.std.Intl.RelativeTimeFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Formatters extends StObject {
  
  def getDateTimeFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.DateTimeFormat> is not an array type */ args: ConstructorParameters[TypeofDateTimeFormat]
  ): DateTimeFormat = js.native
  
  def getDisplayNames(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof DisplayNames> is not an array type */ args: ConstructorParameters[TypeofDisplayNames]
  ): DisplayNames = js.native
  
  def getListFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlListFormat> is not an array type */ args: ConstructorParameters[TypeofIntlListFormat]
  ): default = js.native
  
  def getMessageFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlMessageFormat> is not an array type */ args: ConstructorParameters[TypeofIntlMessageFormat]
  ): IntlMessageFormat = js.native
  
  def getNumberFormat(): NumberFormat = js.native
  def getNumberFormat(locales: String): NumberFormat = js.native
  def getNumberFormat(locales: String, opts: NumberFormatOptions): NumberFormat = js.native
  def getNumberFormat(locales: js.Array[String]): NumberFormat = js.native
  def getNumberFormat(locales: js.Array[String], opts: NumberFormatOptions): NumberFormat = js.native
  def getNumberFormat(locales: Unit, opts: NumberFormatOptions): NumberFormat = js.native
  
  def getPluralRules(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.PluralRules> is not an array type */ args: ConstructorParameters[TypeofPluralRules]
  ): PluralRules = js.native
  
  def getRelativeTimeFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.RelativeTimeFormat> is not an array type */ args: ConstructorParameters[TypeofRelativeTimeFormat]
  ): RelativeTimeFormat = js.native
}
