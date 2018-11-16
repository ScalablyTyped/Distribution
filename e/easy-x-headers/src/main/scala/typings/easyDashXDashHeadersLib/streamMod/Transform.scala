package typings
package easyDashXDashHeadersLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "Transform")
@js.native
class Transform ()
  extends easyDashXDashHeadersLib.eventsMod.EventEmitter
     with easyDashXDashHeadersLib.NodeJSNs.ReadWriteStream {
  def this(opts: TransformOptions) = this()
  def _flush(callback: js.Function): scala.Unit = js.native
  def _transform(chunk: easyDashXDashHeadersLib.Buffer, encoding: java.lang.String, callback: js.Function): scala.Unit = js.native
  def _transform(chunk: java.lang.String, encoding: java.lang.String, callback: js.Function): scala.Unit = js.native
  def push(chunk: js.Any): scala.Boolean = js.native
  def push(chunk: js.Any, encoding: java.lang.String): scala.Boolean = js.native
}

