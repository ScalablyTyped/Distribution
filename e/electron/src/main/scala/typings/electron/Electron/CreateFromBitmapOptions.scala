package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFromBitmapOptions extends StObject {
  
  var height: Double
  
  /**
    * Defaults to 1.0.
    */
  var scaleFactor: js.UndefOr[Double] = js.undefined
  
  var width: Double
}
object CreateFromBitmapOptions {
  
  @scala.inline
  def apply(height: Double, width: Double): CreateFromBitmapOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFromBitmapOptions]
  }
  
  @scala.inline
  implicit class CreateFromBitmapOptionsMutableBuilder[Self <: CreateFromBitmapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
