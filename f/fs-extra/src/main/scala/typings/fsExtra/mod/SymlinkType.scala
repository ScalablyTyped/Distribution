package typings.fsExtra.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fsExtra.fsExtraStrings.dir
  - typings.fsExtra.fsExtraStrings.file
*/
trait SymlinkType extends js.Object

object SymlinkType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dir: typings.fsExtra.fsExtraStrings.dir = this.cast("dir")
  @scala.inline
  def file: typings.fsExtra.fsExtraStrings.file = this.cast("file")
}

