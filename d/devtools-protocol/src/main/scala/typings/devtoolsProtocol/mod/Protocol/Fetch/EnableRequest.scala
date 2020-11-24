package typings.devtoolsProtocol.mod.Protocol.Fetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableRequest extends js.Object {
  
  /**
    * If true, authRequired events will be issued and requests will be paused
    * expecting a call to continueWithAuth.
    */
  var handleAuthRequests: js.UndefOr[Boolean] = js.native
  
  /**
    * If specified, only requests matching any of these patterns will produce
    * fetchRequested event and will be paused until clients response. If not set,
    * all requests will be affected.
    */
  var patterns: js.UndefOr[js.Array[RequestPattern]] = js.native
}
object EnableRequest {
  
  @scala.inline
  def apply(): EnableRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableRequest]
  }
  
  @scala.inline
  implicit class EnableRequestOps[Self <: EnableRequest] (val x: Self) extends AnyVal {
    
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
    def setHandleAuthRequests(value: Boolean): Self = this.set("handleAuthRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleAuthRequests: Self = this.set("handleAuthRequests", js.undefined)
    
    @scala.inline
    def setPatternsVarargs(value: RequestPattern*): Self = this.set("patterns", js.Array(value :_*))
    
    @scala.inline
    def setPatterns(value: js.Array[RequestPattern]): Self = this.set("patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatterns: Self = this.set("patterns", js.undefined)
  }
}
