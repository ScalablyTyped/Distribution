package typings.devtoolsProtocol.mod.Protocol.Browser

import typings.devtoolsProtocol.devtoolsProtocolStrings.allow
import typings.devtoolsProtocol.devtoolsProtocolStrings.allowAndName
import typings.devtoolsProtocol.devtoolsProtocolStrings.default_
import typings.devtoolsProtocol.devtoolsProtocolStrings.deny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetDownloadBehaviorRequest extends StObject {
  
  /**
    * Whether to allow all or deny all download requests, or use default Chrome behavior if
    * available (otherwise deny). |allowAndName| allows download and names files according to
    * their dowmload guids. (SetDownloadBehaviorRequestBehavior enum)
    */
  var behavior: deny | allow | allowAndName | default_ = js.native
  
  /**
    * BrowserContext to set download behavior. When omitted, default browser context is used.
    */
  var browserContextId: js.UndefOr[BrowserContextID] = js.native
  
  /**
    * The default path to save downloaded files to. This is requred if behavior is set to 'allow'
    * or 'allowAndName'.
    */
  var downloadPath: js.UndefOr[String] = js.native
}
object SetDownloadBehaviorRequest {
  
  @scala.inline
  def apply(behavior: deny | allow | allowAndName | default_): SetDownloadBehaviorRequest = {
    val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDownloadBehaviorRequest]
  }
  
  @scala.inline
  implicit class SetDownloadBehaviorRequestMutableBuilder[Self <: SetDownloadBehaviorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBehavior(value: deny | allow | allowAndName | default_): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserContextId(value: BrowserContextID): Self = StObject.set(x, "browserContextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserContextIdUndefined: Self = StObject.set(x, "browserContextId", js.undefined)
    
    @scala.inline
    def setDownloadPath(value: String): Self = StObject.set(x, "downloadPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadPathUndefined: Self = StObject.set(x, "downloadPath", js.undefined)
  }
}
