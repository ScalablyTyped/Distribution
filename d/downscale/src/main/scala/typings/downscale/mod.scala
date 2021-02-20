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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Overloads that automatically type the return value based on the selected options
    */
  @JSImport("downscale", JSImport.Namespace)
  @js.native
  def apply(source: ImageSource, width: Double, height: Double): js.Promise[HTMLCanvasElement] = js.native
  @JSImport("downscale", JSImport.Namespace)
  @js.native
  def apply(source: ImageSource, width: Double, height: Double, options: DownscaleOptionsreturnBlo): js.Promise[Blob] = js.native
  @JSImport("downscale", JSImport.Namespace)
  @js.native
  def apply(source: ImageSource, width: Double, height: Double, options: DownscaleOptionsreturnBloImageType): js.Promise[String] = js.native
  @JSImport("downscale", JSImport.Namespace)
  @js.native
  def apply(source: ImageSource, width: Double, height: Double, options: DownscaleOptionsreturnCan): js.Promise[HTMLCanvasElement] = js.native
  
  @js.native
  trait DownscaleOptions extends StObject {
    
    var imageType: js.UndefOr[String] = js.native
    
    var quality: js.UndefOr[Double] = js.native
    
    var returnBlob: js.UndefOr[Boolean] = js.native
    
    var returnCanvas: js.UndefOr[Boolean] = js.native
    
    var sourceX: js.UndefOr[Double] = js.native
    
    var sourceY: js.UndefOr[Double] = js.native
  }
  object DownscaleOptions {
    
    @scala.inline
    def apply(): DownscaleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownscaleOptions]
    }
    
    @scala.inline
    implicit class DownscaleOptionsMutableBuilder[Self <: DownscaleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setReturnBlob(value: Boolean): Self = StObject.set(x, "returnBlob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnBlobUndefined: Self = StObject.set(x, "returnBlob", js.undefined)
      
      @scala.inline
      def setReturnCanvas(value: Boolean): Self = StObject.set(x, "returnCanvas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnCanvasUndefined: Self = StObject.set(x, "returnCanvas", js.undefined)
      
      @scala.inline
      def setSourceX(value: Double): Self = StObject.set(x, "sourceX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceXUndefined: Self = StObject.set(x, "sourceX", js.undefined)
      
      @scala.inline
      def setSourceY(value: Double): Self = StObject.set(x, "sourceY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceYUndefined: Self = StObject.set(x, "sourceY", js.undefined)
    }
  }
  
  type ImageSource = File | HTMLImageElement | HTMLVideoElement | String
}
