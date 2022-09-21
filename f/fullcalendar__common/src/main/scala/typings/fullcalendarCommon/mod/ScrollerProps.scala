package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollerProps extends StObject {
  
  var children: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any
  ] = js.undefined
  
  var elRef: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<HTMLElement> */ Any
  ] = js.undefined
  
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
  
  extension [Self <: ScrollerProps](x: Self) {
    
    inline def setChildren(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setElRef(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<HTMLElement> */ Any
    ): Self = StObject.set(x, "elRef", value.asInstanceOf[js.Any])
    
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
