package typings.firebaseFirestore

import typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreTypesMod.ListenSequenceNumber
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransaction
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalSimpleDbMod.SimpleDbStore
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalSimpleDbMod.SimpleDbTransaction
import typings.std.IDBValidKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcLocalIndexeddbTransactionMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/local/indexeddb_transaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/local/indexeddb_transaction", "IndexedDbTransaction")
  @js.native
  open class IndexedDbTransaction protected () extends PersistenceTransaction {
    def this(simpleDbTransaction: SimpleDbTransaction, currentSequenceNumber: ListenSequenceNumber) = this()
    
    val simpleDbTransaction: SimpleDbTransaction = js.native
  }
  
  inline def getStore[Key /* <: IDBValidKey */, Value](txn: PersistenceTransaction, store: String): SimpleDbStore[Key, Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStore")(txn.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[SimpleDbStore[Key, Value]]
}
