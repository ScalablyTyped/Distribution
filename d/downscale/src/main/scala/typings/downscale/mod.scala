package typings.downscale

import typings.downscale.anon.DownscaleOptionsreturnBlo
import typings.downscale.anon.DownscaleOptionsreturnBloImageType
import typings.downscale.anon.DownscaleOptionsreturnCan
import typings.std.Blob
import typings.std.File
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Overloads that automatically type the return value based on the selected options
    */
  inline def apply(source: ImageSource, width: Double, height: Double): js.Promise[HTMLCanvasElement] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLCanvasElement]]
  inline def apply(source: ImageSource, width: Double, height: Double, options: DownscaleOptionsreturnBlo): js.Promise[Blob] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blob]]
  inline def apply(source: ImageSource, width: Double, height: Double, options: DownscaleOptionsreturnBloImageType): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def apply(source: ImageSource, width: Double, height: Double, options: DownscaleOptionsreturnCan): js.Promise[HTMLCanvasElement] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLCanvasElement]]
  
  @JSImport("downscale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DownscaleOptions extends StObject {
    
    var imageType: js.UndefOr[String] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var returnBlob: js.UndefOr[Boolean] = js.undefined
    
    var returnCanvas: js.UndefOr[Boolean] = js.undefined
    
    var sourceX: js.UndefOr[Double] = js.undefined
    
    var sourceY: js.UndefOr[Double] = js.undefined
  }
  object DownscaleOptions {
    
    inline def apply(): DownscaleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownscaleOptions]
    }
    
    extension [Self <: DownscaleOptions](x: Self) {
      
      inline def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
      
      inline def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setReturnBlob(value: Boolean): Self = StObject.set(x, "returnBlob", value.asInstanceOf[js.Any])
      
      inline def setReturnBlobUndefined: Self = StObject.set(x, "returnBlob", js.undefined)
      
      inline def setReturnCanvas(value: Boolean): Self = StObject.set(x, "returnCanvas", value.asInstanceOf[js.Any])
      
      inline def setReturnCanvasUndefined: Self = StObject.set(x, "returnCanvas", js.undefined)
      
      inline def setSourceX(value: Double): Self = StObject.set(x, "sourceX", value.asInstanceOf[js.Any])
      
      inline def setSourceXUndefined: Self = StObject.set(x, "sourceX", js.undefined)
      
      inline def setSourceY(value: Double): Self = StObject.set(x, "sourceY", value.asInstanceOf[js.Any])
      
      inline def setSourceYUndefined: Self = StObject.set(x, "sourceY", js.undefined)
    }
  }
  
  type ImageSource = File | HTMLImageElement | HTMLVideoElement | String
}
