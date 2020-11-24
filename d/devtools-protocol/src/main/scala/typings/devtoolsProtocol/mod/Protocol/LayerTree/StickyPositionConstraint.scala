package typings.devtoolsProtocol.mod.Protocol.LayerTree

import typings.devtoolsProtocol.mod.Protocol.DOM.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StickyPositionConstraint extends js.Object {
  
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
  implicit class StickyPositionConstraintOps[Self <: StickyPositionConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainingBlockRect(value: Rect): Self = this.set("containingBlockRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickyBoxRect(value: Rect): Self = this.set("stickyBoxRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearestLayerShiftingContainingBlock(value: LayerId): Self = this.set("nearestLayerShiftingContainingBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNearestLayerShiftingContainingBlock: Self = this.set("nearestLayerShiftingContainingBlock", js.undefined)
    
    @scala.inline
    def setNearestLayerShiftingStickyBox(value: LayerId): Self = this.set("nearestLayerShiftingStickyBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNearestLayerShiftingStickyBox: Self = this.set("nearestLayerShiftingStickyBox", js.undefined)
  }
}
