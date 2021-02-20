package typings.downscale

import typings.downscale.downscaleBooleans.`false`
import typings.downscale.downscaleBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined downscale.downscale.DownscaleOptions & {  returnBlob :true} */
  @js.native
  trait DownscaleOptionsreturnBlo extends StObject {
    
    var imageType: js.UndefOr[String] = js.native
    
    var quality: js.UndefOr[Double] = js.native
    
    var returnBlob: js.UndefOr[Boolean] with `true` = js.native
    
    var returnCanvas: js.UndefOr[Boolean] = js.native
    
    var sourceX: js.UndefOr[Double] = js.native
    
    var sourceY: js.UndefOr[Double] = js.native
  }
  object DownscaleOptionsreturnBlo {
    
    @scala.inline
    def apply(returnBlob: js.UndefOr[Boolean] with `true`): DownscaleOptionsreturnBlo = {
      val __obj = js.Dynamic.literal(returnBlob = returnBlob.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownscaleOptionsreturnBlo]
    }
    
    @scala.inline
    implicit class DownscaleOptionsreturnBloMutableBuilder[Self <: DownscaleOptionsreturnBlo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setReturnBlob(value: js.UndefOr[Boolean] with `true`): Self = StObject.set(x, "returnBlob", value.asInstanceOf[js.Any])
      
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
  
  /* Inlined downscale.downscale.DownscaleOptions & {  returnBlob :false | undefined,   returnCanvas :false | undefined} */
  @js.native
  trait DownscaleOptionsreturnBloImageType extends StObject {
    
    var imageType: js.UndefOr[String] = js.native
    
    var quality: js.UndefOr[Double] = js.native
    
    var returnBlob: js.UndefOr[Boolean] with js.UndefOr[`false`] = js.native
    
    var returnCanvas: js.UndefOr[Boolean] with js.UndefOr[`false`] = js.native
    
    var sourceX: js.UndefOr[Double] = js.native
    
    var sourceY: js.UndefOr[Double] = js.native
  }
  object DownscaleOptionsreturnBloImageType {
    
    @scala.inline
    def apply(
      returnBlob: js.UndefOr[Boolean] with js.UndefOr[`false`],
      returnCanvas: js.UndefOr[Boolean] with js.UndefOr[`false`]
    ): DownscaleOptionsreturnBloImageType = {
      val __obj = js.Dynamic.literal(returnBlob = returnBlob.asInstanceOf[js.Any], returnCanvas = returnCanvas.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownscaleOptionsreturnBloImageType]
    }
    
    @scala.inline
    implicit class DownscaleOptionsreturnBloImageTypeMutableBuilder[Self <: DownscaleOptionsreturnBloImageType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setReturnBlob(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = StObject.set(x, "returnBlob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnCanvas(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = StObject.set(x, "returnCanvas", value.asInstanceOf[js.Any])
      
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
  
  /* Inlined downscale.downscale.DownscaleOptions & {  returnCanvas :true} */
  @js.native
  trait DownscaleOptionsreturnCan extends StObject {
    
    var imageType: js.UndefOr[String] = js.native
    
    var quality: js.UndefOr[Double] = js.native
    
    var returnBlob: js.UndefOr[Boolean] = js.native
    
    var returnCanvas: js.UndefOr[Boolean] with `true` = js.native
    
    var sourceX: js.UndefOr[Double] = js.native
    
    var sourceY: js.UndefOr[Double] = js.native
  }
  object DownscaleOptionsreturnCan {
    
    @scala.inline
    def apply(returnCanvas: js.UndefOr[Boolean] with `true`): DownscaleOptionsreturnCan = {
      val __obj = js.Dynamic.literal(returnCanvas = returnCanvas.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownscaleOptionsreturnCan]
    }
    
    @scala.inline
    implicit class DownscaleOptionsreturnCanMutableBuilder[Self <: DownscaleOptionsreturnCan] (val x: Self) extends AnyVal {
      
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
      def setReturnCanvas(value: js.UndefOr[Boolean] with `true`): Self = StObject.set(x, "returnCanvas", value.asInstanceOf[js.Any])
      
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
}
