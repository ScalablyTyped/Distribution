package typings.escpos.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("escpos", "Network")
@js.native
class Network protected () extends Adapter {
  def this(address: String) = this()
  def this(address: String, port: Double) = this()
  def close(): Network = js.native
  def close(callback: js.Function2[/* error */ js.Any, /* device */ this.type, Unit]): Network = js.native
  def open(): Network = js.native
  def open(callback: js.Function2[/* error */ js.Any, /* device */ this.type, Unit]): Network = js.native
}

