package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollParams
  extends StObject
     with GenericParams {
  
  var scroll: TimeSpan
  
  var scrollId: String
}
object ScrollParams {
  
  inline def apply(scroll: TimeSpan, scrollId: String): ScrollParams = {
    val __obj = js.Dynamic.literal(scroll = scroll.asInstanceOf[js.Any], scrollId = scrollId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollParams]
  }
  
  extension [Self <: ScrollParams](x: Self) {
    
    inline def setScroll(value: TimeSpan): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollId(value: String): Self = StObject.set(x, "scrollId", value.asInstanceOf[js.Any])
  }
}
