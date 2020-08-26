package typings.gapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeValue extends js.Object {
  /** A Boolean value represented by `true` or `false`. */
  var boolValue: js.UndefOr[Boolean] = js.native
  /** A 64-bit signed integer. */
  var intValue: js.UndefOr[String] = js.native
  /** A string up to 256 bytes long. */
  var stringValue: js.UndefOr[TruncatableString] = js.native
}

object AttributeValue {
  @scala.inline
  def apply(): AttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeValue]
  }
  @scala.inline
  implicit class AttributeValueOps[Self <: AttributeValue] (val x: Self) extends AnyVal {
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
    def setIntValue(value: String): Self = this.set("intValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntValue: Self = this.set("intValue", js.undefined)
    @scala.inline
    def setStringValue(value: TruncatableString): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
  }
  
}

