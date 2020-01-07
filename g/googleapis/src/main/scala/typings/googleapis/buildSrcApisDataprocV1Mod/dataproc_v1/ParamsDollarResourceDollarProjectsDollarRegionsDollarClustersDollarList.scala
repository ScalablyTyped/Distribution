package typings.googleapis.buildSrcApisDataprocV1Mod.dataproc_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional. A filter constraining the clusters to list. Filters are
    * case-sensitive and have the following syntax:field = value AND field =
    * value ...where field is one of status.state, clusterName, or
    * labels.[KEY], and [KEY] is a label key. value can be * to match all
    * values. status.state can be one of the following: ACTIVE, INACTIVE,
    * CREATING, RUNNING, ERROR, DELETING, or UPDATING. ACTIVE contains the
    * CREATING, UPDATING, and RUNNING states. INACTIVE contains the DELETING
    * and ERROR states. clusterName is the name of the cluster provided at
    * creation time. Only the logical AND operator is supported;
    * space-separated items are treated as having an implicit AND
    * operator.Example filter:status.state = ACTIVE AND clusterName = mycluster
    * AND labels.env = staging AND labels.starred = *
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Optional. The standard List page size.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional. The standard List page token.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The ID of the Google Cloud Platform project that the cluster
    * belongs to.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Required. The Cloud Dataproc region in which to handle the request.
    */
  var region: js.UndefOr[String] = js.native
}

