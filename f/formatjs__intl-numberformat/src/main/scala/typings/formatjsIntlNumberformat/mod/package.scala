package typings.formatjsIntlNumberformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Locale = java.lang.String
  type NumberFormat = typings.formatjsIntlNumberformat.mod.NumberFormat2
  type NumberFormatOptionsNotation = typings.formatjsIntlNumberformat.mod.NumberFormatNotation
  /* Rewritten from type alias, can be one of: 
    - typings.std.Intl.NumberFormatPartTypes
    - typings.formatjsIntlNumberformat.formatjsIntlNumberformatStrings.exponentSeparator
    - typings.formatjsIntlNumberformat.formatjsIntlNumberformatStrings.exponentMinusSign
    - typings.formatjsIntlNumberformat.formatjsIntlNumberformatStrings.exponentInteger
    - typings.formatjsIntlNumberformat.formatjsIntlNumberformatStrings.compact
    - typings.formatjsIntlNumberformat.formatjsIntlNumberformatStrings.unit
    - typings.formatjsIntlNumberformat.formatjsIntlNumberformatStrings.literal
  */
  type NumberFormatPartTypes = typings.formatjsIntlNumberformat.mod._NumberFormatPartTypes | typings.std.Intl.NumberFormatPartTypes
  type NumberingSystem = java.lang.String
  type RawNumberLocaleData = typings.formatjsIntlNumberformat.mod.LocaleData[typings.formatjsIntlNumberformat.mod.NumberFormatLocaleInternalData]
}
