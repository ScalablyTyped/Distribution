package typings
package gapiDotClientDotCloudiotLib.gapiNs.clientNs.cloudiotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListDeviceStatesResponse extends js.Object {
  /**
               * The last few device states. States are listed in descending order of server
               * update time, starting from the most recent one.
               */
  var deviceStates: js.UndefOr[js.Array[DeviceState]] = js.undefined
}

