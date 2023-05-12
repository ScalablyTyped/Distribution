package typings.fullcalendarCore.internalCommonMod

import typings.preact.mod.ComponentChild
import typings.preact.mod.ComponentChildren
import typings.preact.mod.Ref
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollerProps extends StObject {
  
  var children: js.UndefOr[ComponentChildren] = js.undefined
  
  var elRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
  
  var liquid: js.UndefOr[Boolean] = js.undefined
  
  var liquidIsAbsolute: js.UndefOr[Boolean] = js.undefined
  
  var maxHeight: js.UndefOr[CssDimValue] = js.undefined
  
  var overcomeBottom: js.UndefOr[Double] = js.undefined
  
  var overcomeLeft: js.UndefOr[Double] = js.undefined
  
  var overcomeRight: js.UndefOr[Double] = js.undefined
  
  var overflowX: OverflowValue
  
  var overflowY: OverflowValue
}
object ScrollerProps {
  
  inline def apply(overflowX: OverflowValue, overflowY: OverflowValue): ScrollerProps = {
    val __obj = js.Dynamic.literal(overflowX = overflowX.asInstanceOf[js.Any], overflowY = overflowY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollerProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ComponentChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setElRef(value: Ref[HTMLElement]): Self = StObject.set(x, "elRef", value.asInstanceOf[js.Any])
    
    inline def setElRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "elRef", js.Any.fromFunction1(value))
    
    inline def setElRefNull: Self = StObject.set(x, "elRef", null)
    
    inline def setElRefUndefined: Self = StObject.set(x, "elRef", js.undefined)
    
    inline def setLiquid(value: Boolean): Self = StObject.set(x, "liquid", value.asInstanceOf[js.Any])
    
    inline def setLiquidIsAbsolute(value: Boolean): Self = StObject.set(x, "liquidIsAbsolute", value.asInstanceOf[js.Any])
    
    inline def setLiquidIsAbsoluteUndefined: Self = StObject.set(x, "liquidIsAbsolute", js.undefined)
    
    inline def setLiquidUndefined: Self = StObject.set(x, "liquid", js.undefined)
    
    inline def setMaxHeight(value: CssDimValue): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setOvercomeBottom(value: Double): Self = StObject.set(x, "overcomeBottom", value.asInstanceOf[js.Any])
    
    inline def setOvercomeBottomUndefined: Self = StObject.set(x, "overcomeBottom", js.undefined)
    
    inline def setOvercomeLeft(value: Double): Self = StObject.set(x, "overcomeLeft", value.asInstanceOf[js.Any])
    
    inline def setOvercomeLeftUndefined: Self = StObject.set(x, "overcomeLeft", js.undefined)
    
    inline def setOvercomeRight(value: Double): Self = StObject.set(x, "overcomeRight", value.asInstanceOf[js.Any])
    
    inline def setOvercomeRightUndefined: Self = StObject.set(x, "overcomeRight", js.undefined)
    
    inline def setOverflowX(value: OverflowValue): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
    
    inline def setOverflowY(value: OverflowValue): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
  }
}
