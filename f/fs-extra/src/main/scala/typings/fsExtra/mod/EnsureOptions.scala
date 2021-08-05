package typings.fsExtra.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnsureOptions extends StObject {
  
  var mode: js.UndefOr[Double] = js.undefined
}
object EnsureOptions {
  
  inline def apply(): EnsureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnsureOptions]
  }
  
  extension [Self <: EnsureOptions](x: Self) {
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
