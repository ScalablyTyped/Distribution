package typings
package gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var serviceAccount: ServiceAccountResource
}

object ProjectsResource {
  @scala.inline
  def apply(serviceAccount: ServiceAccountResource): ProjectsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("serviceAccount")(serviceAccount)
    __obj.asInstanceOf[ProjectsResource]
  }
}

