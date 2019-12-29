package typings.escpos.escposMod

import typings.escpos.escposBooleans.`false`
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("escpos", "USB")
@js.native
class USB () extends Adapter {
  def this(vid: String) = this()
  def this(vid: String, pid: String) = this()
  def close(): USB = js.native
  def close(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): USB = js.native
  def open(): USB = js.native
  /* CompleteClass */
  override def open(args: js.Any*): Adapter = js.native
  def open(callback: js.Function2[/* error */ js.Any, /* device */ js.UndefOr[this.type], Unit]): USB = js.native
  /* CompleteClass */
  override def write(data: Buffer, callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Adapter = js.native
}

/* static members */
@JSImport("escpos", "USB")
@js.native
object USB extends js.Object {
  def findPrinter(): js.Array[USB] | `false` = js.native
  def getDevice(): js.Promise[USB] = js.native
  def getDevice(vid: String): js.Promise[USB] = js.native
  def getDevice(vid: String, pid: String): js.Promise[USB] = js.native
}

