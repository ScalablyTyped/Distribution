package typings.fineUploader.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageOptions extends StObject {
  
  /**
    * Restrict images to a maximum height in pixels (wherever possible)
    *
    * @default `0`
    */
  var maxHeight: js.UndefOr[Double] = js.native
  
  /**
    * Restrict images to a maximum width in pixels (wherever possible)
    *
    * @default `0`
    */
  var maxWidth: js.UndefOr[Double] = js.native
  
  /**
    * Restrict images to a minimum height in pixels (wherever possible)
    *
    * @default `0`
    */
  var minHeight: js.UndefOr[Double] = js.native
  
  /**
    * Restrict images to a minimum width in pixels (wherever possible)
    *
    * @default `0`
    */
  var minWidth: js.UndefOr[Double] = js.native
}
object ImageOptions {
  
  @scala.inline
  def apply(): ImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageOptions]
  }
  
  @scala.inline
  implicit class ImageOptionsMutableBuilder[Self <: ImageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
  }
}
