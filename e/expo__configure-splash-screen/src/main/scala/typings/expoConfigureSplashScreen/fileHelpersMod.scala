package typings.expoConfigureSplashScreen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@expo/configure-splash-screen/build/file-helpers", JSImport.Namespace)
@js.native
object fileHelpersMod extends js.Object {
  def createDirAndWriteFile(filePath: String, content: String): js.Promise[Unit] = js.native
  def readFileWithFallback(filePath: String): js.Promise[String] = js.native
  def readFileWithFallback(filePath: String, fallbackContent: String): js.Promise[String] = js.native
  def removeFileIfExists(filePath: String): js.Promise[Unit] = js.native
}

