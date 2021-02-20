package typings.fsTreeDiff

import typings.fsTreeDiff.entryMod.default
import typings.fsTreeDiff.fsTreeDiffNumbers.`-1`
import typings.fsTreeDiff.fsTreeDiffNumbers.`0`
import typings.fsTreeDiff.fsTreeDiffNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("fs-tree-diff/lib/util", "basename")
  @js.native
  def basename(entry: default): String = js.native
  
  @JSImport("fs-tree-diff/lib/util", "commonPrefix")
  @js.native
  def commonPrefix(a: String, b: String): String = js.native
  @JSImport("fs-tree-diff/lib/util", "commonPrefix")
  @js.native
  def commonPrefix(a: String, b: String, term: String): String = js.native
  
  @JSImport("fs-tree-diff/lib/util", "compareByRelativePath")
  @js.native
  def compareByRelativePath(entryA: default, entryB: default): `1` | `0` | `-1` = js.native
  
  @JSImport("fs-tree-diff/lib/util", "computeImpliedEntries")
  @js.native
  def computeImpliedEntries(basePath: String, relativePath: String): js.Array[default] = js.native
  
  @JSImport("fs-tree-diff/lib/util", "sortAndExpand")
  @js.native
  def sortAndExpand(entries: js.Array[default]): js.Array[default] = js.native
  
  @JSImport("fs-tree-diff/lib/util", "validateSortedUnique")
  @js.native
  def validateSortedUnique(entries: js.Array[default]): Unit = js.native
}
