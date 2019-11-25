package typings.atFormatjsIntlDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distDiffMod {
  import typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.day
  import typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.hour
  import typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.minute
  import typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.second
  import typings.std.Record

  type Thresholds = Record[second | minute | hour | day, Double]
}
