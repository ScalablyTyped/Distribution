package typings.firebaseFirestore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.firebaseFirestoreStrings.Unknown
  - typings.firebaseFirestore.firebaseFirestoreStrings.Online
  - typings.firebaseFirestore.firebaseFirestoreStrings.Offline
*/
trait OnlineState extends js.Object

object OnlineState {
  /**
    * The client is either trying to establish a connection but failing, or it
    * has been explicitly marked offline via a call to disableNetwork().
    * Higher-level components should operate in offline mode.
    */
  @scala.inline
  def Offline: typings.firebaseFirestore.firebaseFirestoreStrings.Offline = "Offline".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.Offline]
  /**
    * The client is connected and the connections are healthy. This state is
    * reached after a successful connection and there has been at least one
    * successful message received from the backends.
    */
  @scala.inline
  def Online: typings.firebaseFirestore.firebaseFirestoreStrings.Online = "Online".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.Online]
  /**
    * The Firestore client is in an unknown online state. This means the client
    * is either not actively trying to establish a connection or it is currently
    * trying to establish a connection, but it has not succeeded or failed yet.
    * Higher-level components should not operate in offline mode.
    */
  @scala.inline
  def Unknown: typings.firebaseFirestore.firebaseFirestoreStrings.Unknown = "Unknown".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.Unknown]
}

