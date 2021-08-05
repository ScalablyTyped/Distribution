package typings.fineUploader.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationOptions extends StObject {
  
  /**
    * Used by the file selection dialog.
    *
    * Restrict the valid file types that appear in the selection dialog by listing valid content-type specifiers
    *
    * @default `null`
    */
  var acceptFiles: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Specify file valid file extensions here to restrict uploads to specific types
    *
    * @default `[]`
    */
  var allowedExtensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * ImageOptions
    */
  var image: js.UndefOr[ImageOptions] = js.undefined
  
  /**
    * Maximum number of items that can be potentially uploaded in this session.
    *
    * Will reject all items that are added or retried after this limit is reached
    *
    * @default `0`
    */
  var itemLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum allowable size, in bytes, for an item
    *
    * @default `0`
    */
  var minSizeLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum allowable size, in bytes, for an item
    *
    * @default `0`
    */
  var sizeLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * When `true` the first invalid item will stop processing further files
    *
    * @default `true`
    */
  var stopOnFirstInvalidFile: js.UndefOr[Boolean] = js.undefined
}
object ValidationOptions {
  
  inline def apply(): ValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOptions]
  }
  
  extension [Self <: ValidationOptions](x: Self) {
    
    inline def setAcceptFiles(value: js.Any): Self = StObject.set(x, "acceptFiles", value.asInstanceOf[js.Any])
    
    inline def setAcceptFilesUndefined: Self = StObject.set(x, "acceptFiles", js.undefined)
    
    inline def setAllowedExtensions(value: js.Array[String]): Self = StObject.set(x, "allowedExtensions", value.asInstanceOf[js.Any])
    
    inline def setAllowedExtensionsUndefined: Self = StObject.set(x, "allowedExtensions", js.undefined)
    
    inline def setAllowedExtensionsVarargs(value: String*): Self = StObject.set(x, "allowedExtensions", js.Array(value :_*))
    
    inline def setImage(value: ImageOptions): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setItemLimit(value: Double): Self = StObject.set(x, "itemLimit", value.asInstanceOf[js.Any])
    
    inline def setItemLimitUndefined: Self = StObject.set(x, "itemLimit", js.undefined)
    
    inline def setMinSizeLimit(value: Double): Self = StObject.set(x, "minSizeLimit", value.asInstanceOf[js.Any])
    
    inline def setMinSizeLimitUndefined: Self = StObject.set(x, "minSizeLimit", js.undefined)
    
    inline def setSizeLimit(value: Double): Self = StObject.set(x, "sizeLimit", value.asInstanceOf[js.Any])
    
    inline def setSizeLimitUndefined: Self = StObject.set(x, "sizeLimit", js.undefined)
    
    inline def setStopOnFirstInvalidFile(value: Boolean): Self = StObject.set(x, "stopOnFirstInvalidFile", value.asInstanceOf[js.Any])
    
    inline def setStopOnFirstInvalidFileUndefined: Self = StObject.set(x, "stopOnFirstInvalidFile", js.undefined)
  }
}
