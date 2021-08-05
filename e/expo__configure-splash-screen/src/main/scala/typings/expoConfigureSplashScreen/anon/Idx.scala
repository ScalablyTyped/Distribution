package typings.expoConfigureSplashScreen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Idx extends StObject {
  
  var idx: js.UndefOr[Double] = js.undefined
}
object Idx {
  
  inline def apply(): Idx = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Idx]
  }
  
  extension [Self <: Idx](x: Self) {
    
    inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    inline def setIdxUndefined: Self = StObject.set(x, "idx", js.undefined)
  }
}
