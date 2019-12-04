package typings.electronDashWinstaller

import typings.node.childUnderscoreProcessMod.SpawnOptionsWithoutStdio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-winstaller/lib/spawn-promise", JSImport.Namespace)
@js.native
object libSpawnDashPromiseMod extends js.Object {
  def default(exe: String, params: js.Array[String]): js.Promise[String] = js.native
  def default(exe: String, params: js.Array[String], opts: SpawnOptionsWithoutStdio): js.Promise[String] = js.native
}

