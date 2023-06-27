package typings.floatingUiDom.srcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeScroll extends StObject {
  
  var scrollLeft: Double
  
  var scrollTop: Double
}
object NodeScroll {
  
  inline def apply(scrollLeft: Double, scrollTop: Double): NodeScroll = {
    val __obj = js.Dynamic.literal(scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeScroll]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeScroll] (val x: Self) extends AnyVal {
    
    inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
  }
}
