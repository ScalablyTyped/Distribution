package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvocationListener extends StObject {
  
  /**
    * Detaches listener previously attached through `Interceptor#attach()`.
    */
  def detach(): Unit
}
object InvocationListener {
  
  inline def apply(detach: () => Unit): InvocationListener = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach))
    __obj.asInstanceOf[InvocationListener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvocationListener] (val x: Self) extends AnyVal {
    
    inline def setDetach(value: () => Unit): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
  }
}
