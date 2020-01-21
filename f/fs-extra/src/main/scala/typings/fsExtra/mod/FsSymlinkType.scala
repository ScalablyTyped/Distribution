package typings.fsExtra.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fsExtra.fsExtraStrings.dir
  - typings.fsExtra.fsExtraStrings.file
  - typings.fsExtra.fsExtraStrings.junction
*/
trait FsSymlinkType extends js.Object

object FsSymlinkType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dir: typings.fsExtra.fsExtraStrings.dir = this.cast("dir")
  @scala.inline
  def file: typings.fsExtra.fsExtraStrings.file = this.cast("file")
  @scala.inline
  def junction: typings.fsExtra.fsExtraStrings.junction = this.cast("junction")
}

