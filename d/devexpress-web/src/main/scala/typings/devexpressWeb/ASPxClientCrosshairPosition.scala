package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client-side equivalent of the CrosshairLabelPosition class.
  */
@js.native
trait ASPxClientCrosshairPosition extends StObject {
  
  /**
    * Gets the horizontal offset of a crosshair cursor.
    */
  var offsetX: Double = js.native
  
  /**
    * Gets the vertical offset of a crosshair cursor.
    */
  var offsetY: Double = js.native
}
object ASPxClientCrosshairPosition {
  
  @scala.inline
  def apply(offsetX: Double, offsetY: Double): ASPxClientCrosshairPosition = {
    val __obj = js.Dynamic.literal(offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairPosition]
  }
  
  @scala.inline
  implicit class ASPxClientCrosshairPositionMutableBuilder[Self <: ASPxClientCrosshairPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
  }
}
