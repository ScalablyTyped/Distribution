package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuotaProperties extends js.Object {
  /** Quota mode for this operation. */
  var quotaMode: js.UndefOr[String] = js.native
}

object QuotaProperties {
  @scala.inline
  def apply(): QuotaProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuotaProperties]
  }
  @scala.inline
  implicit class QuotaPropertiesOps[Self <: QuotaProperties] (val x: Self) extends AnyVal {
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
    def setQuotaMode(value: String): Self = this.set("quotaMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaMode: Self = this.set("quotaMode", js.undefined)
  }
  
}

