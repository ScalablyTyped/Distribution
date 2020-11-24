package typings.devtoolsProtocol.mod.Protocol.LayerTree

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layer extends js.Object {
  
  /**
    * Transform anchor point X, absent if no transform specified
    */
  var anchorX: js.UndefOr[Double] = js.native
  
  /**
    * Transform anchor point Y, absent if no transform specified
    */
  var anchorY: js.UndefOr[Double] = js.native
  
  /**
    * Transform anchor point Z, absent if no transform specified
    */
  var anchorZ: js.UndefOr[Double] = js.native
  
  /**
    * The backend id for the node associated with this layer.
    */
  var backendNodeId: js.UndefOr[BackendNodeId] = js.native
  
  /**
    * Indicates whether this layer hosts any content, rather than being used for
    * transform/scrolling purposes only.
    */
  var drawsContent: Boolean = js.native
  
  /**
    * Layer height.
    */
  var height: Double = js.native
  
  /**
    * Set if layer is not visible.
    */
  var invisible: js.UndefOr[Boolean] = js.native
  
  /**
    * The unique id for this layer.
    */
  var layerId: LayerId = js.native
  
  /**
    * Offset from parent layer, X coordinate.
    */
  var offsetX: Double = js.native
  
  /**
    * Offset from parent layer, Y coordinate.
    */
  var offsetY: Double = js.native
  
  /**
    * Indicates how many time this layer has painted.
    */
  var paintCount: integer = js.native
  
  /**
    * The id of parent (not present for root).
    */
  var parentLayerId: js.UndefOr[LayerId] = js.native
  
  /**
    * Rectangles scrolling on main thread only.
    */
  var scrollRects: js.UndefOr[js.Array[ScrollRect]] = js.native
  
  /**
    * Sticky position constraint information
    */
  var stickyPositionConstraint: js.UndefOr[StickyPositionConstraint] = js.native
  
  /**
    * Transformation matrix for layer, default is identity matrix
    */
  var transform: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Layer width.
    */
  var width: Double = js.native
}
object Layer {
  
  @scala.inline
  def apply(
    drawsContent: Boolean,
    height: Double,
    layerId: LayerId,
    offsetX: Double,
    offsetY: Double,
    paintCount: integer,
    width: Double
  ): Layer = {
    val __obj = js.Dynamic.literal(drawsContent = drawsContent.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layerId = layerId.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], paintCount = paintCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  implicit class LayerOps[Self <: Layer] (val x: Self) extends AnyVal {
    
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
    def setDrawsContent(value: Boolean): Self = this.set("drawsContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerId(value: LayerId): Self = this.set("layerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaintCount(value: integer): Self = this.set("paintCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorX(value: Double): Self = this.set("anchorX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorX: Self = this.set("anchorX", js.undefined)
    
    @scala.inline
    def setAnchorY(value: Double): Self = this.set("anchorY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorY: Self = this.set("anchorY", js.undefined)
    
    @scala.inline
    def setAnchorZ(value: Double): Self = this.set("anchorZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorZ: Self = this.set("anchorZ", js.undefined)
    
    @scala.inline
    def setBackendNodeId(value: BackendNodeId): Self = this.set("backendNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackendNodeId: Self = this.set("backendNodeId", js.undefined)
    
    @scala.inline
    def setInvisible(value: Boolean): Self = this.set("invisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvisible: Self = this.set("invisible", js.undefined)
    
    @scala.inline
    def setParentLayerId(value: LayerId): Self = this.set("parentLayerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentLayerId: Self = this.set("parentLayerId", js.undefined)
    
    @scala.inline
    def setScrollRectsVarargs(value: ScrollRect*): Self = this.set("scrollRects", js.Array(value :_*))
    
    @scala.inline
    def setScrollRects(value: js.Array[ScrollRect]): Self = this.set("scrollRects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollRects: Self = this.set("scrollRects", js.undefined)
    
    @scala.inline
    def setStickyPositionConstraint(value: StickyPositionConstraint): Self = this.set("stickyPositionConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStickyPositionConstraint: Self = this.set("stickyPositionConstraint", js.undefined)
    
    @scala.inline
    def setTransformVarargs(value: Double*): Self = this.set("transform", js.Array(value :_*))
    
    @scala.inline
    def setTransform(value: js.Array[Double]): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}
