package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaximumQps extends StObject {
  
  var maximumQps: js.UndefOr[Double] = js.undefined
  
  var region: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object MaximumQps {
  
  inline def apply(): MaximumQps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaximumQps]
  }
  
  extension [Self <: MaximumQps](x: Self) {
    
    inline def setMaximumQps(value: Double): Self = StObject.set(x, "maximumQps", value.asInstanceOf[js.Any])
    
    inline def setMaximumQpsUndefined: Self = StObject.set(x, "maximumQps", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
