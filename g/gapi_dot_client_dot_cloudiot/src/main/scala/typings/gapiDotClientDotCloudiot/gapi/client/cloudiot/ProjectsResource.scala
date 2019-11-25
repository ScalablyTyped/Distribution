package typings.gapiDotClientDotCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var locations: LocationsResource
}

object ProjectsResource {
  @scala.inline
  def apply(locations: LocationsResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

