package typings.formatjsIntl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type FormatDateOptions = (typings.std.Exclude[
    typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormatOptions, 
    typings.formatjsIntl.formatjsIntlStrings.localeMatcher
  ]) with typings.formatjsIntl.typesMod.CustomFormatConfig
  
  type FormatNumberOptions = (typings.std.Exclude[
    typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions, 
    typings.formatjsIntl.formatjsIntlStrings.localeMatcher
  ]) with typings.formatjsIntl.typesMod.CustomFormatConfig
  
  type FormatPluralOptions = (typings.std.Exclude[
    typings.std.Intl.PluralRulesOptions, 
    typings.formatjsIntl.formatjsIntlStrings.localeMatcher
  ]) with typings.formatjsIntl.typesMod.CustomFormatConfig
  
  type FormatRelativeTimeOptions = (typings.std.Exclude[
    typings.formatjsEcma402Abstract.typesRelativeTimeMod.IntlRelativeTimeFormatOptions, 
    typings.formatjsIntl.formatjsIntlStrings.localeMatcher
  ]) with typings.formatjsIntl.typesMod.CustomFormatConfig
  
  type OnErrorFn = js.Function1[
    /* err */ typings.formatjsIntl.errorMod.MissingTranslationError | typings.formatjsIntl.errorMod.MessageFormatError | typings.formatjsIntl.errorMod.MissingDataError | typings.formatjsIntl.errorMod.InvalidConfigError | typings.formatjsIntl.errorMod.UnsupportedFormatterError | typings.intlMessageformat.mod.FormatError, 
    scala.Unit
  ]
}
