package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Permissions: `privacy`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object privacy {
  
  /**
    * Use the `browser.privacy` API to control usage of the features in the browser that can affect a user's privacy.
    *
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  object network {
    
    /* privacy.network types */
    /** The IP handling policy of WebRTC. */
    /* Rewritten from type alias, can be one of: 
      - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.default
      - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.default_public_and_private_interfaces
      - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.default_public_interface_only
      - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_non_proxied_udp
      - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.proxy_only
    */
    trait IPHandlingPolicy extends StObject
    object IPHandlingPolicy {
      
      @scala.inline
      def default: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.default = "default".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.default]
      
      @scala.inline
      def default_public_and_private_interfaces: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.default_public_and_private_interfaces = "default_public_and_private_interfaces".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.default_public_and_private_interfaces]
      
      @scala.inline
      def default_public_interface_only: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.default_public_interface_only = "default_public_interface_only".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.default_public_interface_only]
      
      @scala.inline
      def disable_non_proxied_udp: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_non_proxied_udp = "disable_non_proxied_udp".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_non_proxied_udp]
      
      @scala.inline
      def proxy_only: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.proxy_only = "proxy_only".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.proxy_only]
    }
    
    /** The maximum TLS version supported. */
    /* Rewritten from type alias, can be one of: 
      - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1
      - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot1
      - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot2
      - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot3
      - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
    */
    trait TlsVersionRestrictionConfigMaximum extends StObject
    object TlsVersionRestrictionConfigMaximum {
      
      @scala.inline
      def TLSv1: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1 = "TLSv1".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1]
      
      @scala.inline
      def TLSv1Dot1: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot1 = "TLSv1.1".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot1]
      
      @scala.inline
      def TLSv1Dot2: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot2 = "TLSv1.2".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot2]
      
      @scala.inline
      def TLSv1Dot3: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot3 = "TLSv1.3".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot3]
      
      @scala.inline
      def unknown: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = "unknown".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown]
    }
    
    /** The minimum TLS version supported. */
    /* Rewritten from type alias, can be one of: 
      - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1
      - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot1
      - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot2
      - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot3
      - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
    */
    trait TlsVersionRestrictionConfigMinimum extends StObject
    object TlsVersionRestrictionConfigMinimum {
      
      @scala.inline
      def TLSv1: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1 = "TLSv1".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1]
      
      @scala.inline
      def TLSv1Dot1: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot1 = "TLSv1.1".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot1]
      
      @scala.inline
      def TLSv1Dot2: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot2 = "TLSv1.2".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot2]
      
      @scala.inline
      def TLSv1Dot3: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot3 = "TLSv1.3".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot3]
      
      @scala.inline
      def unknown: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = "unknown".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown]
    }
    
    /** An object which describes TLS minimum and maximum versions. */
    trait tlsVersionRestrictionConfig extends StObject {
      
      /** The maximum TLS version supported. */
      var maximum: js.UndefOr[TlsVersionRestrictionConfigMaximum] = js.undefined
      
      /** The minimum TLS version supported. */
      var minimum: js.UndefOr[TlsVersionRestrictionConfigMinimum] = js.undefined
    }
    object tlsVersionRestrictionConfig {
      
      @scala.inline
      def apply(): tlsVersionRestrictionConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[tlsVersionRestrictionConfig]
      }
      
      @scala.inline
      implicit class tlsVersionRestrictionConfigMutableBuilder[Self <: tlsVersionRestrictionConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMaximum(value: TlsVersionRestrictionConfigMaximum): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
        
        @scala.inline
        def setMinimum(value: TlsVersionRestrictionConfigMinimum): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      }
    }
  }
  
  /**
    * Use the `browser.privacy` API to control usage of the features in the browser that can affect a user's privacy.
    *
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  object services
  
  /**
    * Use the `browser.privacy` API to control usage of the features in the browser that can affect a user's privacy.
    *
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  object websites {
    
    /** The settings for cookies. */
    trait CookieConfig extends StObject {
      
      /** The type of cookies to allow. */
      var behavior: js.UndefOr[CookieConfigBehavior] = js.undefined
      
      /** Whether to create all cookies as nonPersistent (i.e., session) cookies. */
      var nonPersistentCookies: js.UndefOr[Boolean] = js.undefined
    }
    object CookieConfig {
      
      @scala.inline
      def apply(): CookieConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CookieConfig]
      }
      
      @scala.inline
      implicit class CookieConfigMutableBuilder[Self <: CookieConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBehavior(value: CookieConfigBehavior): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
        
        @scala.inline
        def setNonPersistentCookies(value: Boolean): Self = StObject.set(x, "nonPersistentCookies", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNonPersistentCookiesUndefined: Self = StObject.set(x, "nonPersistentCookies", js.undefined)
      }
    }
    
    /** The type of cookies to allow. */
    /* Rewritten from type alias, can be one of: 
      - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_all
      - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_all
      - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_third_party
      - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_visited
      - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_trackers
      - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_trackers_and_partition_foreign
    */
    trait CookieConfigBehavior extends StObject
    object CookieConfigBehavior {
      
      @scala.inline
      def allow_all: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_all = "allow_all".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_all]
      
      @scala.inline
      def allow_visited: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_visited = "allow_visited".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_visited]
      
      @scala.inline
      def reject_all: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_all = "reject_all".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_all]
      
      @scala.inline
      def reject_third_party: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_third_party = "reject_third_party".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_third_party]
      
      @scala.inline
      def reject_trackers: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_trackers = "reject_trackers".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_trackers]
      
      @scala.inline
      def reject_trackers_and_partition_foreign: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_trackers_and_partition_foreign = "reject_trackers_and_partition_foreign".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_trackers_and_partition_foreign]
    }
    
    /* privacy.websites types */
    /** The mode for tracking protection. */
    /* Rewritten from type alias, can be one of: 
      - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.always
      - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.never
      - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.private_browsing
    */
    trait TrackingProtectionModeOption extends StObject
    object TrackingProtectionModeOption {
      
      @scala.inline
      def always: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.always = "always".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.always]
      
      @scala.inline
      def never: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.never = "never".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.never]
      
      @scala.inline
      def private_browsing: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.private_browsing = "private_browsing".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.private_browsing]
    }
  }
}
