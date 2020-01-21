package typings.globStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.globStream.globStreamStrings.cwd
  - typings.globStream.globStreamStrings.base
  - typings.globStream.globStreamStrings.path
*/
trait UniqueByStringPredicate extends js.Object

object UniqueByStringPredicate {
  @scala.inline
  def base: typings.globStream.globStreamStrings.base = this.cast("base")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cwd: typings.globStream.globStreamStrings.cwd = this.cast("cwd")
  @scala.inline
  def path: typings.globStream.globStreamStrings.path = this.cast("path")
}

