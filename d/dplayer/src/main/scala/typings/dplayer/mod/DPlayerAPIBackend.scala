package typings.dplayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DPlayerAPIBackend extends js.Object {
  
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
  implicit class DPlayerAPIBackendOps[Self <: DPlayerAPIBackend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRead(value: (js.Any, js.Function0[Unit]) => Unit): Self = this.set("read", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSend(value: (js.Any, DPlayerDanmakuItem, js.Function0[Unit]) => Unit): Self = this.set("send", js.Any.fromFunction3(value))
  }
}
