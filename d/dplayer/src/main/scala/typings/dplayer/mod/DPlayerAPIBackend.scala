package typings.dplayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DPlayerAPIBackend extends StObject {
  
  def read(endpoint: js.Any, callback: js.Function0[Unit]): Unit = js.native
  
  def send(endpoint: js.Any, danmakuData: DPlayerDanmakuItem, callback: js.Function0[Unit]): Unit = js.native
}
object DPlayerAPIBackend {
  
  @scala.inline
  def apply(
    read: (js.Any, js.Function0[Unit]) => Unit,
    send: (js.Any, DPlayerDanmakuItem, js.Function0[Unit]) => Unit
  ): DPlayerAPIBackend = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction2(read), send = js.Any.fromFunction3(send))
    __obj.asInstanceOf[DPlayerAPIBackend]
  }
  
  @scala.inline
  implicit class DPlayerAPIBackendMutableBuilder[Self <: DPlayerAPIBackend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRead(value: (js.Any, js.Function0[Unit]) => Unit): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSend(value: (js.Any, DPlayerDanmakuItem, js.Function0[Unit]) => Unit): Self = StObject.set(x, "send", js.Any.fromFunction3(value))
  }
}
