package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseGet extends Generic {
  var accept_enterprise: js.UndefOr[Boolean] = js.native
  var local: js.UndefOr[Boolean] = js.native
}

object LicenseGet {
  @scala.inline
  def apply(): LicenseGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseGet]
  }
  @scala.inline
  implicit class LicenseGetOps[Self <: LicenseGet] (val x: Self) extends AnyVal {
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
    def setAccept_enterprise(value: Boolean): Self = this.set("accept_enterprise", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept_enterprise: Self = this.set("accept_enterprise", js.undefined)
    @scala.inline
    def setLocal(value: Boolean): Self = this.set("local", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocal: Self = this.set("local", js.undefined)
  }
  
}

