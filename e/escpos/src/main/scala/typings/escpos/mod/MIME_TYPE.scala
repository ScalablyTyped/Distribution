package typings.escpos.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.escpos.escposStrings.imageSlashpng
  - typings.escpos.escposStrings.imageSlashjpg
  - typings.escpos.escposStrings.imageSlashjpeg
  - typings.escpos.escposStrings.imageSlashgif
  - typings.escpos.escposStrings.imageSlashbmp
*/
trait MIME_TYPE extends js.Object

object MIME_TYPE {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def imageSlashbmp: typings.escpos.escposStrings.imageSlashbmp = this.cast("image/bmp")
  @scala.inline
  def imageSlashgif: typings.escpos.escposStrings.imageSlashgif = this.cast("image/gif")
  @scala.inline
  def imageSlashjpeg: typings.escpos.escposStrings.imageSlashjpeg = this.cast("image/jpeg")
  @scala.inline
  def imageSlashjpg: typings.escpos.escposStrings.imageSlashjpg = this.cast("image/jpg")
  @scala.inline
  def imageSlashpng: typings.escpos.escposStrings.imageSlashpng = this.cast("image/png")
}

