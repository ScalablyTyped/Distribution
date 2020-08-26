package typings.formatjsIntlDatetimeformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type RawDateTimeLocaleData = typings.formatjsIntlUtils.srcTypesMod.LocaleData[typings.formatjsIntlDatetimeformat.typesMod.RawDateTimeLocaleInternalData]
  type TimeZoneNameData = typings.std.Record[java.lang.String, typings.formatjsIntlDatetimeformat.anon.Short]
  type UnpackedZoneData = js.Tuple4[scala.Double, java.lang.String, scala.Double, scala.Boolean]
  type ZoneData = js.Tuple4[scala.Double | java.lang.String, scala.Double, scala.Double, scala.Double]
}
