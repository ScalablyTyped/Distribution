package typings.firebaseAuth

import typings.firebaseAuth.anon.InAppBrowser39
import typings.firebaseAuth.anon.PackageName
import typings.firebaseAuth.anon.Subscribe
import typings.firebaseAuth.distSrcPlatformBrowserRecaptchaRecaptchaMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRnSrcPlatformCordovaPluginsMod {
  
  @JSImport("@firebase/auth/dist/rn/src/platform_cordova/plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def _cordovaWindow(): CordovaWindow = ^.asInstanceOf[js.Dynamic].applyDynamic("_cordovaWindow")().asInstanceOf[CordovaWindow]
  
  trait CordovaWindow
    extends StObject
       with Window {
    
    var BuildInfo: PackageName
    
    var cordova: InAppBrowser39
    
    def handleOpenURL(url: String): Unit
    
    var universalLinks: Subscribe
  }
  object CordovaWindow {
    
    inline def apply(
      BuildInfo: PackageName,
      cordova: InAppBrowser39,
      handleOpenURL: String => Unit,
      universalLinks: Subscribe
    ): CordovaWindow = {
      val __obj = js.Dynamic.literal(BuildInfo = BuildInfo.asInstanceOf[js.Any], cordova = cordova.asInstanceOf[js.Any], handleOpenURL = js.Any.fromFunction1(handleOpenURL), universalLinks = universalLinks.asInstanceOf[js.Any])
      __obj.asInstanceOf[CordovaWindow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CordovaWindow] (val x: Self) extends AnyVal {
      
      inline def setBuildInfo(value: PackageName): Self = StObject.set(x, "BuildInfo", value.asInstanceOf[js.Any])
      
      inline def setCordova(value: InAppBrowser39): Self = StObject.set(x, "cordova", value.asInstanceOf[js.Any])
      
      inline def setHandleOpenURL(value: String => Unit): Self = StObject.set(x, "handleOpenURL", js.Any.fromFunction1(value))
      
      inline def setUniversalLinks(value: Subscribe): Self = StObject.set(x, "universalLinks", value.asInstanceOf[js.Any])
    }
  }
  
  trait InAppBrowserRef extends StObject {
    
    var close: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object InAppBrowserRef {
    
    inline def apply(): InAppBrowserRef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InAppBrowserRef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InAppBrowserRef] (val x: Self) extends AnyVal {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    }
  }
}
