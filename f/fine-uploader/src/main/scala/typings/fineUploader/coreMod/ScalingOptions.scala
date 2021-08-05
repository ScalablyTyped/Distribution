package typings.fineUploader.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalingOptions extends StObject {
  
  /**
    * Ignored if the current browser does not support image previews.
    *
    * If you want to use an alternate scaling library, you must contribute a function for this option that returns a Promise.
    * Once the resize is complete, your promise must be fulfilled. You may, of course, reject your returned Promise is the resize fails in some way
    *
    * @default `undefined`
    */
  var customResizer: js.UndefOr[CustomResizerCallBack] = js.undefined
  
  /**
    * A value between `1` and `100` that describes the requested quality of scaled images.
    *
    * Ignored unless the scaled image type target is `image/jpeg`
    *
    * @default `80`
    */
  var defaultQuality: js.UndefOr[Double] = js.undefined
  
  /**
    * Scaled images will assume this image type if you don't specify a specific type in your size object, or if the type specified in the size object is not valid.
    *
    * You generally should not use any value other than `image/jpeg` or `image/png` here.
    *
    * The default value of null will ensure the scaled image type is `PNG`, unless the original file is a `JPEG`, in which case the scaled file will also be a `JPEG`.
    * The default is probably the safest option.
    *
    * @default `null`
    */
  var defaultType: js.UndefOr[String] = js.undefined
  
  /**
    * Text sent to your `complete` event handler as an `error` property of the `response` param if a scaled image could not be generated
    *
    * @default `'failed to scale'`
    */
  var failureText: js.UndefOr[String] = js.undefined
  
  /**
    * Ensure the `EXIF` data from the reference image is inserted into the scaled image. Only applicable when both the reference and the target are type `image/jpeg`
    *
    * @default `false`
    */
  var includeExif: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set this to `false` if you do not want scaled images to be re-oriented based on parsed `EXIF` data before they are uploaded
    *
    * @default `true`
    */
  var orient: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set this to `false` if you don't want to original file to be uploaded as well
    *
    * @default `true`
    */
  var sendOriginal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array containing size objects that describe scaled versions of each submitted image that should be generated and uploaded
    *
    * @default `[]`
    */
  var sizes: js.UndefOr[SizeOptions] = js.undefined
}
object ScalingOptions {
  
  inline def apply(): ScalingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalingOptions]
  }
  
  extension [Self <: ScalingOptions](x: Self) {
    
    inline def setCustomResizer(value: /* resizeInfo */ ResizeInfo => PromiseOptions): Self = StObject.set(x, "customResizer", js.Any.fromFunction1(value))
    
    inline def setCustomResizerUndefined: Self = StObject.set(x, "customResizer", js.undefined)
    
    inline def setDefaultQuality(value: Double): Self = StObject.set(x, "defaultQuality", value.asInstanceOf[js.Any])
    
    inline def setDefaultQualityUndefined: Self = StObject.set(x, "defaultQuality", js.undefined)
    
    inline def setDefaultType(value: String): Self = StObject.set(x, "defaultType", value.asInstanceOf[js.Any])
    
    inline def setDefaultTypeUndefined: Self = StObject.set(x, "defaultType", js.undefined)
    
    inline def setFailureText(value: String): Self = StObject.set(x, "failureText", value.asInstanceOf[js.Any])
    
    inline def setFailureTextUndefined: Self = StObject.set(x, "failureText", js.undefined)
    
    inline def setIncludeExif(value: Boolean): Self = StObject.set(x, "includeExif", value.asInstanceOf[js.Any])
    
    inline def setIncludeExifUndefined: Self = StObject.set(x, "includeExif", js.undefined)
    
    inline def setOrient(value: Boolean): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
    
    inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
    
    inline def setSendOriginal(value: Boolean): Self = StObject.set(x, "sendOriginal", value.asInstanceOf[js.Any])
    
    inline def setSendOriginalUndefined: Self = StObject.set(x, "sendOriginal", js.undefined)
    
    inline def setSizes(value: SizeOptions): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
  }
}
