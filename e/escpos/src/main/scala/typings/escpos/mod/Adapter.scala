package typings.escpos.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adapter extends js.Object {
  
  def open(args: js.Any*): Adapter = js.native
  
  def write(data: Buffer, callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Adapter = js.native
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
  
  @scala.inline
  implicit class AdapterOps[Self <: Adapter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOpen(value: /* repeated */ js.Any => Adapter): Self = this.set("open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWrite(value: (Buffer, js.Function1[/* error */ js.UndefOr[js.Any], Unit]) => Adapter): Self = this.set("write", js.Any.fromFunction2(value))
  }
}
