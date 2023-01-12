package typings.dynatable.JQueryDynatable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOM extends StObject {
  
  /**
    * Manually update the dom with the current record set...
    * This can be useful after multiple calls to `domcolumns.add()` with `skipUpdate` set to true.
    * This way we improve performance by generating the DOM only once.
    */
  def update(): Unit
}
object DOM {
  
  inline def apply(update: () => Unit): DOM = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[DOM]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DOM] (val x: Self) extends AnyVal {
    
    inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
  }
}
