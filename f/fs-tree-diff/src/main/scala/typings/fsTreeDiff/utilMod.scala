package typings.fsTreeDiff

import typings.fsTreeDiff.entryMod.default
import typings.fsTreeDiff.fsTreeDiffNumbers.`-1`
import typings.fsTreeDiff.fsTreeDiffNumbers.`0`
import typings.fsTreeDiff.fsTreeDiffNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-tree-diff/lib/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def basename(entry: default): String = js.native
  
  def commonPrefix(a: String, b: String): String = js.native
  def commonPrefix(a: String, b: String, term: String): String = js.native
  
  def compareByRelativePath(entryA: default, entryB: default): `1` | `0` | `-1` = js.native
  
  def computeImpliedEntries(basePath: String, relativePath: String): js.Array[default] = js.native
  
  def sortAndExpand(entries: js.Array[default]): js.Array[default] = js.native
  
  def validateSortedUnique(entries: js.Array[default]): Unit = js.native
}
