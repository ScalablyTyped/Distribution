package typings.figma.anon

import typings.figma.figmaStrings.ON_CLICK
import typings.figma.figmaStrings.ON_DRAG
import typings.figma.figmaStrings.ON_HOVER
import typings.figma.figmaStrings.ON_PRESS
import typings.figma.mod.global.Trigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `1` extends Trigger {
  val `type`: ON_CLICK | ON_HOVER | ON_PRESS | ON_DRAG = js.native
}

object `1` {
  @scala.inline
  def apply(`type`: ON_CLICK | ON_HOVER | ON_PRESS | ON_DRAG): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  @scala.inline
  implicit class `1Ops`[Self <: `1`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: ON_CLICK | ON_HOVER | ON_PRESS | ON_DRAG): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

