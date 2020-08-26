package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VcardTypedText extends js.Object {
  /** The text string associated with this item. For example, for an org field: ACME, inc. For an email field: smith@example.com. */
  var text: js.UndefOr[String] = js.native
}

object VcardTypedText {
  @scala.inline
  def apply(): VcardTypedText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VcardTypedText]
  }
  @scala.inline
  implicit class VcardTypedTextOps[Self <: VcardTypedText] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

