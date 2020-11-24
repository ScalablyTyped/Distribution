package typings.devtoolsProtocol.mod.Protocol.DOMDebugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEventListenersRequest extends js.Object {
  
  /**
    * The maximum depth at which Node children should be retrieved, defaults to 1. Use -1 for the
    * entire subtree or provide an integer larger than 0.
    */
  var depth: js.UndefOr[integer] = js.native
  
  /**
    * Identifier of the object to return listeners for.
    */
  var objectId: RemoteObjectId = js.native
  
  /**
    * Whether or not iframes and shadow roots should be traversed when returning the subtree
    * (default is false). Reports listeners for all contexts if pierce is enabled.
    */
  var pierce: js.UndefOr[Boolean] = js.native
}
object GetEventListenersRequest {
  
  @scala.inline
  def apply(objectId: RemoteObjectId): GetEventListenersRequest = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventListenersRequest]
  }
  
  @scala.inline
  implicit class GetEventListenersRequestOps[Self <: GetEventListenersRequest] (val x: Self) extends AnyVal {
    
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
    def setObjectId(value: RemoteObjectId): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth(value: integer): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setPierce(value: Boolean): Self = this.set("pierce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePierce: Self = this.set("pierce", js.undefined)
  }
}
