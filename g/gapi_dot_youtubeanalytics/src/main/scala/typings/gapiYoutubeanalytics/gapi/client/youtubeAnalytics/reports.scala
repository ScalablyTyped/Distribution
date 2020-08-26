package typings.gapiYoutubeanalytics.gapi.client.youtubeAnalytics

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutubeanalytics.anon.Dimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait reports extends js.Object {
  /**
    * Retrieve your YouTube Analytics reports.
    */
  def query(`object`: Dimensions): HttpRequest[_] = js.native
}

object reports {
  @scala.inline
  def apply(query: Dimensions => HttpRequest[_]): reports = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[reports]
  }
  @scala.inline
  implicit class reportsOps[Self <: reports] (val x: Self) extends AnyVal {
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
    def setQuery(value: Dimensions => HttpRequest[_]): Self = this.set("query", js.Any.fromFunction1(value))
  }
  
}

