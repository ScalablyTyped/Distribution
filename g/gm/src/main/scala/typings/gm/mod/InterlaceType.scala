package typings.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gm.gmStrings.None
  - typings.gm.gmStrings.Line
  - typings.gm.gmStrings.Plane
  - typings.gm.gmStrings.Partition
*/
trait InterlaceType extends js.Object

object InterlaceType {
  @scala.inline
  def Line: typings.gm.gmStrings.Line = this.cast("Line")
  @scala.inline
  def None: typings.gm.gmStrings.None = this.cast("None")
  @scala.inline
  def Partition: typings.gm.gmStrings.Partition = this.cast("Partition")
  @scala.inline
  def Plane: typings.gm.gmStrings.Plane = this.cast("Plane")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

