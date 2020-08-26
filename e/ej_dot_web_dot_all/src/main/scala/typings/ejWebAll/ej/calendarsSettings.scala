package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait calendarsSettings extends js.Object {
  var standard: standardSettings = js.native
}

object calendarsSettings {
  @scala.inline
  def apply(standard: standardSettings): calendarsSettings = {
    val __obj = js.Dynamic.literal(standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[calendarsSettings]
  }
  @scala.inline
  implicit class calendarsSettingsOps[Self <: calendarsSettings] (val x: Self) extends AnyVal {
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
    def setStandard(value: standardSettings): Self = this.set("standard", value.asInstanceOf[js.Any])
  }
  
}

