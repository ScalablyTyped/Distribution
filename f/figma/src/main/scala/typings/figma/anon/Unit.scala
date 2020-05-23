package typings.figma.anon

import typings.figma.figmaStrings.PERCENT
import typings.figma.figmaStrings.PIXELS
import typings.figma.mod.global.LineHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unit extends LineHeight {
  val unit: PIXELS | PERCENT
  val value: Double
}

object Unit {
  @scala.inline
  def apply(unit: PIXELS | PERCENT, value: Double): Unit = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unit]
  }
}

