package typings.devtoolsProtocol.mod.Protocol.Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetPermissionsRequest extends StObject {
  
  /**
    * BrowserContext to reset permissions. When omitted, default browser context is used.
    */
  var browserContextId: js.UndefOr[BrowserContextID] = js.undefined
}
object ResetPermissionsRequest {
  
  inline def apply(): ResetPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetPermissionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResetPermissionsRequest] (val x: Self) extends AnyVal {
    
    inline def setBrowserContextId(value: BrowserContextID): Self = StObject.set(x, "browserContextId", value.asInstanceOf[js.Any])
    
    inline def setBrowserContextIdUndefined: Self = StObject.set(x, "browserContextId", js.undefined)
  }
}
