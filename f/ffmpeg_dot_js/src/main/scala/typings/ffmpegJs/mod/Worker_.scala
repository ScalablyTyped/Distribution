package typings.ffmpegJs.mod

import typings.ffmpegJs.mod.Worker.OnMessageOptions
import typings.ffmpegJs.mod.Worker.PostMessageOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ffmpeg.js", "Worker")
@js.native
class Worker_ () extends js.Object {
  def this(someParam: String) = this()
  
  def onmessage(opts: OnMessageOptions): Unit = js.native
  
  def postMessage(opts: PostMessageOptions): Unit = js.native
  
  def terminate(): Unit = js.native
}
