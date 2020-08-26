package typings.gapiClientAdmin.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatetimeValue extends js.Object {
  /** Boolean value of the parameter. */
  var boolValue: js.UndefOr[Boolean] = js.native
  /** RFC 3339 formatted value of the parameter. */
  var datetimeValue: js.UndefOr[String] = js.native
  /** Integral value of the parameter. */
  var intValue: js.UndefOr[String] = js.native
  /** Nested message value of the parameter. */
  var msgValue: js.UndefOr[js.Array[Record[String, _]]] = js.native
  /** The name of the parameter. */
  var name: js.UndefOr[String] = js.native
  /** String value of the parameter. */
  var stringValue: js.UndefOr[String] = js.native
}

object DatetimeValue {
  @scala.inline
  def apply(): DatetimeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatetimeValue]
  }
  @scala.inline
  implicit class DatetimeValueOps[Self <: DatetimeValue] (val x: Self) extends AnyVal {
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
    def setBoolValue(value: Boolean): Self = this.set("boolValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoolValue: Self = this.set("boolValue", js.undefined)
    @scala.inline
    def setDatetimeValue(value: String): Self = this.set("datetimeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatetimeValue: Self = this.set("datetimeValue", js.undefined)
    @scala.inline
    def setIntValue(value: String): Self = this.set("intValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntValue: Self = this.set("intValue", js.undefined)
    @scala.inline
    def setMsgValueVarargs(value: (Record[String, js.Any])*): Self = this.set("msgValue", js.Array(value :_*))
    @scala.inline
    def setMsgValue(value: js.Array[Record[String, _]]): Self = this.set("msgValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsgValue: Self = this.set("msgValue", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
  }
  
}

