package typings.electronWinstaller

import typings.electronWinstaller.libOptionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-winstaller", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertVersion(version: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertVersion")(version.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def createWindowsInstaller(options: Options): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWindowsInstaller")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
