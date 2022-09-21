package typings.expoWebBrowser.webBrowserTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WebBrowserPresentationStyle extends StObject
@JSImport("expo-web-browser/build/WebBrowser.types", "WebBrowserPresentationStyle")
@js.native
object WebBrowserPresentationStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WebBrowserPresentationStyle & String] = js.native
  
  /**
    * The default presentation style chosen by the system.
    * On older iOS versions, falls back to `WebBrowserPresentationStyle.FullScreen`.
    *
    * @platform ios 13+
    */
  @js.native
  sealed trait AUTOMATIC
    extends StObject
       with WebBrowserPresentationStyle
  /* "automatic" */ val AUTOMATIC: typings.expoWebBrowser.webBrowserTypesMod.WebBrowserPresentationStyle.AUTOMATIC & String = js.native
  
  /**
    * A presentation style where the browser is displayed over the app's content.
    */
  @js.native
  sealed trait CURRENT_CONTEXT
    extends StObject
       with WebBrowserPresentationStyle
  /* "currentContext" */ val CURRENT_CONTEXT: typings.expoWebBrowser.webBrowserTypesMod.WebBrowserPresentationStyle.CURRENT_CONTEXT & String = js.native
  
  /**
    * A presentation style that displays the browser centered in the screen.
    */
  @js.native
  sealed trait FORM_SHEET
    extends StObject
       with WebBrowserPresentationStyle
  /* "formSheet" */ val FORM_SHEET: typings.expoWebBrowser.webBrowserTypesMod.WebBrowserPresentationStyle.FORM_SHEET & String = js.native
  
  /**
    * A presentation style in which the presented browser covers the screen.
    */
  @js.native
  sealed trait FULL_SCREEN
    extends StObject
       with WebBrowserPresentationStyle
  /* "fullScreen" */ val FULL_SCREEN: typings.expoWebBrowser.webBrowserTypesMod.WebBrowserPresentationStyle.FULL_SCREEN & String = js.native
  
  /**
    * A presentation style where the browser is displayed over the app's content.
    */
  @js.native
  sealed trait OVER_CURRENT_CONTEXT
    extends StObject
       with WebBrowserPresentationStyle
  /* "overCurrentContext" */ val OVER_CURRENT_CONTEXT: typings.expoWebBrowser.webBrowserTypesMod.WebBrowserPresentationStyle.OVER_CURRENT_CONTEXT & String = js.native
  
  /**
    * A presentation style in which the browser view covers the screen.
    */
  @js.native
  sealed trait OVER_FULL_SCREEN
    extends StObject
       with WebBrowserPresentationStyle
  /* "overFullScreen" */ val OVER_FULL_SCREEN: typings.expoWebBrowser.webBrowserTypesMod.WebBrowserPresentationStyle.OVER_FULL_SCREEN & String = js.native
  
  /**
    * A presentation style that partially covers the underlying content.
    */
  @js.native
  sealed trait PAGE_SHEET
    extends StObject
       with WebBrowserPresentationStyle
  /* "pageSheet" */ val PAGE_SHEET: typings.expoWebBrowser.webBrowserTypesMod.WebBrowserPresentationStyle.PAGE_SHEET & String = js.native
  
  /**
    * A presentation style where the browser is displayed in a popover view.
    */
  @js.native
  sealed trait POPOVER
    extends StObject
       with WebBrowserPresentationStyle
  /* "popover" */ val POPOVER: typings.expoWebBrowser.webBrowserTypesMod.WebBrowserPresentationStyle.POPOVER & String = js.native
}
