package typings.escpos.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Adapter extends StObject {
  
  def open(args: Any*): Adapter
  
  def write(data: Buffer, callback: js.Function1[/* error */ js.UndefOr[Any], Unit]): Adapter
}
object Adapter {
  
  inline def apply(
    open: /* repeated */ Any => Adapter,
    write: (Buffer, js.Function1[/* error */ js.UndefOr[Any], Unit]) => Adapter
  ): Adapter = {
    val __obj = js.Dynamic.literal(open = js.Any.fromFunction1(open), write = js.Any.fromFunction2(write))
    __obj.asInstanceOf[Adapter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Adapter] (val x: Self) extends AnyVal {
    
    inline def setOpen(value: /* repeated */ Any => Adapter): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    inline def setWrite(value: (Buffer, js.Function1[/* error */ js.UndefOr[Any], Unit]) => Adapter): Self = StObject.set(x, "write", js.Any.fromFunction2(value))
  }
}
