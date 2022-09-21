package typings.expoWebBrowser.webBrowserTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WebBrowserResultType extends StObject
@JSImport("expo-web-browser/build/WebBrowser.types", "WebBrowserResultType")
@js.native
object WebBrowserResultType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WebBrowserResultType & String] = js.native
  
  /**
    * @platform ios
    */
  @js.native
  sealed trait CANCEL
    extends StObject
       with WebBrowserResultType
  /* "cancel" */ val CANCEL: typings.expoWebBrowser.webBrowserTypesMod.WebBrowserResultType.CANCEL & String = js.native
  
  /**
    * @platform ios
    */
  @js.native
  sealed trait DISMISS
    extends StObject
       with WebBrowserResultType
  /* "dismiss" */ val DISMISS: typings.expoWebBrowser.webBrowserTypesMod.WebBrowserResultType.DISMISS & String = js.native
  
  @js.native
  sealed trait LOCKED
    extends StObject
       with WebBrowserResultType
  /* "locked" */ val LOCKED: typings.expoWebBrowser.webBrowserTypesMod.WebBrowserResultType.LOCKED & String = js.native
  
  /**
    * @platform android
    */
  @js.native
  sealed trait OPENED
    extends StObject
       with WebBrowserResultType
  /* "opened" */ val OPENED: typings.expoWebBrowser.webBrowserTypesMod.WebBrowserResultType.OPENED & String = js.native
}
