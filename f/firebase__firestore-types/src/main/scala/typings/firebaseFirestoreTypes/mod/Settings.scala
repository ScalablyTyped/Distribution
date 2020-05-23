package typings.firebaseFirestoreTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var cacheSizeBytes: js.UndefOr[Double] = js.undefined
  var experimentalForceLongPolling: js.UndefOr[Boolean] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var ssl: js.UndefOr[Boolean] = js.undefined
  var timestampsInSnapshots: js.UndefOr[Boolean] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    cacheSizeBytes: js.UndefOr[Double] = js.undefined,
    experimentalForceLongPolling: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    ssl: js.UndefOr[Boolean] = js.undefined,
    timestampsInSnapshots: js.UndefOr[Boolean] = js.undefined
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheSizeBytes)) __obj.updateDynamic("cacheSizeBytes")(cacheSizeBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(experimentalForceLongPolling)) __obj.updateDynamic("experimentalForceLongPolling")(experimentalForceLongPolling.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timestampsInSnapshots)) __obj.updateDynamic("timestampsInSnapshots")(timestampsInSnapshots.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

