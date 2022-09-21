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
    
    var data: js.UndefOr[js.typedarray.Uint8ClampedArray] & js.typedarray.Uint8ClampedArray
    
    var height: js.UndefOr[Double] & Double
    
    var width: js.UndefOr[Double] & Double
  }
  object ImageDataSubset {
    
    inline def apply(
      data: js.UndefOr[js.typedarray.Uint8ClampedArray] & js.typedarray.Uint8ClampedArray,
      height: js.UndefOr[Double] & Double,
      width: js.UndefOr[Double] & Double
    ): ImageDataSubset = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageDataSubset]
    }
    
    extension [Self <: ImageDataSubset](x: Self) {
      
      inline def setColorSpace(value: PredefinedColorSpace): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
      
      inline def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
      
      inline def setData(value: js.UndefOr[js.typedarray.Uint8ClampedArray] & js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
