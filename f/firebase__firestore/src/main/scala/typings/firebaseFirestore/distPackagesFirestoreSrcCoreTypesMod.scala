package typings.firebaseFirestore

import typings.firebaseFirestore.firebaseFirestoreInts.`0`
import typings.firebaseFirestore.firebaseFirestoreInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcCoreTypesMod {
  
  type BatchId = Double
  
  type ListenSequenceNumber = Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.pending
    - typings.firebaseFirestore.firebaseFirestoreStrings.acknowledged
    - typings.firebaseFirestore.firebaseFirestoreStrings.rejected
  */
  trait MutationBatchState extends StObject
  object MutationBatchState {
    
    inline def acknowledged: typings.firebaseFirestore.firebaseFirestoreStrings.acknowledged = "acknowledged".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.acknowledged]
    
    inline def pending: typings.firebaseFirestore.firebaseFirestoreStrings.pending = "pending".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.pending]
    
    inline def rejected: typings.firebaseFirestore.firebaseFirestoreStrings.rejected = "rejected".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.rejected]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.Unknown
    - typings.firebaseFirestore.firebaseFirestoreStrings.Online
    - typings.firebaseFirestore.firebaseFirestoreStrings.Offline
  */
  trait OnlineState extends StObject
  object OnlineState {
    
    /**
      * The client is either trying to establish a connection but failing, or it
      * has been explicitly marked offline via a call to disableNetwork().
      * Higher-level components should operate in offline mode.
      */
    inline def Offline: typings.firebaseFirestore.firebaseFirestoreStrings.Offline = "Offline".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.Offline]
    
    /**
      * The client is connected and the connections are healthy. This state is
      * reached after a successful connection and there has been at least one
      * successful message received from the backends.
      */
    inline def Online: typings.firebaseFirestore.firebaseFirestoreStrings.Online = "Online".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.Online]
    
    /**
      * The Firestore client is in an unknown online state. This means the client
      * is either not actively trying to establish a connection or it is currently
      * trying to establish a connection, but it has not succeeded or failed yet.
      * Higher-level components should not operate in offline mode.
      */
    inline def Unknown: typings.firebaseFirestore.firebaseFirestoreStrings.Unknown = "Unknown".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.Unknown]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreInts.`0`
    - typings.firebaseFirestore.firebaseFirestoreInts.`1`
  */
  trait OnlineStateSource extends StObject
  object OnlineStateSource {
    
    inline def RemoteStore: `0` = 0.asInstanceOf[`0`]
    
    inline def SharedClientState: `1` = 1.asInstanceOf[`1`]
  }
  
  type TargetId = Double
}
