package typings.firebaseFirestore.streamTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StreamEventType combines the events that can be observed by the
  * WatchStreamListener and WriteStreamListener.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.firebaseFirestoreStrings.handshakeComplete
  - typings.firebaseFirestore.firebaseFirestoreStrings.mutationResult
  - typings.firebaseFirestore.firebaseFirestoreStrings.watchChange
  - typings.firebaseFirestore.firebaseFirestoreStrings.open
  - typings.firebaseFirestore.firebaseFirestoreStrings.close
*/
trait StreamEventType extends js.Object

object StreamEventType {
  @scala.inline
  def close: typings.firebaseFirestore.firebaseFirestoreStrings.close = "close".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.close]
  @scala.inline
  def handshakeComplete: typings.firebaseFirestore.firebaseFirestoreStrings.handshakeComplete = "handshakeComplete".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.handshakeComplete]
  @scala.inline
  def mutationResult: typings.firebaseFirestore.firebaseFirestoreStrings.mutationResult = "mutationResult".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.mutationResult]
  @scala.inline
  def open: typings.firebaseFirestore.firebaseFirestoreStrings.open = "open".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.open]
  @scala.inline
  def watchChange: typings.firebaseFirestore.firebaseFirestoreStrings.watchChange = "watchChange".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.watchChange]
}

