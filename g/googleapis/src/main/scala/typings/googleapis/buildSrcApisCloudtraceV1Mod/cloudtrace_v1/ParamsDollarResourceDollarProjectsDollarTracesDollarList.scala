package typings.googleapis.buildSrcApisCloudtraceV1Mod.cloudtrace_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarTracesDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * End of the time interval (inclusive) during which the trace data was
    * collected from the application.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * An optional filter against labels for the request.  By default, searches
    * use prefix matching. To specify exact match, prepend a plus symbol (`+`)
    * to the search term. Multiple terms are ANDed. Syntax:  *
    * `root:NAME_PREFIX` or `NAME_PREFIX`: Return traces where any root span
    * starts with `NAME_PREFIX`. *   `+root:NAME` or `+NAME`: Return traces
    * where any root span's name is     exactly `NAME`. *   `span:NAME_PREFIX`:
    * Return traces where any span starts with     `NAME_PREFIX`. *
    * `+span:NAME`: Return traces where any span's name is exactly     `NAME`.
    * *   `latency:DURATION`: Return traces whose overall latency is greater or
    * equal to than `DURATION`. Accepted units are nanoseconds     (`ns`),
    * milliseconds (`ms`), and seconds (`s`). Default is `ms`. For     example,
    * `latency:24ms` returns traces whose overall latency     is greater than
    * or equal to 24 milliseconds. *   `label:LABEL_KEY`: Return all traces
    * containing the specified     label key (exact match, case-sensitive)
    * regardless of the key:value     pair's value (including empty values). *
    * `LABEL_KEY:VALUE_PREFIX`: Return all traces containing the specified
    * label key (exact match, case-sensitive) whose value starts with
    * `VALUE_PREFIX`. Both a key and a value must be specified. *
    * `+LABEL_KEY:VALUE`: Return all traces containing a key:value pair exactly
    * matching the specified text. Both a key and a value must be specified. *
    * `method:VALUE`: Equivalent to `/http/method:VALUE`. *   `url:VALUE`:
    * Equivalent to `/http/url:VALUE`.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Field used to sort the returned traces. Optional. Can be one of the
    * following:  *   `trace_id` *   `name` (`name` field of root span in the
    * trace) *   `duration` (difference between `end_time` and `start_time`
    * fields of      the root span) *   `start` (`start_time` field of the root
    * span)  Descending order can be specified by appending `desc` to the sort
    * field (for example, `name desc`).  Only one sort field is permitted.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Maximum number of traces to return. If not specified or <= 0, the
    * implementation selects a reasonable value.  The implementation may return
    * fewer traces than the requested page size. Optional.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Token identifying the page of results to return. If provided, use the
    * value of the `next_page_token` field from a previous request. Optional.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * ID of the Cloud project where the trace data is stored.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Start of the time interval (inclusive) during which the trace data was
    * collected from the application.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Type of data returned for traces in the list. Optional. Default is
    * `MINIMAL`.
    */
  var view: js.UndefOr[String] = js.native
}

