package typings.devtoolsProtocol.mod.Protocol.Fetch

import typings.devtoolsProtocol.mod.Protocol.Network.ResourceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestPattern extends StObject {
  
  /**
    * Stage at wich to begin intercepting requests. Default is Request.
    */
  var requestStage: js.UndefOr[RequestStage] = js.native
  
  /**
    * If set, only requests for matching resource types will be intercepted.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  
  /**
    * Wildcards ('*' -> zero or more, '?' -> exactly one) are allowed. Escape character is
    * backslash. Omitting is equivalent to "*".
    */
  var urlPattern: js.UndefOr[String] = js.native
}
object RequestPattern {
  
  @scala.inline
  def apply(): RequestPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestPattern]
  }
  
  @scala.inline
  implicit class RequestPatternMutableBuilder[Self <: RequestPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestStage(value: RequestStage): Self = StObject.set(x, "requestStage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestStageUndefined: Self = StObject.set(x, "requestStage", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setUrlPattern(value: String): Self = StObject.set(x, "urlPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlPatternUndefined: Self = StObject.set(x, "urlPattern", js.undefined)
  }
}
