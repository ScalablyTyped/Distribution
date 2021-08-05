package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hi extends StObject {
  
  var hi: js.UndefOr[Latitude] = js.undefined
  
  var lo: js.UndefOr[Latitude] = js.undefined
}
object Hi {
  
  inline def apply(): Hi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hi]
  }
  
  extension [Self <: Hi](x: Self) {
    
    inline def setHi(value: Latitude): Self = StObject.set(x, "hi", value.asInstanceOf[js.Any])
    
    inline def setHiUndefined: Self = StObject.set(x, "hi", js.undefined)
    
    inline def setLo(value: Latitude): Self = StObject.set(x, "lo", value.asInstanceOf[js.Any])
    
    inline def setLoUndefined: Self = StObject.set(x, "lo", js.undefined)
  }
}
