package typings
package gapiDotClientDotCloudiotLib.gapiNs.clientNs.cloudiotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ModifyCloudToDeviceConfigRequest extends js.Object {
  /** The configuration data for the device. */
  var binaryData: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The version number to update. If this value is zero, it will not check the
               * version number of the server and will always update the current version;
               * otherwise, this update will fail if the version number found on the server
               * does not match this version number. This is used to support multiple
               * simultaneous updates without losing data.
               */
  var versionToUpdate: js.UndefOr[java.lang.String] = js.undefined
}

