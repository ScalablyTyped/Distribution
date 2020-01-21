package typings.gapiClientCloudbilling.gapi.client.cloudbilling

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCloudbilling.AnonAccesstokenAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicesResource extends js.Object {
  var skus: SkusResource
  /** Lists all public cloud services. */
  def list(request: AnonAccesstokenAltBearertoken): Request_[ListServicesResponse]
}

object ServicesResource {
  @scala.inline
  def apply(list: AnonAccesstokenAltBearertoken => Request_[ListServicesResponse], skus: SkusResource): ServicesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), skus = skus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServicesResource]
  }
}

