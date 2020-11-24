package typings.ffmpegJs.ffmpegWorkerMp4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Worker extends js.Object {
  
  def onmessage(opts: OnMessageOptions): Unit = js.native
  
  def postMessage(opts: PostMessageOptions): Unit = js.native
  
  def terminate(): Unit = js.native
}
object Worker {
  
  @scala.inline
  def apply(
    onmessage: OnMessageOptions => Unit,
    postMessage: PostMessageOptions => Unit,
    terminate: () => Unit
  ): Worker = {
    val __obj = js.Dynamic.literal(onmessage = js.Any.fromFunction1(onmessage), postMessage = js.Any.fromFunction1(postMessage), terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[Worker]
  }
  
  @scala.inline
  implicit class WorkerOps[Self <: Worker] (val x: Self) extends AnyVal {
    
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
    def setOnmessage(value: OnMessageOptions => Unit): Self = this.set("onmessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPostMessage(value: PostMessageOptions => Unit): Self = this.set("postMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTerminate(value: () => Unit): Self = this.set("terminate", js.Any.fromFunction0(value))
  }
}
