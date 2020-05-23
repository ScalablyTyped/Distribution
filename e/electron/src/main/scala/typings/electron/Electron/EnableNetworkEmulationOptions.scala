package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableNetworkEmulationOptions extends js.Object {
  /**
    * Download rate in Bps. Defaults to 0 which will disable download throttling.
    */
  var downloadThroughput: js.UndefOr[Double] = js.undefined
  /**
    * RTT in ms. Defaults to 0 which will disable latency throttling.
    */
  var latency: js.UndefOr[Double] = js.undefined
  /**
    * Whether to emulate network outage. Defaults to false.
    */
  var offline: js.UndefOr[Boolean] = js.undefined
  /**
    * Upload rate in Bps. Defaults to 0 which will disable upload throttling.
    */
  var uploadThroughput: js.UndefOr[Double] = js.undefined
}

object EnableNetworkEmulationOptions {
  @scala.inline
  def apply(
    downloadThroughput: js.UndefOr[Double] = js.undefined,
    latency: js.UndefOr[Double] = js.undefined,
    offline: js.UndefOr[Boolean] = js.undefined,
    uploadThroughput: js.UndefOr[Double] = js.undefined
  ): EnableNetworkEmulationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(downloadThroughput)) __obj.updateDynamic("downloadThroughput")(downloadThroughput.get.asInstanceOf[js.Any])
    if (!js.isUndefined(latency)) __obj.updateDynamic("latency")(latency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offline)) __obj.updateDynamic("offline")(offline.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uploadThroughput)) __obj.updateDynamic("uploadThroughput")(uploadThroughput.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableNetworkEmulationOptions]
  }
}

