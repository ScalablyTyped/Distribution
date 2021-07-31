package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptureSnapshotRequest extends StObject {
  
  /**
    * Whitelist of computed styles to return.
    */
  var computedStyles: js.Array[String]
  
  /**
    * Whether to include DOM rectangles (offsetRects, clientRects, scrollRects) into the snapshot
    */
  var includeDOMRects: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to include layout object paint orders into the snapshot.
    */
  var includePaintOrder: js.UndefOr[Boolean] = js.undefined
}
object CaptureSnapshotRequest {
  
  @scala.inline
  def apply(computedStyles: js.Array[String]): CaptureSnapshotRequest = {
    val __obj = js.Dynamic.literal(computedStyles = computedStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureSnapshotRequest]
  }
  
  @scala.inline
  implicit class CaptureSnapshotRequestMutableBuilder[Self <: CaptureSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputedStyles(value: js.Array[String]): Self = StObject.set(x, "computedStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputedStylesVarargs(value: String*): Self = StObject.set(x, "computedStyles", js.Array(value :_*))
    
    @scala.inline
    def setIncludeDOMRects(value: Boolean): Self = StObject.set(x, "includeDOMRects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDOMRectsUndefined: Self = StObject.set(x, "includeDOMRects", js.undefined)
    
    @scala.inline
    def setIncludePaintOrder(value: Boolean): Self = StObject.set(x, "includePaintOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludePaintOrderUndefined: Self = StObject.set(x, "includePaintOrder", js.undefined)
  }
}
