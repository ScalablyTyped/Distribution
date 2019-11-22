package typings.ffmpegDotJs.ffmpegDotJsMod

import typings.ffmpegDotJs.ffmpegDotJsMod.Worker.OnMessageOptions
import typings.ffmpegDotJs.ffmpegDotJsMod.Worker.PostMessageOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ffmpeg.js", "Worker")
@js.native
class Worker_ () extends js.Object {
  def this(someParam: String) = this()
  def onmessage(opts: OnMessageOptions): Unit = js.native
  def postMessage(opts: PostMessageOptions): Unit = js.native
  def terminate(): Unit = js.native
}

