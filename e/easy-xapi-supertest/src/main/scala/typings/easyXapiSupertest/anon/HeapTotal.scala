package typings.easyXapiSupertest.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeapTotal extends StObject {
  
  var heapTotal: Double
  
  var heapUsed: Double
  
  var rss: Double
}
object HeapTotal {
  
  inline def apply(heapTotal: Double, heapUsed: Double, rss: Double): HeapTotal = {
    val __obj = js.Dynamic.literal(heapTotal = heapTotal.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeapTotal]
  }
  
  extension [Self <: HeapTotal](x: Self) {
    
    inline def setHeapTotal(value: Double): Self = StObject.set(x, "heapTotal", value.asInstanceOf[js.Any])
    
    inline def setHeapUsed(value: Double): Self = StObject.set(x, "heapUsed", value.asInstanceOf[js.Any])
    
    inline def setRss(value: Double): Self = StObject.set(x, "rss", value.asInstanceOf[js.Any])
  }
}
