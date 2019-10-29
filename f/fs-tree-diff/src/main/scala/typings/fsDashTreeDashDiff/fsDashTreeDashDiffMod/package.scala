package typings.fsDashTreeDashDiff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fsDashTreeDashDiffMod {
  import typings.std.Partial

  type FSTreeDelegates = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in fs-tree-diff.fs-tree-diff.ChangeType ]:? (inputPath : string, outputPath : string, relativePath : string): void}
    */ typings.fsDashTreeDashDiff.fsDashTreeDashDiffStrings.FSTreeDelegates with js.Any
  type PartialFSTreeOptions = Partial[FSTreeOptions]
  type Patch = js.Tuple3[ChangeType, String, FSTreeEntry]
}
