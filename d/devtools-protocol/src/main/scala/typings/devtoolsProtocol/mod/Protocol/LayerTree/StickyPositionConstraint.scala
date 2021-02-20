package typings.devtoolsProtocol.mod.Protocol.LayerTree

import typings.devtoolsProtocol.mod.Protocol.DOM.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StickyPositionConstraint extends StObject {
  
  /**
    * Layout rectangle of the containing block of the sticky element
    */
  var containingBlockRect: Rect = js.native
  
  /**
    * The nearest sticky layer that shifts the containing block
    */
  var nearestLayerShiftingContainingBlock: js.UndefOr[LayerId] = js.native
  
  /**
    * The nearest sticky layer that shifts the sticky box
    */
  var nearestLayerShiftingStickyBox: js.UndefOr[LayerId] = js.native
  
  /**
    * Layout rectangle of the sticky element before being shifted
    */
  var stickyBoxRect: Rect = js.native
}
object StickyPositionConstraint {
  
  @scala.inline
  def apply(containingBlockRect: Rect, stickyBoxRect: Rect): StickyPositionConstraint = {
    val __obj = js.Dynamic.literal(containingBlockRect = containingBlockRect.asInstanceOf[js.Any], stickyBoxRect = stickyBoxRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickyPositionConstraint]
  }
  
  @scala.inline
  implicit class StickyPositionConstraintMutableBuilder[Self <: StickyPositionConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainingBlockRect(value: Rect): Self = StObject.set(x, "containingBlockRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearestLayerShiftingContainingBlock(value: LayerId): Self = StObject.set(x, "nearestLayerShiftingContainingBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearestLayerShiftingContainingBlockUndefined: Self = StObject.set(x, "nearestLayerShiftingContainingBlock", js.undefined)
    
    @scala.inline
    def setNearestLayerShiftingStickyBox(value: LayerId): Self = StObject.set(x, "nearestLayerShiftingStickyBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearestLayerShiftingStickyBoxUndefined: Self = StObject.set(x, "nearestLayerShiftingStickyBox", js.undefined)
    
    @scala.inline
    def setStickyBoxRect(value: Rect): Self = StObject.set(x, "stickyBoxRect", value.asInstanceOf[js.Any])
  }
}
