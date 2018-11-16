package typings
package gapiDotClientDotCloudiotLib.gapiNs.clientNs.cloudiotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListDevicesResponse extends js.Object {
  /** The devices that match the request. */
  var devices: js.UndefOr[js.Array[Device]] = js.undefined
  /**
               * If not empty, indicates that there may be more devices that match the
               * request; this value should be passed in a new `ListDevicesRequest`.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

