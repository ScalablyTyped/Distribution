package typings.fsDashTreeDashDiff.fsDashTreeDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FSTree extends js.Object {
  def addEntries(entries: js.Array[Entry]): Unit = js.native
  def addEntries(entries: js.Array[Entry], options: PartialFSTreeOptions): Unit = js.native
  def addPaths(paths: js.Array[String]): Unit = js.native
  def addPaths(paths: js.Array[String], options: PartialFSTreeOptions): Unit = js.native
  def calculateAndApplyPatch(tree: FSTree, inputDir: String, outputDir: String): Unit = js.native
  def calculateAndApplyPatch(tree: FSTree, inputDir: String, outputDir: String, delegate: FSTreeDelegates): Unit = js.native
  def calculatePatch(tree: FSTree): js.Array[Patch] = js.native
  def calculatePatch(tree: FSTree, isEqual: js.Function2[/* a */ this.type, /* b */ this.type, Boolean]): js.Array[Patch] = js.native
  def forEach(
    cb: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FSEntry */ /* entry */ js.Any, 
      Unit
    ]
  ): Unit = js.native
  def forEach(
    cb: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FSEntry */ /* entry */ js.Any, 
      Unit
    ],
    context: js.Any
  ): Unit = js.native
}

