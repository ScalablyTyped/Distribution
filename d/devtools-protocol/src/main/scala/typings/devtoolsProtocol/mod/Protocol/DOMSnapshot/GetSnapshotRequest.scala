package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSnapshotRequest extends js.Object {
  
  /**
    * Whitelist of computed styles to return.
    */
  var computedStyleWhitelist: js.Array[String] = js.native
  
  /**
    * Whether or not to retrieve details of DOM listeners (default false).
    */
  var includeEventListeners: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to determine and include the paint order index of LayoutTreeNodes (default false).
    */
  var includePaintOrder: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to include UA shadow tree in the snapshot (default false).
    */
  var includeUserAgentShadowTree: js.UndefOr[Boolean] = js.native
}
object GetSnapshotRequest {
  
  @scala.inline
  def apply(computedStyleWhitelist: js.Array[String]): GetSnapshotRequest = {
    val __obj = js.Dynamic.literal(computedStyleWhitelist = computedStyleWhitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSnapshotRequest]
  }
  
  @scala.inline
  implicit class GetSnapshotRequestOps[Self <: GetSnapshotRequest] (val x: Self) extends AnyVal {
    
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
    def setComputedStyleWhitelistVarargs(value: String*): Self = this.set("computedStyleWhitelist", js.Array(value :_*))
    
    @scala.inline
    def setComputedStyleWhitelist(value: js.Array[String]): Self = this.set("computedStyleWhitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeEventListeners(value: Boolean): Self = this.set("includeEventListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeEventListeners: Self = this.set("includeEventListeners", js.undefined)
    
    @scala.inline
    def setIncludePaintOrder(value: Boolean): Self = this.set("includePaintOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludePaintOrder: Self = this.set("includePaintOrder", js.undefined)
    
    @scala.inline
    def setIncludeUserAgentShadowTree(value: Boolean): Self = this.set("includeUserAgentShadowTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeUserAgentShadowTree: Self = this.set("includeUserAgentShadowTree", js.undefined)
  }
}
