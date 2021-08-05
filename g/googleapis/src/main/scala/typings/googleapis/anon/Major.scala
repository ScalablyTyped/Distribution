package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Major extends StObject {
  
  var major: js.UndefOr[Double] = js.undefined
  
  var minor: js.UndefOr[Double] = js.undefined
}
object Major {
  
  inline def apply(): Major = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Major]
  }
  
  extension [Self <: Major](x: Self) {
    
    inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    inline def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
    
    inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    inline def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
  }
}
