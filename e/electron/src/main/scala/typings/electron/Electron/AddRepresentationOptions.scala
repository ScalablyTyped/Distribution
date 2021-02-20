package typings.electron.Electron

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddRepresentationOptions extends StObject {
  
  /**
    * The buffer containing the raw image data.
    */
  var buffer: js.UndefOr[Buffer] = js.native
  
  /**
    * The data URL containing either a base 64 encoded PNG or JPEG image.
    */
  var dataURL: js.UndefOr[String] = js.native
  
  /**
    * Defaults to 0. Required if a bitmap buffer is specified as `buffer`.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * The scale factor to add the image representation for.
    */
  var scaleFactor: Double = js.native
  
  /**
    * Defaults to 0. Required if a bitmap buffer is specified as `buffer`.
    */
  var width: js.UndefOr[Double] = js.native
}
object AddRepresentationOptions {
  
  @scala.inline
  def apply(scaleFactor: Double): AddRepresentationOptions = {
    val __obj = js.Dynamic.literal(scaleFactor = scaleFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddRepresentationOptions]
  }
  
  @scala.inline
  implicit class AddRepresentationOptionsMutableBuilder[Self <: AddRepresentationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    @scala.inline
    def setDataURL(value: String): Self = StObject.set(x, "dataURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataURLUndefined: Self = StObject.set(x, "dataURL", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
