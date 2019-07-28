package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.FreeBusyRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.FreeBusyResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FreebusyCollection extends js.Object {
  // Returns free/busy information for a set of calendars.
  def query(resource: FreeBusyRequest): FreeBusyResponse = js.native
  // Returns free/busy information for a set of calendars.
  def query(resource: FreeBusyRequest, optionalArgs: js.Object, headers: js.Object): FreeBusyResponse = js.native
}

