package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO: Replace this declaration with NodeJS.EventEmitter
@JSGlobal("Electron.EventEmitter")
@js.native
class EventEmitter () extends js.Object {
  def addListener(event: String, listener: js.Function): this.type = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def eventNames(): js.Array[String | js.Symbol] = js.native
  def getMaxListeners(): Double = js.native
  def listenerCount(`type`: String): Double = js.native
  def listeners(event: String): js.Array[js.Function] = js.native
  def on(event: String, listener: js.Function): this.type = js.native
  def once(event: String, listener: js.Function): this.type = js.native
  def prependListener(event: String, listener: js.Function): this.type = js.native
  def prependOnceListener(event: String, listener: js.Function): this.type = js.native
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: String): this.type = js.native
  def removeListener(event: String, listener: js.Function): this.type = js.native
  def setMaxListeners(n: Double): this.type = js.native
}

