package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.documentdb.documentdbStrings.Strong
  - typings.documentdb.documentdbStrings.BoundedStaleness
  - typings.documentdb.documentdbStrings.Session
  - typings.documentdb.documentdbStrings.Eventual
*/
trait ConsistencyLevel extends js.Object

object ConsistencyLevel {
  @scala.inline
  def BoundedStaleness: typings.documentdb.documentdbStrings.BoundedStaleness = this.cast("BoundedStaleness")
  @scala.inline
  def Eventual: typings.documentdb.documentdbStrings.Eventual = this.cast("Eventual")
  @scala.inline
  def Session: typings.documentdb.documentdbStrings.Session = this.cast("Session")
  @scala.inline
  def Strong: typings.documentdb.documentdbStrings.Strong = this.cast("Strong")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

