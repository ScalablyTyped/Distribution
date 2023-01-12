package typings.fineUploader.libCoreMod

import typings.std.Blob
import typings.std.File
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeInfo extends StObject {
  
  /**
    * The original `File` or `Blob` object, if available.
    */
  var blob: js.UndefOr[File | Blob] = js.undefined
  
  /**
    * Desired height of the image after the resize operation.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The original HTMLImageElement object, if available.
    */
  var image: js.UndefOr[HTMLImageElement] = js.undefined
  
  /**
    * `HTMLCanvasElement` element containing the original image data (not resized).
    */
  var sourceCanvas: js.UndefOr[HTMLCanvasElement] = js.undefined
  
  /**
    * `HTMLCanvasElement` element containing the `HTMLCanvasElement` that should contain the resized image.
    */
  var targetCanvas: js.UndefOr[HTMLCanvasElement] = js.undefined
  
  /**
    * Desired width of the image after the resize operation.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ResizeInfo {
  
  inline def apply(): ResizeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResizeInfo] (val x: Self) extends AnyVal {
    
    inline def setBlob(value: File | Blob): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    
    inline def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setImage(value: HTMLImageElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setSourceCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "sourceCanvas", value.asInstanceOf[js.Any])
    
    inline def setSourceCanvasUndefined: Self = StObject.set(x, "sourceCanvas", js.undefined)
    
    inline def setTargetCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "targetCanvas", value.asInstanceOf[js.Any])
    
    inline def setTargetCanvasUndefined: Self = StObject.set(x, "targetCanvas", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
