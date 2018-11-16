package typings
package easyDashXapiDashSupertestLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "Writable")
@js.native
class Writable ()
  extends easyDashXapiDashSupertestLib.eventsMod.EventEmitter
     with easyDashXapiDashSupertestLib.NodeJSNs.WritableStream {
  def this(opts: WritableOptions) = this()
  def _write(data: easyDashXapiDashSupertestLib.Buffer, encoding: java.lang.String, callback: js.Function): scala.Unit = js.native
  def _write(data: java.lang.String, encoding: java.lang.String, callback: js.Function): scala.Unit = js.native
}

