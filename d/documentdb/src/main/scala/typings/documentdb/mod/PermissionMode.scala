package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.documentdb.documentdbStrings.None
  - typings.documentdb.documentdbStrings.Read
  - typings.documentdb.documentdbStrings.All
*/
trait PermissionMode extends js.Object

object PermissionMode {
  @scala.inline
  def All: typings.documentdb.documentdbStrings.All = this.cast("All")
  @scala.inline
  def None: typings.documentdb.documentdbStrings.None = this.cast("None")
  @scala.inline
  def Read: typings.documentdb.documentdbStrings.Read = this.cast("Read")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

