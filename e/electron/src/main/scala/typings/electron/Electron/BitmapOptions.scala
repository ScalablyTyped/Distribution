package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitmapOptions extends StObject {
  
  /**
    * Defaults to 1.0.
    */
  var scaleFactor: js.UndefOr[Double] = js.undefined
}
object BitmapOptions {
  
  inline def apply(): BitmapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BitmapOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BitmapOptions] (val x: Self) extends AnyVal {
    
    inline def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    inline def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
  }
}
