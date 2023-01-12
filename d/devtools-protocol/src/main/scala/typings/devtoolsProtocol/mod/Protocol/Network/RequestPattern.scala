package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestPattern extends StObject {
  
  /**
    * Stage at which to begin intercepting requests. Default is Request.
    */
  var interceptionStage: js.UndefOr[InterceptionStage] = js.undefined
  
  /**
    * If set, only requests for matching resource types will be intercepted.
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * Wildcards (`'*'` -> zero or more, `'?'` -> exactly one) are allowed. Escape character is
    * backslash. Omitting is equivalent to `"*"`.
    */
  var urlPattern: js.UndefOr[String] = js.undefined
}
object RequestPattern {
  
  inline def apply(): RequestPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestPattern]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestPattern] (val x: Self) extends AnyVal {
    
    inline def setInterceptionStage(value: InterceptionStage): Self = StObject.set(x, "interceptionStage", value.asInstanceOf[js.Any])
    
    inline def setInterceptionStageUndefined: Self = StObject.set(x, "interceptionStage", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setUrlPattern(value: String): Self = StObject.set(x, "urlPattern", value.asInstanceOf[js.Any])
    
    inline def setUrlPatternUndefined: Self = StObject.set(x, "urlPattern", js.undefined)
  }
}
