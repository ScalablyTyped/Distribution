package typings.firebaseDatabase

import typings.firebaseDatabase.operationMod.Operation
import typings.firebaseDatabase.operationMod.OperationSource
import typings.firebaseDatabase.pathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listenCompleteMod {
  
  @JSImport("@firebase/database/dist/src/core/operation/ListenComplete", "ListenComplete")
  @js.native
  class ListenComplete protected () extends Operation {
    def this(source: OperationSource, path: Path) = this()
  }
}
