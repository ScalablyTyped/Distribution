package typings.figma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.figma.figmaStrings.ORIGINAL
  - typings.figma.figmaStrings.UPPER
  - typings.figma.figmaStrings.LOWER
  - typings.figma.figmaStrings.TITLE
*/
trait TextCase extends js.Object

object TextCase {
  @scala.inline
  def LOWER: typings.figma.figmaStrings.LOWER = this.cast("LOWER")
  @scala.inline
  def ORIGINAL: typings.figma.figmaStrings.ORIGINAL = this.cast("ORIGINAL")
  @scala.inline
  def TITLE: typings.figma.figmaStrings.TITLE = this.cast("TITLE")
  @scala.inline
  def UPPER: typings.figma.figmaStrings.UPPER = this.cast("UPPER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

