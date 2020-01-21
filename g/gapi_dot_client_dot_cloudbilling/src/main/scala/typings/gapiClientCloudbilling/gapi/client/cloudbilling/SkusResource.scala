package typings.gapiClientCloudbilling.gapi.client.cloudbilling

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCloudbilling.AnonAccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkusResource extends js.Object {
  /** Lists all publicly available SKUs for a given cloud service. */
  def list(request: AnonAccesstokenAltBearertokenCallback): Request_[ListSkusResponse]
}

object SkusResource {
  @scala.inline
  def apply(list: AnonAccesstokenAltBearertokenCallback => Request_[ListSkusResponse]): SkusResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SkusResource]
  }
}

