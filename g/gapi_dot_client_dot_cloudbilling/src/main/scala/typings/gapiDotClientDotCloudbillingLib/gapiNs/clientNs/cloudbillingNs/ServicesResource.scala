package typings
package gapiDotClientDotCloudbillingLib.gapiNs.clientNs.cloudbillingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicesResource extends js.Object {
  var skus: SkusResource
  /** Lists all public cloud services. */
  def list(request: gapiDotClientDotCloudbillingLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ListServicesResponse]
}

