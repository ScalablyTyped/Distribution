package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiDatabaseMod.Firestore
import typings.firebaseFirestore.distPackagesFirestoreSrcModelMutationMod.Mutation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcApiWriteBatchMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/api/write_batch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/api/write_batch", "WriteBatch")
  @js.native
  open class WriteBatch_ protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiWriteBatchMod.WriteBatch_ {
    /** @hideconstructor */
    def this(_firestore: Firestore, _commitHandler: js.Function1[/* m */ js.Array[Mutation], js.Promise[Unit]]) = this()
  }
  
  inline def writeBatch(firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiWriteBatchMod.WriteBatch_ = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBatch")(firestore.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiWriteBatchMod.WriteBatch_]
}
