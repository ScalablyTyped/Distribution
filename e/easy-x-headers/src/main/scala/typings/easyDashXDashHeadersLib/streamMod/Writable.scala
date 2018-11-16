package typings
package easyDashXDashHeadersLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "Writable")
@js.native
class Writable ()
  extends easyDashXDashHeadersLib.eventsMod.EventEmitter
     with easyDashXDashHeadersLib.NodeJSNs.WritableStream {
  def this(opts: WritableOptions) = this()
  def _write(data: easyDashXDashHeadersLib.Buffer, encoding: java.lang.String, callback: js.Function): scala.Unit = js.native
  def _write(data: java.lang.String, encoding: java.lang.String, callback: js.Function): scala.Unit = js.native
}

