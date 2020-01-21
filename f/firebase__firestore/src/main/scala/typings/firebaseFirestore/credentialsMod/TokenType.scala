package typings.firebaseFirestore.credentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.firebaseFirestoreStrings.OAuth
  - typings.firebaseFirestore.firebaseFirestoreStrings.FirstParty
*/
trait TokenType extends js.Object

object TokenType {
  @scala.inline
  def FirstParty: typings.firebaseFirestore.firebaseFirestoreStrings.FirstParty = this.cast("FirstParty")
  @scala.inline
  def OAuth: typings.firebaseFirestore.firebaseFirestoreStrings.OAuth = this.cast("OAuth")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

