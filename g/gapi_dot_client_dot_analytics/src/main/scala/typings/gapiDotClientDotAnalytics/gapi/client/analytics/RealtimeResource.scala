package typings.gapiDotClientDotAnalytics.gapi.client.analytics

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAnalytics.Anon_AltDimensionsFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealtimeResource extends js.Object {
  /** Returns real time data for a view (profile). */
  def get(request: Anon_AltDimensionsFields): Request[RealtimeData]
}

object RealtimeResource {
  @scala.inline
  def apply(get: Anon_AltDimensionsFields => Request[RealtimeData]): RealtimeResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[RealtimeResource]
  }
}

