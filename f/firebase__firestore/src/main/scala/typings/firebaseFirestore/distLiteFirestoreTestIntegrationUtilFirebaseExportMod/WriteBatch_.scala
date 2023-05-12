package typings.firebaseFirestore.distLiteFirestoreTestIntegrationUtilFirebaseExportMod

import typings.firebaseFirestore.distLiteFirestoreSrcModelMutationMod.Mutation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/firestore/test/integration/util/firebase_export", "WriteBatch")
@js.native
open class WriteBatch_ protected ()
  extends typings.firebaseFirestore.distLiteFirestoreSrcMod.WriteBatch_ {
  /** @hideconstructor */
  def this(
    _firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
    _commitHandler: js.Function1[/* m */ js.Array[Mutation], js.Promise[Unit]]
  ) = this()
}
