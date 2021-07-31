package typings.expoConfigureSplashScreen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentsJsonMod {
  
  @JSImport("@expo/configure-splash-screen/build/ios/Contents.json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def writeContentsJsonFile(contentsJsonFilePath: String, filename: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeContentsJsonFile")(contentsJsonFilePath.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeContentsJsonFile(contentsJsonFilePath: String, filename: String, darkModeFilename: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeContentsJsonFile")(contentsJsonFilePath.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], darkModeFilename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
