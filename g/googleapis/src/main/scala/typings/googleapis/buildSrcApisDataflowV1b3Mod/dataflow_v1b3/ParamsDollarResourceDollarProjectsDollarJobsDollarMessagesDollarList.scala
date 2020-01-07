package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarJobsDollarMessagesDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Return only messages with timestamps < end_time. The default is now (i.e.
    * return up to the latest messages available).
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The job to get messages about.
    */
  var jobId: js.UndefOr[String] = js.native
  /**
    * The [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * contains the job specified by job_id.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Filter to only get messages with importance >= level
    */
  var minimumImportance: js.UndefOr[String] = js.native
  /**
    * If specified, determines the maximum number of messages to return.  If
    * unspecified, the service may choose an appropriate default, or may return
    * an arbitrarily large number of results.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * If supplied, this should be the value of next_page_token returned by an
    * earlier call. This will cause the next page of results to be returned.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * A project id.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * If specified, return only messages with timestamps >= start_time. The
    * default is the job creation time (i.e. beginning of messages).
    */
  var startTime: js.UndefOr[String] = js.native
}

