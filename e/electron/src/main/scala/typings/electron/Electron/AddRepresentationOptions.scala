package typings.electron.Electron

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddRepresentationOptions extends StObject {
  
  /**
    * The buffer containing the raw image data.
    */
  var buffer: js.UndefOr[Buffer] = js.undefined
  
  /**
    * The data URL containing either a base 64 encoded PNG or JPEG image.
    */
  var dataURL: js.UndefOr[String] = js.undefined
  
  /**
    * Defaults to 0. Required if a bitmap buffer is specified as `buffer`.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The scale factor to add the image representation for.
    */
  var scaleFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * Defaults to 0. Required if a bitmap buffer is specified as `buffer`.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object AddRepresentationOptions {
  
  inline def apply(): AddRepresentationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddRepresentationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddRepresentationOptions] (val x: Self) extends AnyVal {
    
    inline def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    inline def setDataURL(value: String): Self = StObject.set(x, "dataURL", value.asInstanceOf[js.Any])
    
    inline def setDataURLUndefined: Self = StObject.set(x, "dataURL", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    inline def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
