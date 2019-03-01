package typings
package gapiDotPlusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CoverInfo extends js.Object {
  var coverInfo: Anon_LeftImageOffset
  var coverPhoto: Anon_Height
  var layout: java.lang.String
}

object Anon_CoverInfo {
  @scala.inline
  def apply(coverInfo: Anon_LeftImageOffset, coverPhoto: Anon_Height, layout: java.lang.String): Anon_CoverInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("coverInfo")(coverInfo)
    __obj.updateDynamic("coverPhoto")(coverPhoto)
    __obj.updateDynamic("layout")(layout)
    __obj.asInstanceOf[Anon_CoverInfo]
  }
}

