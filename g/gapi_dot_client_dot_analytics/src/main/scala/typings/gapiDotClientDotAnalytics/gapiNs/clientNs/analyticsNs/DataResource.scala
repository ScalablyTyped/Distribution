package typings.gapiDotClientDotAnalytics.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataResource extends js.Object {
  var ga: GaResource
  var mcf: McfResource
  var realtime: RealtimeResource
}

object DataResource {
  @scala.inline
  def apply(ga: GaResource, mcf: McfResource, realtime: RealtimeResource): DataResource = {
    val __obj = js.Dynamic.literal(ga = ga, mcf = mcf, realtime = realtime)
  
    __obj.asInstanceOf[DataResource]
  }
}

