package typings
package easyDashXapiDashSupertestLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "Transform")
@js.native
class Transform ()
  extends easyDashXapiDashSupertestLib.eventsMod.EventEmitter
     with easyDashXapiDashSupertestLib.NodeJSNs.ReadWriteStream {
  def this(opts: TransformOptions) = this()
  def _flush(callback: js.Function): scala.Unit = js.native
  def _transform(chunk: easyDashXapiDashSupertestLib.Buffer, encoding: java.lang.String, callback: js.Function): scala.Unit = js.native
  def _transform(chunk: java.lang.String, encoding: java.lang.String, callback: js.Function): scala.Unit = js.native
  def push(chunk: js.Any): scala.Boolean = js.native
  def push(chunk: js.Any, encoding: java.lang.String): scala.Boolean = js.native
}

