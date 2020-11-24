package typings.expoConfigureSplashScreen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@expo/configure-splash-screen/build/utils/file-utils", JSImport.Namespace)
@js.native
object fileUtilsMod extends js.Object {
  
  def createDirAndWriteFile(filePath: String, content: String): js.Promise[Unit] = js.native
  
  def readFileWithFallback(filePath: String): js.Promise[String] = js.native
  def readFileWithFallback(filePath: String, fallbackContent: String): js.Promise[String] = js.native
  
  def removeFileIfExists(filePath: String): js.Promise[Unit] = js.native
}
