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
    clear: () => scala.Unit,
    draw: DPlayerDanmakuItem => scala.Unit,
    hide: () => scala.Unit,
    opacity: scala.Double => scala.Unit,
    send: (DPlayerDanmakuItem, js.Function0[scala.Unit]) => scala.Unit,
    show: () => scala.Unit
  ): Danmaku = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), draw = js.Any.fromFunction1(draw), hide = js.Any.fromFunction0(hide), opacity = js.Any.fromFunction1(opacity), send = js.Any.fromFunction2(send), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[Danmaku]
  }
}

