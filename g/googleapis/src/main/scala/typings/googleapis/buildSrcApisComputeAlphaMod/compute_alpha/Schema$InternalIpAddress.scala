package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InternalIpAddress extends js.Object {
  /**
    * IP CIDR address or range.
    */
  var cidr: js.UndefOr[String] = js.native
  /**
    * The owner of the internal IP address.
    */
  var owner: js.UndefOr[String] = js.native
  /**
    * The purpose of the internal IP address if applicable.
    */
  var purpose: js.UndefOr[String] = js.native
  /**
    * The region of the internal IP address if applicable.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * The type of the internal IP address.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$InternalIpAddress {
  @scala.inline
  def apply(
    cidr: String = null,
    owner: String = null,
    purpose: String = null,
    region: String = null,
    `type`: String = null
  ): Schema$InternalIpAddress = {
    val __obj = js.Dynamic.literal()
    if (cidr != null) __obj.updateDynamic("cidr")(cidr.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InternalIpAddress]
  }
}

