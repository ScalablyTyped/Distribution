package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EnableNetworkEmulationOptions extends js.Object {
  /**
       * Download rate in Bps. Defaults to 0 which will disable download throttling.
       */
  var downloadThroughput: js.UndefOr[scala.Double] = js.undefined
  /**
       * RTT in ms. Defaults to 0 which will disable latency throttling.
       */
  var latency: js.UndefOr[scala.Double] = js.undefined
  /**
       * Whether to emulate network outage. Defaults to false.
       */
  var offline: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Upload rate in Bps. Defaults to 0 which will disable upload throttling.
       */
  var uploadThroughput: js.UndefOr[scala.Double] = js.undefined
}

