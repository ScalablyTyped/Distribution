package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VcardTelephone extends js.Object {
  /** A nested telephone URI of the form: tel:+1-123-456-7890. */
  var uri: js.UndefOr[String] = js.native
}

object VcardTelephone {
  @scala.inline
  def apply(): VcardTelephone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VcardTelephone]
  }
  @scala.inline
  implicit class VcardTelephoneOps[Self <: VcardTelephone] (val x: Self) extends AnyVal {
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
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

