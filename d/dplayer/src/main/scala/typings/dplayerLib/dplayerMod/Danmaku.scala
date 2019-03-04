package typings
package dplayerLib.dplayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Danmaku extends js.Object {
  def clear(): scala.Unit
  def draw(danmaku: DPlayerDanmakuItem): scala.Unit
  def hide(): scala.Unit
  def opacity(percentage: scala.Double): scala.Unit
  def send(danmaku: DPlayerDanmakuItem, callback: js.Function0[scala.Unit]): scala.Unit
  def show(): scala.Unit
}

object Danmaku {
  @scala.inline
  def apply(
    clear: js.Function0[scala.Unit],
    draw: js.Function1[DPlayerDanmakuItem, scala.Unit],
    hide: js.Function0[scala.Unit],
    opacity: js.Function1[scala.Double, scala.Unit],
    send: js.Function2[DPlayerDanmakuItem, js.Function0[scala.Unit], scala.Unit],
    show: js.Function0[scala.Unit]
  ): Danmaku = {
    val __obj = js.Dynamic.literal(clear = clear, draw = draw, hide = hide, opacity = opacity, send = send, show = show)
  
    __obj.asInstanceOf[Danmaku]
  }
}

