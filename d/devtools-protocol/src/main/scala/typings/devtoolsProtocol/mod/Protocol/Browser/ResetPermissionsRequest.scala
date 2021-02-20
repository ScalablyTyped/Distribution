package typings.devtoolsProtocol.mod.Protocol.Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResetPermissionsRequest extends StObject {
  
  /**
    * BrowserContext to reset permissions. When omitted, default browser context is used.
    */
  var browserContextId: js.UndefOr[BrowserContextID] = js.native
}
object ResetPermissionsRequest {
  
  @scala.inline
  def apply(): ResetPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetPermissionsRequest]
  }
  
  @scala.inline
  implicit class ResetPermissionsRequestMutableBuilder[Self <: ResetPermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowserContextId(value: BrowserContextID): Self = StObject.set(x, "browserContextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserContextIdUndefined: Self = StObject.set(x, "browserContextId", js.undefined)
  }
}
