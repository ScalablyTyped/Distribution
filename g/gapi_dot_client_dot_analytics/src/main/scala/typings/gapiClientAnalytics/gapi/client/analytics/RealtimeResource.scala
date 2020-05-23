package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealtimeResource extends js.Object {
  /** Returns real time data for a view (profile). */
  def get(request: Fields): Request[RealtimeData]
}

object RealtimeResource {
  @scala.inline
  def apply(get: Fields => Request[RealtimeData]): RealtimeResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[RealtimeResource]
  }
}

