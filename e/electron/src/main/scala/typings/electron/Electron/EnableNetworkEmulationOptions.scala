package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableNetworkEmulationOptions extends js.Object {
  /**
    * Download rate in Bps. Defaults to 0 which will disable download throttling.
    */
  var downloadThroughput: js.UndefOr[Double] = js.native
  /**
    * RTT in ms. Defaults to 0 which will disable latency throttling.
    */
  var latency: js.UndefOr[Double] = js.native
  /**
    * Whether to emulate network outage. Defaults to false.
    */
  var offline: js.UndefOr[Boolean] = js.native
  /**
    * Upload rate in Bps. Defaults to 0 which will disable upload throttling.
    */
  var uploadThroughput: js.UndefOr[Double] = js.native
}

object EnableNetworkEmulationOptions {
  @scala.inline
  def apply(): EnableNetworkEmulationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableNetworkEmulationOptions]
  }
  @scala.inline
  implicit class EnableNetworkEmulationOptionsOps[Self <: EnableNetworkEmulationOptions] (val x: Self) extends AnyVal {
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
    def deleteDownloadThroughput: Self = this.set("downloadThroughput", js.undefined)
    @scala.inline
    def setLatency(value: Double): Self = this.set("latency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatency: Self = this.set("latency", js.undefined)
    @scala.inline
    def setOffline(value: Boolean): Self = this.set("offline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffline: Self = this.set("offline", js.undefined)
    @scala.inline
    def setUploadThroughput(value: Double): Self = this.set("uploadThroughput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadThroughput: Self = this.set("uploadThroughput", js.undefined)
  }
  
}

