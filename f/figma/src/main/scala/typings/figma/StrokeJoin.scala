package typings.figma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.figma.figmaStrings.MITER
  - typings.figma.figmaStrings.BEVEL
  - typings.figma.figmaStrings.ROUND
*/
trait StrokeJoin extends js.Object

object StrokeJoin {
  @scala.inline
  def BEVEL: typings.figma.figmaStrings.BEVEL = this.cast("BEVEL")
  @scala.inline
  def MITER: typings.figma.figmaStrings.MITER = this.cast("MITER")
  @scala.inline
  def ROUND: typings.figma.figmaStrings.ROUND = this.cast("ROUND")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

