package typings.electronNotarize.spawnMod

import typings.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-notarize/lib/spawn", "spawn")
@js.native
object spawn extends js.Object {
  def apply(cmd: String): js.Promise[SpawnResult] = js.native
  def apply(cmd: String, args: js.Array[String]): js.Promise[SpawnResult] = js.native
  def apply(cmd: String, args: js.Array[String], opts: SpawnOptions): js.Promise[SpawnResult] = js.native
}

