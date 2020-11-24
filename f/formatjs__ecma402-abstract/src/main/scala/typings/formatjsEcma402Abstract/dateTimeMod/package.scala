package typings.formatjsEcma402Abstract

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object dateTimeMod {
  
  type IntervalFormatsData = typings.formatjsEcma402Abstract.anon.IntervalFormatFallback with (typings.std.Record[java.lang.String, typings.std.Record[java.lang.String, java.lang.String]])
  
  /* Rewritten from type alias, can be one of: 
    - typings.std.Intl.DateTimeFormatPartTypes
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.ampm
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.relatedYear
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.yearName
    - typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.unknown
  */
  type IntlDateTimeFormatPartType = typings.formatjsEcma402Abstract.dateTimeMod._IntlDateTimeFormatPartType | typings.std.Intl.DateTimeFormatPartTypes
  
  type TimeZoneNameData = typings.std.Record[java.lang.String, typings.formatjsEcma402Abstract.anon.Long]
  
  type UnpackedZoneData = js.Tuple4[scala.Double, java.lang.String, scala.Double, scala.Boolean]
}
