package typings.expoConfigureSplashScreen

import typings.expoConfigureSplashScreen.anon.DarkMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorsXmlMod {
  
  @JSImport("@expo/configure-splash-screen/build/android/Colors.xml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(androidMainPath: String, config: DarkMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(androidMainPath.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
