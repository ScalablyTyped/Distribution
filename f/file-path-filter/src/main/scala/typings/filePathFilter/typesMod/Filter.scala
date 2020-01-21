package typings.filePathFilter.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.filePathFilter.filePathFilterStrings.include
  - typings.filePathFilter.filePathFilterStrings.exclude
*/
trait Filter extends js.Object

object Filter {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exclude: typings.filePathFilter.filePathFilterStrings.exclude = this.cast("exclude")
  @scala.inline
  def include: typings.filePathFilter.filePathFilterStrings.include = this.cast("include")
}

