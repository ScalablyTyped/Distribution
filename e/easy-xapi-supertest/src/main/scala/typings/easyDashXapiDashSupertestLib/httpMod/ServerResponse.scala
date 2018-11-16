package typings
package easyDashXapiDashSupertestLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerResponse
  extends easyDashXapiDashSupertestLib.streamMod.Writable {
  var sendDate: scala.Boolean = js.native
  var statusCode: scala.Double = js.native
  def addTrailers(headers: js.Any): scala.Unit = js.native
  def end(data: js.Any): scala.Unit = js.native
  def end(data: js.Any, encoding: java.lang.String): scala.Unit = js.native
  def getHeader(name: java.lang.String): java.lang.String = js.native
  def removeHeader(name: java.lang.String): scala.Unit = js.native
  def setHeader(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def write(chunk: js.Any): js.Any = js.native
  def write(chunk: js.Any, encoding: java.lang.String): js.Any = js.native
  def write(str: java.lang.String, encoding: java.lang.String, fd: java.lang.String): scala.Boolean = js.native
  def writeContinue(): scala.Unit = js.native
  def writeHead(statusCode: scala.Double): scala.Unit = js.native
  def writeHead(statusCode: scala.Double, headers: js.Any): scala.Unit = js.native
  def writeHead(statusCode: scala.Double, reasonPhrase: java.lang.String): scala.Unit = js.native
  def writeHead(statusCode: scala.Double, reasonPhrase: java.lang.String, headers: js.Any): scala.Unit = js.native
}

