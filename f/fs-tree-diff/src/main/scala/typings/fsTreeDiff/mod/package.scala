package typings.fsTreeDiff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FSTreeDelegates = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in fs-tree-diff.fs-tree-diff.ChangeType ]:? (inputPath : string, outputPath : string, relativePath : string): void}
    */ typings.fsTreeDiff.fsTreeDiffStrings.FSTreeDelegates with js.Any
  type PartialFSTreeOptions = typings.std.Partial[typings.fsTreeDiff.mod.FSTreeOptions]
  type Patch = js.Tuple3[
    typings.fsTreeDiff.mod.ChangeType, 
    java.lang.String, 
    typings.fsTreeDiff.mod.FSTreeEntry
  ]
}
