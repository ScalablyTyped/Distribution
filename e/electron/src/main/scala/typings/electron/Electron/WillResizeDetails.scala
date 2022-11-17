package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WillResizeDetails extends StObject {
  
  /**
    * The edge of the window being dragged for resizing. Can be `bottom`, `left`,
    * `right`, `top-left`, `top-right`, `bottom-left` or `bottom-right`.
    */
  var edge: "bottom" | "left" | "right" | "top-left" | "top-right" | "bottom-left" | "bottom-right"
}
object WillResizeDetails {
  
  inline def apply(edge: "bottom" | "left" | "right" | "top-left" | "top-right" | "bottom-left" | "bottom-right"): WillResizeDetails = {
    val __obj = js.Dynamic.literal(edge = edge.asInstanceOf[js.Any])
    __obj.asInstanceOf[WillResizeDetails]
  }
  
  extension [Self <: WillResizeDetails](x: Self) {
    
    inline def setEdge(value: "bottom" | "left" | "right" | "top-left" | "top-right" | "bottom-left" | "bottom-right"): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
  }
}
