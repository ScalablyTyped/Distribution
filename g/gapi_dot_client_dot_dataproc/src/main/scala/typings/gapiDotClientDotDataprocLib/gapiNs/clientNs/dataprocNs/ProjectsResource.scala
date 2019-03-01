package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var regions: RegionsResource
}

object ProjectsResource {
  @scala.inline
  def apply(regions: RegionsResource): ProjectsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("regions")(regions)
    __obj.asInstanceOf[ProjectsResource]
  }
}

