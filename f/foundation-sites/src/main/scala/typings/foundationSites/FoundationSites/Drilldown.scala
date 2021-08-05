package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/drilldown-menu.html#javascript-reference
trait Drilldown extends StObject {
  
  def destroy(): Unit
}
object Drilldown {
  
  inline def apply(destroy: () => Unit): Drilldown = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[Drilldown]
  }
  
  extension [Self <: Drilldown](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}
