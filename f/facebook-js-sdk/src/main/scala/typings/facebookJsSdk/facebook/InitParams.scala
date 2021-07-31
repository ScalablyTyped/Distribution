package typings.facebookJsSdk.facebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitParams extends StObject {
  
  var appId: js.UndefOr[String] = js.undefined
  
  var autoLogAppEvents: js.UndefOr[Boolean] = js.undefined
  
  var cookie: js.UndefOr[Boolean] = js.undefined
  
  var frictionlessRequests: js.UndefOr[Boolean] = js.undefined
  
  var hideFlashCallback: js.UndefOr[Boolean] = js.undefined
  
  var status: js.UndefOr[Boolean] = js.undefined
  
  var version: String
  
  var xfbml: js.UndefOr[Boolean] = js.undefined
}
object InitParams {
  
  @scala.inline
  def apply(version: String): InitParams = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitParams]
  }
  
  @scala.inline
  implicit class InitParamsMutableBuilder[Self <: InitParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    @scala.inline
    def setAutoLogAppEvents(value: Boolean): Self = StObject.set(x, "autoLogAppEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoLogAppEventsUndefined: Self = StObject.set(x, "autoLogAppEvents", js.undefined)
    
    @scala.inline
    def setCookie(value: Boolean): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
    
    @scala.inline
    def setFrictionlessRequests(value: Boolean): Self = StObject.set(x, "frictionlessRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionlessRequestsUndefined: Self = StObject.set(x, "frictionlessRequests", js.undefined)
    
    @scala.inline
    def setHideFlashCallback(value: Boolean): Self = StObject.set(x, "hideFlashCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideFlashCallbackUndefined: Self = StObject.set(x, "hideFlashCallback", js.undefined)
    
    @scala.inline
    def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXfbml(value: Boolean): Self = StObject.set(x, "xfbml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXfbmlUndefined: Self = StObject.set(x, "xfbml", js.undefined)
  }
}
