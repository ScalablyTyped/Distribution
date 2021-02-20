package typings.devtoolsProtocol.mod.Protocol.LayerTree

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layer extends StObject {
  
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
  implicit class LayerMutableBuilder[Self <: Layer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchorX(value: Double): Self = StObject.set(x, "anchorX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorXUndefined: Self = StObject.set(x, "anchorX", js.undefined)
    
    @scala.inline
    def setAnchorY(value: Double): Self = StObject.set(x, "anchorY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorYUndefined: Self = StObject.set(x, "anchorY", js.undefined)
    
    @scala.inline
    def setAnchorZ(value: Double): Self = StObject.set(x, "anchorZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorZUndefined: Self = StObject.set(x, "anchorZ", js.undefined)
    
    @scala.inline
    def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendNodeIdUndefined: Self = StObject.set(x, "backendNodeId", js.undefined)
    
    @scala.inline
    def setDrawsContent(value: Boolean): Self = StObject.set(x, "drawsContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
    
    @scala.inline
    def setLayerId(value: LayerId): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaintCount(value: integer): Self = StObject.set(x, "paintCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentLayerId(value: LayerId): Self = StObject.set(x, "parentLayerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentLayerIdUndefined: Self = StObject.set(x, "parentLayerId", js.undefined)
    
    @scala.inline
    def setScrollRects(value: js.Array[ScrollRect]): Self = StObject.set(x, "scrollRects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollRectsUndefined: Self = StObject.set(x, "scrollRects", js.undefined)
    
    @scala.inline
    def setScrollRectsVarargs(value: ScrollRect*): Self = StObject.set(x, "scrollRects", js.Array(value :_*))
    
    @scala.inline
    def setStickyPositionConstraint(value: StickyPositionConstraint): Self = StObject.set(x, "stickyPositionConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickyPositionConstraintUndefined: Self = StObject.set(x, "stickyPositionConstraint", js.undefined)
    
    @scala.inline
    def setTransform(value: js.Array[Double]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setTransformVarargs(value: Double*): Self = StObject.set(x, "transform", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
