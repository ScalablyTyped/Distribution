package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists values that specify the position relative to the target column in which a moved column should be placed.
  */
trait ASPxClientGridColumnMovingTargetPosition extends StObject {
  
  /**
    * A moved column should be placed at the bottom of the target column.
    */
  var Bottom: Double
  
  /**
    * A moved column should be placed to the left of the target column.
    */
  var Left: Double
  
  /**
    * A moved column should be placed to the right of the target column.
    */
  var Right: Double
  
  /**
    * A moved column should be placed at the top of the target column.
    */
  var Top: Double
}
object ASPxClientGridColumnMovingTargetPosition {
  
  inline def apply(Bottom: Double, Left: Double, Right: Double, Top: Double): ASPxClientGridColumnMovingTargetPosition = {
    val __obj = js.Dynamic.literal(Bottom = Bottom.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridColumnMovingTargetPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientGridColumnMovingTargetPosition] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "Bottom", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Double): Self = StObject.set(x, "Right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
  }
}
