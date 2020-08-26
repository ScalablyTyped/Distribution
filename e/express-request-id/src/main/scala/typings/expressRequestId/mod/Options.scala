package typings.expressRequestId.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var attributeName: js.UndefOr[String] = js.native
  var headerName: js.UndefOr[String] = js.native
  var setHeader: js.UndefOr[Boolean] = js.native
  var uuidVersion: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAttributeName(value: String): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeName: Self = this.set("attributeName", js.undefined)
    @scala.inline
    def setHeaderName(value: String): Self = this.set("headerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderName: Self = this.set("headerName", js.undefined)
    @scala.inline
    def setSetHeader(value: Boolean): Self = this.set("setHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetHeader: Self = this.set("setHeader", js.undefined)
    @scala.inline
    def setUuidVersion(value: String): Self = this.set("uuidVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUuidVersion: Self = this.set("uuidVersion", js.undefined)
  }
  
}

