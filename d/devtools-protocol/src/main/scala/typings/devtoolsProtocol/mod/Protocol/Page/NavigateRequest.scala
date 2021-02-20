package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigateRequest extends StObject {
  
  /**
    * Frame id to navigate, if not specified navigates the top frame.
    */
  var frameId: js.UndefOr[FrameId] = js.native
  
  /**
    * Referrer URL.
    */
  var referrer: js.UndefOr[String] = js.native
  
  /**
    * Referrer-policy used for the navigation.
    */
  var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.native
  
  /**
    * Intended transition type.
    */
  var transitionType: js.UndefOr[TransitionType] = js.native
  
  /**
    * URL to navigate the page to.
    */
  var url: String = js.native
}
object NavigateRequest {
  
  @scala.inline
  def apply(url: String): NavigateRequest = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateRequest]
  }
  
  @scala.inline
  implicit class NavigateRequestMutableBuilder[Self <: NavigateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    
    @scala.inline
    def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    @scala.inline
    def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    @scala.inline
    def setTransitionType(value: TransitionType): Self = StObject.set(x, "transitionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionTypeUndefined: Self = StObject.set(x, "transitionType", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
