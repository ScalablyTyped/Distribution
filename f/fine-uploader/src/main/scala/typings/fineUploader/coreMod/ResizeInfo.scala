package typings.fineUploader.coreMod

import typings.std.Blob
import typings.std.File
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeInfo extends StObject {
  
  /**
    * The original `File` or `Blob` object, if available.
    */
  var blob: js.UndefOr[File | Blob] = js.native
  
  /**
    * Desired height of the image after the resize operation.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * The original HTMLImageElement object, if available.
    */
  var image: js.UndefOr[HTMLImageElement] = js.native
  
  /**
    * `HTMLCanvasElement` element containing the original image data (not resized).
    */
  var sourceCanvas: js.UndefOr[HTMLCanvasElement] = js.native
  
  /**
    * `HTMLCanvasElement` element containing the `HTMLCanvasElement` that should contain the resized image.
    */
  var targetCanvas: js.UndefOr[HTMLCanvasElement] = js.native
  
  /**
    * Desired width of the image after the resize operation.
    */
  var width: js.UndefOr[Double] = js.native
}
object ResizeInfo {
  
  @scala.inline
  def apply(): ResizeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeInfo]
  }
  
  @scala.inline
  implicit class ResizeInfoMutableBuilder[Self <: ResizeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlob(value: File | Blob): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setImage(value: HTMLImageElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setSourceCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "sourceCanvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCanvasUndefined: Self = StObject.set(x, "sourceCanvas", js.undefined)
    
    @scala.inline
    def setTargetCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "targetCanvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCanvasUndefined: Self = StObject.set(x, "targetCanvas", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
