package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.PositionConfig
import typings.devextreme.mod.DevExpress.animation._AnimationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position
  extends StObject
     with _AnimationState {
  
  /**
    * Element position.
    */
  var position: PositionConfig
}
object Position {
  
  inline def apply(position: PositionConfig): Position = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
    
    inline def setPosition(value: PositionConfig): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
