package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CorsOptions extends js.Object {
  /**
    * Enable or disable cross-origin requests from IE9 and older where XDomainRequest must be used
    *
    * @default `false`
    */
  var allowXdr: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable cross-domain requests
    *
    * @default `false`
    */
  var expected: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable sending credentials along with each cross-domain request. Ignored if allowXdr is true and IE9 is being used
    *
    * @default `false`
    */
  var sendCredentials: js.UndefOr[Boolean] = js.native
}

object CorsOptions {
  @scala.inline
  def apply(): CorsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CorsOptions]
  }
  @scala.inline
  implicit class CorsOptionsOps[Self <: CorsOptions] (val x: Self) extends AnyVal {
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
    def setAllowXdr(value: Boolean): Self = this.set("allowXdr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowXdr: Self = this.set("allowXdr", js.undefined)
    @scala.inline
    def setExpected(value: Boolean): Self = this.set("expected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpected: Self = this.set("expected", js.undefined)
    @scala.inline
    def setSendCredentials(value: Boolean): Self = this.set("sendCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendCredentials: Self = this.set("sendCredentials", js.undefined)
  }
  
}

