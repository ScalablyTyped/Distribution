package typings
package gapiDotClientDotCloudfunctionsLib.gapiNs.clientNs.cloudfunctionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var locations: LocationsResource
}

object ProjectsResource {
  @scala.inline
  def apply(locations: LocationsResource): ProjectsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("locations")(locations)
    __obj.asInstanceOf[ProjectsResource]
  }
}

