package typings.dplayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DPlayerHighLightItem extends js.Object {
  var text: String
  var time: Double
}

object DPlayerHighLightItem {
  @scala.inline
  def apply(text: String, time: Double): DPlayerHighLightItem = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[DPlayerHighLightItem]
  }
}

