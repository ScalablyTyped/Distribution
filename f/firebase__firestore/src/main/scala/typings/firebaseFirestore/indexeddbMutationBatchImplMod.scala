package typings.firebaseFirestore

import typings.firebaseFirestore.anon.BatchId
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.indexeddbSchemaLegacyMod.DbRemoteDocument
import typings.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.simpleDbMod.SimpleDbTransaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexeddbMutationBatchImplMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/local/indexeddb_mutation_batch_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dbDocumentSize(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dbDocumentSize")().asInstanceOf[Double]
  inline def dbDocumentSize(doc: DbRemoteDocument): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dbDocumentSize")(doc.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def dbDocumentSize(doc: typings.firebaseFirestore.indexeddbSchemaMod.DbRemoteDocument): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dbDocumentSize")(doc.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def removeMutationBatch(txn: SimpleDbTransaction, userId: String, batch: BatchId): PersistencePromise[js.Array[DocumentKey]] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeMutationBatch")(txn.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[PersistencePromise[js.Array[DocumentKey]]]
}
