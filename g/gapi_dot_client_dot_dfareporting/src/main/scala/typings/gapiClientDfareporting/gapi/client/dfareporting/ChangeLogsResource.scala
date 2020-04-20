package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAction
import typings.gapiClientDfareporting.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeLogsResource extends js.Object {
  /** Gets one change log by ID. */
  def get(request: AnonFields): Request_[ChangeLog]
  /** Retrieves a list of change logs. This method supports paging. */
  def list(request: AnonAction): Request_[ChangeLogsListResponse]
}

object ChangeLogsResource {
  @scala.inline
  def apply(get: AnonFields => Request_[ChangeLog], list: AnonAction => Request_[ChangeLogsListResponse]): ChangeLogsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ChangeLogsResource]
  }
}

