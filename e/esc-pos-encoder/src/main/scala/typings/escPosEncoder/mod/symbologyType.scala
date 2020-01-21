package typings.escPosEncoder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.escPosEncoder.escPosEncoderStrings.upca
  - typings.escPosEncoder.escPosEncoderStrings.upce
  - typings.escPosEncoder.escPosEncoderStrings.ean13
  - typings.escPosEncoder.escPosEncoderStrings.ean8
  - typings.escPosEncoder.escPosEncoderStrings.coda39
  - typings.escPosEncoder.escPosEncoderStrings.itf
  - typings.escPosEncoder.escPosEncoderStrings.codabar
*/
trait symbologyType extends js.Object

object symbologyType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def coda39: typings.escPosEncoder.escPosEncoderStrings.coda39 = this.cast("coda39")
  @scala.inline
  def codabar: typings.escPosEncoder.escPosEncoderStrings.codabar = this.cast("codabar")
  @scala.inline
  def ean13: typings.escPosEncoder.escPosEncoderStrings.ean13 = this.cast("ean13")
  @scala.inline
  def ean8: typings.escPosEncoder.escPosEncoderStrings.ean8 = this.cast("ean8")
  @scala.inline
  def itf: typings.escPosEncoder.escPosEncoderStrings.itf = this.cast("itf")
  @scala.inline
  def upca: typings.escPosEncoder.escPosEncoderStrings.upca = this.cast("upca")
  @scala.inline
  def upce: typings.escPosEncoder.escPosEncoderStrings.upce = this.cast("upce")
}

