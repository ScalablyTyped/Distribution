package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Experimental extends js.Object {
  /** Authorization configuration. */
  var authorization: js.UndefOr[AuthorizationConfig] = js.native
}

object Experimental {
  @scala.inline
  def apply(): Experimental = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Experimental]
  }
  @scala.inline
  implicit class ExperimentalOps[Self <: Experimental] (val x: Self) extends AnyVal {
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
    def setAuthorization(value: AuthorizationConfig): Self = this.set("authorization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorization: Self = this.set("authorization", js.undefined)
  }
  
}

