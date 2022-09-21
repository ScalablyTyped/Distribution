package typings.floatingUiDom.anon

import typings.floatingUiCore.typesMod.Strategy
import typings.floatingUiDom.isMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rect extends StObject {
  
  var offsetParent: typings.std.Element | Window
  
  var rect: typings.floatingUiCore.typesMod.Rect
  
  var strategy: Strategy
}
object Rect {
  
  inline def apply(
    offsetParent: typings.std.Element | Window,
    rect: typings.floatingUiCore.typesMod.Rect,
    strategy: Strategy
  ): Rect = {
    val __obj = js.Dynamic.literal(offsetParent = offsetParent.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rect]
  }
  
  extension [Self <: Rect](x: Self) {
    
    inline def setOffsetParent(value: typings.std.Element | Window): Self = StObject.set(x, "offsetParent", value.asInstanceOf[js.Any])
    
    inline def setRect(value: typings.floatingUiCore.typesMod.Rect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
