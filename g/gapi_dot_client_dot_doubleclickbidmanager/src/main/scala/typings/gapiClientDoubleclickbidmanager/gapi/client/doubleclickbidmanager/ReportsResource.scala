package typings.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDoubleclickbidmanager.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  /** Retrieves stored reports. */
  def listreports(request: Fields): Request[ListReportsResponse]
}

object ReportsResource {
  @scala.inline
  def apply(listreports: Fields => Request[ListReportsResponse]): ReportsResource = {
    val __obj = js.Dynamic.literal(listreports = js.Any.fromFunction1(listreports))
    __obj.asInstanceOf[ReportsResource]
  }
}

