package typings.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageLoad extends StObject {
  
  var `implicit`: Double
  
  var pageLoad: Double
  
  var script: Double
}
object PageLoad {
  
  inline def apply(`implicit`: Double, pageLoad: Double, script: Double): PageLoad = {
    val __obj = js.Dynamic.literal(pageLoad = pageLoad.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.updateDynamic("implicit")(`implicit`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageLoad]
  }
  
  extension [Self <: PageLoad](x: Self) {
    
    inline def setImplicit(value: Double): Self = StObject.set(x, "implicit", value.asInstanceOf[js.Any])
    
    inline def setPageLoad(value: Double): Self = StObject.set(x, "pageLoad", value.asInstanceOf[js.Any])
    
    inline def setScript(value: Double): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
  }
}
