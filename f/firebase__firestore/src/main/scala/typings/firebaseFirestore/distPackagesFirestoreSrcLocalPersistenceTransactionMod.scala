package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcCoreTypesMod.ListenSequenceNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcLocalPersistenceTransactionMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/local/persistence_transaction", "PRIMARY_LEASE_LOST_ERROR_MSG")
  @js.native
  val PRIMARY_LEASE_LOST_ERROR_MSG: String = js.native
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/packages/firestore/src/local/persistence_transaction", "PersistenceTransaction")
  @js.native
  open class PersistenceTransaction () extends StObject {
    
    def addOnCommittedListener(listener: js.Function0[Unit]): Unit = js.native
    
    val currentSequenceNumber: ListenSequenceNumber = js.native
    
    /* private */ val onCommittedListeners: Any = js.native
    
    def raiseOnCommittedEvent(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.readonly
    - typings.firebaseFirestore.firebaseFirestoreStrings.readwrite
    - typings.firebaseFirestore.firebaseFirestoreStrings.`readwrite-primary`
  */
  trait PersistenceTransactionMode extends StObject
  object PersistenceTransactionMode {
    
    inline def readonly: typings.firebaseFirestore.firebaseFirestoreStrings.readonly = "readonly".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.readonly]
    
    inline def readwrite: typings.firebaseFirestore.firebaseFirestoreStrings.readwrite = "readwrite".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.readwrite]
    
    inline def `readwrite-primary`: typings.firebaseFirestore.firebaseFirestoreStrings.`readwrite-primary` = "readwrite-primary".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`readwrite-primary`]
  }
}
