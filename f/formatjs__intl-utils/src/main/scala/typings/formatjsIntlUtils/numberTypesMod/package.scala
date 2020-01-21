package typings.formatjsIntlUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object numberTypesMod {
  type CompactSignPattern = typings.std.Record[
    typings.formatjsIntlUtils.numberTypesMod.DecimalFormatNum, 
    typings.formatjsIntlUtils.numberTypesMod.SignPattern
  ]
  type LDMLPluralRuleMap[T] = (typings.std.Omit[
    typings.std.Partial[
      typings.std.Record[typings.formatjsIntlUtils.pluralRulesTypesMod.LDMLPluralRule, T]
    ], 
    typings.formatjsIntlUtils.formatjsIntlUtilsStrings.other
  ]) with typings.formatjsIntlUtils.AnonOther[T]
  type NumberLocaleData = typings.formatjsIntlUtils.typesMod.LocaleData[typings.formatjsIntlUtils.numberTypesMod.NumberInternalSlots]
  type NumberingSystem = java.lang.String
  type RawNumberLocaleData = typings.formatjsIntlUtils.typesMod.LocaleData[typings.formatjsIntlUtils.numberTypesMod.NumberLocaleInternalData]
}
