package typings.easyDashXapiDashSupertest.streamMod

import typings.easyDashXapiDashSupertest.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.easyDashXapiDashSupertest.NodeJSNs.ReadWriteStream because var conflicts: readable. Inlined  */ @JSImport("stream", "Duplex")
@js.native
class Duplex () extends Readable {
  def this(opts: DuplexOptions) = this()
  var writable: Boolean = js.native
  def _write(data: String, encoding: String, callback: js.Function): Unit = js.native
  def _write(data: Buffer, encoding: String, callback: js.Function): Unit = js.native
  def end(): Unit = js.native
  def end(buffer: Buffer): Unit = js.native
  def end(buffer: Buffer, cb: js.Function): Unit = js.native
  def end(str: String): Unit = js.native
  def end(str: String, cb: js.Function): Unit = js.native
  def end(str: String, encoding: String): Unit = js.native
  def end(str: String, encoding: String, cb: js.Function): Unit = js.native
  def write(buffer: Buffer): Boolean = js.native
  def write(buffer: Buffer, cb: js.Function): Boolean = js.native
  def write(str: String): Boolean = js.native
  def write(str: String, cb: js.Function): Boolean = js.native
  def write(str: String, encoding: String): Boolean = js.native
  def write(str: String, encoding: String, cb: js.Function): Boolean = js.native
}

