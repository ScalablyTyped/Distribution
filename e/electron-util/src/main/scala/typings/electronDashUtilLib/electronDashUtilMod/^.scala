package typings
package electronDashUtilLib.electronDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val appReady: js.Promise[scala.Unit] = js.native
  val chromeVersion: java.lang.String = js.native
  val electronVersion: java.lang.String = js.native
  def activeWindow(): js.Any = js.native
  def fixPathForAsarUnpack(path: java.lang.String): java.lang.String = js.native
  def platform[T](platforms: PlatformsParameter[T]): T = js.native
  def runJS(code: java.lang.String): js.Promise[_] = js.native
  def runJS(code: java.lang.String, window: js.Any): js.Promise[_] = js.native
}

