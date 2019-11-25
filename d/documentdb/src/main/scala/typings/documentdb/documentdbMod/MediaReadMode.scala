package typings.documentdb.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.documentdb.documentdbStrings.Buffered
  - typings.documentdb.documentdbStrings.Streamed
*/
trait MediaReadMode extends js.Object

object MediaReadMode {
  @scala.inline
  def Buffered: typings.documentdb.documentdbStrings.Buffered = this.cast("Buffered")
  @scala.inline
  def Streamed: typings.documentdb.documentdbStrings.Streamed = this.cast("Streamed")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

