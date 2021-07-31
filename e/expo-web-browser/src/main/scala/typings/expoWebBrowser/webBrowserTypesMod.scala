package typings.expoWebBrowser

import typings.expoWebBrowser.expoWebBrowserStrings.cancel
import typings.expoWebBrowser.expoWebBrowserStrings.close
import typings.expoWebBrowser.expoWebBrowserStrings.dismiss
import typings.expoWebBrowser.expoWebBrowserStrings.done
import typings.expoWebBrowser.expoWebBrowserStrings.locked
import typings.expoWebBrowser.expoWebBrowserStrings.opened
import typings.expoWebBrowser.expoWebBrowserStrings.success
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webBrowserTypesMod {
  
  /* Inlined { readonly CANCEL :'cancel',  readonly DISMISS :'dismiss',  readonly OPENED :'opened',  readonly LOCKED :'locked'}[keyof { readonly CANCEL :'cancel',  readonly DISMISS :'dismiss',  readonly OPENED :'opened',  readonly LOCKED :'locked'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.expoWebBrowser.expoWebBrowserStrings.cancel
    - typings.expoWebBrowser.expoWebBrowserStrings.dismiss
    - typings.expoWebBrowser.expoWebBrowserStrings.opened
    - typings.expoWebBrowser.expoWebBrowserStrings.locked
  */
  trait WebBrowserResultType extends StObject
  object WebBrowserResultType {
    
    /**
      * iOS only
      */
    @JSImport("expo-web-browser/build/WebBrowser.types", "WebBrowserResultType.CANCEL")
    @js.native
    val CANCEL: cancel = js.native
    
    /**
      * iOS only
      */
    @JSImport("expo-web-browser/build/WebBrowser.types", "WebBrowserResultType.DISMISS")
    @js.native
    val DISMISS: dismiss = js.native
    
    @JSImport("expo-web-browser/build/WebBrowser.types", "WebBrowserResultType.LOCKED")
    @js.native
    val LOCKED: locked = js.native
    
    /**
      * Android only
      */
    @JSImport("expo-web-browser/build/WebBrowser.types", "WebBrowserResultType.OPENED")
    @js.native
    val OPENED: opened = js.native
  }
  
  trait RedirectEvent extends StObject {
    
    var url: String
  }
  object RedirectEvent {
    
    @scala.inline
    def apply(url: String): RedirectEvent = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedirectEvent]
    }
    
    @scala.inline
    implicit class RedirectEventMutableBuilder[Self <: RedirectEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServiceActionResult extends StObject {
    
    var servicePackage: js.UndefOr[String] = js.undefined
  }
  object ServiceActionResult {
    
    @scala.inline
    def apply(): ServiceActionResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceActionResult]
    }
    
    @scala.inline
    implicit class ServiceActionResultMutableBuilder[Self <: ServiceActionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setServicePackage(value: String): Self = StObject.set(x, "servicePackage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServicePackageUndefined: Self = StObject.set(x, "servicePackage", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expoWebBrowser.webBrowserTypesMod.WebBrowserRedirectResult
    - typings.expoWebBrowser.webBrowserTypesMod.WebBrowserResult
  */
  trait WebBrowserAuthSessionResult extends StObject
  object WebBrowserAuthSessionResult {
    
    @scala.inline
    def WebBrowserRedirectResult(url: String): typings.expoWebBrowser.webBrowserTypesMod.WebBrowserRedirectResult = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("success")
      __obj.asInstanceOf[typings.expoWebBrowser.webBrowserTypesMod.WebBrowserRedirectResult]
    }
    
    @scala.inline
    def WebBrowserResult(`type`: WebBrowserResultType): typings.expoWebBrowser.webBrowserTypesMod.WebBrowserResult = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.expoWebBrowser.webBrowserTypesMod.WebBrowserResult]
    }
  }
  
  type WebBrowserCoolDownResult = ServiceActionResult
  
  trait WebBrowserCustomTabsResults extends StObject {
    
    var browserPackages: js.Array[String]
    
    var defaultBrowserPackage: js.UndefOr[String] = js.undefined
    
    var preferredBrowserPackage: js.UndefOr[String] = js.undefined
    
    var servicePackages: js.Array[String]
  }
  object WebBrowserCustomTabsResults {
    
    @scala.inline
    def apply(browserPackages: js.Array[String], servicePackages: js.Array[String]): WebBrowserCustomTabsResults = {
      val __obj = js.Dynamic.literal(browserPackages = browserPackages.asInstanceOf[js.Any], servicePackages = servicePackages.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebBrowserCustomTabsResults]
    }
    
    @scala.inline
    implicit class WebBrowserCustomTabsResultsMutableBuilder[Self <: WebBrowserCustomTabsResults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowserPackages(value: js.Array[String]): Self = StObject.set(x, "browserPackages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserPackagesVarargs(value: String*): Self = StObject.set(x, "browserPackages", js.Array(value :_*))
      
      @scala.inline
      def setDefaultBrowserPackage(value: String): Self = StObject.set(x, "defaultBrowserPackage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultBrowserPackageUndefined: Self = StObject.set(x, "defaultBrowserPackage", js.undefined)
      
      @scala.inline
      def setPreferredBrowserPackage(value: String): Self = StObject.set(x, "preferredBrowserPackage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredBrowserPackageUndefined: Self = StObject.set(x, "preferredBrowserPackage", js.undefined)
      
      @scala.inline
      def setServicePackages(value: js.Array[String]): Self = StObject.set(x, "servicePackages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServicePackagesVarargs(value: String*): Self = StObject.set(x, "servicePackages", js.Array(value :_*))
    }
  }
  
  type WebBrowserMayInitWithUrlResult = ServiceActionResult
  
  trait WebBrowserOpenOptions extends StObject {
    
    var browserPackage: js.UndefOr[String] = js.undefined
    
    /** iOS only */
    var controlsColor: js.UndefOr[String] = js.undefined
    
    var dismissButtonStyle: js.UndefOr[done | close | cancel] = js.undefined
    
    /**
      * Whether the toolbar should be hiding when a user scrolls the website.
      */
    var enableBarCollapsing: js.UndefOr[Boolean] = js.undefined
    
    var enableDefaultShareMenuItem: js.UndefOr[Boolean] = js.undefined
    
    var readerMode: js.UndefOr[Boolean] = js.undefined
    
    /** Android only */
    /**
      * Color of the secondary toolbar in either #AARRGGBB or #RRGGBB format.
      */
    var secondaryToolbarColor: js.UndefOr[String] = js.undefined
    
    /**
      * Whether browsed website should be shown as separate entry in Android recents/multitasking view.
      * Default: `false`
      */
    var showInRecents: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the browser should show the title of website on the toolbar.
      */
    var showTitle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Color of the toolbar in either #AARRGGBB or #RRGGBB format.
      */
    var toolbarColor: js.UndefOr[String] = js.undefined
    
    /**
      * **Web:** features to use with `window.open()`
      */
    var windowFeatures: js.UndefOr[String | WebBrowserWindowFeatures] = js.undefined
    
    /**
      * **Web:** name to assign to the popup window.
      */
    var windowName: js.UndefOr[String] = js.undefined
  }
  object WebBrowserOpenOptions {
    
    @scala.inline
    def apply(): WebBrowserOpenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebBrowserOpenOptions]
    }
    
    @scala.inline
    implicit class WebBrowserOpenOptionsMutableBuilder[Self <: WebBrowserOpenOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowserPackage(value: String): Self = StObject.set(x, "browserPackage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserPackageUndefined: Self = StObject.set(x, "browserPackage", js.undefined)
      
      @scala.inline
      def setControlsColor(value: String): Self = StObject.set(x, "controlsColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsColorUndefined: Self = StObject.set(x, "controlsColor", js.undefined)
      
      @scala.inline
      def setDismissButtonStyle(value: done | close | cancel): Self = StObject.set(x, "dismissButtonStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissButtonStyleUndefined: Self = StObject.set(x, "dismissButtonStyle", js.undefined)
      
      @scala.inline
      def setEnableBarCollapsing(value: Boolean): Self = StObject.set(x, "enableBarCollapsing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableBarCollapsingUndefined: Self = StObject.set(x, "enableBarCollapsing", js.undefined)
      
      @scala.inline
      def setEnableDefaultShareMenuItem(value: Boolean): Self = StObject.set(x, "enableDefaultShareMenuItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableDefaultShareMenuItemUndefined: Self = StObject.set(x, "enableDefaultShareMenuItem", js.undefined)
      
      @scala.inline
      def setReaderMode(value: Boolean): Self = StObject.set(x, "readerMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReaderModeUndefined: Self = StObject.set(x, "readerMode", js.undefined)
      
      @scala.inline
      def setSecondaryToolbarColor(value: String): Self = StObject.set(x, "secondaryToolbarColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryToolbarColorUndefined: Self = StObject.set(x, "secondaryToolbarColor", js.undefined)
      
      @scala.inline
      def setShowInRecents(value: Boolean): Self = StObject.set(x, "showInRecents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowInRecentsUndefined: Self = StObject.set(x, "showInRecents", js.undefined)
      
      @scala.inline
      def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
      
      @scala.inline
      def setToolbarColor(value: String): Self = StObject.set(x, "toolbarColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarColorUndefined: Self = StObject.set(x, "toolbarColor", js.undefined)
      
      @scala.inline
      def setWindowFeatures(value: String | WebBrowserWindowFeatures): Self = StObject.set(x, "windowFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowFeaturesUndefined: Self = StObject.set(x, "windowFeatures", js.undefined)
      
      @scala.inline
      def setWindowName(value: String): Self = StObject.set(x, "windowName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowNameUndefined: Self = StObject.set(x, "windowName", js.undefined)
    }
  }
  
  trait WebBrowserRedirectResult
    extends StObject
       with WebBrowserAuthSessionResult {
    
    var `type`: success
    
    var url: String
  }
  object WebBrowserRedirectResult {
    
    @scala.inline
    def apply(url: String): WebBrowserRedirectResult = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("success")
      __obj.asInstanceOf[WebBrowserRedirectResult]
    }
    
    @scala.inline
    implicit class WebBrowserRedirectResultMutableBuilder[Self <: WebBrowserRedirectResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: success): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebBrowserResult
    extends StObject
       with WebBrowserAuthSessionResult {
    
    var `type`: WebBrowserResultType
  }
  object WebBrowserResult {
    
    @scala.inline
    def apply(`type`: WebBrowserResultType): WebBrowserResult = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebBrowserResult]
    }
    
    @scala.inline
    implicit class WebBrowserResultMutableBuilder[Self <: WebBrowserResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: WebBrowserResultType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type WebBrowserWarmUpResult = ServiceActionResult
  
  type WebBrowserWindowFeatures = Record[String, Double | Boolean | String]
}
