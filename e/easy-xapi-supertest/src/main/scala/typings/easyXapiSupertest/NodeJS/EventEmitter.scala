package typings.easyXapiSupertest.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEmitter extends js.Object {
  def addListener(event: String, listener: js.Function): EventEmitter = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def listeners(event: String): js.Array[js.Function] = js.native
  def on(event: String, listener: js.Function): EventEmitter = js.native
  def once(event: String, listener: js.Function): EventEmitter = js.native
  def removeAllListeners(): EventEmitter = js.native
  def removeAllListeners(event: String): EventEmitter = js.native
  def removeListener(event: String, listener: js.Function): EventEmitter = js.native
  def setMaxListeners(n: Double): Unit = js.native
}

