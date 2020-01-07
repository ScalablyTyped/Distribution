package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describing the ARP neighbor entries seen on this link
  */
@js.native
trait Schema$InterconnectDiagnosticsARPEntry extends js.Object {
  /**
    * The IP address of this ARP neighbor.
    */
  var ipAddress: js.UndefOr[String] = js.native
  /**
    * The MAC address of this ARP neighbor.
    */
  var macAddress: js.UndefOr[String] = js.native
}

object Schema$InterconnectDiagnosticsARPEntry {
  @scala.inline
  def apply(ipAddress: String = null, macAddress: String = null): Schema$InterconnectDiagnosticsARPEntry = {
    val __obj = js.Dynamic.literal()
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (macAddress != null) __obj.updateDynamic("macAddress")(macAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InterconnectDiagnosticsARPEntry]
  }
}

