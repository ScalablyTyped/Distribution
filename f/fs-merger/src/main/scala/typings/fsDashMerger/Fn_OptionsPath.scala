package typings.fsDashMerger

import typings.walkDashSync.walkDashSyncMod.WalkSyncEntry
import typings.walkDashSync.walkDashSyncMod.WalkSyncOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_OptionsPath extends js.Object {
  def apply(path: String): js.Array[WalkSyncEntry] = js.native
  def apply(path: String, options: WalkSyncOptions): js.Array[WalkSyncEntry] = js.native
}

