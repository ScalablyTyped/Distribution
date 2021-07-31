package typings.expoConfigureSplashScreen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androidManifestXmlMod {
  
  @JSImport("@expo/configure-splash-screen/build/android/AndroidManifest.xml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(androidMainPath: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(androidMainPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
