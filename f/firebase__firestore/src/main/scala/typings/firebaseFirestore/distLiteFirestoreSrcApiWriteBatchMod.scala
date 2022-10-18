package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore
import typings.firebaseFirestore.distLiteFirestoreSrcModelMutationMod.Mutation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcApiWriteBatchMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/api/write_batch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/api/write_batch", "WriteBatch")
  @js.native
  open class WriteBatch_ protected ()
    extends typings.firebaseFirestore.distLiteFirestoreSrcLiteApiWriteBatchMod.WriteBatch_ {
    /** @hideconstructor */
    def this(_firestore: Firestore, _commitHandler: js.Function1[/* m */ js.Array[Mutation], js.Promise[Unit]]) = this()
  }
  
  inline def writeBatch(firestore: typings.firebaseFirestore.distLiteFirestoreSrcApiDatabaseMod.Firestore): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiWriteBatchMod.WriteBatch_ = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBatch")(firestore.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiWriteBatchMod.WriteBatch_]
}
