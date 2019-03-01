package typings
package gapiDotClientDotCloudiotLib.gapiNs.clientNs.cloudiotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatesResource extends js.Object {
  /**
    * Lists the last few versions of the device state in descending order (i.e.:
    * newest first).
    */
  def list(request: gapiDotClientDotCloudiotLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[ListDeviceStatesResponse]
}

object StatesResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotCloudiotLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListDeviceStatesResponse]
    ]
  ): StatesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[StatesResource]
  }
}

