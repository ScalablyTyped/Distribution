package typings.gapiDotClientDotStorage.gapiNs.clientNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var serviceAccount: ServiceAccountResource
}

object ProjectsResource {
  @scala.inline
  def apply(serviceAccount: ServiceAccountResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(serviceAccount = serviceAccount)
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

