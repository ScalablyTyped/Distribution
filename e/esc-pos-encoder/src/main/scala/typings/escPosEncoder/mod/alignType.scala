package typings.escPosEncoder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.escPosEncoder.escPosEncoderStrings.left
  - typings.escPosEncoder.escPosEncoderStrings.center
  - typings.escPosEncoder.escPosEncoderStrings.right
*/
trait alignType extends js.Object

object alignType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.escPosEncoder.escPosEncoderStrings.center = this.cast("center")
  @scala.inline
  def left: typings.escPosEncoder.escPosEncoderStrings.left = this.cast("left")
  @scala.inline
  def right: typings.escPosEncoder.escPosEncoderStrings.right = this.cast("right")
}

