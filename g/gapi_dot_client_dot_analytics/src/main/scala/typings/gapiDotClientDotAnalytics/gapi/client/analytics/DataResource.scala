package typings.gapiDotClientDotAnalytics.gapi.client.analytics

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
    val __obj = js.Dynamic.literal(ga = ga.asInstanceOf[js.Any], mcf = mcf.asInstanceOf[js.Any], realtime = realtime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataResource]
  }
}

