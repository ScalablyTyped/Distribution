package typings.gapiDotClientDotLogging.gapiNs.clientNs.loggingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotLogging.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotLogging.Anon_AccesstokenAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogsResource extends js.Object {
  /**
    * Deletes all the log entries in a log. The log reappears if it receives new entries. Log entries written shortly before the delete operation might not
    * be deleted.
    */
  def delete(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[js.Object]
  /** Lists the logs in projects, organizations, folders, or billing accounts. Only logs that have entries are listed. */
  def list(request: Anon_AccesstokenAltBearertoken): Request[ListLogsResponse]
}

object LogsResource {
  @scala.inline
  def apply(
    delete: Anon_AccesstokenAltBearertokenCallbackFields => Request[js.Object],
    list: Anon_AccesstokenAltBearertoken => Request[ListLogsResponse]
  ): LogsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LogsResource]
  }
}

