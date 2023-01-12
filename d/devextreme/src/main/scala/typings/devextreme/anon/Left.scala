package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.animation._AnimationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Left
  extends StObject
     with _AnimationState {
  
  /**
    * A shortcut that positions the element&apos;s left side relative to the parent element.
    */
  var left: Double
}
object Left {
  
  inline def apply(left: Double): Left = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
  }
}
