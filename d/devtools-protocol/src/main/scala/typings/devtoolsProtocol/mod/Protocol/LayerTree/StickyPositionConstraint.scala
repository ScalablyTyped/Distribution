package typings.devtoolsProtocol.mod.Protocol.LayerTree

import typings.devtoolsProtocol.mod.Protocol.DOM.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StickyPositionConstraint extends StObject {
  
  /**
    * Layout rectangle of the containing block of the sticky element
    */
  var containingBlockRect: Rect
  
  /**
    * The nearest sticky layer that shifts the containing block
    */
  var nearestLayerShiftingContainingBlock: js.UndefOr[LayerId] = js.undefined
  
  /**
    * The nearest sticky layer that shifts the sticky box
    */
  var nearestLayerShiftingStickyBox: js.UndefOr[LayerId] = js.undefined
  
  /**
    * Layout rectangle of the sticky element before being shifted
    */
  var stickyBoxRect: Rect
}
object StickyPositionConstraint {
  
  inline def apply(containingBlockRect: Rect, stickyBoxRect: Rect): StickyPositionConstraint = {
    val __obj = js.Dynamic.literal(containingBlockRect = containingBlockRect.asInstanceOf[js.Any], stickyBoxRect = stickyBoxRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickyPositionConstraint]
  }
  
  extension [Self <: StickyPositionConstraint](x: Self) {
    
    inline def setContainingBlockRect(value: Rect): Self = StObject.set(x, "containingBlockRect", value.asInstanceOf[js.Any])
    
    inline def setNearestLayerShiftingContainingBlock(value: LayerId): Self = StObject.set(x, "nearestLayerShiftingContainingBlock", value.asInstanceOf[js.Any])
    
    inline def setNearestLayerShiftingContainingBlockUndefined: Self = StObject.set(x, "nearestLayerShiftingContainingBlock", js.undefined)
    
    inline def setNearestLayerShiftingStickyBox(value: LayerId): Self = StObject.set(x, "nearestLayerShiftingStickyBox", value.asInstanceOf[js.Any])
    
    inline def setNearestLayerShiftingStickyBoxUndefined: Self = StObject.set(x, "nearestLayerShiftingStickyBox", js.undefined)
    
    inline def setStickyBoxRect(value: Rect): Self = StObject.set(x, "stickyBoxRect", value.asInstanceOf[js.Any])
  }
}
