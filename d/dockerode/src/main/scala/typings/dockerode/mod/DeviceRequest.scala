package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceRequest extends js.Object {
  var Capabilities: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  var Count: js.UndefOr[Double] = js.undefined
  var DeviceIDs: js.UndefOr[js.Array[String]] = js.undefined
  var Driver: js.UndefOr[String] = js.undefined
  var Options: js.UndefOr[StringDictionary[String]] = js.undefined
}

object DeviceRequest {
  @scala.inline
  def apply(
    Capabilities: js.Array[js.Array[String]] = null,
    Count: Int | Double = null,
    DeviceIDs: js.Array[String] = null,
    Driver: String = null,
    Options: StringDictionary[String] = null
  ): DeviceRequest = {
    val __obj = js.Dynamic.literal()
    if (Capabilities != null) __obj.updateDynamic("Capabilities")(Capabilities.asInstanceOf[js.Any])
    if (Count != null) __obj.updateDynamic("Count")(Count.asInstanceOf[js.Any])
    if (DeviceIDs != null) __obj.updateDynamic("DeviceIDs")(DeviceIDs.asInstanceOf[js.Any])
    if (Driver != null) __obj.updateDynamic("Driver")(Driver.asInstanceOf[js.Any])
    if (Options != null) __obj.updateDynamic("Options")(Options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceRequest]
  }
}

