package typings.gapiDotClientDotYoutubeanalytics.gapi.client.youtubeanalytics

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotYoutubeanalytics.Anon_AltCurrency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  /** Retrieve your YouTube Analytics reports. */
  def query(request: Anon_AltCurrency): Request[ResultTable]
}

object ReportsResource {
  @scala.inline
  def apply(query: Anon_AltCurrency => Request[ResultTable]): ReportsResource = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
  
    __obj.asInstanceOf[ReportsResource]
  }
}

