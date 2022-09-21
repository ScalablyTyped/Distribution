package typings.firebaseAuth

import typings.firebaseAuth.anon.InAppBrowserPlugins
import typings.firebaseAuth.anon.PackageName
import typings.firebaseAuth.anon.Subscribe
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPlatformCordovaPluginsMod {
  
  @JSImport("@firebase/auth/dist/esm5/src/platform_cordova/plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def _cordovaWindow(): CordovaWindow = ^.asInstanceOf[js.Dynamic].applyDynamic("_cordovaWindow")().asInstanceOf[CordovaWindow]
  
  @js.native
  trait CordovaWindow
    extends StObject
       with Window {
    
    var BuildInfo: PackageName = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    var cordova: InAppBrowserPlugins = js.native
    
    def handleOpenURL(url: String): Unit = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    var universalLinks: Subscribe = js.native
  }
  
  trait InAppBrowserRef extends StObject {
    
    var close: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object InAppBrowserRef {
    
    inline def apply(): InAppBrowserRef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InAppBrowserRef]
    }
    
    extension [Self <: InAppBrowserRef](x: Self) {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    }
  }
}
