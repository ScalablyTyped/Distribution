package typings.firebaseFirestore.distLitePrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the online state of the Firestore client. Note that this does not
  * indicate whether or not the remote store is trying to connect or not. This is
  * primarily used by the View / EventManager code to change their behavior while
  * offline (e.g. get() calls shouldn't wait for data from the server and
  * snapshot events should set metadata.isFromCache=true).
  *
  * The string values should not be changed since they are persisted in
  * WebStorage.
  */
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
