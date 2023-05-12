package typings.embroiderSharedInternals.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Write extends StObject {
  
  def write(args: Any*): Unit
}
object Write {
  
  inline def apply(write: /* repeated */ Any => Unit): Write = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[Write]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Write] (val x: Self) extends AnyVal {
    
    inline def setWrite(value: /* repeated */ Any => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
