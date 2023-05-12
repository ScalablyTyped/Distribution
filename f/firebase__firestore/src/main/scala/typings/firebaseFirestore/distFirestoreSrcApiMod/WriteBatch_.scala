package typings.firebaseFirestore.distFirestoreSrcApiMod

import typings.firebaseFirestore.distFirestoreSrcModelMutationMod.Mutation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/firestore/src/api", "WriteBatch")
@js.native
open class WriteBatch_ protected ()
  extends typings.firebaseFirestore.distFirestoreSrcLiteApiWriteBatchMod.WriteBatch_ {
  /** @hideconstructor */
  def this(
    _firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
    _commitHandler: js.Function1[/* m */ js.Array[Mutation], js.Promise[Unit]]
  ) = this()
}
