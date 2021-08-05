package typings.gestalt.mod

import typings.gestalt.anon.Height
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollageProps extends StObject {
  
  var columns: Double
  
  var cover: js.UndefOr[Boolean] = js.undefined
  
  var gutter: js.UndefOr[Double] = js.undefined
  
  var height: Double
  
  var layoutKey: js.UndefOr[Double] = js.undefined
  
  def renderImage(args: Height): ReactNode
  
  var width: Double
}
object CollageProps {
  
  inline def apply(columns: Double, height: Double, renderImage: Height => ReactNode, width: Double): CollageProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], renderImage = js.Any.fromFunction1(renderImage), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollageProps]
  }
  
  extension [Self <: CollageProps](x: Self) {
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setCover(value: Boolean): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
    
    inline def setCoverUndefined: Self = StObject.set(x, "cover", js.undefined)
    
    inline def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
    
    inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLayoutKey(value: Double): Self = StObject.set(x, "layoutKey", value.asInstanceOf[js.Any])
    
    inline def setLayoutKeyUndefined: Self = StObject.set(x, "layoutKey", js.undefined)
    
    inline def setRenderImage(value: Height => ReactNode): Self = StObject.set(x, "renderImage", js.Any.fromFunction1(value))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
