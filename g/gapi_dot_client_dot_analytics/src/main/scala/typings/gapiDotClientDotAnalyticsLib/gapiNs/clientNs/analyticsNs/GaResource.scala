package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaResource extends js.Object {
  /** Returns Analytics data for a view (profile). */
  def get(request: gapiDotClientDotAnalyticsLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[GaData]
}

object GaResource {
  @scala.inline
  def apply(get: gapiDotClientDotAnalyticsLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[GaData]): GaResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[GaResource]
  }
}

