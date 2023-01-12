package typings.dplayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DPlayerAPIBackend extends StObject {
  
  def read(endpoint: Any, callback: js.Function0[Unit]): Unit
  
  def send(endpoint: Any, danmakuData: DPlayerDanmakuItem, callback: js.Function0[Unit]): Unit
}
object DPlayerAPIBackend {
  
  inline def apply(
    read: (Any, js.Function0[Unit]) => Unit,
    send: (Any, DPlayerDanmakuItem, js.Function0[Unit]) => Unit
  ): DPlayerAPIBackend = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction2(read), send = js.Any.fromFunction3(send))
    __obj.asInstanceOf[DPlayerAPIBackend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DPlayerAPIBackend] (val x: Self) extends AnyVal {
    
    inline def setRead(value: (Any, js.Function0[Unit]) => Unit): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
    
    inline def setSend(value: (Any, DPlayerDanmakuItem, js.Function0[Unit]) => Unit): Self = StObject.set(x, "send", js.Any.fromFunction3(value))
  }
}
