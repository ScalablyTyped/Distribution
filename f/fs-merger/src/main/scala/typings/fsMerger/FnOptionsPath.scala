package typings.fsMerger

import typings.walkSync.mod.WalkSyncEntry
import typings.walkSync.mod.WalkSyncOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnOptionsPath extends js.Object {
  def apply(path: String): js.Array[WalkSyncEntry] = js.native
  def apply(path: String, options: WalkSyncOptions): js.Array[WalkSyncEntry] = js.native
}

