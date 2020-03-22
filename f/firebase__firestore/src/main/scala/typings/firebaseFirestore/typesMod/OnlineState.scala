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
  @scala.inline
  def Offline: typings.firebaseFirestore.firebaseFirestoreStrings.Offline = this.cast("Offline")
  @scala.inline
  def Online: typings.firebaseFirestore.firebaseFirestoreStrings.Online = this.cast("Online")
  @scala.inline
  def Unknown: typings.firebaseFirestore.firebaseFirestoreStrings.Unknown = this.cast("Unknown")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

