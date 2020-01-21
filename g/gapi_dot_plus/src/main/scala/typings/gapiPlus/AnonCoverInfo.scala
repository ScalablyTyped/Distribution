package typings.gapiPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCoverInfo extends js.Object {
  var coverInfo: AnonLeftImageOffset
  var coverPhoto: AnonHeight
  var layout: String
}

object AnonCoverInfo {
  @scala.inline
  def apply(coverInfo: AnonLeftImageOffset, coverPhoto: AnonHeight, layout: String): AnonCoverInfo = {
    val __obj = js.Dynamic.literal(coverInfo = coverInfo.asInstanceOf[js.Any], coverPhoto = coverPhoto.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCoverInfo]
  }
}

