package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmulateNetworkConditionsRequest extends js.Object {
  /**
    * Connection type if known.
    */
  var connectionType: js.UndefOr[ConnectionType] = js.native
  /**
    * Maximal aggregated download throughput (bytes/sec). -1 disables download throttling.
    */
  var downloadThroughput: Double = js.native
  /**
    * Minimum latency from request sent to response headers received (ms).
    */
  var latency: Double = js.native
  /**
    * True to emulate internet disconnection.
    */
  var offline: Boolean = js.native
  /**
    * Maximal aggregated upload throughput (bytes/sec).  -1 disables upload throttling.
    */
  var uploadThroughput: Double = js.native
}

object EmulateNetworkConditionsRequest {
  @scala.inline
  def apply(downloadThroughput: Double, latency: Double, offline: Boolean, uploadThroughput: Double): EmulateNetworkConditionsRequest = {
    val __obj = js.Dynamic.literal(downloadThroughput = downloadThroughput.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], uploadThroughput = uploadThroughput.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmulateNetworkConditionsRequest]
  }
  @scala.inline
  implicit class EmulateNetworkConditionsRequestOps[Self <: EmulateNetworkConditionsRequest] (val x: Self) extends AnyVal {
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
    def setDownloadThroughput(value: Double): Self = this.set("downloadThroughput", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatency(value: Double): Self = this.set("latency", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffline(value: Boolean): Self = this.set("offline", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadThroughput(value: Double): Self = this.set("uploadThroughput", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionType(value: ConnectionType): Self = this.set("connectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionType: Self = this.set("connectionType", js.undefined)
  }
  
}

