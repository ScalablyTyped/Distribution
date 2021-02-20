package typings.electronWinstaller

import typings.electronWinstaller.optionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-winstaller", "convertVersion")
  @js.native
  def convertVersion(version: String): String = js.native
  
  @JSImport("electron-winstaller", "createWindowsInstaller")
  @js.native
  def createWindowsInstaller(options: Options): js.Promise[Unit] = js.native
}
