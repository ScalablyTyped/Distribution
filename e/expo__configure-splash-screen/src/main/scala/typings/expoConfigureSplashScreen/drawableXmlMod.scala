package typings.expoConfigureSplashScreen

import typings.expoConfigureSplashScreen.anon.ImageResizeMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawableXmlMod {
  
  @JSImport("@expo/configure-splash-screen/build/android/Drawable.xml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(androidMainPath: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(androidMainPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def default(androidMainPath: String, config: ImageResizeMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(androidMainPath.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
