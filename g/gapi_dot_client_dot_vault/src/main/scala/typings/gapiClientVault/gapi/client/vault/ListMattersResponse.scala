package typings.gapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMattersResponse extends js.Object {
  /** List of matters. */
  var matters: js.UndefOr[js.Array[Matter]] = js.native
  /** Page token to retrieve the next page of results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListMattersResponse {
  @scala.inline
  def apply(): ListMattersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMattersResponse]
  }
  @scala.inline
  implicit class ListMattersResponseOps[Self <: ListMattersResponse] (val x: Self) extends AnyVal {
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
    def setMattersVarargs(value: Matter*): Self = this.set("matters", js.Array(value :_*))
    @scala.inline
    def setMatters(value: js.Array[Matter]): Self = this.set("matters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatters: Self = this.set("matters", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

