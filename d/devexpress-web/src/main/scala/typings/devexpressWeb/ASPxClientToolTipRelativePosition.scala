package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client-side equivalent of the ToolTipRelativePosition class.
  */
@js.native
trait ASPxClientToolTipRelativePosition extends ASPxClientToolTipPosition {
  
  /**
    * Gets the horizontal offset of a tooltip.
    */
  var offsetX: Double = js.native
  
  /**
    * Gets the vertical offset of a tooltip.
    */
  var offsetY: Double = js.native
}
object ASPxClientToolTipRelativePosition {
  
  @scala.inline
  def apply(offsetX: Double, offsetY: Double): ASPxClientToolTipRelativePosition = {
    val __obj = js.Dynamic.literal(offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientToolTipRelativePosition]
  }
  
  @scala.inline
  implicit class ASPxClientToolTipRelativePositionMutableBuilder[Self <: ASPxClientToolTipRelativePosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
  }
}
