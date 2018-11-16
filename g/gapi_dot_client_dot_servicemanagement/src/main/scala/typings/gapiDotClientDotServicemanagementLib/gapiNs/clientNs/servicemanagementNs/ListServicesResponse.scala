package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListServicesResponse extends js.Object {
  /** Token that can be passed to `ListServices` to resume a paginated query. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The returned services will only have the name field set. */
  var services: js.UndefOr[js.Array[ManagedService]] = js.undefined
}

