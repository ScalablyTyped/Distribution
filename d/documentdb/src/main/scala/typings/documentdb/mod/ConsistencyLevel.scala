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
  def BoundedStaleness: typings.documentdb.documentdbStrings.BoundedStaleness = "BoundedStaleness".asInstanceOf[typings.documentdb.documentdbStrings.BoundedStaleness]
  @scala.inline
  def Eventual: typings.documentdb.documentdbStrings.Eventual = "Eventual".asInstanceOf[typings.documentdb.documentdbStrings.Eventual]
  @scala.inline
  def Session: typings.documentdb.documentdbStrings.Session = "Session".asInstanceOf[typings.documentdb.documentdbStrings.Session]
  @scala.inline
  def Strong: typings.documentdb.documentdbStrings.Strong = "Strong".asInstanceOf[typings.documentdb.documentdbStrings.Strong]
}

