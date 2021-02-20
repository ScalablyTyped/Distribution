package typings.fineUploader.coreMod

import typings.std.HTMLCanvasElement
import typings.std.MimeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasWrapper extends StObject {
  
  /**
    * the `<canvas>` to be converted to a file & then uploaded
    */
  var canvas: js.UndefOr[HTMLCanvasElement] = js.native
  
  /**
    * the name to assign to the created file
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * `1`-`100` value indicating the desired quality of the converted file (only for `image/jpeg`)
    */
  var quality: js.UndefOr[Double] = js.native
  
  /**
    * MIME type of the file to create from this `<canvas>`
    */
  var `type`: js.UndefOr[MimeType] = js.native
}
object CanvasWrapper {
  
  @scala.inline
  def apply(): CanvasWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasWrapper]
  }
  
  @scala.inline
  implicit class CanvasWrapperMutableBuilder[Self <: CanvasWrapper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    @scala.inline
    def setType(value: MimeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
