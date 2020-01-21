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
    cacheSizeBytes: Int | Double = null,
    experimentalForceLongPolling: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    ssl: js.UndefOr[Boolean] = js.undefined,
    timestampsInSnapshots: js.UndefOr[Boolean] = js.undefined
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (cacheSizeBytes != null) __obj.updateDynamic("cacheSizeBytes")(cacheSizeBytes.asInstanceOf[js.Any])
    if (!js.isUndefined(experimentalForceLongPolling)) __obj.updateDynamic("experimentalForceLongPolling")(experimentalForceLongPolling.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (!js.isUndefined(timestampsInSnapshots)) __obj.updateDynamic("timestampsInSnapshots")(timestampsInSnapshots.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

