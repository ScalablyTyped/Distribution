package typings.dexie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.dexie.dexieStrings.r
  - typings.dexie.dexieStrings.rExclamationmark
  - typings.dexie.dexieStrings.rQuestionmark
  - typings.dexie.dexieStrings.rw
  - typings.dexie.dexieStrings.rwExclamationmark
  - typings.dexie.dexieStrings.rwQuestionmark
*/
trait TransactionMode extends js.Object

object TransactionMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def r: typings.dexie.dexieStrings.r = this.cast("r")
  @scala.inline
  def rExclamationmark: typings.dexie.dexieStrings.rExclamationmark = this.cast("r!")
  @scala.inline
  def rQuestionmark: typings.dexie.dexieStrings.rQuestionmark = this.cast("r?")
  @scala.inline
  def rw: typings.dexie.dexieStrings.rw = this.cast("rw")
  @scala.inline
  def rwExclamationmark: typings.dexie.dexieStrings.rwExclamationmark = this.cast("rw!")
  @scala.inline
  def rwQuestionmark: typings.dexie.dexieStrings.rwQuestionmark = this.cast("rw?")
}

