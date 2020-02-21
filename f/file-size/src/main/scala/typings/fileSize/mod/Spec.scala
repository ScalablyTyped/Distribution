package typings.fileSize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fileSize.fileSizeStrings.si
  - typings.fileSize.fileSizeStrings.iec
  - typings.fileSize.fileSizeStrings.jedec
*/
trait Spec extends js.Object

object Spec {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def iec: typings.fileSize.fileSizeStrings.iec = this.cast("iec")
  @scala.inline
  def jedec: typings.fileSize.fileSizeStrings.jedec = this.cast("jedec")
  @scala.inline
  def si: typings.fileSize.fileSizeStrings.si = this.cast("si")
}

