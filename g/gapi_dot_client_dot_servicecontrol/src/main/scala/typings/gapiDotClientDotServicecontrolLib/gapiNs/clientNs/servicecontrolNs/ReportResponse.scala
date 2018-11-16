package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReportResponse extends js.Object {
  /**
               * Partial failures, one for each `Operation` in the request that failed
               * processing. There are three possible combinations of the RPC status:
               *
               * 1. The combination of a successful RPC status and an empty `report_errors`
               * list indicates a complete success where all `Operations` in the
               * request are processed successfully.
               * 2. The combination of a successful RPC status and a non-empty
               * `report_errors` list indicates a partial success where some
               * `Operations` in the request succeeded. Each
               * `Operation` that failed processing has a corresponding item
               * in this list.
               * 3. A failed RPC status indicates a general non-deterministic failure.
               * When this happens, it's impossible to know which of the
               * 'Operations' in the request succeeded or failed.
               */
  var reportErrors: js.UndefOr[js.Array[ReportError]] = js.undefined
  /**
               * Quota usage for each quota release `Operation` request.
               *
               * Fully or partially failed quota release request may or may not be present
               * in `report_quota_info`. For example, a failed quota release request will
               * have the current quota usage info when precise quota library returns the
               * info. A deadline exceeded quota request will not have quota usage info.
               *
               * If there is no quota release request, report_quota_info will be empty.
               */
  var reportInfos: js.UndefOr[js.Array[ReportInfo]] = js.undefined
  /** The actual config id used to process the request. */
  var serviceConfigId: js.UndefOr[java.lang.String] = js.undefined
}

