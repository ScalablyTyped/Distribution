package typings.firebaseFirestore.distLiteFirestoreSrcApiMod

import typings.firebaseFirestore.distLiteFirestoreSrcModelMutationMod.Mutation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/firestore/src/api", "WriteBatch")
@js.native
open class WriteBatch_ protected ()
  extends typings.firebaseFirestore.distLiteFirestoreSrcLiteApiWriteBatchMod.WriteBatch_ {
  /** @hideconstructor */
  def this(
    _firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
    _commitHandler: js.Function1[/* m */ js.Array[Mutation], js.Promise[Unit]]
  ) = this()
}
