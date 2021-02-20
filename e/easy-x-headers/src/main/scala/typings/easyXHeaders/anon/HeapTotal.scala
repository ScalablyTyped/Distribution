package typings.easyXHeaders.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeapTotal extends StObject {
  
  var heapTotal: Double = js.native
  
  var heapUsed: Double = js.native
  
  var rss: Double = js.native
}
object HeapTotal {
  
  @scala.inline
  def apply(heapTotal: Double, heapUsed: Double, rss: Double): HeapTotal = {
    val __obj = js.Dynamic.literal(heapTotal = heapTotal.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeapTotal]
  }
  
  @scala.inline
  implicit class HeapTotalMutableBuilder[Self <: HeapTotal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeapTotal(value: Double): Self = StObject.set(x, "heapTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeapUsed(value: Double): Self = StObject.set(x, "heapUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRss(value: Double): Self = StObject.set(x, "rss", value.asInstanceOf[js.Any])
  }
}
