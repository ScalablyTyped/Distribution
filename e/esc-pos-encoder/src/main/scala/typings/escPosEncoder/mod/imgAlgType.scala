package typings.escPosEncoder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.escPosEncoder.escPosEncoderStrings.threshold
  - typings.escPosEncoder.escPosEncoderStrings.bayer
  - typings.escPosEncoder.escPosEncoderStrings.floydsteinberg
  - typings.escPosEncoder.escPosEncoderStrings.atkinson
*/
trait imgAlgType extends js.Object

object imgAlgType {
  @scala.inline
  def atkinson: typings.escPosEncoder.escPosEncoderStrings.atkinson = this.cast("atkinson")
  @scala.inline
  def bayer: typings.escPosEncoder.escPosEncoderStrings.bayer = this.cast("bayer")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def floydsteinberg: typings.escPosEncoder.escPosEncoderStrings.floydsteinberg = this.cast("floydsteinberg")
  @scala.inline
  def threshold: typings.escPosEncoder.escPosEncoderStrings.threshold = this.cast("threshold")
}

