package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceId extends js.Object {
  var DeviceId: java.lang.String
  var DeviceName: java.lang.String
  var DeviceSize: java.lang.String
}

object Anon_DeviceId {
  @scala.inline
  def apply(DeviceId: java.lang.String, DeviceName: java.lang.String, DeviceSize: java.lang.String): Anon_DeviceId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DeviceId")(DeviceId)
    __obj.updateDynamic("DeviceName")(DeviceName)
    __obj.updateDynamic("DeviceSize")(DeviceSize)
    __obj.asInstanceOf[Anon_DeviceId]
  }
}

