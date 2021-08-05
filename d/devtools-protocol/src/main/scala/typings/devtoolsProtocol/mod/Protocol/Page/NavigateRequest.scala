package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigateRequest extends StObject {
  
  /**
    * Frame id to navigate, if not specified navigates the top frame.
    */
  var frameId: js.UndefOr[FrameId] = js.undefined
  
  /**
    * Referrer URL.
    */
  var referrer: js.UndefOr[String] = js.undefined
  
  /**
    * Referrer-policy used for the navigation.
    */
  var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
  
  /**
    * Intended transition type.
    */
  var transitionType: js.UndefOr[TransitionType] = js.undefined
  
  /**
    * URL to navigate the page to.
    */
  var url: String
}
object NavigateRequest {
  
  inline def apply(url: String): NavigateRequest = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateRequest]
  }
  
  extension [Self <: NavigateRequest](x: Self) {
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    
    inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    inline def setTransitionType(value: TransitionType): Self = StObject.set(x, "transitionType", value.asInstanceOf[js.Any])
    
    inline def setTransitionTypeUndefined: Self = StObject.set(x, "transitionType", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
