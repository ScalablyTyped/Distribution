package typings.googleMaps.google.maps

import org.scalablytyped.runtime.Instantiable1
import typings.googleMaps.google.maps.drawing.DrawingManager
import typings.googleMaps.google.maps.drawing.DrawingManagerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawingLibrary extends StObject {
  
  var DrawingManager: Instantiable1[
    /* options */ js.UndefOr[DrawingManagerOptions | Null], 
    typings.googleMaps.google.maps.drawing.DrawingManager
  ]
  
  var OverlayType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.drawing.OverlayType */ Any
}
object DrawingLibrary {
  
  inline def apply(
    DrawingManager: Instantiable1[/* options */ js.UndefOr[DrawingManagerOptions | Null], DrawingManager],
    OverlayType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.drawing.OverlayType */ Any
  ): DrawingLibrary = {
    val __obj = js.Dynamic.literal(DrawingManager = DrawingManager.asInstanceOf[js.Any], OverlayType = OverlayType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawingLibrary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrawingLibrary] (val x: Self) extends AnyVal {
    
    inline def setDrawingManager(value: Instantiable1[/* options */ js.UndefOr[DrawingManagerOptions | Null], DrawingManager]): Self = StObject.set(x, "DrawingManager", value.asInstanceOf[js.Any])
    
    inline def setOverlayType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.drawing.OverlayType */ Any
    ): Self = StObject.set(x, "OverlayType", value.asInstanceOf[js.Any])
  }
}
