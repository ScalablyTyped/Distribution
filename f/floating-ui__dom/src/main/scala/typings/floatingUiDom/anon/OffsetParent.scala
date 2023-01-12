package typings.floatingUiDom.anon

import typings.floatingUiCore.srcTypesMod.Strategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetParent extends StObject {
  
  var offsetParent: typings.std.Element
  
  var rect: typings.floatingUiCore.srcTypesMod.Rect
  
  var strategy: Strategy
}
object OffsetParent {
  
  inline def apply(
    offsetParent: typings.std.Element,
    rect: typings.floatingUiCore.srcTypesMod.Rect,
    strategy: Strategy
  ): OffsetParent = {
    val __obj = js.Dynamic.literal(offsetParent = offsetParent.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetParent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OffsetParent] (val x: Self) extends AnyVal {
    
    inline def setOffsetParent(value: typings.std.Element): Self = StObject.set(x, "offsetParent", value.asInstanceOf[js.Any])
    
    inline def setRect(value: typings.floatingUiCore.srcTypesMod.Rect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
