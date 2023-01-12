package typings.devtoolsProtocol.mod.Protocol.Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelDownloadRequest extends StObject {
  
  /**
    * BrowserContext to perform the action in. When omitted, default browser context is used.
    */
  var browserContextId: js.UndefOr[BrowserContextID] = js.undefined
  
  /**
    * Global unique identifier of the download.
    */
  var guid: String
}
object CancelDownloadRequest {
  
  inline def apply(guid: String): CancelDownloadRequest = {
    val __obj = js.Dynamic.literal(guid = guid.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelDownloadRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelDownloadRequest] (val x: Self) extends AnyVal {
    
    inline def setBrowserContextId(value: BrowserContextID): Self = StObject.set(x, "browserContextId", value.asInstanceOf[js.Any])
    
    inline def setBrowserContextIdUndefined: Self = StObject.set(x, "browserContextId", js.undefined)
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
  }
}
