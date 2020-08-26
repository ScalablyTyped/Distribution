package typings.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslCertsCreateEphemeralRequest extends js.Object {
  /** PEM encoded public key to include in the signed certificate. */
  var public_key: js.UndefOr[String] = js.native
}

object SslCertsCreateEphemeralRequest {
  @scala.inline
  def apply(): SslCertsCreateEphemeralRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslCertsCreateEphemeralRequest]
  }
  @scala.inline
  implicit class SslCertsCreateEphemeralRequestOps[Self <: SslCertsCreateEphemeralRequest] (val x: Self) extends AnyVal {
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
    def setPublic_key(value: String): Self = this.set("public_key", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublic_key: Self = this.set("public_key", js.undefined)
  }
  
}

