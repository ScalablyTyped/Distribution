package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDismissStart extends StObject {
  
  def onDismissStart(): Unit
}
object OnDismissStart {
  
  inline def apply(onDismissStart: () => Unit): OnDismissStart = {
    val __obj = js.Dynamic.literal(onDismissStart = js.Any.fromFunction0(onDismissStart))
    __obj.asInstanceOf[OnDismissStart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnDismissStart] (val x: Self) extends AnyVal {
    
    inline def setOnDismissStart(value: () => Unit): Self = StObject.set(x, "onDismissStart", js.Any.fromFunction0(value))
  }
}
