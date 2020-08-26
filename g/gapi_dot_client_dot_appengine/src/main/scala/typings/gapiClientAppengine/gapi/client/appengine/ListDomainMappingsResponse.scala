package typings.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainMappingsResponse extends js.Object {
  /** The domain mappings for the application. */
  var domainMappings: js.UndefOr[js.Array[DomainMapping]] = js.native
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListDomainMappingsResponse {
  @scala.inline
  def apply(): ListDomainMappingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainMappingsResponse]
  }
  @scala.inline
  implicit class ListDomainMappingsResponseOps[Self <: ListDomainMappingsResponse] (val x: Self) extends AnyVal {
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
    def setDomainMappingsVarargs(value: DomainMapping*): Self = this.set("domainMappings", js.Array(value :_*))
    @scala.inline
    def setDomainMappings(value: js.Array[DomainMapping]): Self = this.set("domainMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainMappings: Self = this.set("domainMappings", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

