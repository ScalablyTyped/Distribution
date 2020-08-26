package typings.gapiClientProximitybeacon.gapi.client.proximitybeacon

import typings.gapiClient.gapi.client.Request
import typings.gapiClientProximitybeacon.anon.AlertFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagnosticsResource extends js.Object {
  /**
    * List the diagnostics for a single beacon. You can also list diagnostics for
    * all the beacons owned by your Google Developers Console project by using
    * the beacon name `beacons/-`.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;viewer&#42;&#42;, &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42;
    * permissions in the Google Developers Console project.
    */
  def list(request: AlertFilter): Request[ListDiagnosticsResponse] = js.native
}

object DiagnosticsResource {
  @scala.inline
  def apply(list: AlertFilter => Request[ListDiagnosticsResponse]): DiagnosticsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[DiagnosticsResource]
  }
  @scala.inline
  implicit class DiagnosticsResourceOps[Self <: DiagnosticsResource] (val x: Self) extends AnyVal {
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
    def setList(value: AlertFilter => Request[ListDiagnosticsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

