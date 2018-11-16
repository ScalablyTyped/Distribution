package typings
package easyDashXapiDashSupertestLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "Readable")
@js.native
class Readable ()
  extends easyDashXapiDashSupertestLib.eventsMod.EventEmitter
     with easyDashXapiDashSupertestLib.NodeJSNs.ReadableStream {
  def this(opts: ReadableOptions) = this()
  def _read(size: scala.Double): scala.Unit = js.native
  def push(chunk: js.Any): scala.Boolean = js.native
  def push(chunk: js.Any, encoding: java.lang.String): scala.Boolean = js.native
}

