package typings.fsDashExtra.fsDashExtraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fsDashExtra.fsDashExtraStrings.dir
  - typings.fsDashExtra.fsDashExtraStrings.file
  - typings.fsDashExtra.fsDashExtraStrings.junction
*/
trait FsSymlinkType extends js.Object

object FsSymlinkType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dir: typings.fsDashExtra.fsDashExtraStrings.dir = this.cast("dir")
  @scala.inline
  def file: typings.fsDashExtra.fsDashExtraStrings.file = this.cast("file")
  @scala.inline
  def junction: typings.fsDashExtra.fsDashExtraStrings.junction = this.cast("junction")
}

