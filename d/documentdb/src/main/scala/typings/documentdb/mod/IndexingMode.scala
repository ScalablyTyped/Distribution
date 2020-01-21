package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.documentdb.documentdbStrings.Consistent
  - typings.documentdb.documentdbStrings.Lazy
*/
trait IndexingMode extends js.Object

object IndexingMode {
  @scala.inline
  def Consistent: typings.documentdb.documentdbStrings.Consistent = this.cast("Consistent")
  @scala.inline
  def Lazy: typings.documentdb.documentdbStrings.Lazy = this.cast("Lazy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

