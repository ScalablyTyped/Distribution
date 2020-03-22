package typings.fsTreeDiff.mod

import typings.fsTreeDiff.entryMod.BaseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FSTree[T /* <: BaseEntry */] extends js.Object {
  var entries: js.Array[T] = js.native
  val size: Double = js.native
  def addEntries(entries: js.Array[T]): Unit = js.native
  def addEntries(entries: js.Array[T], options: StaticOptions): Unit = js.native
  def addPaths(paths: js.Array[String]): Unit = js.native
  def addPaths(paths: js.Array[String], options: StaticOptions): Unit = js.native
  def calculateAndApplyPatch(otherFSTree: FSTree[T], input: String, output: String): Unit = js.native
  def calculateAndApplyPatch(otherFSTree: FSTree[T], input: String, output: String, delegate: PatchDelegate): Unit = js.native
  def calculatePatch[K /* <: BaseEntry */](theirFSTree: FSTree[K]): Patch = js.native
  def calculatePatch[K /* <: BaseEntry */](theirFSTree: FSTree[K], isEqual: js.Function2[/* a */ T, /* b */ K, Boolean]): Patch = js.native
  def forEach(
    fn: js.Function3[/* entry */ T, /* index */ Double, /* collection */ js.Array[T], Unit],
    context: js.Any
  ): Unit = js.native
}

