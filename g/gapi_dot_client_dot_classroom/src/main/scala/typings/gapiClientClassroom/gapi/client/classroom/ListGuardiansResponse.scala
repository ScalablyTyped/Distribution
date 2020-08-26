package typings.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGuardiansResponse extends js.Object {
  /**
    * Guardians on this page of results that met the criteria specified in
    * the request.
    */
  var guardians: js.UndefOr[js.Array[Guardian]] = js.native
  /**
    * Token identifying the next page of results to return. If empty, no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListGuardiansResponse {
  @scala.inline
  def apply(): ListGuardiansResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGuardiansResponse]
  }
  @scala.inline
  implicit class ListGuardiansResponseOps[Self <: ListGuardiansResponse] (val x: Self) extends AnyVal {
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
    def setGuardiansVarargs(value: Guardian*): Self = this.set("guardians", js.Array(value :_*))
    @scala.inline
    def setGuardians(value: js.Array[Guardian]): Self = this.set("guardians", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuardians: Self = this.set("guardians", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

