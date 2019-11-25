package typings.figma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.figma.figmaStrings.NONE
  - typings.figma.figmaStrings.UNDERLINE
  - typings.figma.figmaStrings.STRIKETHROUGH
*/
trait TextDecoration extends js.Object

object TextDecoration {
  @scala.inline
  def NONE: typings.figma.figmaStrings.NONE = this.cast("NONE")
  @scala.inline
  def STRIKETHROUGH: typings.figma.figmaStrings.STRIKETHROUGH = this.cast("STRIKETHROUGH")
  @scala.inline
  def UNDERLINE: typings.figma.figmaStrings.UNDERLINE = this.cast("UNDERLINE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

