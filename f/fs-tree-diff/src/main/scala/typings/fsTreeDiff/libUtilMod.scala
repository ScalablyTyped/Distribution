package typings.fsTreeDiff

import typings.fsTreeDiff.fsTreeDiffInts.`-1`
import typings.fsTreeDiff.fsTreeDiffInts.`0`
import typings.fsTreeDiff.fsTreeDiffInts.`1`
import typings.fsTreeDiff.libEntryMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilMod {
  
  @JSImport("fs-tree-diff/lib/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def basename(entry: default): String = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(entry.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def commonPrefix(a: String, b: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("commonPrefix")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def commonPrefix(a: String, b: String, term: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("commonPrefix")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], term.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def compareByRelativePath(entryA: default, entryB: default): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareByRelativePath")(entryA.asInstanceOf[js.Any], entryB.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  
  inline def computeImpliedEntries(basePath: String, relativePath: String): js.Array[default] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeImpliedEntries")(basePath.asInstanceOf[js.Any], relativePath.asInstanceOf[js.Any])).asInstanceOf[js.Array[default]]
  
  inline def sortAndExpand(entries: js.Array[default]): js.Array[default] = ^.asInstanceOf[js.Dynamic].applyDynamic("sortAndExpand")(entries.asInstanceOf[js.Any]).asInstanceOf[js.Array[default]]
  
  inline def validateSortedUnique(entries: js.Array[default]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateSortedUnique")(entries.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
