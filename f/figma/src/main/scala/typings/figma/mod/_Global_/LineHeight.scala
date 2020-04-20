package typings.figma.mod._Global_

import typings.figma.figmaStrings.AUTO
import typings.figma.figmaStrings.PERCENT
import typings.figma.figmaStrings.PIXELS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.figma.AnonUnit
  - typings.figma.Anon0
*/
trait LineHeight extends js.Object

object LineHeight {
  @scala.inline
  def AnonUnit(unit: PIXELS | PERCENT, value: Double): LineHeight = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineHeight]
  }
  @scala.inline
  def Anon0(unit: AUTO): LineHeight = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineHeight]
  }
}

