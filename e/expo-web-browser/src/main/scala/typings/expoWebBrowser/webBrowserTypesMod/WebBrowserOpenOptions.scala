package typings.expoWebBrowser.webBrowserTypesMod

import typings.expoWebBrowser.expoWebBrowserStrings.cancel
import typings.expoWebBrowser.expoWebBrowserStrings.close
import typings.expoWebBrowser.expoWebBrowserStrings.done
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebBrowserOpenOptions extends StObject {
  
  /**
    * Package name of a browser to be used to handle Custom Tabs. List of
    * available packages is to be queried by [`getCustomTabsSupportingBrowsers`](#webbrowsergetcustomtabssupportingbrowsersasync) method.
    * @platform android
    */
  var browserPackage: js.UndefOr[String] = js.undefined
  
  /**
    * Tint color for controls in SKSafariViewController in `#AARRGGBB` or `#RRGGBB` format.
    * @platform ios
    */
  var controlsColor: js.UndefOr[String] = js.undefined
  
  /**
    * A boolean determining whether the browser should open in a new task or in
    * the same task as your app.
    * @default true
    * @platform android
    */
  var createTask: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The style of the dismiss button. Should be one of: `done`, `close`, or `cancel`.
    * @platform ios
    */
  var dismissButtonStyle: js.UndefOr[done | close | cancel] = js.undefined
  
  /**
    * A boolean determining whether the toolbar should be hiding when a user scrolls the website.
    */
  var enableBarCollapsing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean determining whether a default share item should be added to the menu.
    * @platform android
    */
  var enableDefaultShareMenuItem: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The [presentation style](https://developer.apple.com/documentation/uikit/uiviewcontroller/1621355-modalpresentationstyle)
    * of the browser window.
    * @default WebBrowser.WebBrowserPresentationStyle.OverFullScreen
    * @platform ios
    */
  var presentationStyle: js.UndefOr[WebBrowserPresentationStyle] = js.undefined
  
  /**
    * A boolean determining whether Safari should enter Reader mode, if it is available.
    * @platform ios
    */
  var readerMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Color of the secondary toolbar in either `#AARRGGBB` or `#RRGGBB` format.
    * @platform android
    */
  var secondaryToolbarColor: js.UndefOr[String] = js.undefined
  
  /**
    * A boolean determining whether browsed website should be shown as separate
    * entry in Android recents/multitasking view. Requires `createTask` to be `true` (default).
    * @default false
    * @platform android
    */
  var showInRecents: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean determining whether the browser should show the title of website on the toolbar.
    * @platform android
    */
  var showTitle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Color of the toolbar in either `#AARRGGBB` or `#RRGGBB` format.
    */
  var toolbarColor: js.UndefOr[String] = js.undefined
  
  /**
    * Features to use with `window.open()`.
    * @platform web
    */
  var windowFeatures: js.UndefOr[String | WebBrowserWindowFeatures] = js.undefined
  
  /**
    * Name to assign to the popup window.
    * @platform web
    */
  var windowName: js.UndefOr[String] = js.undefined
}
object WebBrowserOpenOptions {
  
  inline def apply(): WebBrowserOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebBrowserOpenOptions]
  }
  
  extension [Self <: WebBrowserOpenOptions](x: Self) {
    
    inline def setBrowserPackage(value: String): Self = StObject.set(x, "browserPackage", value.asInstanceOf[js.Any])
    
    inline def setBrowserPackageUndefined: Self = StObject.set(x, "browserPackage", js.undefined)
    
    inline def setControlsColor(value: String): Self = StObject.set(x, "controlsColor", value.asInstanceOf[js.Any])
    
    inline def setControlsColorUndefined: Self = StObject.set(x, "controlsColor", js.undefined)
    
    inline def setCreateTask(value: Boolean): Self = StObject.set(x, "createTask", value.asInstanceOf[js.Any])
    
    inline def setCreateTaskUndefined: Self = StObject.set(x, "createTask", js.undefined)
    
    inline def setDismissButtonStyle(value: done | close | cancel): Self = StObject.set(x, "dismissButtonStyle", value.asInstanceOf[js.Any])
    
    inline def setDismissButtonStyleUndefined: Self = StObject.set(x, "dismissButtonStyle", js.undefined)
    
    inline def setEnableBarCollapsing(value: Boolean): Self = StObject.set(x, "enableBarCollapsing", value.asInstanceOf[js.Any])
    
    inline def setEnableBarCollapsingUndefined: Self = StObject.set(x, "enableBarCollapsing", js.undefined)
    
    inline def setEnableDefaultShareMenuItem(value: Boolean): Self = StObject.set(x, "enableDefaultShareMenuItem", value.asInstanceOf[js.Any])
    
    inline def setEnableDefaultShareMenuItemUndefined: Self = StObject.set(x, "enableDefaultShareMenuItem", js.undefined)
    
    inline def setPresentationStyle(value: WebBrowserPresentationStyle): Self = StObject.set(x, "presentationStyle", value.asInstanceOf[js.Any])
    
    inline def setPresentationStyleUndefined: Self = StObject.set(x, "presentationStyle", js.undefined)
    
    inline def setReaderMode(value: Boolean): Self = StObject.set(x, "readerMode", value.asInstanceOf[js.Any])
    
    inline def setReaderModeUndefined: Self = StObject.set(x, "readerMode", js.undefined)
    
    inline def setSecondaryToolbarColor(value: String): Self = StObject.set(x, "secondaryToolbarColor", value.asInstanceOf[js.Any])
    
    inline def setSecondaryToolbarColorUndefined: Self = StObject.set(x, "secondaryToolbarColor", js.undefined)
    
    inline def setShowInRecents(value: Boolean): Self = StObject.set(x, "showInRecents", value.asInstanceOf[js.Any])
    
    inline def setShowInRecentsUndefined: Self = StObject.set(x, "showInRecents", js.undefined)
    
    inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    inline def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    
    inline def setToolbarColor(value: String): Self = StObject.set(x, "toolbarColor", value.asInstanceOf[js.Any])
    
    inline def setToolbarColorUndefined: Self = StObject.set(x, "toolbarColor", js.undefined)
    
    inline def setWindowFeatures(value: String | WebBrowserWindowFeatures): Self = StObject.set(x, "windowFeatures", value.asInstanceOf[js.Any])
    
    inline def setWindowFeaturesUndefined: Self = StObject.set(x, "windowFeatures", js.undefined)
    
    inline def setWindowName(value: String): Self = StObject.set(x, "windowName", value.asInstanceOf[js.Any])
    
    inline def setWindowNameUndefined: Self = StObject.set(x, "windowName", js.undefined)
  }
}
