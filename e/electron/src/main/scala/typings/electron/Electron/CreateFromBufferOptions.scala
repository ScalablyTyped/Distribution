package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFromBufferOptions extends StObject {
  
  /**
    * Required for bitmap buffers.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Defaults to 1.0.
    */
  var scaleFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * Required for bitmap buffers.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object CreateFromBufferOptions {
  
  inline def apply(): CreateFromBufferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFromBufferOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFromBufferOptions] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    inline def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
