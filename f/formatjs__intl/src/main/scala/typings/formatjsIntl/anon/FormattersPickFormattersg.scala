package typings.formatjsIntl.anon

import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions
import typings.intlMessageformat.mod.IntlMessageFormat
import typings.std.ConstructorParameters
import typings.std.Intl.DateTimeFormat
import typings.std.Intl.NumberFormat
import typings.std.Intl.PluralRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined intl-messageformat.intl-messageformat.Formatters & std.Pick<@formatjs/intl.@formatjs/intl/src/types.Formatters, 'getMessageFormat'> */
@js.native
trait FormattersPickFormattersg extends StObject {
  
  def getDateTimeFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.DateTimeFormat> is not an array type */ args: ConstructorParameters[typings.intlMessageformat.anon.TypeofDateTimeFormat]
  ): DateTimeFormat = js.native
  
  def getMessageFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlMessageFormat> is not an array type */ args: ConstructorParameters[TypeofIntlMessageFormat]
  ): IntlMessageFormat = js.native
  @JSName("getMessageFormat")
  var getMessageFormat_Original: js.Function1[/* args */ ConstructorParameters[TypeofIntlMessageFormat], IntlMessageFormat] = js.native
  
  def getNumberFormat(): NumberFormat = js.native
  def getNumberFormat(locals: String): NumberFormat = js.native
  def getNumberFormat(locals: String, opts: NumberFormatOptions): NumberFormat = js.native
  def getNumberFormat(locals: js.Array[String]): NumberFormat = js.native
  def getNumberFormat(locals: js.Array[String], opts: NumberFormatOptions): NumberFormat = js.native
  def getNumberFormat(locals: Unit, opts: NumberFormatOptions): NumberFormat = js.native
  
  def getPluralRules(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.PluralRules> is not an array type */ args: ConstructorParameters[typings.intlMessageformat.anon.TypeofPluralRules]
  ): PluralRules = js.native
}
