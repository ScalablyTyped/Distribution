package typings.escpos.escposMod

import typings.node.Buffer
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
  /* CompleteClass */
  override def open(args: js.Any*): Adapter = js.native
  def open(callback: js.Function2[/* error */ js.Any, /* device */ this.type, Unit]): Network = js.native
  /* CompleteClass */
  override def write(data: Buffer, callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Adapter = js.native
}

