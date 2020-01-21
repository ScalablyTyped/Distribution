package typings.firebaseFirestoreTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.debug
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.error
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.silent
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.error = this.cast("error")
  @scala.inline
  def silent: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.silent = this.cast("silent")
}

