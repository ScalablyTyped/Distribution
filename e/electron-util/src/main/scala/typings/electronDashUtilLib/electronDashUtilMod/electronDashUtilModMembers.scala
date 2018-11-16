package typings
package electronDashUtilLib.electronDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-util", JSImport.Namespace)
@js.native
object electronDashUtilModMembers extends js.Object {
  val app: electronDashUtilLib.Anon_BrowserWindow = js.native
  val appReady: stdLib.Promise[scala.Unit] = js.native
  val chromeVersion: java.lang.String = js.native
  val electronVersion: java.lang.String = js.native
  val is: electronDashUtilLib.Anon_Macos = js.native
  def activeWindow(): js.Any = js.native
  def fixPathForAsarUnpack(path: java.lang.String): java.lang.String = js.native
  def platform[T](platforms: PlatformsParameter[T]): T = js.native
  def runJS(code: java.lang.String): stdLib.Promise[_] = js.native
  def runJS(code: java.lang.String, window: js.Any): stdLib.Promise[_] = js.native
}

