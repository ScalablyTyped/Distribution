package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollParams extends GenericParams {
  
  var scroll: TimeSpan = js.native
  
  var scrollId: String = js.native
}
object ScrollParams {
  
  @scala.inline
  def apply(scroll: TimeSpan, scrollId: String): ScrollParams = {
    val __obj = js.Dynamic.literal(scroll = scroll.asInstanceOf[js.Any], scrollId = scrollId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollParams]
  }
  
  @scala.inline
  implicit class ScrollParamsMutableBuilder[Self <: ScrollParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScroll(value: TimeSpan): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollId(value: String): Self = StObject.set(x, "scrollId", value.asInstanceOf[js.Any])
  }
}
