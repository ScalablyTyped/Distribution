package typings.floydSteinberg

import typings.std.PredefinedColorSpace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: ImageDataSubset */](image: T): T = ^.asInstanceOf[js.Dynamic].apply(image.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("floyd-steinberg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Partial<std.ImageData> & std.Pick<std.ImageData, 'width' | 'height' | 'data'> */
  trait ImageDataSubset extends StObject {
    
    var colorSpace: js.UndefOr[PredefinedColorSpace] = js.undefined
    
    var data: js.UndefOr[js.typedarray.Uint8ClampedArray] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ImageDataSubset {
    
    inline def apply(): ImageDataSubset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageDataSubset]
    }
    
    extension [Self <: ImageDataSubset](x: Self) {
      
      inline def setColorSpace(value: PredefinedColorSpace): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
      
      inline def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
      
      inline def setData(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
