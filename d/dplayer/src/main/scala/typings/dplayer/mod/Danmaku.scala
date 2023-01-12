package typings.dplayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Danmaku extends StObject {
  
  def clear(): Unit
  
  def draw(danmaku: DPlayerDanmakuItem): Unit
  
  def hide(): Unit
  
  def opacity(percentage: Double): Unit
  
  def send(danmaku: DPlayerDanmakuItem, callback: js.Function0[Unit]): Unit
  
  def show(): Unit
}
object Danmaku {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Danmaku] (val x: Self) extends AnyVal {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setDraw(value: DPlayerDanmakuItem => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction1(value))
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setOpacity(value: Double => Unit): Self = StObject.set(x, "opacity", js.Any.fromFunction1(value))
    
    inline def setSend(value: (DPlayerDanmakuItem, js.Function0[Unit]) => Unit): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
