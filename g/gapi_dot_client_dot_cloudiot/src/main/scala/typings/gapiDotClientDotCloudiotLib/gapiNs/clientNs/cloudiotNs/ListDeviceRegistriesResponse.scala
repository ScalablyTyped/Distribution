package typings
package gapiDotClientDotCloudiotLib.gapiNs.clientNs.cloudiotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListDeviceRegistriesResponse extends js.Object {
  /** The registries that matched the query. */
  var deviceRegistries: js.UndefOr[js.Array[DeviceRegistry]] = js.undefined
  /**
               * If not empty, indicates that there may be more registries that match the
               * request; this value should be passed in a new
               * `ListDeviceRegistriesRequest`.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

