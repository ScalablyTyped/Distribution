package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.ProfileId
import typings.gapiClientAnalytics.anon.Startindex
import typings.gapiClientAnalytics.anon.UnsampledReportId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsampledReportsResource extends js.Object {
  /** Deletes an unsampled report. */
  def delete(request: UnsampledReportId): Request[Unit]
  /** Returns a single unsampled report. */
  def get(request: UnsampledReportId): Request[UnsampledReport]
  /** Create a new unsampled report. */
  def insert(request: ProfileId): Request[UnsampledReport]
  /** Lists unsampled reports to which the user has access. */
  def list(request: Startindex): Request[UnsampledReports]
}

object UnsampledReportsResource {
  @scala.inline
  def apply(
    delete: UnsampledReportId => Request[Unit],
    get: UnsampledReportId => Request[UnsampledReport],
    insert: ProfileId => Request[UnsampledReport],
    list: Startindex => Request[UnsampledReports]
  ): UnsampledReportsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UnsampledReportsResource]
  }
}

