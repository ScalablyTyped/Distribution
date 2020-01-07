package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarJobtriggersDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional. Allows filtering.  Supported syntax:  * Filter expressions are
    * made up of one or more restrictions. * Restrictions can be combined by
    * `AND` or `OR` logical operators. A sequence of restrictions implicitly
    * uses `AND`. * A restriction has the form of `<field> <operator> <value>`.
    * * Supported fields/values for inspect jobs:     - `status` -
    * HEALTHY|PAUSED|CANCELLED     - `inspected_storage` -
    * DATASTORE|CLOUD_STORAGE|BIGQUERY     - 'last_run_time` - RFC 3339
    * formatted timestamp, surrounded by     quotation marks. Nanoseconds are
    * ignored.     - 'error_count' - Number of errors that have occurred while
    * running. * The operator must be `=` or `!=` for status and
    * inspected_storage.  Examples:  * inspected_storage = cloud_storage AND
    * status = HEALTHY * inspected_storage = cloud_storage OR inspected_storage
    * = bigquery * inspected_storage = cloud_storage AND (state = PAUSED OR
    * state = HEALTHY) * last_run_time > \"2017-12-12T00:00:00+00:00\"  The
    * length of this field should be no more than 500 characters.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Optional comma separated list of triggeredJob fields to order by,
    * followed by `asc` or `desc` postfix. This list is case-insensitive,
    * default sorting order is ascending, redundant space characters are
    * insignificant.  Example: `name asc,update_time, create_time desc`
    * Supported fields are:  - `create_time`: corresponds to time the
    * JobTrigger was created. - `update_time`: corresponds to time the
    * JobTrigger was last updated. - `last_run_time`: corresponds to the last
    * time the JobTrigger ran. - `name`: corresponds to JobTrigger's name. -
    * `display_name`: corresponds to JobTrigger's display name. - `status`:
    * corresponds to JobTrigger's status.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Optional size of the page, can be limited by a server.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional page token to continue retrieval. Comes from previous call to
    * ListJobTriggers. `order_by` field must not change for subsequent calls.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The parent resource name, for example `projects/my-project-id`.
    */
  var parent: js.UndefOr[String] = js.native
}

