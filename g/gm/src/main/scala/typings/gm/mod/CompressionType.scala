package typings.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gm.gmStrings.None
  - typings.gm.gmStrings.BZip
  - typings.gm.gmStrings.Fax
  - typings.gm.gmStrings.Group4
  - typings.gm.gmStrings.JPEG
  - typings.gm.gmStrings.Lossless
  - typings.gm.gmStrings.LZW
  - typings.gm.gmStrings.RLE
  - typings.gm.gmStrings.Zip
  - typings.gm.gmStrings.LZMA
*/
trait CompressionType extends js.Object

object CompressionType {
  @scala.inline
  def BZip: typings.gm.gmStrings.BZip = this.cast("BZip")
  @scala.inline
  def Fax: typings.gm.gmStrings.Fax = this.cast("Fax")
  @scala.inline
  def Group4: typings.gm.gmStrings.Group4 = this.cast("Group4")
  @scala.inline
  def JPEG: typings.gm.gmStrings.JPEG = this.cast("JPEG")
  @scala.inline
  def LZMA: typings.gm.gmStrings.LZMA = this.cast("LZMA")
  @scala.inline
  def LZW: typings.gm.gmStrings.LZW = this.cast("LZW")
  @scala.inline
  def Lossless: typings.gm.gmStrings.Lossless = this.cast("Lossless")
  @scala.inline
  def None: typings.gm.gmStrings.None = this.cast("None")
  @scala.inline
  def RLE: typings.gm.gmStrings.RLE = this.cast("RLE")
  @scala.inline
  def Zip: typings.gm.gmStrings.Zip = this.cast("Zip")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

