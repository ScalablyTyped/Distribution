package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupInterval extends js.Object {
  var groupInterval: js.UndefOr[String | Double] = js.native
  var target: js.UndefOr[String] = js.native
  var value: js.UndefOr[String | Double | typings.std.Date] = js.native
  var valueText: js.UndefOr[String] = js.native
}

object GroupInterval {
  @scala.inline
  def apply(): GroupInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupInterval]
  }
  @scala.inline
  implicit class GroupIntervalOps[Self <: GroupInterval] (val x: Self) extends AnyVal {
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
    def setGroupInterval(value: String | Double): Self = this.set("groupInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupInterval: Self = this.set("groupInterval", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setValue(value: String | Double | typings.std.Date): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueText(value: String): Self = this.set("valueText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueText: Self = this.set("valueText", js.undefined)
  }
  
}

