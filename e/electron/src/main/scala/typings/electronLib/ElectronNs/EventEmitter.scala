package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.EventEmitter")
@js.native
class EventEmitter () extends js.Object {
  def addListener(event: java.lang.String, listener: js.Function): this.type = js.native
  def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  def eventNames(): js.Array[java.lang.String] = js.native
  def getMaxListeners(): scala.Double = js.native
  def listenerCount(`type`: java.lang.String): scala.Double = js.native
  def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  def once(event: java.lang.String, listener: js.Function): this.type = js.native
  def prependListener(event: java.lang.String, listener: js.Function): this.type = js.native
  def prependOnceListener(event: java.lang.String, listener: js.Function): this.type = js.native
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: java.lang.String): this.type = js.native
  def removeListener(event: java.lang.String, listener: js.Function): this.type = js.native
  def setMaxListeners(n: scala.Double): this.type = js.native
}

