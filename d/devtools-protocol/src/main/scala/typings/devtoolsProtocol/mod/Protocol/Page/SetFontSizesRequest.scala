package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetFontSizesRequest extends js.Object {
  /**
    * Specifies font sizes to set. If a font size is not specified, it won't be changed.
    */
  var fontSizes: FontSizes = js.native
}

object SetFontSizesRequest {
  @scala.inline
  def apply(fontSizes: FontSizes): SetFontSizesRequest = {
    val __obj = js.Dynamic.literal(fontSizes = fontSizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFontSizesRequest]
  }
  @scala.inline
  implicit class SetFontSizesRequestOps[Self <: SetFontSizesRequest] (val x: Self) extends AnyVal {
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
    def setFontSizes(value: FontSizes): Self = this.set("fontSizes", value.asInstanceOf[js.Any])
  }
  
}

