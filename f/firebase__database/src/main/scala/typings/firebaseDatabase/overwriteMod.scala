package typings.firebaseDatabase

import typings.firebaseDatabase.nodeMod.Node
import typings.firebaseDatabase.operationMod.Operation
import typings.firebaseDatabase.operationMod.OperationSource
import typings.firebaseDatabase.pathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/operation/Overwrite", JSImport.Namespace)
@js.native
object overwriteMod extends js.Object {
  @js.native
  class Overwrite protected () extends Operation {
    def this(source: OperationSource, path: Path, snap: Node) = this()
    var snap: Node = js.native
  }
  
}

