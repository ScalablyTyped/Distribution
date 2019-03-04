package typings
package gapiDotClientDotCloudfunctionsLib.gapiNs.clientNs.cloudfunctionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  /** Lists information about the supported locations for this service. */
  def list(request: gapiDotClientDotCloudfunctionsLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotCloudfunctionsLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListLocationsResponse]
    ]
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[LocationsResource]
  }
}

