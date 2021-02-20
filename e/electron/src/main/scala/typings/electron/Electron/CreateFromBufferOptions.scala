package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFromBufferOptions extends StObject {
  
  /**
    * Required for bitmap buffers.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Defaults to 1.0.
    */
  var scaleFactor: js.UndefOr[Double] = js.native
  
  /**
    * Required for bitmap buffers.
    */
  var width: js.UndefOr[Double] = js.native
}
object CreateFromBufferOptions {
  
  @scala.inline
  def apply(): CreateFromBufferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFromBufferOptions]
  }
  
  @scala.inline
  implicit class CreateFromBufferOptionsMutableBuilder[Self <: CreateFromBufferOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
