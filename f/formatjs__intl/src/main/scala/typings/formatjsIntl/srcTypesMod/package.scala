package typings.formatjsIntl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object srcTypesMod {
  
  type FormatDateOptions = (typings.std.Exclude[
    typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormatOptions, 
    typings.formatjsIntl.formatjsIntlStrings.localeMatcher
  ]) with typings.formatjsIntl.srcTypesMod.CustomFormatConfig
  
  type FormatNumberOptions = (typings.std.Exclude[
    typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions, 
    typings.formatjsIntl.formatjsIntlStrings.localeMatcher
  ]) with typings.formatjsIntl.srcTypesMod.CustomFormatConfig
  
  type FormatPluralOptions = (typings.std.Exclude[
    typings.std.Intl.PluralRulesOptions, 
    typings.formatjsIntl.formatjsIntlStrings.localeMatcher
  ]) with typings.formatjsIntl.srcTypesMod.CustomFormatConfig
  
  type FormatRelativeTimeOptions = (typings.std.Exclude[
    typings.formatjsEcma402Abstract.typesRelativeTimeMod.IntlRelativeTimeFormatOptions, 
    typings.formatjsIntl.formatjsIntlStrings.localeMatcher
  ]) with typings.formatjsIntl.srcTypesMod.CustomFormatConfig
  
  type OnErrorFn = js.Function1[
    /* err */ typings.formatjsIntl.srcErrorMod.MissingTranslationError | typings.formatjsIntl.srcErrorMod.MessageFormatError | typings.formatjsIntl.srcErrorMod.MissingDataError | typings.formatjsIntl.srcErrorMod.InvalidConfigError | typings.formatjsIntl.srcErrorMod.UnsupportedFormatterError | typings.intlMessageformat.mod.FormatError, 
    scala.Unit
  ]
}
