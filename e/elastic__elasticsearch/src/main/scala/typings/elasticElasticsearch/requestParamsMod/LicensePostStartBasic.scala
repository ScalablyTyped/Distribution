package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicensePostStartBasic extends Generic {
  var acknowledge: js.UndefOr[Boolean] = js.native
}

object LicensePostStartBasic {
  @scala.inline
  def apply(): LicensePostStartBasic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicensePostStartBasic]
  }
  @scala.inline
  implicit class LicensePostStartBasicOps[Self <: LicensePostStartBasic] (val x: Self) extends AnyVal {
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
    def setAcknowledge(value: Boolean): Self = this.set("acknowledge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcknowledge: Self = this.set("acknowledge", js.undefined)
  }
  
}

