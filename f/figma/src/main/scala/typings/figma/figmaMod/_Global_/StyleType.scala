package typings.figma.figmaMod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////////////////////////
// Styles
/* Rewritten from type alias, can be one of: 
  - typings.figma.figmaStrings.PAINT
  - typings.figma.figmaStrings.TEXT
  - typings.figma.figmaStrings.EFFECT
  - typings.figma.figmaStrings.GRID
*/
trait StyleType extends js.Object

object StyleType {
  @scala.inline
  def EFFECT: typings.figma.figmaStrings.EFFECT = this.cast("EFFECT")
  @scala.inline
  def GRID: typings.figma.figmaStrings.GRID = this.cast("GRID")
  @scala.inline
  def PAINT: typings.figma.figmaStrings.PAINT = this.cast("PAINT")
  @scala.inline
  def TEXT: typings.figma.figmaStrings.TEXT = this.cast("TEXT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

