package typings.gapiClientDlp.gapi.client.dlp

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDlp.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceResource extends js.Object {
  /**
    * Schedules a job to compute risk analysis metrics over content in a Google
    * Cloud Platform repository.
    */
  def analyze(request: AnonAccesstoken): Request_[GoogleLongrunningOperation]
}

object DataSourceResource {
  @scala.inline
  def apply(analyze: AnonAccesstoken => Request_[GoogleLongrunningOperation]): DataSourceResource = {
    val __obj = js.Dynamic.literal(analyze = js.Any.fromFunction1(analyze))
    __obj.asInstanceOf[DataSourceResource]
  }
}

