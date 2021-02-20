package typings.dplayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Danmaku extends StObject {
  
  def clear(): Unit = js.native
  
  def draw(danmaku: DPlayerDanmakuItem): Unit = js.native
  
  def hide(): Unit = js.native
  
  def opacity(percentage: Double): Unit = js.native
  
  def send(danmaku: DPlayerDanmakuItem, callback: js.Function0[Unit]): Unit = js.native
  
  def show(): Unit = js.native
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
  
  @scala.inline
  implicit class DanmakuMutableBuilder[Self <: Danmaku] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDraw(value: DPlayerDanmakuItem => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpacity(value: Double => Unit): Self = StObject.set(x, "opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSend(value: (DPlayerDanmakuItem, js.Function0[Unit]) => Unit): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
