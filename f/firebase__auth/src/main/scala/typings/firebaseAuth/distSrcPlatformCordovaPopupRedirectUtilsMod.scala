package typings.firebaseAuth

import typings.firebaseAuth.distSrcModelAuthMod.AuthInternal
import typings.firebaseAuth.distSrcModelPopupRedirectMod.AuthEvent
import typings.firebaseAuth.distSrcModelPublicTypesMod.AuthProvider
import typings.firebaseAuth.distSrcPlatformCordovaPluginsMod.InAppBrowserRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPlatformCordovaPopupRedirectUtilsMod {
  
  @JSImport("@firebase/auth/dist/src/platform_cordova/popup_redirect/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkCordovaConfiguration(auth: AuthInternal): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_checkCordovaConfiguration")(auth.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def generateHandlerUrl(auth: AuthInternal, event: AuthEvent, provider: AuthProvider): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_generateHandlerUrl")(auth.asInstanceOf[js.Any], event.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def performRedirect(handlerUrl: String): js.Promise[InAppBrowserRef | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("_performRedirect")(handlerUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[InAppBrowserRef | Null]]
  
  inline def validateOrigin(auth: AuthInternal): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("_validateOrigin")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def waitForAppResume(auth: AuthInternal, eventListener: PassiveAuthEventListener): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("_waitForAppResume")(auth.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForAppResume(auth: AuthInternal, eventListener: PassiveAuthEventListener, iabRef: InAppBrowserRef): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("_waitForAppResume")(auth.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any], iabRef.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait PassiveAuthEventListener extends StObject {
    
    def addPassiveListener(cb: js.Function0[Unit]): Unit
    
    def removePassiveListener(cb: js.Function0[Unit]): Unit
  }
  object PassiveAuthEventListener {
    
    inline def apply(addPassiveListener: js.Function0[Unit] => Unit, removePassiveListener: js.Function0[Unit] => Unit): PassiveAuthEventListener = {
      val __obj = js.Dynamic.literal(addPassiveListener = js.Any.fromFunction1(addPassiveListener), removePassiveListener = js.Any.fromFunction1(removePassiveListener))
      __obj.asInstanceOf[PassiveAuthEventListener]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PassiveAuthEventListener] (val x: Self) extends AnyVal {
      
      inline def setAddPassiveListener(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "addPassiveListener", js.Any.fromFunction1(value))
      
      inline def setRemovePassiveListener(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "removePassiveListener", js.Any.fromFunction1(value))
    }
  }
}
