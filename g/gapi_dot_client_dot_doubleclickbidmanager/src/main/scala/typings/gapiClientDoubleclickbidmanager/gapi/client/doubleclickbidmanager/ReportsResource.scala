package typings.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDoubleclickbidmanager.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  /** Retrieves stored reports. */
  def listreports(request: AnonFields): Request_[ListReportsResponse]
}

object ReportsResource {
  @scala.inline
  def apply(listreports: AnonFields => Request_[ListReportsResponse]): ReportsResource = {
    val __obj = js.Dynamic.literal(listreports = js.Any.fromFunction1(listreports))
    __obj.asInstanceOf[ReportsResource]
  }
}

