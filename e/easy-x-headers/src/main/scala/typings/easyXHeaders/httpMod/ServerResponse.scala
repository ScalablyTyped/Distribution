package typings.easyXHeaders.httpMod

import typings.easyXHeaders.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerResponse extends Writable {
  
  def addTrailers(headers: js.Any): Unit = js.native
  
  def end(data: js.UndefOr[scala.Nothing], encoding: String): Unit = js.native
  def end(data: js.Any): Unit = js.native
  def end(data: js.Any, encoding: String): Unit = js.native
  
  def getHeader(name: String): String = js.native
  
  def removeHeader(name: String): Unit = js.native
  
  var sendDate: Boolean = js.native
  
  def setHeader(name: String, value: String): Unit = js.native
  
  var statusCode: Double = js.native
  
  def write(chunk: js.Any): js.Any = js.native
  def write(chunk: js.Any, encoding: String): js.Any = js.native
  def write(str: String, encoding: js.UndefOr[scala.Nothing], fd: String): Boolean = js.native
  def write(str: String, encoding: String, fd: String): Boolean = js.native
  
  def writeContinue(): Unit = js.native
  
  def writeHead(statusCode: Double): Unit = js.native
  def writeHead(statusCode: Double, headers: js.Any): Unit = js.native
  def writeHead(statusCode: Double, reasonPhrase: js.UndefOr[scala.Nothing], headers: js.Any): Unit = js.native
  def writeHead(statusCode: Double, reasonPhrase: String): Unit = js.native
  def writeHead(statusCode: Double, reasonPhrase: String, headers: js.Any): Unit = js.native
}
