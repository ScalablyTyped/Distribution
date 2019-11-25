package typings.firebase.firebaseMod.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebase.firebaseStrings.desc
  - typings.firebase.firebaseStrings.asc
*/
trait OrderByDirection extends js.Object

object OrderByDirection {
  @scala.inline
  def asc: typings.firebase.firebaseStrings.asc = this.cast("asc")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def desc: typings.firebase.firebaseStrings.desc = this.cast("desc")
}

