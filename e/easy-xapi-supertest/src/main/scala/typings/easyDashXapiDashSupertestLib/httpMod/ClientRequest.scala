package typings
package easyDashXapiDashSupertestLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientRequest
  extends easyDashXapiDashSupertestLib.streamMod.Writable {
  def abort(): scala.Unit = js.native
  def end(data: js.Any): scala.Unit = js.native
  def end(data: js.Any, encoding: java.lang.String): scala.Unit = js.native
  def setNoDelay(): scala.Unit = js.native
  def setNoDelay(noDelay: scala.Boolean): scala.Unit = js.native
  def setSocketKeepAlive(): scala.Unit = js.native
  def setSocketKeepAlive(enable: scala.Boolean): scala.Unit = js.native
  def setSocketKeepAlive(enable: scala.Boolean, initialDelay: scala.Double): scala.Unit = js.native
  def setTimeout(timeout: scala.Double): scala.Unit = js.native
  def setTimeout(timeout: scala.Double, callback: js.Function): scala.Unit = js.native
  def write(chunk: js.Any): scala.Unit = js.native
  def write(chunk: js.Any, encoding: java.lang.String): scala.Unit = js.native
  def write(str: java.lang.String, encoding: java.lang.String, fd: java.lang.String): scala.Boolean = js.native
}

