package typings.expoConfigureSplashScreen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileUtilsMod {
  
  @JSImport("@expo/configure-splash-screen/build/utils/file-utils", "createDirAndWriteFile")
  @js.native
  def createDirAndWriteFile(filePath: String, content: String): js.Promise[Unit] = js.native
  
  @JSImport("@expo/configure-splash-screen/build/utils/file-utils", "readFileWithFallback")
  @js.native
  def readFileWithFallback(filePath: String): js.Promise[String] = js.native
  @JSImport("@expo/configure-splash-screen/build/utils/file-utils", "readFileWithFallback")
  @js.native
  def readFileWithFallback(filePath: String, fallbackContent: String): js.Promise[String] = js.native
  
  @JSImport("@expo/configure-splash-screen/build/utils/file-utils", "removeFileIfExists")
  @js.native
  def removeFileIfExists(filePath: String): js.Promise[Unit] = js.native
}
