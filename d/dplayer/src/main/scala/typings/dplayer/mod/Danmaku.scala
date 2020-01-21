package typings.dplayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Danmaku extends js.Object {
  def clear(): Unit
  def draw(danmaku: DPlayerDanmakuItem): Unit
  def hide(): Unit
  def opacity(percentage: Double): Unit
  def send(danmaku: DPlayerDanmakuItem, callback: js.Function0[Unit]): Unit
  def show(): Unit
}

object Danmaku {
  @scala.inline
  def apply(
    clear: () => Unit,
    draw: DPlayerDanmakuItem => Unit,
    hide: () => Unit,
    opacity: Double => Unit,
    send: (DPlayerDanmakuItem, js.Function0[Unit]) => Unit,
    show: () => Unit
  ): Danmaku = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), draw = js.Any.fromFunction1(draw), hide = js.Any.fromFunction0(hide), opacity = js.Any.fromFunction1(opacity), send = js.Any.fromFunction2(send), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[Danmaku]
  }
}

