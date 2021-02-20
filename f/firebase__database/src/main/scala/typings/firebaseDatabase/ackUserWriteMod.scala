package typings.firebaseDatabase

import typings.firebaseDatabase.immutableTreeMod.ImmutableTree
import typings.firebaseDatabase.operationMod.Operation
import typings.firebaseDatabase.pathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ackUserWriteMod {
  
  @JSImport("@firebase/database/dist/src/core/operation/AckUserWrite", "AckUserWrite")
  @js.native
  class AckUserWrite protected () extends Operation {
    /**
      *
      * @param {!Path} path
      * @param {!ImmutableTree<!boolean>} affectedTree A tree containing true for each affected path. Affected paths can't overlap.
      * @param {!boolean} revert
      */
    def this(
      /** @inheritDoc */ path: Path,
      /** @inheritDoc */ affectedTree: ImmutableTree[Boolean],
      /** @inheritDoc */ revert: Boolean
    ) = this()
    
    /** @inheritDoc */ var affectedTree: ImmutableTree[Boolean] = js.native
    
    /** @inheritDoc */ var revert: Boolean = js.native
  }
}
