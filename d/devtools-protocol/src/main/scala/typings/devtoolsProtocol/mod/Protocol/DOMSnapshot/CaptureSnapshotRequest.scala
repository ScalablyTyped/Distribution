package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptureSnapshotRequest extends js.Object {
  
  /**
    * Whitelist of computed styles to return.
    */
  var computedStyles: js.Array[String] = js.native
  
  /**
    * Whether to include DOM rectangles (offsetRects, clientRects, scrollRects) into the snapshot
    */
  var includeDOMRects: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to include layout object paint orders into the snapshot.
    */
  var includePaintOrder: js.UndefOr[Boolean] = js.native
}
object CaptureSnapshotRequest {
  
  @scala.inline
  def apply(computedStyles: js.Array[String]): CaptureSnapshotRequest = {
    val __obj = js.Dynamic.literal(computedStyles = computedStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureSnapshotRequest]
  }
  
  @scala.inline
  implicit class CaptureSnapshotRequestOps[Self <: CaptureSnapshotRequest] (val x: Self) extends AnyVal {
    
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
    def setComputedStylesVarargs(value: String*): Self = this.set("computedStyles", js.Array(value :_*))
    
    @scala.inline
    def setComputedStyles(value: js.Array[String]): Self = this.set("computedStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDOMRects(value: Boolean): Self = this.set("includeDOMRects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDOMRects: Self = this.set("includeDOMRects", js.undefined)
    
    @scala.inline
    def setIncludePaintOrder(value: Boolean): Self = this.set("includePaintOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludePaintOrder: Self = this.set("includePaintOrder", js.undefined)
  }
}
