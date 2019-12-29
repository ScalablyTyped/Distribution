package typings.atFirebaseDatabase.distSrcCoreRepoUnderscoreTransactionMod

import typings.atFirebaseDatabase.distSrcApiDataSnapshotMod.DataSnapshot
import typings.atFirebaseDatabase.distSrcCoreUtilPathMod.Path
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@firebase/database/dist/src/core/Repo", JSImport.Namespace)
@js.native
object distSrcCoreRepoMod extends js.Object {
  @js.native
  trait Repo extends js.Object {
    def startTransaction(
      path: Path,
      transactionUpdate: js.Function1[/* a */ js.Any, Unit],
      onComplete: js.Function3[/* a */ Error, /* b */ Boolean, /* c */ DataSnapshot, Unit],
      applyLocally: Boolean
    ): Unit = js.native
    def startTransaction(
      path: Path,
      transactionUpdate: js.Function1[/* a */ js.Any, Unit],
      onComplete: Null,
      applyLocally: Boolean
    ): Unit = js.native
  }
  
}

