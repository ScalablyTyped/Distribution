package typings.figma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.figma.figmaStrings.MIN
  - typings.figma.figmaStrings.CENTER
  - typings.figma.figmaStrings.MAX
  - typings.figma.figmaStrings.STRETCH
  - typings.figma.figmaStrings.SCALE
*/
trait ConstraintType extends js.Object

object ConstraintType {
  @scala.inline
  def CENTER: typings.figma.figmaStrings.CENTER = this.cast("CENTER")
  @scala.inline
  def MAX: typings.figma.figmaStrings.MAX = this.cast("MAX")
  @scala.inline
  def MIN: typings.figma.figmaStrings.MIN = this.cast("MIN")
  @scala.inline
  def SCALE: typings.figma.figmaStrings.SCALE = this.cast("SCALE")
  @scala.inline
  def STRETCH: typings.figma.figmaStrings.STRETCH = this.cast("STRETCH")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

