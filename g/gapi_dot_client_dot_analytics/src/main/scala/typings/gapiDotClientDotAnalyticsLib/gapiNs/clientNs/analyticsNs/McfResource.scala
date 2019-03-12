package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait McfResource extends js.Object {
  /** Returns Analytics Multi-Channel Funnels data for a view (profile). */
  def get(request: gapiDotClientDotAnalyticsLib.Anon_AltDimensions): gapiDotClientLib.gapiNs.clientNs.Request[McfData]
}

object McfResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotAnalyticsLib.Anon_AltDimensions => gapiDotClientLib.gapiNs.clientNs.Request[McfData]
  ): McfResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[McfResource]
  }
}

