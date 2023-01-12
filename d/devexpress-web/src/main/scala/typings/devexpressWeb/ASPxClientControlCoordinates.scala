package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ControlCoordinates class.
  */
trait ASPxClientControlCoordinates extends StObject {
  
  /**
    * Gets the point's pane.
    */
  var pane: ASPxClientXYDiagramPane
  
  /**
    * Gets the point's visibility state.
    */
  var visibility: String
  
  /**
    * Gets the point's X-coordinate, in pixels.
    */
  var x: Double
  
  /**
    * Gets the point's Y-coordinate, in pixels.
    */
  var y: Double
}
object ASPxClientControlCoordinates {
  
  inline def apply(pane: ASPxClientXYDiagramPane, visibility: String, x: Double, y: Double): ASPxClientControlCoordinates = {
    val __obj = js.Dynamic.literal(pane = pane.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientControlCoordinates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientControlCoordinates] (val x: Self) extends AnyVal {
    
    inline def setPane(value: ASPxClientXYDiagramPane): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
