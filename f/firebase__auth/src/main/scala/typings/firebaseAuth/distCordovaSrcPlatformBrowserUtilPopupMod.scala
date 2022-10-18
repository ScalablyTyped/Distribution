package typings.firebaseAuth

import typings.firebaseAuth.distCordovaSrcModelAuthMod.AuthInternal
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCordovaSrcPlatformBrowserUtilPopupMod {
  
  @JSImport("@firebase/auth/dist/cordova/src/platform_browser/util/popup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth/dist/cordova/src/platform_browser/util/popup", "AuthPopup")
  @js.native
  open class AuthPopup () extends StObject {
    def this(window: Window) = this()
    
    var associatedEvent: String | Null = js.native
    
    def close(): Unit = js.native
    
    val window: Window | Null = js.native
  }
  
  inline def open(auth: AuthInternal): AuthPopup = ^.asInstanceOf[js.Dynamic].applyDynamic("_open")(auth.asInstanceOf[js.Any]).asInstanceOf[AuthPopup]
  inline def open(auth: AuthInternal, url: String): AuthPopup = (^.asInstanceOf[js.Dynamic].applyDynamic("_open")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[AuthPopup]
  inline def open(auth: AuthInternal, url: String, name: String): AuthPopup = (^.asInstanceOf[js.Dynamic].applyDynamic("_open")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[AuthPopup]
  inline def open(auth: AuthInternal, url: String, name: String, width: Double): AuthPopup = (^.asInstanceOf[js.Dynamic].applyDynamic("_open")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any], name.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[AuthPopup]
  inline def open(auth: AuthInternal, url: String, name: String, width: Double, height: Double): AuthPopup = (^.asInstanceOf[js.Dynamic].applyDynamic("_open")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any], name.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[AuthPopup]
  inline def open(auth: AuthInternal, url: String, name: String, width: Unit, height: Double): AuthPopup = (^.asInstanceOf[js.Dynamic].applyDynamic("_open")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any], name.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[AuthPopup]
  inline def open(auth: AuthInternal, url: String, name: Unit, width: Double): AuthPopup = (^.asInstanceOf[js.Dynamic].applyDynamic("_open")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any], name.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[AuthPopup]
  inline def open(auth: AuthInternal, url: String, name: Unit, width: Double, height: Double): AuthPopup = (^.asInstanceOf[js.Dynamic].applyDynamic("_open")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any], name.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[AuthPopup]
  inline def open(auth: AuthInternal, url: String, name: Unit, width: Unit, height: Double): AuthPopup = (^.asInstanceOf[js.Dynamic].applyDynamic("_open")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any], name.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[AuthPopup]
  inline def open(auth: AuthInternal, url: Unit, name: String): AuthPopup = (^.asInstanceOf[js.Dynamic].applyDynamic("_open")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[AuthPopup]
  inline def open(auth: AuthInternal, url: Unit, name: String, width: Double): AuthPopup = (^.asInstanceOf[js.Dynamic].applyDynamic("_open")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any], name.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[AuthPopup]
  inline def open(auth: AuthInternal, url: Unit, name: String, width: Double, height: Double): AuthPopup = (^.asInstanceOf[js.Dynamic].applyDynamic("_open")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any], name.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[AuthPopup]
  inline def open(auth: AuthInternal, url: Unit, name: String, width: Unit, height: Double): AuthPopup = (^.asInstanceOf[js.Dynamic].applyDynamic("_open")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any], name.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[AuthPopup]
  inline def open(auth: AuthInternal, url: Unit, name: Unit, width: Double): AuthPopup = (^.asInstanceOf[js.Dynamic].applyDynamic("_open")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any], name.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[AuthPopup]
  inline def open(auth: AuthInternal, url: Unit, name: Unit, width: Double, height: Double): AuthPopup = (^.asInstanceOf[js.Dynamic].applyDynamic("_open")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any], name.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[AuthPopup]
  inline def open(auth: AuthInternal, url: Unit, name: Unit, width: Unit, height: Double): AuthPopup = (^.asInstanceOf[js.Dynamic].applyDynamic("_open")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any], name.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[AuthPopup]
}
