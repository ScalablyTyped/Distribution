package typings.firebaseFirestore

import typings.firebaseFirestore.anon.BatchIdNumber
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalIndexeddbSchemaLegacyMod.DbRemoteDocument
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalSimpleDbMod.SimpleDbTransaction
import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcLocalIndexeddbMutationBatchImplMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/local/indexeddb_mutation_batch_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dbDocumentSize(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dbDocumentSize")().asInstanceOf[Double]
  inline def dbDocumentSize(doc: DbRemoteDocument): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dbDocumentSize")(doc.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def dbDocumentSize(doc: typings.firebaseFirestore.distPackagesFirestoreSrcLocalIndexeddbSchemaMod.DbRemoteDocument): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dbDocumentSize")(doc.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def removeMutationBatch(txn: SimpleDbTransaction, userId: String, batch: BatchIdNumber): PersistencePromise[js.Array[DocumentKey]] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeMutationBatch")(txn.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[PersistencePromise[js.Array[DocumentKey]]]
}
