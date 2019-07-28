package typings.dplayer.dplayerMod

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
    val __obj = js.Dynamic.literal(text = text, time = time)
  
    __obj.asInstanceOf[DPlayerHighLightItem]
  }
}

