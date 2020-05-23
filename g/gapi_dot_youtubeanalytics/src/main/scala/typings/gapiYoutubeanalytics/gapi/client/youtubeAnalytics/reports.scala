package typings.gapiYoutubeanalytics.gapi.client.youtubeAnalytics

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutubeanalytics.anon.Dimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reports extends js.Object {
  /**
    * Retrieve your YouTube Analytics reports.
    */
  def query(`object`: Dimensions): HttpRequest[_]
}

object reports {
  @scala.inline
  def apply(query: Dimensions => HttpRequest[_]): reports = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[reports]
  }
}

