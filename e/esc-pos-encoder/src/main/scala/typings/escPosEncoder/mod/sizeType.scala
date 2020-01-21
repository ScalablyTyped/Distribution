package typings.escPosEncoder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.escPosEncoder.escPosEncoderStrings.small
  - typings.escPosEncoder.escPosEncoderStrings.normal
*/
trait sizeType extends js.Object

object sizeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def normal: typings.escPosEncoder.escPosEncoderStrings.normal = this.cast("normal")
  @scala.inline
  def small: typings.escPosEncoder.escPosEncoderStrings.small = this.cast("small")
}

