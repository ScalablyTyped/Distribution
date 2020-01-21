package typings.ffmpegJs.ffmpegWorkerMp4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Worker extends js.Object {
  def onmessage(opts: OnMessageOptions): Unit
  def postMessage(opts: PostMessageOptions): Unit
  def terminate(): Unit
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
}

