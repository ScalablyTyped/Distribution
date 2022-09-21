package typings.firebaseFirestore

import typings.firebaseFirestore.srcCoreTypesMod.ListenSequenceNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLocalPersistenceTransactionMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/local/persistence_transaction", "PRIMARY_LEASE_LOST_ERROR_MSG")
  @js.native
  val PRIMARY_LEASE_LOST_ERROR_MSG: String = js.native
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/local/persistence_transaction", "PersistenceTransaction")
  @js.native
  abstract class PersistenceTransaction () extends StObject {
    
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
