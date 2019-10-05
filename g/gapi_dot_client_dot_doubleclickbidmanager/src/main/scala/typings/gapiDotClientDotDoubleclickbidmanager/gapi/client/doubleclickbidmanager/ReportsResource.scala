package typings.gapiDotClientDotDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDoubleclickbidmanager.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  /** Retrieves stored reports. */
  def listreports(request: Anon_AltFields): Request[ListReportsResponse]
}

object ReportsResource {
  @scala.inline
  def apply(listreports: Anon_AltFields => Request[ListReportsResponse]): ReportsResource = {
    val __obj = js.Dynamic.literal(listreports = js.Any.fromFunction1(listreports))
  
    __obj.asInstanceOf[ReportsResource]
  }
}

