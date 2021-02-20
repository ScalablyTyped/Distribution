package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client-side equivalent of the CrosshairFreePosition class.
  */
@js.native
trait ASPxClientCrosshairFreePosition extends ASPxClientCrosshairPosition {
  
  /**
    * Gets a string containing information on a crosshair label's dock position when the crosshair cursor is in the free position mode.
    */
  var dockPosition: String = js.native
  
  /**
    * Gets a Pane's ID when the crosshair cursor is in the free position mode.
    */
  var paneID: Double = js.native
}
object ASPxClientCrosshairFreePosition {
  
  @scala.inline
  def apply(dockPosition: String, offsetX: Double, offsetY: Double, paneID: Double): ASPxClientCrosshairFreePosition = {
    val __obj = js.Dynamic.literal(dockPosition = dockPosition.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], paneID = paneID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairFreePosition]
  }
  
  @scala.inline
  implicit class ASPxClientCrosshairFreePositionMutableBuilder[Self <: ASPxClientCrosshairFreePosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDockPosition(value: String): Self = StObject.set(x, "dockPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaneID(value: Double): Self = StObject.set(x, "paneID", value.asInstanceOf[js.Any])
  }
}
