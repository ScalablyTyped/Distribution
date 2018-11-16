package typings
package gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EntriesResource extends js.Object {
  /** Lists log entries. Use this method to retrieve log entries from Stackdriver Logging. For ways to export log entries, see Exporting Logs. */
  def list(request: gapiDotClientDotLoggingLib.Anon_AccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ListLogEntriesResponse]
  /**
               * Log entry resourcesWrites log entries to Stackdriver Logging. This API method is the only way to send log entries to Stackdriver Logging. This method
               * is used, directly or indirectly, by the Stackdriver Logging agent (fluentd) and all logging libraries configured to use Stackdriver Logging.
               */
  def write(request: gapiDotClientDotLoggingLib.Anon_AccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
}

