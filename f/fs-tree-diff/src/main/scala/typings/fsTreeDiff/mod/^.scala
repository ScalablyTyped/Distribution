package typings.fsTreeDiff.mod

import typings.fsTreeDiff.anon.Entries
import typings.fsTreeDiff.entryMod.BaseEntry
import typings.fsTreeDiff.entryMod.DefaultEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-tree-diff", JSImport.Namespace)
@js.native
class ^[T /* <: BaseEntry */] () extends FSTree[T] {
  def this(options: Entries[T]) = this()
}

@JSImport("fs-tree-diff", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def applyPatch(input: String, output: String, patch: Patch): Unit = js.native
  def applyPatch(input: String, output: String, patch: Patch, _delegate: PatchDelegate): Unit = js.native
  def defaultIsEqual(entryA: DefaultEntry, entryB: DefaultEntry): Boolean = js.native
  def fromEntries[T /* <: BaseEntry */](entries: js.Array[T]): FSTree[T] = js.native
  def fromEntries[T /* <: BaseEntry */](entries: js.Array[T], options: StaticOptions): FSTree[T] = js.native
  def fromPaths(paths: js.Array[String]): FSTree[Entry] = js.native
  def fromPaths(paths: js.Array[String], options: StaticOptions): FSTree[Entry] = js.native
}

