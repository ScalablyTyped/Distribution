package typings.escpos.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Adapter extends StObject {
  
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
  
  @scala.inline
  implicit class AdapterMutableBuilder[Self <: Adapter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpen(value: /* repeated */ js.Any => Adapter): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWrite(value: (Buffer, js.Function1[/* error */ js.UndefOr[js.Any], Unit]) => Adapter): Self = StObject.set(x, "write", js.Any.fromFunction2(value))
  }
}
