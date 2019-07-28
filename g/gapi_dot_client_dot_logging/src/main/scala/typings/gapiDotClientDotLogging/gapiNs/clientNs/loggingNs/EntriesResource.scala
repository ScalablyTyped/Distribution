package typings.gapiDotClientDotLogging.gapiNs.clientNs.loggingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotLogging.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntriesResource extends js.Object {
  /** Lists log entries. Use this method to retrieve log entries from Stackdriver Logging. For ways to export log entries, see Exporting Logs. */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrint): Request[ListLogEntriesResponse]
  /**
    * Log entry resourcesWrites log entries to Stackdriver Logging. This API method is the only way to send log entries to Stackdriver Logging. This method
    * is used, directly or indirectly, by the Stackdriver Logging agent (fluentd) and all logging libraries configured to use Stackdriver Logging.
    */
  def write(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrint): Request[js.Object]
}

object EntriesResource {
  @scala.inline
  def apply(
    list: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrint => Request[ListLogEntriesResponse],
    write: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrint => Request[js.Object]
  ): EntriesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[EntriesResource]
  }
}

