package typings.gapiDotClientDotContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var zones: ZonesResource
}

object ProjectsResource {
  @scala.inline
  def apply(zones: ZonesResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(zones = zones.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

