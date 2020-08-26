package typings.firebaseDatabase

import typings.firebaseDatabase.operationMod.Operation
import typings.firebaseDatabase.operationMod.OperationSource
import typings.firebaseDatabase.pathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/operation/ListenComplete", JSImport.Namespace)
@js.native
object listenCompleteMod extends js.Object {
  @js.native
  class ListenComplete protected () extends Operation {
    def this(source: OperationSource, path: Path) = this()
  }
  
}

