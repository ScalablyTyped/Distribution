package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseFn[I] extends StObject {
  
  def closeFn(): Unit
  
  def sendFn(msg: I): Unit
}
object CloseFn {
  
  inline def apply[I](closeFn: () => Unit, sendFn: I => Unit): CloseFn[I] = {
    val __obj = js.Dynamic.literal(closeFn = js.Any.fromFunction0(closeFn), sendFn = js.Any.fromFunction1(sendFn))
    __obj.asInstanceOf[CloseFn[I]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloseFn[?], I] (val x: Self & CloseFn[I]) extends AnyVal {
    
    inline def setCloseFn(value: () => Unit): Self = StObject.set(x, "closeFn", js.Any.fromFunction0(value))
    
    inline def setSendFn(value: I => Unit): Self = StObject.set(x, "sendFn", js.Any.fromFunction1(value))
  }
}
