package typings.devtoolsProtocol.mod.Protocol.Browser

import typings.devtoolsProtocol.devtoolsProtocolStrings.allowAndName
import typings.devtoolsProtocol.devtoolsProtocolStrings.allow_
import typings.devtoolsProtocol.devtoolsProtocolStrings.default_
import typings.devtoolsProtocol.devtoolsProtocolStrings.deny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetDownloadBehaviorRequest extends StObject {
  
  /**
    * Whether to allow all or deny all download requests, or use default Chrome behavior if
    * available (otherwise deny). |allowAndName| allows download and names files according to
    * their dowmload guids. (SetDownloadBehaviorRequestBehavior enum)
    */
  var behavior: deny | allow_ | allowAndName | default_
  
  /**
    * BrowserContext to set download behavior. When omitted, default browser context is used.
    */
  var browserContextId: js.UndefOr[BrowserContextID] = js.undefined
  
  /**
    * The default path to save downloaded files to. This is required if behavior is set to 'allow'
    * or 'allowAndName'.
    */
  var downloadPath: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to emit download events (defaults to false).
    */
  var eventsEnabled: js.UndefOr[Boolean] = js.undefined
}
object SetDownloadBehaviorRequest {
  
  inline def apply(behavior: deny | allow_ | allowAndName | default_): SetDownloadBehaviorRequest = {
    val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDownloadBehaviorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetDownloadBehaviorRequest] (val x: Self) extends AnyVal {
    
    inline def setBehavior(value: deny | allow_ | allowAndName | default_): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setBrowserContextId(value: BrowserContextID): Self = StObject.set(x, "browserContextId", value.asInstanceOf[js.Any])
    
    inline def setBrowserContextIdUndefined: Self = StObject.set(x, "browserContextId", js.undefined)
    
    inline def setDownloadPath(value: String): Self = StObject.set(x, "downloadPath", value.asInstanceOf[js.Any])
    
    inline def setDownloadPathUndefined: Self = StObject.set(x, "downloadPath", js.undefined)
    
    inline def setEventsEnabled(value: Boolean): Self = StObject.set(x, "eventsEnabled", value.asInstanceOf[js.Any])
    
    inline def setEventsEnabledUndefined: Self = StObject.set(x, "eventsEnabled", js.undefined)
  }
}
