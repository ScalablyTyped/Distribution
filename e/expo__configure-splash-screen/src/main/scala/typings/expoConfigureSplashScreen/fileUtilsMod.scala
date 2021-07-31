package typings.expoConfigureSplashScreen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileUtilsMod {
  
  @JSImport("@expo/configure-splash-screen/build/utils/file-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createDirAndWriteFile(filePath: String, content: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDirAndWriteFile")(filePath.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def readFileWithFallback(filePath: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileWithFallback")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def readFileWithFallback(filePath: String, fallbackContent: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileWithFallback")(filePath.asInstanceOf[js.Any], fallbackContent.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def removeFileIfExists(filePath: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFileIfExists")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
