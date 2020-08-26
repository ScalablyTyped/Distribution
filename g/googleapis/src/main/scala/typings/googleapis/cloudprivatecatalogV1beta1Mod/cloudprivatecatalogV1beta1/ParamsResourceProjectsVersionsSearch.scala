package typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsVersionsSearch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of entries that are requested.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A pagination token returned from a previous call to SearchVersions that
    * indicates where this listing should continue from. This field is
    * optional.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The query to filter the versions. Required.  The supported queries are: *
    * List versions under a product:
    * `parent=catalogs/{catalog_id}/products/{product_id}` * Get a version by
    * name:
    * `name=catalogs/{catalog_id}/products/{product_id}/versions/{version_id}`
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Required. The name of the resource context. See
    * SearchCatalogsRequest.resource for details.
    */
  var resource: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsVersionsSearch {
  @scala.inline
  def apply(): ParamsResourceProjectsVersionsSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsVersionsSearch]
  }
  @scala.inline
  implicit class ParamsResourceProjectsVersionsSearchOps[Self <: ParamsResourceProjectsVersionsSearch] (val x: Self) extends AnyVal {
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
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
  
}

