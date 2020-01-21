package typings.fsTreeDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-tree-diff", JSImport.Namespace)
@js.native
class ^ () extends FSTree {
  def this(options: PartialFSTreeOptions) = this()
}

@JSImport("fs-tree-diff", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def applyPatch(inputDir: String, outputDir: String, patch: js.Array[Patch]): Unit = js.native
  def fromEntries(entries: js.Array[Entry]): FSTree = js.native
  def fromPaths(paths: js.Array[String]): FSTree = js.native
  def isEqual(a: FSTree, b: FSTree): Boolean = js.native
}

