package typings.easyDashXDashHeaders.NodeJSNs

import typings.easyDashXDashHeaders.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritableStream extends EventEmitter {
  var writable: Boolean = js.native
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

