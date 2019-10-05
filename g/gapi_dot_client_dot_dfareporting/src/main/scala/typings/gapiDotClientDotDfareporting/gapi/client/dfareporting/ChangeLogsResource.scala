package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_Action
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeLogsResource extends js.Object {
  /** Gets one change log by ID. */
  def get(request: Anon_AltFields): Request[ChangeLog]
  /** Retrieves a list of change logs. This method supports paging. */
  def list(request: Anon_Action): Request[ChangeLogsListResponse]
}

object ChangeLogsResource {
  @scala.inline
  def apply(get: Anon_AltFields => Request[ChangeLog], list: Anon_Action => Request[ChangeLogsListResponse]): ChangeLogsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ChangeLogsResource]
  }
}

