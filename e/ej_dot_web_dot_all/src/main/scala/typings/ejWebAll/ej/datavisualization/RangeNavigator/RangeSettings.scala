package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeSettings extends js.Object {
  /** Specifies the ending range of range navigator.
    * @Default {null}
    */
  var end: js.UndefOr[String] = js.native
  /** Specifies the starting range of range navigator.
    * @Default {null}
    */
  var start: js.UndefOr[String] = js.native
}

object RangeSettings {
  @scala.inline
  def apply(): RangeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeSettings]
  }
  @scala.inline
  implicit class RangeSettingsOps[Self <: RangeSettings] (val x: Self) extends AnyVal {
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
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

