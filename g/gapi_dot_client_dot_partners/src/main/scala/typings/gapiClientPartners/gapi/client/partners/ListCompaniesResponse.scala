package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCompaniesResponse extends js.Object {
  /** The list of companies. */
  var companies: js.UndefOr[js.Array[Company]] = js.native
  /**
    * A token to retrieve next page of results.
    * Pass this value in the `ListCompaniesRequest.page_token` field in the
    * subsequent call to
    * ListCompanies to retrieve the
    * next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.native
}

object ListCompaniesResponse {
  @scala.inline
  def apply(): ListCompaniesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCompaniesResponse]
  }
  @scala.inline
  implicit class ListCompaniesResponseOps[Self <: ListCompaniesResponse] (val x: Self) extends AnyVal {
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
    def setCompaniesVarargs(value: Company*): Self = this.set("companies", js.Array(value :_*))
    @scala.inline
    def setCompanies(value: js.Array[Company]): Self = this.set("companies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompanies: Self = this.set("companies", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setResponseMetadata(value: ResponseMetadata): Self = this.set("responseMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseMetadata: Self = this.set("responseMetadata", js.undefined)
  }
  
}

