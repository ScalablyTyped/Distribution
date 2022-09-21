package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmoothScroll extends StObject {
  
  def scrollToLoc(loc: String, options: Any, callback: js.Function): Boolean
}
object SmoothScroll {
  
  inline def apply(scrollToLoc: (String, Any, js.Function) => Boolean): SmoothScroll = {
    val __obj = js.Dynamic.literal(scrollToLoc = js.Any.fromFunction3(scrollToLoc))
    __obj.asInstanceOf[SmoothScroll]
  }
  
  extension [Self <: SmoothScroll](x: Self) {
    
    inline def setScrollToLoc(value: (String, Any, js.Function) => Boolean): Self = StObject.set(x, "scrollToLoc", js.Any.fromFunction3(value))
  }
}
