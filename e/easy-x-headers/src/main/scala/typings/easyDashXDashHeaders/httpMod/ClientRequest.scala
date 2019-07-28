package typings.easyDashXDashHeaders.httpMod

import typings.easyDashXDashHeaders.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientRequest extends Writable {
  def abort(): Unit = js.native
  def end(data: js.Any): Unit = js.native
  def end(data: js.Any, encoding: String): Unit = js.native
  def setNoDelay(): Unit = js.native
  def setNoDelay(noDelay: Boolean): Unit = js.native
  def setSocketKeepAlive(): Unit = js.native
  def setSocketKeepAlive(enable: Boolean): Unit = js.native
  def setSocketKeepAlive(enable: Boolean, initialDelay: Double): Unit = js.native
  def setTimeout(timeout: Double): Unit = js.native
  def setTimeout(timeout: Double, callback: js.Function): Unit = js.native
  def write(chunk: js.Any): Unit = js.native
  def write(chunk: js.Any, encoding: String): Unit = js.native
  def write(str: String, encoding: String, fd: String): Boolean = js.native
}

