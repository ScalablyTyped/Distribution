package typings.gapiClientProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDiagnosticsResponse extends js.Object {
  /** The diagnostics matching the given request. */
  var diagnostics: js.UndefOr[js.Array[Diagnostics]] = js.native
  /**
    * Token that can be used for pagination. Returned only if the
    * request matches more beacons than can be returned in this response.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListDiagnosticsResponse {
  @scala.inline
  def apply(): ListDiagnosticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDiagnosticsResponse]
  }
  @scala.inline
  implicit class ListDiagnosticsResponseOps[Self <: ListDiagnosticsResponse] (val x: Self) extends AnyVal {
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
    def setDiagnosticsVarargs(value: Diagnostics*): Self = this.set("diagnostics", js.Array(value :_*))
    @scala.inline
    def setDiagnostics(value: js.Array[Diagnostics]): Self = this.set("diagnostics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagnostics: Self = this.set("diagnostics", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

