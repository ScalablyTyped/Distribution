package typings.divaJs.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewportPosition extends StObject {
  
  var anchorPage: Boolean
  
  var horizontalOffset: Double
  
  var verticalOffset: Double
  
  var zoomLevel: Null | Double
}
object ViewportPosition {
  
  inline def apply(anchorPage: Boolean, horizontalOffset: Double, verticalOffset: Double): ViewportPosition = {
    val __obj = js.Dynamic.literal(anchorPage = anchorPage.asInstanceOf[js.Any], horizontalOffset = horizontalOffset.asInstanceOf[js.Any], verticalOffset = verticalOffset.asInstanceOf[js.Any], zoomLevel = null)
    __obj.asInstanceOf[ViewportPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewportPosition] (val x: Self) extends AnyVal {
    
    inline def setAnchorPage(value: Boolean): Self = StObject.set(x, "anchorPage", value.asInstanceOf[js.Any])
    
    inline def setHorizontalOffset(value: Double): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
    
    inline def setVerticalOffset(value: Double): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
    
    inline def setZoomLevel(value: Double): Self = StObject.set(x, "zoomLevel", value.asInstanceOf[js.Any])
    
    inline def setZoomLevelNull: Self = StObject.set(x, "zoomLevel", null)
  }
}
