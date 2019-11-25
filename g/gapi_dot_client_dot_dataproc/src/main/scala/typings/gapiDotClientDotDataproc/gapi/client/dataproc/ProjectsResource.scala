package typings.gapiDotClientDotDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var regions: RegionsResource
}

object ProjectsResource {
  @scala.inline
  def apply(regions: RegionsResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(regions = regions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

