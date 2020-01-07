package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarOperationsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A string for filtering Operations.   The following filter fields are
    * supported&#58;    * serviceName&#58; Required. Only `=` operator is
    * allowed.   * startTime&#58; The time this job was started, in ISO 8601
    * format.     Allowed operators are `>=`,  `>`, `<=`, and `<`.   *
    * status&#58; Can be `done`, `in_progress`, or `failed`. Allowed operators
    * are `=`, and `!=`.    Filter expression supports conjunction (AND) and
    * disjunction (OR)   logical operators. However, the serviceName
    * restriction must be at the   top-level and can only be combined with
    * other restrictions via the AND   logical operator.    Examples&#58;    *
    * `serviceName={some-service}.googleapis.com`   *
    * `serviceName={some-service}.googleapis.com AND startTime>="2017-02-01"`
    * * `serviceName={some-service}.googleapis.com AND status=done`   *
    * `serviceName={some-service}.googleapis.com AND (status=done OR
    * startTime>="2017-02-01")`
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Not used.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The maximum number of operations to return. If unspecified, defaults
    * to 50. The maximum value is 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The standard list page token.
    */
  var pageToken: js.UndefOr[String] = js.native
}

