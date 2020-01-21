package typings.gapiClientLogging.gapi.client.logging

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientLogging.AnonAccesstokenAltBearertoken
import typings.gapiClientLogging.AnonAccesstokenAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogsResource extends js.Object {
  /**
    * Deletes all the log entries in a log. The log reappears if it receives new entries. Log entries written shortly before the delete operation might not
    * be deleted.
    */
  def delete(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[js.Object]
  /** Lists the logs in projects, organizations, folders, or billing accounts. Only logs that have entries are listed. */
  def list(request: AnonAccesstokenAltBearertoken): Request_[ListLogsResponse]
}

object LogsResource {
  @scala.inline
  def apply(
    delete: AnonAccesstokenAltBearertokenCallbackFields => Request_[js.Object],
    list: AnonAccesstokenAltBearertoken => Request_[ListLogsResponse]
  ): LogsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LogsResource]
  }
}

