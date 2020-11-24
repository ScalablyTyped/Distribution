package typings.electronWinstaller

import typings.node.childProcessMod.SpawnOptionsWithoutStdio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron-winstaller/lib/spawn-promise", JSImport.Namespace)
@js.native
object spawnPromiseMod extends js.Object {
  
  def default(exe: String, params: js.Array[String]): js.Promise[String] = js.native
  def default(exe: String, params: js.Array[String], opts: SpawnOptionsWithoutStdio): js.Promise[String] = js.native
}
