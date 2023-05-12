package typings.firebaseFirestore.distFirestoreTestIntegrationUtilFirebaseExportMod

import typings.firebaseFirestore.distFirestoreSrcModelMutationMod.Mutation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "WriteBatch")
@js.native
open class WriteBatch_ protected ()
  extends typings.firebaseFirestore.distFirestoreSrcMod.WriteBatch_ {
  /** @hideconstructor */
  def this(
    _firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
    _commitHandler: js.Function1[/* m */ js.Array[Mutation], js.Promise[Unit]]
  ) = this()
}
