package typings.dplayer.dplayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DPlayerDanmakuItem extends js.Object {
  var color: String
  var text: String
  var `type`: DirectionType
}

object DPlayerDanmakuItem {
  @scala.inline
  def apply(color: String, text: String, `type`: DirectionType): DPlayerDanmakuItem = {
    val __obj = js.Dynamic.literal(color = color, text = text)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DPlayerDanmakuItem]
  }
}

