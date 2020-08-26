package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for AuthorizedDomains.ListAuthorizedDomains.
  */
@js.native
trait SchemaListAuthorizedDomainsResponse extends js.Object {
  /**
    * The authorized domains belonging to the user.
    */
  var domains: js.UndefOr[js.Array[SchemaAuthorizedDomain]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListAuthorizedDomainsResponse {
  @scala.inline
  def apply(): SchemaListAuthorizedDomainsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAuthorizedDomainsResponse]
  }
  @scala.inline
  implicit class SchemaListAuthorizedDomainsResponseOps[Self <: SchemaListAuthorizedDomainsResponse] (val x: Self) extends AnyVal {
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
    def setDomainsVarargs(value: SchemaAuthorizedDomain*): Self = this.set("domains", js.Array(value :_*))
    @scala.inline
    def setDomains(value: js.Array[SchemaAuthorizedDomain]): Self = this.set("domains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomains: Self = this.set("domains", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

