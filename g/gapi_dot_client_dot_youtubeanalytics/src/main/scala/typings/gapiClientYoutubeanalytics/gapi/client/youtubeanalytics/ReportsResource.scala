package typings.gapiClientYoutubeanalytics.gapi.client.youtubeanalytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutubeanalytics.anon.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportsResource extends js.Object {
  /** Retrieve your YouTube Analytics reports. */
  def query(request: Currency): Request[ResultTable] = js.native
}

object ReportsResource {
  @scala.inline
  def apply(query: Currency => Request[ResultTable]): ReportsResource = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[ReportsResource]
  }
  @scala.inline
  implicit class ReportsResourceOps[Self <: ReportsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQuery(value: Currency => Request[ResultTable]): Self = this.set("query", js.Any.fromFunction1(value))
  }
  
}

