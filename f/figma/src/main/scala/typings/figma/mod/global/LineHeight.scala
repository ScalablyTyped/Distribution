package typings.figma.mod.global

import typings.figma.figmaStrings.AUTO
import typings.figma.figmaStrings.PERCENT
import typings.figma.figmaStrings.PIXELS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.figma.anon.Unit
  - typings.figma.anon.`0`
*/
trait LineHeight extends js.Object

object LineHeight {
  @scala.inline
  def Unit(unit: PIXELS | PERCENT, value: Double): LineHeight = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineHeight]
  }
  @scala.inline
  def `0`(unit: AUTO): LineHeight = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineHeight]
  }
}

