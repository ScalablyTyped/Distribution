package typings
package dplayerLib.dplayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DPlayerDanmakuItem extends js.Object {
  var color: java.lang.String
  var text: java.lang.String
  var `type`: DirectionType
}

object DPlayerDanmakuItem {
  @scala.inline
  def apply(color: java.lang.String, text: java.lang.String, `type`: DirectionType): DPlayerDanmakuItem = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[DPlayerDanmakuItem]
  }
}

