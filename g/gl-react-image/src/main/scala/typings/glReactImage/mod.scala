package typings.glReactImage

import typings.glReactImage.glReactImageStrings.contain
import typings.glReactImage.glReactImageStrings.cover
import typings.glReactImage.glReactImageStrings.free
import typings.glReactImage.glReactImageStrings.stretch
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gl-react-image", JSImport.Default)
  @js.native
  open class default ()
    extends Component[GLImageProps, js.Object, Any]
  
  type GLImage = Component[GLImageProps, js.Object, Any]
  
  trait GLImageProps extends StObject {
    
    var center: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var resizeMode: js.UndefOr[cover | free | contain | stretch] = js.undefined
    
    var source: Any
    
    var zoom: js.UndefOr[Double] = js.undefined
  }
  object GLImageProps {
    
    inline def apply(source: Any): GLImageProps = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[GLImageProps]
    }
    
    extension [Self <: GLImageProps](x: Self) {
      
      inline def setCenter(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setResizeMode(value: cover | free | contain | stretch): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
      
      inline def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
}
