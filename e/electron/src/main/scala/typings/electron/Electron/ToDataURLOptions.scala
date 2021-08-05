package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToDataURLOptions extends StObject {
  
  /**
    * Defaults to 1.0.
    */
  var scaleFactor: js.UndefOr[Double] = js.undefined
}
object ToDataURLOptions {
  
  inline def apply(): ToDataURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToDataURLOptions]
  }
  
  extension [Self <: ToDataURLOptions](x: Self) {
    
    inline def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    inline def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
  }
}
