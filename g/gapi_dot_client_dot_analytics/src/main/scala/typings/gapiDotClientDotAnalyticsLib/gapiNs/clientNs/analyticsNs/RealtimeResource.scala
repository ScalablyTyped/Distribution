package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealtimeResource extends js.Object {
  /** Returns real time data for a view (profile). */
  def get(request: gapiDotClientDotAnalyticsLib.Anon_AltDimensionsFields): gapiDotClientLib.gapiNs.clientNs.Request[RealtimeData]
}

object RealtimeResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotAnalyticsLib.Anon_AltDimensionsFields => gapiDotClientLib.gapiNs.clientNs.Request[RealtimeData]
  ): RealtimeResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[RealtimeResource]
  }
}

