package typings
package easyDashXapiDashSupertestLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- easyDashXapiDashSupertestLib.NodeJSNs.ReadWriteStream because var conflicts: readable. Inlined  */ @JSImport("stream", "Duplex")
@js.native
class Duplex () extends Readable {
  def this(opts: DuplexOptions) = this()
  var writable: scala.Boolean = js.native
  def _write(data: easyDashXapiDashSupertestLib.Buffer, encoding: java.lang.String, callback: js.Function): scala.Unit = js.native
  def _write(data: java.lang.String, encoding: java.lang.String, callback: js.Function): scala.Unit = js.native
  def end(): scala.Unit = js.native
  def end(buffer: easyDashXapiDashSupertestLib.Buffer): scala.Unit = js.native
  def end(buffer: easyDashXapiDashSupertestLib.Buffer, cb: js.Function): scala.Unit = js.native
  def end(str: java.lang.String): scala.Unit = js.native
  def end(str: java.lang.String, cb: js.Function): scala.Unit = js.native
  def end(str: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
  def end(str: java.lang.String, encoding: java.lang.String, cb: js.Function): scala.Unit = js.native
  def write(buffer: easyDashXapiDashSupertestLib.Buffer): scala.Boolean = js.native
  def write(buffer: easyDashXapiDashSupertestLib.Buffer, cb: js.Function): scala.Boolean = js.native
  def write(str: java.lang.String): scala.Boolean = js.native
  def write(str: java.lang.String, cb: js.Function): scala.Boolean = js.native
  def write(str: java.lang.String, encoding: java.lang.String): scala.Boolean = js.native
  def write(str: java.lang.String, encoding: java.lang.String, cb: js.Function): scala.Boolean = js.native
}

