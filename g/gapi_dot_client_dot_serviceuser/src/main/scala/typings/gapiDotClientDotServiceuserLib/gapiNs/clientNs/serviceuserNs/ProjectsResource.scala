package typings
package gapiDotClientDotServiceuserLib.gapiNs.clientNs.serviceuserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var services: ServicesResource
}

object ProjectsResource {
  @scala.inline
  def apply(services: ServicesResource): ProjectsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("services")(services)
    __obj.asInstanceOf[ProjectsResource]
  }
}

