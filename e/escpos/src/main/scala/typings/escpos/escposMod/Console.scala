package typings.escpos.escposMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("escpos", "Console")
@js.native
class Console () extends Adapter {
  def this(handler: js.Function1[/* data */ js.Array[js.Array[_]], Unit]) = this()
  def open(): Console = js.native
  /* CompleteClass */
  override def open(args: js.Any*): Adapter = js.native
  def open(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Console = js.native
  def write(data: Buffer): Console = js.native
  /* CompleteClass */
  override def write(data: Buffer, callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Adapter = js.native
}

