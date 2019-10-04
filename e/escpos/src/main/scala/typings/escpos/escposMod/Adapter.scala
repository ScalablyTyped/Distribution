package typings.escpos.escposMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adapter extends js.Object {
  def open(args: js.Any*): Adapter
  def write(data: Buffer, callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Adapter
}

object Adapter {
  @scala.inline
  def apply(
    open: /* repeated */ js.Any => Adapter,
    write: (Buffer, js.Function1[/* error */ js.UndefOr[js.Any], Unit]) => Adapter
  ): Adapter = {
    val __obj = js.Dynamic.literal(open = js.Any.fromFunction1(open), write = js.Any.fromFunction2(write))
  
    __obj.asInstanceOf[Adapter]
  }
}

