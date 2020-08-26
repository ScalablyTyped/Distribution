package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceOnboardingListcategoryvolumes extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * List of category ids requested.
    */
  var categoryId: js.UndefOr[js.Array[String]] = js.native
  /**
    * ISO-639-1 language and ISO-3166-1 country code. Default is en-US if
    * unset.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * The maximum allowed maturity rating of returned volumes. Books with a
    * higher maturity rating are filtered out.
    */
  var maxAllowedMaturityRating: js.UndefOr[String] = js.native
  /**
    * Number of maximum results per page to be included in the response.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The value of the nextToken from the previous page.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object ParamsResourceOnboardingListcategoryvolumes {
  @scala.inline
  def apply(): ParamsResourceOnboardingListcategoryvolumes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOnboardingListcategoryvolumes]
  }
  @scala.inline
  implicit class ParamsResourceOnboardingListcategoryvolumesOps[Self <: ParamsResourceOnboardingListcategoryvolumes] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setCategoryIdVarargs(value: String*): Self = this.set("categoryId", js.Array(value :_*))
    @scala.inline
    def setCategoryId(value: js.Array[String]): Self = this.set("categoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoryId: Self = this.set("categoryId", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMaxAllowedMaturityRating(value: String): Self = this.set("maxAllowedMaturityRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAllowedMaturityRating: Self = this.set("maxAllowedMaturityRating", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
  
}

