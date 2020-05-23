package typings.gapiPlus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverInfo extends js.Object {
  var coverInfo: LeftImageOffset
  var coverPhoto: Height
  var layout: String
}

object CoverInfo {
  @scala.inline
  def apply(coverInfo: LeftImageOffset, coverPhoto: Height, layout: String): CoverInfo = {
    val __obj = js.Dynamic.literal(coverInfo = coverInfo.asInstanceOf[js.Any], coverPhoto = coverPhoto.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverInfo]
  }
}

