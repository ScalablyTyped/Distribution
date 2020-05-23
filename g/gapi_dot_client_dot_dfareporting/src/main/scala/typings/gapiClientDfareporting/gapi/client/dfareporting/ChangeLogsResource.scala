package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Action
import typings.gapiClientDfareporting.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeLogsResource extends js.Object {
  /** Gets one change log by ID. */
  def get(request: Fields): Request[ChangeLog]
  /** Retrieves a list of change logs. This method supports paging. */
  def list(request: Action): Request[ChangeLogsListResponse]
}

object ChangeLogsResource {
  @scala.inline
  def apply(get: Fields => Request[ChangeLog], list: Action => Request[ChangeLogsListResponse]): ChangeLogsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ChangeLogsResource]
  }
}

