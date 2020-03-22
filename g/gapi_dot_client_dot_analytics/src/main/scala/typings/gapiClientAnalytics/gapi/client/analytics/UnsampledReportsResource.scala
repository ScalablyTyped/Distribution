package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonProfileId
import typings.gapiClientAnalytics.AnonStartindex
import typings.gapiClientAnalytics.AnonUnsampledReportId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsampledReportsResource extends js.Object {
  /** Deletes an unsampled report. */
  def delete(request: AnonUnsampledReportId): Request_[Unit]
  /** Returns a single unsampled report. */
  def get(request: AnonUnsampledReportId): Request_[UnsampledReport]
  /** Create a new unsampled report. */
  def insert(request: AnonProfileId): Request_[UnsampledReport]
  /** Lists unsampled reports to which the user has access. */
  def list(request: AnonStartindex): Request_[UnsampledReports]
}

object UnsampledReportsResource {
  @scala.inline
  def apply(
    delete: AnonUnsampledReportId => Request_[Unit],
    get: AnonUnsampledReportId => Request_[UnsampledReport],
    insert: AnonProfileId => Request_[UnsampledReport],
    list: AnonStartindex => Request_[UnsampledReports]
  ): UnsampledReportsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[UnsampledReportsResource]
  }
}

