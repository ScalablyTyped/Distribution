package typings.googlePublisherTag.googletag

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration object for
  * [SafeFrame](https://support.google.com/admanager/answer/6023110)
  * containers.
  *
  * @see {@link PubAdsService.setSafeFrameConfig}
  */
trait SafeFrameConfig extends StObject {
  
  /**
    * Whether SafeFrame should allow ad content to expand by overlaying page
    * content.
    */
  var allowOverlayExpansion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether SafeFrame should allow ad content to expand by pushing page
    * content.
    */
  var allowPushExpansion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether SafeFrame should use the HTML5 sandbox attribute to prevent top
    * level navigation without user interaction. The only valid value is
    * `true` (cannot be forced to `false`). Note that the
    * sandbox attribute disables plugins (e.g. Flash).
    */
  var sandbox: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether SafeFrame should use randomized subdomains for
    * Reservation creatives. Pass in `null` to clear the stored
    * value.
    *
    * Note: this feature is enabled by default.
    *
    * @deprecated It is no longer possible to disable this feature. Setting
    * `useUniqueDomain` has no effect.
    * @see [Render creatives using SafeFrame](https://support.google.com/admanager/answer/9999596)
    */
  var useUniqueDomain: js.UndefOr[Boolean | Null] = js.undefined
}
object SafeFrameConfig {
  
  inline def apply(): SafeFrameConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeFrameConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SafeFrameConfig] (val x: Self) extends AnyVal {
    
    inline def setAllowOverlayExpansion(value: Boolean): Self = StObject.set(x, "allowOverlayExpansion", value.asInstanceOf[js.Any])
    
    inline def setAllowOverlayExpansionUndefined: Self = StObject.set(x, "allowOverlayExpansion", js.undefined)
    
    inline def setAllowPushExpansion(value: Boolean): Self = StObject.set(x, "allowPushExpansion", value.asInstanceOf[js.Any])
    
    inline def setAllowPushExpansionUndefined: Self = StObject.set(x, "allowPushExpansion", js.undefined)
    
    inline def setSandbox(value: Boolean): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    
    inline def setUseUniqueDomain(value: Boolean): Self = StObject.set(x, "useUniqueDomain", value.asInstanceOf[js.Any])
    
    inline def setUseUniqueDomainNull: Self = StObject.set(x, "useUniqueDomain", null)
    
    inline def setUseUniqueDomainUndefined: Self = StObject.set(x, "useUniqueDomain", js.undefined)
  }
}
