package typings.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var services: ServicesResource
}

object ProjectsResource {
  @scala.inline
  def apply(services: ServicesResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
}

