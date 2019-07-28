package typings.easyDashXDashHeaders.streamMod

import typings.easyDashXDashHeaders.Buffer
import typings.easyDashXDashHeaders.NodeJSNs.ReadWriteStream
import typings.easyDashXDashHeaders.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "Transform")
@js.native
class Transform ()
  extends EventEmitter
     with ReadWriteStream {
  def this(opts: TransformOptions) = this()
  def _flush(callback: js.Function): Unit = js.native
  def _transform(chunk: String, encoding: String, callback: js.Function): Unit = js.native
  def _transform(chunk: Buffer, encoding: String, callback: js.Function): Unit = js.native
  def push(chunk: js.Any): Boolean = js.native
  def push(chunk: js.Any, encoding: String): Boolean = js.native
}

