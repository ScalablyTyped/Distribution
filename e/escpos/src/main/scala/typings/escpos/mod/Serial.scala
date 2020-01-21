package typings.escpos.mod

import typings.escpos.AnonAutoOpen
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("escpos", "Serial")
@js.native
class Serial protected () extends Adapter {
  def this(port: Double) = this()
  def this(port: Double, options: AnonAutoOpen) = this()
  def close(): Serial = js.native
  def close(callback: js.Function2[/* error */ js.Any, /* device */ this.type, Unit]): Serial = js.native
  def close(callback: js.Function2[/* error */ js.Any, /* device */ this.type, Unit], timeout: Double): Serial = js.native
  def open(): Serial = js.native
  /* CompleteClass */
  override def open(args: js.Any*): Adapter = js.native
  def open(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Serial = js.native
  /* CompleteClass */
  override def write(data: Buffer, callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Adapter = js.native
}

