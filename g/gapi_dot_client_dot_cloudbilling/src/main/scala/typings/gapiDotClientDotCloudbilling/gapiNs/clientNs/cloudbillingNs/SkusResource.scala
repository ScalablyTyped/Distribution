package typings.gapiDotClientDotCloudbilling.gapiNs.clientNs.cloudbillingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCloudbilling.Anon_AccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkusResource extends js.Object {
  /** Lists all publicly available SKUs for a given cloud service. */
  def list(request: Anon_AccesstokenAltBearertokenCallback): Request[ListSkusResponse]
}

object SkusResource {
  @scala.inline
  def apply(list: Anon_AccesstokenAltBearertokenCallback => Request[ListSkusResponse]): SkusResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SkusResource]
  }
}

