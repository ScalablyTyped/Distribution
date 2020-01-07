package typings.googleapis.buildSrcApisServiceconsumermanagementV1Mod.serviceconsumermanagement_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarServicesDollarTenancyunitsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Filter expression over tenancy resources field. Optional.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The maximum number of results returned by this request.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The continuation token, which is used to page through large result sets.
    * To get the next page of results, set this parameter to the value of
    * `nextPageToken` from the previous response.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Managed service and service consumer. Required.
    * services/{service}/{collection id}/{resource id} {collection id} is the
    * cloud resource collection type representing the service consumer, for
    * example 'projects', or 'organizations'. {resource id} is the consumer
    * numeric id, such as project number: '123456'. {service} the name of a
    * service, such as 'service.googleapis.com'.
    */
  var parent: js.UndefOr[String] = js.native
}

