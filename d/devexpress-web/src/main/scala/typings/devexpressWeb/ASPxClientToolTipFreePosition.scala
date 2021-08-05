package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client-side equivalent of the ToolTipFreePosition class.
  */
trait ASPxClientToolTipFreePosition
  extends StObject
     with ASPxClientToolTipPosition {
  
  /**
    * Gets an object containing settings that define how a tooltip should be docked.
    */
  var dockPosition: String
  
  /**
    * Gets the horizontal offset of a tooltip.
    */
  var offsetX: Double
  
  /**
    * Gets the vertical offset of a tooltip.
    */
  var offsetY: Double
  
  /**
    * Gets the ID of a pane.
    */
  var paneID: Double
}
object ASPxClientToolTipFreePosition {
  
  inline def apply(dockPosition: String, offsetX: Double, offsetY: Double, paneID: Double): ASPxClientToolTipFreePosition = {
    val __obj = js.Dynamic.literal(dockPosition = dockPosition.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], paneID = paneID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientToolTipFreePosition]
  }
  
  extension [Self <: ASPxClientToolTipFreePosition](x: Self) {
    
    inline def setDockPosition(value: String): Self = StObject.set(x, "dockPosition", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setPaneID(value: Double): Self = StObject.set(x, "paneID", value.asInstanceOf[js.Any])
  }
}
