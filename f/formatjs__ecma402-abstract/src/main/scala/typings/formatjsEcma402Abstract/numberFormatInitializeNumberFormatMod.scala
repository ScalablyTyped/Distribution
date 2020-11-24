package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.GetDefaultLocale
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions
import typings.std.Intl.NumberFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/ecma402-abstract/NumberFormat/InitializeNumberFormat", JSImport.Namespace)
@js.native
object numberFormatInitializeNumberFormatMod extends js.Object {
  
  def InitializeNumberFormat(
    nf: NumberFormat,
    locales: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    hasGetInternalSlotsLocaleDataAvailableLocalesNumberingSystemNamesGetDefaultLocaleCurrencyDigitsData: GetDefaultLocale
  ): NumberFormat = js.native
  def InitializeNumberFormat(
    nf: NumberFormat,
    locales: js.UndefOr[scala.Nothing],
    opts: NumberFormatOptions,
    hasGetInternalSlotsLocaleDataAvailableLocalesNumberingSystemNamesGetDefaultLocaleCurrencyDigitsData: GetDefaultLocale
  ): NumberFormat = js.native
  def InitializeNumberFormat(
    nf: NumberFormat,
    locales: String,
    opts: js.UndefOr[scala.Nothing],
    hasGetInternalSlotsLocaleDataAvailableLocalesNumberingSystemNamesGetDefaultLocaleCurrencyDigitsData: GetDefaultLocale
  ): NumberFormat = js.native
  def InitializeNumberFormat(
    nf: NumberFormat,
    locales: String,
    opts: NumberFormatOptions,
    hasGetInternalSlotsLocaleDataAvailableLocalesNumberingSystemNamesGetDefaultLocaleCurrencyDigitsData: GetDefaultLocale
  ): NumberFormat = js.native
  def InitializeNumberFormat(
    nf: NumberFormat,
    locales: js.Array[String],
    opts: js.UndefOr[scala.Nothing],
    hasGetInternalSlotsLocaleDataAvailableLocalesNumberingSystemNamesGetDefaultLocaleCurrencyDigitsData: GetDefaultLocale
  ): NumberFormat = js.native
  def InitializeNumberFormat(
    nf: NumberFormat,
    locales: js.Array[String],
    opts: NumberFormatOptions,
    hasGetInternalSlotsLocaleDataAvailableLocalesNumberingSystemNamesGetDefaultLocaleCurrencyDigitsData: GetDefaultLocale
  ): NumberFormat = js.native
}
