package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentsResource extends js.Object {
  /** Lists segments to which the user has access. */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Segments]
}

object SegmentsResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotAnalyticsLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Segments]
  ): SegmentsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SegmentsResource]
  }
}

