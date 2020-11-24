package typings.fineUploader.coreMod

import typings.std.Blob
import typings.std.File
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeInfo extends js.Object {
  
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
  implicit class ResizeInfoOps[Self <: ResizeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlob(value: File | Blob): Self = this.set("blob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlob: Self = this.set("blob", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setImage(value: HTMLImageElement): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setSourceCanvas(value: HTMLCanvasElement): Self = this.set("sourceCanvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCanvas: Self = this.set("sourceCanvas", js.undefined)
    
    @scala.inline
    def setTargetCanvas(value: HTMLCanvasElement): Self = this.set("targetCanvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetCanvas: Self = this.set("targetCanvas", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
