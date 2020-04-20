package typings.gapiClientYoutubeanalytics.gapi.client.youtubeanalytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutubeanalytics.AnonCurrency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  /** Retrieve your YouTube Analytics reports. */
  def query(request: AnonCurrency): Request_[ResultTable]
}

object ReportsResource {
  @scala.inline
  def apply(query: AnonCurrency => Request_[ResultTable]): ReportsResource = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[ReportsResource]
  }
}

