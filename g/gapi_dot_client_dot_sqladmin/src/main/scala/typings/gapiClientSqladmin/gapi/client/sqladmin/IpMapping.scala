package typings.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpMapping extends js.Object {
  /** The IP address assigned. */
  var ipAddress: js.UndefOr[String] = js.native
  /**
    * The due time for this IP to be retired in RFC 3339 format, for example 2012-11-15T16:19:00.094Z. This field is only available when the IP is scheduled
    * to be retired.
    */
  var timeToRetire: js.UndefOr[String] = js.native
  /**
    * The type of this IP address. A PRIMARY address is an address that can accept incoming connections. An OUTGOING address is the source address of
    * connections originating from the instance, if supported.
    */
  var `type`: js.UndefOr[String] = js.native
}

object IpMapping {
  @scala.inline
  def apply(): IpMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpMapping]
  }
  @scala.inline
  implicit class IpMappingOps[Self <: IpMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    @scala.inline
    def setTimeToRetire(value: String): Self = this.set("timeToRetire", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeToRetire: Self = this.set("timeToRetire", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

