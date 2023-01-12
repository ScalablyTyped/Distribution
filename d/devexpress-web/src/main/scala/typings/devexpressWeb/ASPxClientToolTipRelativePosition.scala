package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client-side equivalent of the ToolTipRelativePosition class.
  */
trait ASPxClientToolTipRelativePosition
  extends StObject
     with ASPxClientToolTipPosition {
  
  /**
    * Gets the horizontal offset of a tooltip.
    */
  var offsetX: Double
  
  /**
    * Gets the vertical offset of a tooltip.
    */
  var offsetY: Double
}
object ASPxClientToolTipRelativePosition {
  
  inline def apply(offsetX: Double, offsetY: Double): ASPxClientToolTipRelativePosition = {
    val __obj = js.Dynamic.literal(offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientToolTipRelativePosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientToolTipRelativePosition] (val x: Self) extends AnyVal {
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
  }
}
