package typings.googleImages.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleImages.googleImagesStrings.color
  - typings.googleImages.googleImagesStrings.gray
  - typings.googleImages.googleImagesStrings.mono
*/
trait SearchColorType extends js.Object

object SearchColorType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def color: typings.googleImages.googleImagesStrings.color = this.cast("color")
  @scala.inline
  def gray: typings.googleImages.googleImagesStrings.gray = this.cast("gray")
  @scala.inline
  def mono: typings.googleImages.googleImagesStrings.mono = this.cast("mono")
}

