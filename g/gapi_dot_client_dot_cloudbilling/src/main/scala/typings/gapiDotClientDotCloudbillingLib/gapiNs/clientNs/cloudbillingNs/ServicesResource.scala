package typings
package gapiDotClientDotCloudbillingLib.gapiNs.clientNs.cloudbillingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicesResource extends js.Object {
  var skus: SkusResource
  /** Lists all public cloud services. */
  def list(request: gapiDotClientDotCloudbillingLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ListServicesResponse]
}

object ServicesResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotCloudbillingLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListServicesResponse]
    ],
    skus: SkusResource
  ): ServicesResource = {
    val __obj = js.Dynamic.literal(list = list, skus = skus)
  
    __obj.asInstanceOf[ServicesResource]
  }
}

